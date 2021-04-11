
package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 842223
 */
public class NoteServlet extends HttpServlet {

    //String path = getServletContext().getRealPath("/WEB-INF/note.txt");
    
 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                //getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        
       // BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       
      
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
      
      String title = request.getParameter("title");
      String contents = request.getParameter("contents");
      
       if( title == null || title.equals("") || contents == null || contents.equals("")){
           
           request.setAttribute("title",title);
           request.setAttribute("contents",contents);
           
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            
            return;
       }   
       
       
            Note note = new Note(title, contents);
            request.setAttribute("note", note);
       
       
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
              
    }
}
