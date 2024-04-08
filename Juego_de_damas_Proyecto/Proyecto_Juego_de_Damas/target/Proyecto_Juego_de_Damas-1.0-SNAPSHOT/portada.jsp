<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        /* Estilo para el tablero de damas */
        .tablero {
            display: grid;
            grid-template-columns: repeat(8, 50px); /* Define 8 columnas de 50px cada una */
            grid-template-rows: repeat(8, 50px); /* Define 8 filas de 50px cada una */
            border: 1px solid black; /* Borde del tablero */
        }
        .casilla {
            width: 50px;
            height: 50px;
        }
        .casilla-verde {
            background-color: #BDB76B; /* Color verde bambú */
        }
        .casilla-beige {
            background-color: #F5F5DC; /* Color beige pastel */
        }
        .borde-numerado {
            display: grid;
            grid-template-columns: auto 1fr; /* Una columna para el borde numerado y otra para el tablero */
            grid-template-rows: auto;
        }
        .borde-numerado .numeracion {
            display: grid;
            grid-template-rows: repeat(8, 50px); /* 8 filas de 50px cada una */
            justify-items: center; /* Centrar horizontalmente */
        }
        .borde-numerado .numeracion div {
            display: flex;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>
<body>
    <h1>Tablero de Damas</h1>
    <div class="borde-numerado">
        <div class="numeracion">
            <% for (int i = 8; i > 0; i--) { %>
                <div><%= i %></div> <!-- Numeración de arriba hacia abajo -->
            <% } %>
        </div>
        <div class="tablero">
            <% 
                boolean esVerde = true; // Variable para alternar entre casillas verdes y beige
                for (int fila = 0; fila < 8; fila++) {
                    for (int columna = 0; columna < 8; columna++) {
                        if (esVerde) { %>
                            <div class="casilla casilla-verde"></div>
                        <% } else { %>
                            <div class="casilla casilla-beige"></div>
                        <% }
                        esVerde = !esVerde; // Alternar entre casillas verdes y beige
                    }
                    esVerde = !esVerde; // Al final de cada fila, invertir para empezar con el otro color en la siguiente fila
                } 
            %>
        </div>
    </div>
    <div style="text-align: center;"> <!-- Centrar la numeración -->
        <% for (char c = 'A'; c <= 'H'; c++) { %>
            <span><%= c %></span> <!-- Letras de izquierda a derecha -->
        <% } %>
    </div>
</body>
</html>
