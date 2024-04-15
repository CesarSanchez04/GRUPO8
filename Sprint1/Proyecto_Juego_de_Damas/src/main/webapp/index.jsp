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
            /*background-color: rgba(0, 0, 0, 0.5); /* Fondo negro con opacidad */
            /*padding: 20px;
            border-radius: 10px;*/
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
        }

        input[type="submit"]:hover {
            background-color: #A9A9A9; /* Gris rata más claro al pasar el cursor */
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
