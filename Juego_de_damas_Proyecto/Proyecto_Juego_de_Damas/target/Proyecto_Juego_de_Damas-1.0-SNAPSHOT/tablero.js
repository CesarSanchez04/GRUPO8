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
            cell.className = 'cell ' + (isBlack ? 'black' : 'gray');
            cell.dataset.row = row;
            cell.dataset.col = col;
            
            if ((row < 3 || row > 4) && isBlack) { // Posicionar fichas
                const piece = document.createElement('div');
                piece.className = 'piece ' + (row < 3 ? 'white-piece' : 'red-piece');
                piece.addEventListener('click', function() {
                    selectPiece(row, col);
                });
                cell.appendChild(piece);
            }
            board.appendChild(cell);
            isBlack = !isBlack;
        }
        isBlack = !isBlack;
    }
}

function selectPiece(row, col) {
    fetch(`/SelectPieceServlet?row=${row}&col=${col}`, { method: 'GET' })
    .then(response => response.json())
    .then(data => {
        showPossibleMoves(data);
    })
    .catch(error => console.error('Error:', error));
}

function showPossibleMoves(moves) {
    // Limpiar movimientos anteriores
    document.querySelectorAll('.possible-move').forEach(el => el.classList.remove('possible-move'));

    // Resaltar movimientos posibles
    moves.forEach(move => {
        const cell = document.querySelector(`.cell[data-row="${move.row}"][data-col="${move.col}"]`);
        cell.classList.add('possible-move');
        cell.addEventListener('click', () => movePiece(move.row, move.col));
    });
}

function movePiece(row, col) {
    // Lógica para mover la ficha seleccionada a la nueva posición
    // y comunicación con el servidor si es necesario
}