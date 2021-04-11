<%-- 
    Document   : viewnote
    Created on : Feb 19, 2021, 2:29:41 PM
    Author     : 842223
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>View Note</h2>
        
        <div>
            
        <p>
            <b>Title:</b>
            ${note.title} 
        </p> 
        
        <p>
           <b>Contents:</b>
            ${note.contents}
        </p>
        
        <p><a href="edit?note">Edit</a></p>
        
            
        </div>
        
       
        
    </body>
</html>
