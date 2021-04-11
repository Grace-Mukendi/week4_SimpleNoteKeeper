<%-- 
    Document   : editnote
    Created on : Feb 19, 2021, 2:30:20 PM
    Author     : 842223
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>Edit Note</h2>
        
        <form method="POST" action="NoteServlet">
            <label>Title:</label>
            <input type="text" name="title" value="${title}">
            </br>
            <label>Contents:</label>
            <textarea id="contents" name="contents" value="${contents}" rows="4" cols="50">
            </textarea>
            
             </br>
            
             <input type="submit" value="Save">
        </form>    
    </body>
</html>
