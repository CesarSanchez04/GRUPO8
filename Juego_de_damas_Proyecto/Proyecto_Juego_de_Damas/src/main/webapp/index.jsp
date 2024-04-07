<%-- 
    Document   : index
    Created on : 4 abr 2024, 18:22:25
    Author     : lauta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
        form {
            max-width: 400px;
            margin: 0 auto;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
    </head>
    <body>
        <h1>Registrate para Jugar</h1>
        <% String hola = "aqui"; %>
        <%= hola %>
        <form action="SvUsuario" method="POST">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>

        <label for="nickname">Nickname:</label>
        <input type="text" id="nickname" name="nickname" required>

        <label for="email">Correo Electrónico:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Registrarse">
    </form>
    </body>
</html>
