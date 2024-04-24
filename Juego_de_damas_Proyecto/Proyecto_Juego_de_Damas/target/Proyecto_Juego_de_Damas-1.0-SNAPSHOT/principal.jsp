
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     
    <% HttpSession sesion= request.getSession();
       String usuario=(String)request.getSession().getAttribute("nickname");
       if(usuario==null){
          response.sendRedirect("sinlogin.jsp");
        }
      %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juego de Damas</title>
    <link rel="stylesheet" href="./styles.css"/>
</head>
<body>
    <header>
        <h1>JUEGO DE DAMAS</h1>
    </header>
    
    <main>
        <div class='cuadrado2'></div>
        <h1>Modo de juego</h1>
    
        <div>
        <!-- Formulario para el botón de inicio de sesión -->
        <form action="TablerNuevo.jsp" method="get">
            <input type="submit" value="1 vs 1" />
        </form>
    
        <!-- Formulario para el botón de registro -->
        <form action="TablerNuevo.jsp" method="get">
            <input type="submit" value="Vs Computer" />
        </form>
        </div>
        
    </main>
    
</body>
</html>