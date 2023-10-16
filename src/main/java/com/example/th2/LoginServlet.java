package com.example.th2;

import sun.net.www.http.HttpCaptureOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet (name =  "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String name="admin";
//        String passWord="1234";
//
//        String userName= req.getParameter("username");
//        String userPassword= req.getParameter("password");
//
//        PrintWriter printWriter=resp.getWriter();
//        printWriter.println("<html>");
//        if (name.equals(userName)&&passWord.equals(userPassword)){
//            printWriter.println("<h1>Welcome"+userName+"to WebSide</1>" );
//        }else {
//            printWriter.println("<h1>Longin Error</1>" );
//        }
//        printWriter.println("</html>");
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name="admin";
        String passWord="1234";

        String userName= req.getParameter("username");
        String userPassword= req.getParameter("password");


        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html>");
        if (name.equals(userName)&&passWord.equals(userPassword)){
            printWriter.println("<h1>Welcome"+userName+"to WebSide</1>" );
        }else {
            printWriter.println("<h1>Longin Error</1>" );
        }
        printWriter.println("</html>");
    }
}
