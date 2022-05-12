<%-- 
    Document   : index
    Created on : Aug 19, 2010, 3:30:49 PM
    Author     : odjogiy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="EventManagerServlet" method="POST">
       User ID: <input type="text" size="20" name ="userId" />
       User First NAME: <input type="text" size="20" name ="firstName" />
        User last Name:<input type="text" size="20" name ="lastName" />
        <br><br>
        <hr>
        <input type="radio" name="group1" value="Milk"> Milk<br>
        <input type="radio" name="group1" value="Butter"> Butter<br>
        <input type="radio" name="group1" value="Cheese"> Cheese
        <hr>

        <input type="submit" name="showBL" value="Show List"/>
     </form>
    </body>
</html>
