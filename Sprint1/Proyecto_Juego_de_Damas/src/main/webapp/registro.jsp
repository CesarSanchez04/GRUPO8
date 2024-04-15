<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juego de Damas</title>
    <style type="text/css">
        /* Estilos CSS */
        body {
            font-family: 'Arial Black', Gadget, sans-serif;
            background-image: url('FONDO_DAMAS.jpeg'); /* Cambia 'ruta_de_la_imagen.jpg' por la ruta de tu imagen de fondo */
            background-size: cover;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            justify-content: center; /* Centra verticalmente el contenido */
            align-items: center; /* Centra horizontalmente el contenido */
            height: 100vh;
        }

        h1 {
            text-align: center;
            margin-top: 50px; /* Mayor margen superior para el título */
            margin-bottom: 20px;
            color: #FFFFFF; /* Blanco */
            text-shadow: 2px 2px #000000; /* Sombra */
            font-size: 36px; /* Tamaño de fuente más grande */
            font-style: italic; /* Estilo de fuente */
        }

        form {
            text-align: center;
            font-size: 18px;
            color: #000000;
            /*background-color: rgba(0, 0, 0, 0.5); /* Fondo negro con opacidad 
            padding: 20px;
            border-radius: 10px;*/
            display: flex;
            flex-direction: column; /* Formulario vertical */
            align-items: center; /* Centra los elementos horizontalmente */
        }
        input[type="text"],
        input[type="email"],
        input[type="password"]{
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
            background-color: #FFFFFF; 
            color: #000000;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            width: 100%; /* Ancho completo */
        }
        
        input[type="submit"] {
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
            background-color: #808080; /* Gris rata */
            color: #FFFFFF; /* Blanco */
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            width: 100%; /* Ancho completo */
        }

        input[type="submit"]:hover {
            background-color: #A9A9A9; /* Gris rata más claro al pasar el cursor */
        }
    </style>
</head>
<body>
    <h1>Registrate para Jugar</h1>
    <form action="SvUsuario" method="POST">
        <label for="nickname">Nickname:</label>
        <input type="text" id="nickname" name="nickname" required>

        <label for="email">Correo Electrónico:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Registrarse">
    </form>
    <form  action="index.jsp" method="get">
        <input type="submit" value="Regresar" />
    </form>
</body>
</html>
