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
            background-color: #8B4513; /* Marrón */
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #FFFFFF; /* Blanco */
            text-shadow: 2px 2px #000000; /* Sombra */
        }

        form {
            text-align: center;
            display: flex;
            flex-direction: column;
            align-items: center;
            width: 300px; /* Ancho del formulario */
        }

        label {
            color: #FFFFFF; /* Blanco */
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            margin-bottom: 15px;
            padding: 10px;
            width: 100%; /* Ancho completo */
            border-radius: 5px;
            border: none;
        }

        input[type="submit"] {
            margin-top: 10px;
            padding: 10px 20px;
            font-size: 16px;
            background-color: #FFD700; /* Dorado */
            color: #000000; /* Negro */
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #FFA500; /* Naranja */
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