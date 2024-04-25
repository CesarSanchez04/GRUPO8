/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.poyectodamas.proyecto_juego_de_damas.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controlador;
import logica.Usuario;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario "})
public class SvUsuario extends HttpServlet {
Controlador control = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("registro.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nickname= request.getParameter("nickname");
        String password= request.getParameter("password");
        String email= request.getParameter("email");
        
        Usuario usu = new Usuario();
        usu.setNickname(nickname);
        usu.setPassword(password);
        usu.setEmail(email);
        List<String> errores = validateUser(nickname, password, email);
        if(!errores.isEmpty()){
           request.setAttribute("errores", errores);
           request.getRequestDispatcher("registro.jsp").forward(request, response);
        }
        else{
           control.crearUsuario(usu);
           response.sendRedirect("principal.jsp");
           HttpSession sesion= request.getSession(true);
           sesion.setAttribute("nickname",nickname);
        }

    }
    private List<String> validateUser(String nickname, String password, String email) {
        List<String> errores = new ArrayList<>();

        if (nickname == null || control.validarNickname(nickname)) {
            errores.add("Ya existe el Nickname, prueba con otro.");
        }

        if (password == null || !password.matches(".*[!@#$%^&*].*")) {
            errores.add("La contraseña debe contener al menos una letra mayúscula y un carácter especial");
        }
        if(email == null || control.validarEmail(email)){
           errores.add("Ya esta registrado este email, prueba con otro"); 
        }
            return errores;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
