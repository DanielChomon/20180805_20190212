package com.example.appl7;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "Servlet", urlPatterns = {"/Servlet", "/actores", ""})
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Dao jobDao = new Dao();
        request.setAttribute("listaActores",jobDao.listarActores());
        request.setAttribute("saludo","un saludo para los conectados");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("lista.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}