# Sprint 1

Objetivos: 

Durante el Sprint 1, el equipo se centrará en establecer las bases del proyecto desarrollando las funciones esenciales para la gestión de usuarios y la preparación del entorno de juego de damas americanas. Esto incluye la implementación de historias de usuario clave como el registro de usuario, inicio de sesión y cierre de sesión, así como la visualización del tablero de juego. El equipo creará un plan de proyecto detallado, especificará los requisitos del producto en forma de historias de usuario y criterios de aceptación, y pondrá en marcha estas funcionalidades fundamentales para proporcionar una experiencia de usuario completa y funcional desde el principio del desarrollo.

**I. Microcarta del Proyecto**

- Nombre del proyecto: DamasCity
- **Declaración de visión:** Acceder a una plataforma de juego de damas online la cual sea interactiva y educativa. La cual proporcione las herramientas necesarias para que los usuarios desarrollen sus habilidades estratégicas en el juego.
- **Declaración de misión/propósito del proyecto:** El propósito de DamasCity es ofrecer un entorno virtual para jugar damas americanas que sea fácil de usar, seguro y entretenido. Buscamos promover la estrategia a través del grabado de partidas, jugar con el computador, fomentando que el usuario eleve su nivel en el juego.
- **Elevator Pitch:** DamasCity es una plataforma en línea que permite a los jugadores disfrutar de emocionantes partidas de damas americanas en cualquier momento y desde cualquier lugar. Con características de gestión de usuarios seguras y un tablero de juego intuitivo, DamasCity ofrece una experiencia de juego única para entusiastas de todas las edades.
- **Valor de negocio:** Nuestro valor radica en proporcionar una plataforma virtual accesible y segura para jugar damas americanas, el correcto grabado de juegos para una retroalimentación de parte de nuestros usuarios, y el juego con computador para elevar su capacidad jugando damas americanas.
- **Clientes y usuarios:** Nuestros clientes son los entusiastas de las damas americanas que buscan una plataforma en línea para jugar y mejorar sus habilidades. Nuestros usuarios incluyen a personas de todas las edades y niveles de habilidad que disfrutan de juegos de estrategia y desean una experiencia de juego confiable.
- **Métricas:** Mediremos el valor del negocio mediante métricas como la cantidad de usuarios activos mensuales, la retención de usuarios, la satisfacción del usuario y la participación en el juego. Además, analizaremos el crecimiento del número de partidas jugadas y la interacción de la comunidad en la plataforma.
- **Hitos:** Los hitos clave incluyen el lanzamiento exitoso de la versión beta del software, la implementación de funciones esenciales como el registro de usuario y el inicio de sesión, y la mejora continua del sistema en respuesta a comentarios de los usuarios.
- **Riesgos:** Los riesgos potenciales incluyen problemas de seguridad de datos, dificultades técnicas en el desarrollo de la plataforma, la no correcta familiarización con la aplicación de parte de los jugadores

# Historias de Usuario

| ID  | Nombre de la historia de usuario | Descripción de la historia de usuario  | Prioridad  | Esfuerzo estimado(Horas) | Esfuerzo real (si se completa) | Estado(Completado Pendiente en curso) | Desarrollador  |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1  | 
Registro del jugador  | Como nuevo jugador de DamasCity necesito registrarme en la plataforma para poder acceder al juego y participar en partidas contra otros usuarios o jugar con las damas americanas con el computador. | Alta  | 3 Horas  | 2 horas  | En curso  | Breimer Palacios  |
| 2  | Inicio de sesión  | Como jugador ya registrado, cuando quiera acceder a mi cuenta, necesito iniciar sesión con mi nickname y poder jugar en la aplicación  | Alta  | 1 hora  | 1 hora | Pendiente | Cesar Sanchez |
| 3  | Cierre de sesión | El Jugador cuando entre a plataforma puede tener la opcion de cierre de sesion esto con la finalidad de poder cerrar su cuenta  | Alta | 1 hora  | —  | Pendiente  | Pedro Lautaro Quispe Ballesteros |

# Criterios de Aceptación

| ID y nombre de la historia del Usuario  | ACID | Descripción del criterio de aceptación | Estado (completado, pendiente, en progreso) | Desarrollador  |
| --- | --- | --- | --- | --- |
| Registro del Jugador | 1.1 Creación exitosa de una cuenta de usuario válida | Dado un nickname único y válido, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico válido
Cuando se crea una cuenta con estos datos
Entonces el sistema debería crear una nueva cuenta
Y mostrar un mensaje de registro exitos | Completado | Breimer |
|  | 1.2 Creación de una cuenta fallida con un nickname existente | Dado un nickname que ya existe
Cuando se intenta crear una cuenta con este nickname, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico válido
Entonces el sistema no debería crear una nueva cuenta
Y debería mostrar un mensaje de error | Completado | Bremier |
|  | AC 1.3 Creación de una cuenta fallida con una contraseña no válida | Dado un nickname válido, una contraseña inválida sin al menos una mayúscula o un carácter especial, y un correo electrónico válido
Cuando se intenta crear una cuenta con estos datos
Entonces el sistema no debería crear una nueva cuenta
Y debería mostrar un mensaje de error | Completado | Lautaro |
|  | 1.4 Creación de una  uenta fallida con un nickname sin número
 | Dado un nickname válido sin ningún número, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico válido
Cuando se intenta crear una cuenta con estos datos
Entonces el sistema no debería crear una nueva cuenta
Y debería mostrar un mensaje de error | Completado | Cesar |
|  | 1.5 Opción de regresar al menú principal desde el formulario de registro | Dado que el usuario se encuentra en el formulario de registro
Cuando hace clic en la opción para regresar al menú principal
Entonces el sistema debería redirigir al usuario al menú principal | Completado  | Cesar |
|  | 1.6 Creación de una cuenta fallida con contraseña válida pero correo electrónico inválido | Dado un nickname válido, una contraseña válida con al menos una mayúscula y un carácter especial, y un correo electrónico inválido
Cuando se intenta crear una cuenta con estos datos
Entonces el sistema no debería crear una nueva cuenta
Y debería mostrar un mensaje de error | Completado  | Breimer |