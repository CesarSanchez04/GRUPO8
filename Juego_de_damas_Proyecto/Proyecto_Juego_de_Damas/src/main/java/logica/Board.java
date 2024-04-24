/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author lauta
 */
public class Board {
    private Ficha[][] casillas; // Un tablero 8x8 para las fichas

    public Board() {
        casillas = new Ficha[8][8];
        inicializarTablero();
    }

    private void inicializarTablero() {
        // Inicializa las fichas en sus posiciones estándar de inicio
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) { // Solo en casillas negras (o grises)
                    if (i < 3) {
                        casillas[i][j] = new Ficha(Color.ROJO);
                    } else if (i > 4) {
                        casillas[i][j] = new Ficha(Color.BLANCO);
                    }
                }
            }
        }
    }

    public boolean movePiece(int originRow, int originCol, int targetRow, int targetCol) {
        // Valida el movimiento antes de ejecutarlo
        if (isValidMove(originRow, originCol, targetRow, targetCol)) {
            Ficha ficha = casillas[originRow][originCol];
            casillas[targetRow][targetCol] = ficha; // Mover ficha al nuevo lugar
            casillas[originRow][originCol] = null; // La posición original ahora está vacía
            return true;
        }
        return false;
    }

    private boolean isValidMove(int originRow, int originCol, int targetRow, int targetCol) {
        // Implementa las reglas de los movimientos (incluyendo saltar sobre fichas enemigas)
        // Considera las fichas normales y los reyes con movimientos en ambas direcciones

        if (casillas[originRow][originCol] == null) return false; // No hay ficha en la posición origen
        if (casillas[targetRow][targetCol] != null) return false; // La posición destino está ocupada

        // Ejemplo de validación simple: movimiento diagonal de una casilla sin captura
        if (Math.abs(targetRow - originRow) == 1 && Math.abs(targetCol - originCol) == 1) {
            return true;
        }

        // Aquí puedes añadir más lógica para manejar capturas, movimientos de reyes, etc.
        return false;
    }
}
