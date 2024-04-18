<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juego de Damas</title>
    <link rel="stylesheet" href="./styles.css"/>

</head>
<body>
    <header>
        <h1>JUEGO DE DAMAS</h1>
    </header>
    <main>
        <div class="cuadrado"></div>
        <h1 class='titulo'>Registrate para Jugar</h1>
        <% if (request.getAttribute("errores") != null) { %>
            <div class="error">
                <% List<String> errores = (List<String>) request.getAttribute("errores");
                   for (String error : errores) { %>
                       <p><%= error %></p>
                <% } %>
            </div>
        <% } %>
        <form action="SvUsuario" method="POST">
            <label for="nickname">
                <span>Nickname:</span>
                <input type="text" id="nickname" name="nickname" required>
            </label>

            <label for="email">
                <span>Correo Electronico:</span>
                <input type="email" id="email" name="email" required>
            </label>

            <label for="password">
                <span>Contraseña:</span>
                <input type="password" id="password" name="password" required>
            </label>
            <input type="submit" value="Registrarse">
        </form>
        <form action="index.jsp" method="get">
            <input type="submit" value="Regresar" />
        </form>
    </main>
</body>
</html>
