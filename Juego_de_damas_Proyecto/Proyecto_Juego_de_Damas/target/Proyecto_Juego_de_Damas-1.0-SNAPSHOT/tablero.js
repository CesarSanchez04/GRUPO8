/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function createBoard() {
    const board = document.getElementById('board');
    let isBlack = false;
    for (let row = 0; row < 8; row++) {
        for (let col = 0; col < 8; col++) {
            const cell = document.createElement('div');
            cell.className = 'cell ' + (isBlack ? 'gray' : 'black');
            if (row < 3 && isBlack) { // Colocar fichas negras
                const piece = document.createElement('div');
                piece.className = 'piece white-piece';
                cell.appendChild(piece);
            } else if (row > 4 && isBlack) { // Colocar fichas rojas
                const piece = document.createElement('div');
                piece.className = 'piece red-piece';
                cell.appendChild(piece);
            }
            board.appendChild(cell);
            isBlack = !isBlack;
        }
        isBlack = !isBlack;
    }
}

createBoard(); // Crea el tablero al cargar
