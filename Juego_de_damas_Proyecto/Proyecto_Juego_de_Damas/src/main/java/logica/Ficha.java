/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author lauta
 */
public class Ficha {
    private int fila;
    private int columna; 
    private String color;  // color: rojo reina, rojo peon, blanco, blanco peon
    private boolean estado=true;     // vivo o muerto 

    public Ficha(int fila, int columna, String color, boolean estado) {
        this.fila = fila;
        this.columna = columna;
        this.color = color;
        this.estado=estado; 
    }
    public Ficha() {               
        this.estado=false; 
    }
    
    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getColor() {
        return color;
    }

    public boolean getEstado() {
        return estado;
    }
    
}
