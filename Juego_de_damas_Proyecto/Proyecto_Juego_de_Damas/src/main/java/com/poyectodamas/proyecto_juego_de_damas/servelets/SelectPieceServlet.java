/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.poyectodamas.proyecto_juego_de_damas.servelets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Board;



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
        
    // Obteniendo el cuerpo de la solicitud
    BufferedReader reader = request.getReader();
    StringBuilder requestBody = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
        requestBody.append(line);
    }

    System.out.println("Cuerpo de la solicitud: " + requestBody.toString());
    String[] N= requestBody.toString().split(",");
    String row = N[0];
    String col = N[1];
    String[] tipoM = N[2].split(":");
    row= N[0].substring(N[0].length() -1, N[0].length());
    col= N[1].substring(N[1].length() -1, N[1].length());
    String tipo= tipoM[1].substring(1, tipoM[1].length()-2);       
    int rowInt= Integer.parseInt(row);
    int colInt= Integer.parseInt(col);
    System.out.println("fila: "+row);
    System.out.println("columna: "+col);
    System.out.println("tipo: "+tipo);
    // Obtener los movimientos posibles
    int[][] movPosibles = Board.movimientosPosibles(rowInt, colInt, tipo);

    StringBuilder jsonResponse = new StringBuilder();
    if (movPosibles != null) {
        jsonResponse.append("{ \"movimientosPosibles\": [");
        for (int i = 0; i < 2; i++) {
            jsonResponse.append("{ \"fila\": ")
                        .append(movPosibles[i][0])
                        .append(", \"columna\": ")
                        .append(movPosibles[i][1])
                        .append("}");
            if (i < movPosibles.length - 1) {
                jsonResponse.append(", ");
            }
        }
        jsonResponse.append("]}");
    } else {
        jsonResponse.append("{ \"error\": \"No hay movimientos posibles\" }");
    }

    // Configurar la respuesta
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");

    // Enviar la respuesta al cliente
    response.getWriter().write(jsonResponse.toString());
    }
    


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
