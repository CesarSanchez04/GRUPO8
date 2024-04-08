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
    <style type="text/css">
        /* Estilos CSS */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
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
        }

        form {
            text-align: center;
        }
        

        input[type="submit"] {
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Hello World!</h1>
    
    <div>
    <!-- Formulario para el botón de inicio de sesión -->
    <form action="versus.jsp" method="get">
        <input type="submit" value="1 vs 1" />
    </form>
    
    <!-- Formulario para el botón de registro -->
    <form action="maquina.jsp" method="get">
        <input type="submit" value="Vs Computer" />
    </form>
    </div>
</body>
</html>