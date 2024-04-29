/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.poyectodamas.proyecto_juego_de_damas.servelets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Board;


@WebServlet(name = "MovePieceServlet", urlPatterns = {"/MovePieceServlet"})
public class MovePieceServlet extends HttpServlet {

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
         //{"row":2,"col":5,"className":"piece white-piece"}
        BufferedReader reader = request.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }

        System.out.println("Cuerpo de la solicitud: " + requestBody.toString());
        String[] N= requestBody.toString().split(",");
       int pRow = Integer.parseInt(N[0].substring(N[0].length() - 1));
        int pCol = Integer.parseInt(N[1].substring(N[1].length() - 1));
        int nRow = Integer.parseInt(N[2].substring(N[2].length() - 1));
        int nCol = Integer.parseInt(N[3].substring(N[3].length() - 1));
        
        Board.actualizar(pRow, pCol, nRow, nCol);
        String estado= "listo";
        String jsonResponse = "{ \"estado\": " + estado + " }";
        
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