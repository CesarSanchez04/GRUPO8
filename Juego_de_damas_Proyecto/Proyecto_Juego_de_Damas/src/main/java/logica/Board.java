/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Board {
    private static Ficha[][] ficha = new Ficha[8][8]; // Inicialización del array con 2 filas y 8 columnas
    private static boolean [][] casilla = new boolean[8][8]; // true = casilla ocupada / false= casilla desocupada
    
    static {
        for(int fila =0; fila<8;fila++){
            for(int columna=0; columna<8; columna++){
                casilla[fila][columna]=false;
                ficha[fila][columna]= new Ficha();
            }
        }
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                if (fila < 3 && (fila + columna) % 2 == 1) {
                    for(int j=0; j<8; j++){
                        ficha[fila][columna] = new Ficha(fila,columna,"white-piece",true); // creando ficha blanca
                        casilla[fila][columna]= true;                                       // ocupando casilla 
                    }
                } else if (fila > 4 && (fila + columna) % 2 == 1) {
                    for(int j=0; j<8; j++){
                        ficha[fila][columna] = new Ficha(fila,columna,"red-piece",true); // creando ficha roja
                        casilla[fila][columna]= true;                                      // ocupando casilla
                    }
                } 
            }
        }

    }
    
    public static int[][] movimientosPosibles(int fila, int columna, String tipo) {
    int[][] movPosibles = new int[2][2]; // Almacenará los movimientos posibles (máximo dos movimientos)
    boolean hayMovimientosObligatorios = false; // Bandera para indicar si hay movimientos obligatorios
        
    switch(tipo) {
        case "piece white-piece":
            // Movimientos para piezas blancas
            if (fila + 2 < 8) { // Verifica si puede comer hacia adelante
                System.out.println("aqui1");
                if (columna > 1 && casilla[fila+1][columna-1] && ficha[fila+1][columna-1].getColor().equals("red-piece") && !casilla[fila+2][columna-2]) {
                    System.out.println("aqui2");
                    movPosibles[0][0] = fila + 2;
                    movPosibles[0][1] = columna - 2;
                    hayMovimientosObligatorios = true; // Hay movimientos obligatorios
                }
                if (columna < 6 && casilla[fila+1][columna+1] && ficha[fila+1][columna+1].getColor().equals("red-piece") && !casilla[fila+2][columna+2]) {
                    System.out.println("aqui3");
                    movPosibles[1][0] = fila + 2;
                    movPosibles[1][1] = columna + 2;
                    hayMovimientosObligatorios = true; // Hay movimientos obligatorios
                }
            }
            // Agrega los movimientos normales si no hay movimientos obligatorios
            if (!hayMovimientosObligatorios) {
                System.out.println("aqui4");
                if (fila + 1 < 8) { // Verifica si puede moverse una fila hacia adelante
                    if (columna > 0 && !casilla[fila+1][columna-1]) {
                        System.out.println("aqui5");
                        movPosibles[0][0] = fila + 1;
                        movPosibles[0][1] = columna - 1;
                    }
                    if (columna < 7 && !casilla[fila+1][columna+1]) {
                        System.out.println("aqui6");
                        movPosibles[1][0] = fila + 1;
                        movPosibles[1][1] = columna + 1;
                    }
                }
            }
            break;
        case "piece red-piece":
            // Movimientos para piezas rojas
            if (fila - 2 >= 0) { // Verifica si puede comer hacia atrás
                if (columna > 1 && casilla[fila-1][columna-1] && ficha[fila-1][columna-1].getColor().equals("white-piece") && !casilla[fila-2][columna-2]) {
                    System.out.println("aqui7");
                    movPosibles[0][0] = fila - 2;
                    movPosibles[0][1] = columna - 2;
                    hayMovimientosObligatorios = true; // Hay movimientos obligatorios
                }
                if (columna < 6 && casilla[fila-1][columna+1] && ficha[fila-1][columna+1].getColor().equals("white-piece") && !casilla[fila-2][columna+2]) {
                    System.out.println("aqui8");
                    movPosibles[1][0] = fila - 2;
                    movPosibles[1][1] = columna + 2;
                    hayMovimientosObligatorios = true; // Hay movimientos obligatorios
                }
            }
            // Agrega los movimientos normales si no hay movimientos obligatorios
            if (!hayMovimientosObligatorios) {
                if (fila - 1 >= 0) { // Verifica si puede moverse una fila hacia atrás
                    if (columna > 0 && !casilla[fila-1][columna-1]) {
                        System.out.println("aqui9");
                        movPosibles[0][0] = fila - 1;
                        movPosibles[0][1] = columna - 1;
                    }
                    if (columna < 7 && !casilla[fila-1][columna+1]) {
                        System.out.println("aqui10");
                        movPosibles[1][0] = fila - 1;
                        movPosibles[1][1] = columna + 1;
                    }
                }
            }
            break;
        case "queen-red-piece":
            // Implementación específica para reinas rojas
            break;
        case "queen-white-piece":
            // Implementación específica para reinas blancas
            break;
    }
    if(movPosibles!=null){
        return movPosibles;
    }else{
        return null;
    }
}


    public static void actualizar(int pRow, int pCol, int nRow, int nCol) {
    // Verifica si las posiciones están dentro del rango del tablero
    if (pRow < 0 || pRow >= casilla.length || pCol < 0 || pCol >= casilla[0].length ||
        nRow < 0 || nRow >= casilla.length || nCol < 0 || nCol >= casilla[0].length) {
        System.out.println("Error: Posiciones fuera del rango del tablero.");
        return;
    }
    ficha[nRow][nCol]=ficha[pRow][pCol];
    ficha[pRow][pCol].setEstado(false);
    // Mueve la pieza a la nueva posición
    casilla[nRow][nCol] = casilla[pRow][pCol];
    // Marca la posición anterior como vacía
    casilla[pRow][pCol] = false;
}


}