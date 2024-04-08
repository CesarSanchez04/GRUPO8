
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
        }

        input[type="submit"] {
            margin: 10px;
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
    <h1>JUEGO DE DAMAS</h1>
    
    <div>
        <!-- Formulario para el botón de inicio de sesión -->
        <form action="sesion.jsp" method="get">
            <input type="submit" value="Iniciar Sesión" />
        </form>
        
        <!-- Formulario para el botón de registro -->
        <form action="registro.jsp" method="get">
            <input type="submit" value="Registrarse" />
        </form>
    </div>
</body>
</html>

