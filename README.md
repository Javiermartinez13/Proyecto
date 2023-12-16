
F1 Team Manager
Descripción
Bienvenido al F1 Team Manager, una aplicación simple de gestión de escuderías de Fórmula 1. Esta aplicación te permite crear y administrar escuderías, agregar pilotos, coches, motores y neumáticos, así como visualizar y eliminar escuderías. A continuación, encontrarás información importante para usuarios y desarrolladores.

Para Usuarios
Requisitos del Sistema
Java Runtime Environment (JRE) instalado en tu máquina.
Cómo Iniciar la Aplicación
Descarga el archivo ejecutable F1TeamManager.jar desde la página de lanzamientos.
Ejecuta el archivo F1TeamManager.jar haciendo doble clic.
Sigue las instrucciones del menú para crear, visualizar y eliminar escuderías.
Notas de Uso
Crear Escudería: Puedes crear una nueva escudería ingresando información sobre pilotos, coches, motores y neumáticos.
Mostrar Escuderías: Visualiza la información detallada de todas las escuderías registradas.
Eliminar Escudería: Elimina una escudería ingresando su nombre.
Guardar Datos
Los datos se guardan automáticamente al cerrar la aplicación.
Puedes reiniciar la aplicación y cargar datos previos al reiniciar.
Para Desarrolladores
Requisitos de Desarrollo
Java Development Kit (JDK) 8 o superior.
IDE compatible con Java (Eclipse, IntelliJ, etc.).
Estructura del Proyecto
El proyecto está dividido en paquetes (dominio, interfaz, main) para una organización clara.
La lógica de dominio se encuentra en el paquete dominio.
La interfaz de usuario y la gestión del menú están en el paquete interfaz.
El punto de entrada principal está en la clase Main del paquete main.
Archivos Importantes
Menu.java: Clase que gestiona el menú y la interacción con el usuario.
Escuderia.java, Coche.java, Piloto.java, Motor.java, Neumaticos.java: Clases que representan entidades del dominio.
Main.java: Clase principal con el método main para iniciar la aplicación.
F1TeamManager.jar: Archivo ejecutable para usuarios finales.
Almacenamiento de Datos
Los datos se almacenan en el archivo escuderias.dat utilizando serialización.
Los datos se cargan al iniciar la aplicación y se guardan al cerrar.
Contribuciones
Siéntete libre de realizar mejoras y contribuciones al proyecto.
Abre problemas (issues) para informar sobre errores o sugerir nuevas características.
Construcción del Proyecto
Abre el proyecto en tu IDE.
Compila y ejecuta Main.java para iniciar la aplicación.
Dependencias
No hay dependencias externas, solo utiliza las clases estándar de Java.
¡Disfruta gestionando tu propia escudería de Fórmula 1 con F1 Team Manager! Si tienes preguntas o encuentras problemas, no dudes en abrir un problema (issue) en este repositorio. ¡Gracias por usar nuestra aplicación! 🏎️🏁