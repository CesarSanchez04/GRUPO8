/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.poyectodamas.proyecto_juego_de_damas.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controlador;
import logica.Usuario;


@WebServlet(name = "SvSesion", urlPatterns = {"/SvSesion"})
public class SvSesion extends HttpServlet {
Controlador control = new Controlador();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("sesion.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nickname= request.getParameter("nickname");
        String password= request.getParameter("password");
        if(control.comprobarUsuario(nickname,password)){
            HttpSession sesion= request.getSession(true); 
            sesion.setAttribute("nickname",nickname);
            response.sendRedirect("principal.jsp");
        }else{
            response.sendRedirect("loginError.jsp");
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
