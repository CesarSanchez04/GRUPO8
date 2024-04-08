<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tablero de Damas</title>
    <style>
        body {
            font-family: 'Arial Black', Gadget, sans-serif;
            background-color: #808080; /* Gris rata */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .tablero {
            position: relative;
            width: 300px; /* Ajusta el ancho del tablero según sea necesario */
            height: 300px; /* Ajusta la altura del tablero según sea necesario */
        }

        img {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        .numeracion {
            position: absolute;
            top: 0;
            bottom: 0;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            margin-left: 10px; /* Ajusta el margen izquierdo según sea necesario */
        }

        .numeracion div {
            width: 10px;
            text-align: center;
        }

        .letras {
            position: absolute;
            left: 0;
            right: 0;
            bottom: calc(100% + 20px); /* Ajusta el espacio entre las letras y el tablero según sea necesario */
            display: flex;
            justify-content: space-between;
            margin-top: 20px; /* Ajusta el margen superior según sea necesario */
        }

        .letras span {
            width: 10px;
            text-align: center;
        }

        /* Estilos para el cuadro de usuario */
        .user-box {
            position: absolute;
            top: 10px; /* Ajusta la posición vertical según sea necesario */
            left: 10px; /* Ajusta la posición horizontal según sea necesario */
            background-color: #FFFFFF; /* Color de fondo */
            padding: 10px; /* Espaciado interno */
            border-radius: 5px; /* Borde redondeado */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Sombra */
        }

        .user-box img {
            width: 30px; /* Tamaño de la imagen */
            height: 30px;
            border-radius: 50%; /* Borde redondeado para la imagen */
            margin-right: 5px; /* Espacio entre la imagen y el texto */
        }
    </style>
</head>
<body>
    <div class="user-box">
        Usuario: Tu Nombre
    </div>

    <div class="tablero">
        <img src="TABLERO.png" alt="Tablero de Damas">
    </div>

    
</body>
</html>
