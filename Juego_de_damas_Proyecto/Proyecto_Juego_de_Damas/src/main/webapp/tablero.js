/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/Tablero.js to edit this template
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
    console.log("Row: ", row);
    console.log("Col: ", col);
    const requestData = {
        row: row,
        col: col
    };

    fetch('http://localhost:8080/Proyecto_Juego_de_Damas/SelectPieceServlet', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(requestData)
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        showPossibleMoves(data);
    })
    .then(data => {
        console.log('Datos recibidos del servlet:', data); // Aquí se agrega el console.log
        showPossibleMoves(data);
    })
    .catch(error => console.error('Error:', error));
    
}
createBoard();
/*
function showPossibleMoves(moves) {
    // Limpiar movimientos anteriores
    document.querySelectorAll('.possible-move').forEach(el => el.classList.remove('possible-move'));
    document.querySelectorAll('.piece').forEach(p => p.classList.remove('selected'));

    // Marcar la ficha seleccionada
    const selectedPiece = document.querySelector(`.cell[data-row="${moves.origin.row}"][data-col="${moves.origin.col}"] .piece`);
    selectedPiece.classList.add('selected');

    // Resaltar movimientos posibles
    moves.possibleMoves.forEach(move => {
        const cell = document.querySelector(`.cell[data-row="${move.row}"][data-col="${move.col}"]`);
        cell.classList.add('possible-move');
        cell.addEventListener('click', () => movePiece(moves.origin.row, moves.origin.col, move.row, move.col), { once: true });
    });
}

function movePiece(row, col) {
    fetch(`/MovePieceServlet?originRow=${originRow}&originCol=${originCol}&targetRow=${targetRow}&targetCol=${targetCol}`, { method: 'GET' })
    .then(response => response.json())
    .then(data => {
        updateBoard(data);
    })
    .catch(error => console.error('Error:', error));
}

function updateBoard(data) {
    // Actualizar el tablero según la respuesta del servidor
    if (data.moveValid) {
        const originCell = document.querySelector(`.cell[data-row="${data.origin.row}"][data-col="${data.origin.col}"]`);
        const targetCell = document.querySelector(`.cell[data-row="${data.target.row}"][data-col="${data.target.col}"]`);

        // Mover la ficha visualmente
        const piece = originCell.removeChild(originCell.querySelector('.piece'));
        targetCell.appendChild(piece);

        // Limpiar todas las casillas sombreadas
        document.querySelectorAll('.possible-move').forEach(el => el.classList.remove('possible-move'));
        document.querySelectorAll('.selected').forEach(p => p.classList.remove('selected'));
    } else {
        alert("Movimiento inválido. Intente nuevamente.");
    }
}

*/