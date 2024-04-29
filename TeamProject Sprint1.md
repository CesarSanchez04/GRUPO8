**Sprint 1 del Proyecto de Equipo** 

` `Plantilla de Reporte

Nombre del equipo: GRUPO PEPINILLO

Miembros del equipo: <a name="_hlk165277088"></a>LAUTARO QUISPE / CESAR SANCHEZ / BREIMER PALACIOS

**I. Microcarta del Proyecto**

**Nombre del proyecto:** Juego de Damas 

**Declaración de visión:** Crear la plataforma de juego de damas en línea más interactiva y accesible, proporcionando una experiencia de usuario excepcional el cual se pueda jugar en línea o contra un computador.

Declaración de misión/propósito del proyecto: Facilitar un entorno digital seguro y emocionante donde los jugadores puedan disfrutar del clásico juego de damas, mejorar sus habilidades estratégicas y competir contra otros jugadores o contra la inteligencia artificial, siempre considerando las reglas clásicas del juego de damas, ya que el juego de damas implementará que se puedan mover las fichas correctamente, los movimientos obligatorios (cuando se tiene la posibilidad de comer una ficha rival), los movimientos adicionales que se dan luego de un movimiento obligatorio, la posibilidad de convertir a una ficha en ficha reina cuando llegue al otro lado del tablero, ser ficha reina te da la ventaja de poder moverte en todas sus diagonales en un bloque si es que sea posible, la visualización de los movimientos posibles de cada ficha cuando se seleccione.

**Elevator Pitch:** Juego de Damas es la nueva forma de jugar damas en línea. Con opciones para jugar contra amigos o contra una inteligencia artificial desafiante, nuestra plataforma ofrece una experiencia de juego emocionante y accesible para todos los niveles de habilidad, disponible en cualquier momento y en cualquier lugar.

**Valor de negocio:** Aumento de la retención de usuarios y creación de una comunidad activa de jugadores, lo cual puede monetizarse a través de publicidad, membresías premium y ventas de contenido digital exclusivo como tableros y piezas personalizadas.

**Clientes y usuarios:** El juego está dirigido a entusiastas del juego de damas de todas las edades, desde jóvenes estudiantes que buscan mejorar su pensamiento estratégico hasta adultos y personas mayores que disfrutan de juegos de mesa clásicos. Los clientes potenciales incluyen también escuelas y clubes de juegos que buscan herramientas digitales para sus actividades.

**Métricas:** La efectividad del negocio se medirá a través de la adquisición de nuevos usuarios, la tasa de retención de usuarios, la duración de las sesiones de juego y el ingreso promedio por usuario (ARPU).

**Hitos:**

Completar un prototipo jugable que incluya funcionalidades básicas como inicio de sesión, registro de usuarios, y la capacidad de iniciar y jugar una partida básica de damas.

Finalizar la integración de un algoritmo de inteligencia artificial capaz de ofrecer varios niveles de dificultad para jugar contra la computadora.

Realizar pruebas de usabilidad con usuarios reales para identificar y corregir problemas de interfaz y experiencia de usuario.

**Riesgos:**

Enfrentar problemas de rendimiento debido a la carga simultánea de múltiples partidas, lo que puede afectar la experiencia del usuario.

Dificultades en el desarrollo de un sistema de IA que sea desafiante pero justo, especialmente en niveles avanzados.

Autores de esta microcarta: LAUTARO QUISPE / CESAR SANCHEZ / BREIMER PALACIOS

1. **Historias de usuarios**

|<a name="_hlk165274636"></a>**ID**|**Nombre de la historia de usuario**|**Descripción de la historia de usuario**|**Prioridad**|**Esfuerzo estimado (horas)**|**Esfuerzo real (si se completa)**|**Estado (completado, pendiente, en <a name="_int_b5s0x91r"></a>curso )**|**Desarrollador**|
| :- | :- | :- | :- | :- | :- | :- | :- |
|1|Registro del jugador|Como nuevo jugador de DamasCity necesito registrarme en la plataforma para poder acceder al juego y participar en partidas contra otros usuarios o jugar con las damas americanas con el computador.|ALTA|3|3|COMPLETADO|<p>LAUTARO</p><p></p>|
|2|Inicio de sesión|Como jugador ya registrado, cuando quiera acceder a mi cuenta, necesito iniciar sesión con mi nickname y poder jugar en la aplicación|ALTA|1|-|EN CURSO|CESAR|
|3|Cierre de sesión|El Jugador cuando entre a plataforma puede tener la opcion de cierre de sesion esto con la finalidad de poder cerrar su cuenta|ALTA|1|-|EN CURSO|CESAR|
|4|Funcionabilidad de las fichas|La operatividad de la partida depende principalmente de la funcionabilidad de las fichas y las acciones debidamente implementadas de ellas, y de la lógica relacionada|ALTA|3|-|EN CURSO|LAUTARO|
|5|Funcionabilidad del tablero|La operatividad de la partida depende del tablero que abarca las fichas, además de las funciones conexas a ella|ALTA|8|-|EN CURSO|BREIMER|
|6|Modo de juego 1vs1|Como modo de juego 1vs1 se espera una formidable jugabilidad entre ambos jugadores respetándose las reglas del juego|ALTA|4|-|PENDIENTE|BREIMER|
|7|Modo de juego 1vsPC|Como modo de juego 1vsPC se espera una lógica aceptable por movimientos de la CPU, que sea capaz de dar una partida decente con la opción de ganar|ALTA|11|-|PENDIENTE|BREIMER|

1. **Criterios de Aceptación (AC)**

|<a name="_hlk165275493"></a>**ID y nombre de la historia del usuario**|**ACID**|**Descripción del criterio de aceptación**|**Estado (completado, pendiente, en progreso)**|**Desarrollador**|
| :- | :- | :- | :- | :- |
|1 Historia uno|1\.1|Dado un nickname único y válido, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico válido Cuando se crea una cuenta con estos datos Entonces el sistema debería crear una nueva cuenta |COMPLETADO|<p>LAUTARO</p><p></p>|
||1\.2|Dado un nickname que ya existe Cuando se intenta crear una cuenta con este nickname, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico válido Entonces el sistema no debería crear una nueva cuenta y debería mostrar un mensaje de error|<p>COMPLETADO</p><p></p>|CESAR|
||1\.3|Dado un nickname válido, una contraseña inválida sin al menos una mayúscula o un carácter especial, y un correo electrónico válido Cuando se intenta crear una cuenta con estos datos Entonces el sistema no debería crear una nueva cuenta Y debería mostrar un mensaje de error|<p>COMPLETADO</p><p></p>|LAUTARO|
||1\.4|Dado un nickname válido sin ningún número, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico válido Cuando se intenta crear una cuenta con estos datos Entonces el sistema no debería crear una nueva cuenta Y debería mostrar un mensaje de error|COMPLETADO|CESAR|
||1\.5|Dado que el usuario se encuentra en el formulario de registro Cuando hace clic en la opción para regresar al menú principal Entonces el sistema debería redirigir al usuario al menú principal|COMPLETADO|LAUTARO|
||1\.6|Dado un nickname válido, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico inválido Cuando se intenta crear una cuenta con estos datos Entonces el sistema no debería crear una nueva cuenta y debería mostrar un mensaje de error|EN PROGRESO|LAUTARO|
|2 Historia dos|2\.1|Dado un usuario y contraseña para realizar la validacion Cuando se realice el envio del formulario Entonces el sistema tendrá que validar si existe y coinciden el usuario con la contraseña asignada|COMPLETADO|BREIMER|
||2\.2|Dado un usuario y contraseña que no corresponde Cuando suceda este evento se reportara un error Entonces el sistema mostrará un anuncio de contraseña incorrecta si es que el caso lo amerita|EN PROGRESO|BREIMER|
||2\.3|Dado que el usuario se encuentra en el formulario de registro Cuando hace clic en la opción para regresar al menú principal Entonces el sistema debería redirigir al usuario al menú principal|EN PROGRESO|BREIMER|
|3 Historia 3|3\.1|Dado una ficha cualquiera con un movimiento posible Cuando se intenta realizar el movimiento de la ficha en una posicion posible Entonces el sistema deberia cambiar la posicion de la ficha de manera exitosa|EN PROGRESO|LAUTARO|
||3\.2|Dada una ficha que tenga la oportunidad de comer una ficha rival Cuando se tenga esta oportunidad el usuario tendrá la obligación de realizar el movimiento obligatorio para comer la ficha Entonces el sistema automaticamente cuando suceda este evento le mostrará el movimiento obligatorio al usuario para que lo realice|EN PROGRESO|CESAR|
|<p></p><p></p>|3\.3|Dada una ficha seleccionada por el usuario Cuando el usuario seleccione una ficha se le deberá mostrar los movimientos posibles que tiene Entonces el sistema mostrará de un color diferente en el tablero las opciones de movimiento que posee el jugador con la ficha seleccionada|PENDIENTE|BREIMER|
||3\.4|Dada una ficha que llego al otro extremo del tablero Cuando esto suceda la ficha tendrá la opcion de moverse en todas sus diagonales y ya no solo en las 2 como en una ficha peon, diferenciando adicionalmente a la ficha con una corona encima de la ficha Entonces el sistema mostrará al usuario la ficha reina distintiva y cuando se le seleccione se le mostrará si es que amerita el caso movimientos posibles en todas sus diagonales mientras dure la partida|PENDIENTE|LAUTARO|
||3\.5|Dada una ficha de cualquiera de los 2 equipos Cuando se muestre el tablero se verán fichas de 2 colores diferentes para distinguir el equipo asignado Entonces el sistema mostrará el color de las fichas de diferente equipo con un color diferente|PENDIENTE|CESAR|
||3\.6|Dada una ficha que acaba de comer a una ficha rival (movimiento obligatorio) Cuando suceda este evento al jugador respectivo se le asignará un movimiento adicional por haber comido una ficha rival Entonces el sistema le permitirá realizar otro movimiento al jugador|PENDIENTE|BREIMER|
||3\.7|Dado el suceso de que el jugador posea un movimiento obligatorio y desee mover otra ficha Cuando este evento sucesa no se le podrá permitir al jugador mover otra ficha que no sea la que tiene movimiento obligatorio Entonces el sistema solo permitirá realizar movimeintos en la ficha permitida|PENDIENTE|LAUTARO|
|4 Historia 4|4\.1|Dado el inicio de una partida se les permitirá a los jugadores la opcion de elegir el color del equipo que deseen Cuando se inicie la partida se podrá elegir el equipo correspondiente|EN PROGRESO|CESAR|
||4\.2|Dado el final de la partida se puede volver a jugar Cuando se acabe la partida se le da la opcion al usuario de volver a jugar otra partida Entonces el sistema permitirá el juego de otra partida si es que el usuario lo desea|PENDIENTE|LAUTARO|
||4\.3|Dado un juego de ajedrez se tiene la opcion de volver al menu Cuando el usuario decida se podrá volver al menu Entonces el sistema volverá al menu cuando el usuario lo desee|PENDIENTE|LAUTARO|
||4\.4|Dado que un jugador realice su jugada se realizará el cambio de turno Cuando el jugador acabe su jugada le tocará al otro jugador relizar su jugada Entonces el sistema le permitirá mover ficha al otro jugador cuando acabe el turno del jugador|PENDIENTE|<p>CESAR</p><p></p>|
||4\.5|Dado el final de la partida se dará cuando uno de los dos jugadores se queden sin fichas Cuando uno de los dos jugadores se queden sin fichas el otro jugador automaticamente gana la partida Entonces el sistema mostrará un anuncio al jugador ganador de que ganó la partida|PENDIENTE|BREIMER|
|5 Historia 5|5\.1|Dado el modo de juego 1vs1 seleccionado Cuando se inicie el modo de juego se le pedirá un nickname al segundo jugador Entonces el sistema tendrá que solicitar y recopilar el nickname dado|PENDIENTE|LAUTARO|
||5\.2|Dada una partida en curso Cuando un jugador realice un movimiento valido Entonces el sistema tendrá que registrarlo y efectuar el movimiento requerido|PENDIENTE|CESAR|
|6 Historia 6|6\.1|Dado el modo de juego 1vsPC seleccionado Cuando sea el turno de PC, la maquina tendrá que efectuar el mejor movimiento a realizar con la inteligencia dada por el sistema Entonces el sistema tendrá que realizar el movimiento usando el algoritmo empleado|PENDIENTE|BREIMER|


1. **Calificaciones de amigos**

Si no se siente cómodo al incluir sus calificaciones en este informe, puede enviarlas por correo electrónico al instructor o al calificador.

<table><tr><th rowspan="6" valign="top"><p></p><p></p><p></p><p><a name="_hlk165278655"></a><i>Dador de calificación</i></p></th><th colspan="5" valign="top"><i>Receptor de calificación</i></th></tr>
<tr><td valign="top"></td><td valign="top">CESAR SANCHEZ</td><td valign="top">LAUTARO QUSPE</td><td valign="top">BREIMER PALACIOS</td></tr>
<tr><td valign="top">CESAR SANCHEZ</td><td valign="top"></td><td valign="top"></td><td valign="top"></td></tr>
<tr><td valign="top">LAUTARO QUISPE</td><td valign="top"></td><td valign="top"></td><td valign="top"></td></tr>
<tr><td valign="top">BREIMER PALACIOS</td><td valign="top"></td><td valign="top"></td><td valign="top"></td></tr>
<tr><td valign="top">Promedio</td><td valign="top"></td><td valign="top"></td><td valign="top"></td></tr>
<tr><td valign="top"></td></tr>
</table>


