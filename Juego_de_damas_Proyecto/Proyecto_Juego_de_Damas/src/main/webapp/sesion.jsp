<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="./styles.css"/>
    <title>Juego de Damas</title>
</head>
<body>
    <header>
        <h1>JUEGO DE DAMAS</h1>
    </header>
    <main>
        <div class='cuadrado'></div>
        <h1>Iniciar sesión</h1>
        <form action="SvSesion" method="POST">        
            <label for="nickname">
                <span>Nickname:</span>
                <input type="text" id="nickname" name="nickname" required>
            </label>

            <label for="password">
                <span>Contraseña:</span>
                <input type="password" id="password" name="password" required>
            </label>
            <input type="submit" value="Ingresar">      
        </form>
    
    <form action="index.jsp" method="get">
        <input type="submit" value="Regresar" />
    </form>
    </main>
    
</body>
</html>
