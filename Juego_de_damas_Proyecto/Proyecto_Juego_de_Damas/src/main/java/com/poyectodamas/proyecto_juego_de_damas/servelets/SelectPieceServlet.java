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

/**
 *
 * @author lauta
 */
@WebServlet(name = "SelectPieceServlet", urlPatterns = {"/SelectPieceServlet"})
public class SelectPieceServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
        int row = Integer.parseInt(request.getParameter("row"));
        int col = Integer.parseInt(request.getParameter("col"));
        System.out.println("Row: " + row);
        System.out.println("Col: " + col);

        
        // Aquí puedes procesar la fila y la columna según sea necesario
        
        // Simplemente devuelve un movimiento fijo por ahora (por ejemplo, fila - 1, columna + 1)
        int newRow = row - 1;
        int newCol = col + 1;
        
        // Formar la respuesta como JSON
        String jsonResponse = "{ \"newRow\": " + newRow + ", \"newCol\": " + newCol + " }";
        
        // Configurar la respuesta
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        // Enviar la respuesta al cliente
        response.getWriter().write(jsonResponse);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
