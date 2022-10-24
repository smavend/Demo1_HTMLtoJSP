package Servlets;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "JobServlet", value = "/JobServlet")
public class JobServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String alumno = "Carlos Pisco";
        request.setAttribute("nombreAlumno",alumno);


        RequestDispatcher view =  request.getRequestDispatcher("MyFirstJSP.jsp");
        view.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
