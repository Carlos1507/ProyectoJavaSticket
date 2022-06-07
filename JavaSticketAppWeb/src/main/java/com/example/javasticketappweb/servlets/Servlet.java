package com.example.javasticketappweb.servlets;

import org.jetbrains.annotations.NotNull;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(@NotNull HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClienteDao clienteDao = new ClienteDao();
        request.setAttribute("listaClientes",clienteDao.listarClientes());

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jobs/ListaClientes.jsp");
        requestDispatcher.forward(request,response);

        Administrador admin = new Administrador();
        request.setAttribute("listaClientes",admin.listarClientes());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListaClientes.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
