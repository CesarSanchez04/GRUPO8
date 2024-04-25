/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestServelets;

import com.poyectodamas.proyecto_juego_de_damas.servelets.SvUsuario;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import javax.servlet.http.*;
import logica.Controlador;
import logica.Usuario;

public class SvUsuarioTest extends SvUsuario {

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private HttpSession session;
    @Mock private Controlador control;
    @InjectMocks private SvUsuario servlet;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(request.getSession()).thenReturn(session);
    }
    
    @Test
    public void testCrearCuentaConDatosValidos() throws Exception {
        when(request.getParameter("nickname")).thenReturn("user123");
        when(request.getParameter("password")).thenReturn("Password@1");
        when(request.getParameter("email")).thenReturn("user@example.com");
        when(control.validarNickname(anyString())).thenReturn(false);
        when(control.validarEmail(anyString())).thenReturn(false);

        servlet.doPost(request, response);

        verify(control, times(1)).crearUsuario(any(Usuario.class));
        verify(response).sendRedirect("principal.jsp");
    }
    
    @Test
    public void testContrasenaInvalida() throws Exception {
        when(request.getParameter("nickname")).thenReturn("user123");
        when(request.getParameter("password")).thenReturn("password"); // Sin mayúsculas ni caracteres especiales
        when(request.getParameter("email")).thenReturn("user@example.com");
        when(control.validarNickname(anyString())).thenReturn(false);
        when(control.validarEmail(anyString())).thenReturn(false);

        servlet.doPost(request, response);

        verify(control, never()).crearUsuario(any(Usuario.class));
        verify(request).getRequestDispatcher("registro.jsp");
    }
    
    @Test
    public void testRedireccionAMenuPrincipal() throws Exception {
        servlet.doGet(request, response);

        verify(response).sendRedirect("registro.jsp");
    }
    
    @Test
    public void testEmailInvalido() throws Exception {
        when(request.getParameter("nickname")).thenReturn("user123");
        when(request.getParameter("password")).thenReturn("Password@1");
        when(request.getParameter("email")).thenReturn("user@");
        when(control.validarNickname(anyString())).thenReturn(false);
        when(control.validarEmail(anyString())).thenReturn(true);

        servlet.doPost(request, response);

        verify(control, never()).crearUsuario(any(Usuario.class));
        verify(request).getRequestDispatcher("registro.jsp");
    }


}