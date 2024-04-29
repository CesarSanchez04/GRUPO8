/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/Tablerito.js to edit this template
 */

let turno = 'rojo';
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
                    // Solo permitir clics en las fichas del color correspondiente al turno actual
                    if ((turno === 'rojo' && piece.className.includes('red-piece')) || 
                        (turno === 'blanco' && piece.className.includes('white-piece'))) {
                        selectPiece(row, col, piece.className);
                    }
                });
                cell.appendChild(piece);
            }
            board.appendChild(cell);
            isBlack = !isBlack;
        }
        isBlack = !isBlack;
    }
}
createBoard();
function selectPiece(row, col, clase) {
    clearEventListeners(); 
    clearHighlightedCells();
    console.log("Row: ", row);
    console.log("Col: ", col);
    console.log("Clase: ", clase);
    const requestData = {
        row: row,
        col: col,
        className: clase
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
        
        if (data.movimientosPosibles) {
            data.movimientosPosibles.forEach(move => {
                const fila = move.fila;
                const columna = move.columna;
                console.log("Movimiento posible - Fila:", fila, "Columna:", columna);
                showPossibleMove(fila, columna);
                // Haz algo con la fila y la columna, por ejemplo, mostrarlas en la interfaz
                const cell = document.querySelector(`.cell[data-row="${fila}"][data-col="${columna}"]`);
                cell.addEventListener('click', () => movePiece(row, col, fila, columna, clase));
                
            });
        } else if (data.error) {
            console.log("Error:", data.error);
            // Haz algo con el mensaje de error, por ejemplo, mostrarlo en la interfaz
        }
        
    })    
    .catch(error => console.error('Error:', error));
    /* 
     * Capturar las celdas amarillas disponibles y asociar un click a esas casillas
     * Dado que se da click, desaparecer esa ficha dentro del div de la casilla original
     * y colocar la ficha en la nueva casilla donde se da click. 
     */
}
function clearEventListeners() {
    const cells = document.querySelectorAll('.cell');
    
    cells.forEach(cell => {
        const newCell = cell.cloneNode(true); // Clona la celda para eliminar los eventListeners
        cell.parentNode.replaceChild(newCell, cell); // Reemplaza la celda actual con la clonada
    });
}
function movePiece(originalRow, originalCol, newRow, newCol, className) {
        // Encuentra la celda original y la nueva
    const originalCell = document.querySelector(`.cell[data-row="${originalRow}"][data-col="${originalCol}"]`);
    const newCell = document.querySelector(`.cell[data-row="${newRow}"][data-col="${newCol}"]`);
    console.log(originalCell)
    console.log(newCell)
    const requestData = {
        row: originalRow,
        col: originalCol,
        Nrow: newRow,
        Ncol: newCol
    };

    fetch('http://localhost:8080/Proyecto_Juego_de_Damas/MovePieceServlet', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(requestData)
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        
    })    
    .catch(error => console.error('Error:', error));
    // Mueve la ficha
    const piece = originalCell.querySelector('.piece');
    newCell.appendChild(piece);
    
    
    clearHighlightedCells(); // Limpia cualquier celda resaltada
    toggleTurn();
}
function toggleTurn() {
    turno = turno === 'rojo' ? 'blanco' : 'rojo';
}

function showPossibleMove(fila, columna) {
    // Obtenemos la celda correspondiente a la fila y columna proporcionadas
    const cell = document.querySelector(`.cell[data-row="${fila}"][data-col="${columna}"]`);
    
    // Si encontramos la celda, la sombreamos
    if(fila===0 && columna===0){
        console.error("No se encontró la celda para sombrear");
    }
    else{
        cell.style.backgroundColor = 'yellow';
    }
}
function clearHighlightedCells() {
    // Obtener todas las celdas del tablero
    const cells = document.querySelectorAll('.cell');
    
    // Iterar sobre todas las celdas y borrar el sombreado
    cells.forEach(cell => {
        cell.style.backgroundColor = ''; // Borrar el color de fondo
    });
}
