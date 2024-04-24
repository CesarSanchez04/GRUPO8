/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author casm7
 */
public class Ficha {
    private final Color color; // Color de la ficha
    private boolean esRey; // Estado que indica si la ficha es un rey

    // Constructor para inicializar una ficha con un color específico y no como rey
    public Ficha(Color color) {
        this.color = color;
        this.esRey = false; // Las fichas se inicializan como no reyes
    }

    // Retorna el color de la ficha
    public Color getColor() {
        return color;
    }

    // Establece una ficha como rey
    public void coronar() {
        esRey = true;
    }

    // Verifica si la ficha es un rey
    public boolean esRey() {
        return esRey;
    }
    
}


