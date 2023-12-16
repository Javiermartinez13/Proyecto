## Formula 1 Team Management System

Este proyecto en Java ofrece una aplicación simple para gestionar equipos de Fórmula 1, brindando a los usuarios la capacidad de crear, visualizar y eliminar equipos. La aplicación cuenta con clases que representan un equipo de Fórmula 1 (`Escuderia`), un coche (`Coche`), un motor (`Motor`), neumáticos (`Neumaticos`), y un piloto (`Piloto`). La interacción con el usuario está implementada en la clase `Menu`, que proporciona un menú interactivo para realizar acciones específicas.

### Estructura del Proyecto

El proyecto se organiza en varias clases, cada una con su función específica:

- **Coche (`dominio.Coche`):** Representa un coche de Fórmula 1 con modelo y color.

- **Escuderia (`dominio.Escuderia`):** Representa un equipo de Fórmula 1 que incluye listas de pilotos, coches, motores y neumáticos.

- **Motor (`dominio.Motor`):** Representa un motor de Fórmula 1 con un fabricante.

- **Neumaticos (`dominio.Neumaticos`):** Representa los neumáticos de un equipo de Fórmula 1, heredando de la clase `Escuderia`.

- **Piloto (`dominio.Piloto`):** Representa un piloto de Fórmula 1 con un nombre y una edad.

- **Menu (`interfaz.Menu`):** Gestiona la interfaz de usuario y las interacciones del usuario, permitiendo la creación, visualización y eliminación de equipos. También se encarga de cargar y guardar datos.

- **Main (`main.Main`):** Contiene el método `main` para iniciar la aplicación.

- **Makefile:** Proporciona reglas para compilar, generar archivos JAR, crear documentación Javadoc, ejecutar la aplicación y limpiar el proyecto.

### Uso del Makefile

El proyecto utiliza un Makefile para automatizar tareas comunes. Algunos objetivos incluyen:

- `make compilar`: Compila los archivos fuente de Java.
- `make jar`: Crea un archivo JAR para la aplicación.
- `make javadoc`: Genera la documentación Javadoc.
- `make ejecutar`: Ejecuta la aplicación Java compilada.
- `make limpiar`: Limpia el proyecto eliminando archivos compilados y archivos JAR.
- `make debug`: Compila el código con información de depuración y ejecuta el depurador.
- `make runjar`: Ejecuta la aplicación utilizando el archivo JAR generado.
- `make completo`: Realiza una compilación completa, generación de Javadoc, creación de JAR y ejecución de la aplicación.

Personaliza el Makefile según la estructura y requisitos de tu proyecto.

### Instrucciones de Ejecución

1. Clona o descarga el proyecto desde el repositorio.
2. Abre una terminal y navega al directorio del proyecto.
3. Ejecuta `make completo` para una compilación completa.
4. Ejecuta `make runjar` para ejecutar la aplicación utilizando el archivo JAR generado.

### UML
![DiagramaUML](https://github.com/Javiermartinez13/Proyecto/assets/119308526/2f95418b-e79d-4c06-bb91-be45dff34184)

Los diagramas UML que visualiza en este programa se generan automáticamente a partir de los archivos .java y no han sido revisados manualmente. Por lo tanto, tenga en cuenta lo siguiente:

Los diagramas UML se generan con fines ilustrativos y pueden contener errores, omisiones o representaciones incompletas de la estructura y relaciones del sistema.

La precisión de la información en los diagramas UML depende de la exactitud de los datos de entrada y la implementación del programa. Pueden producirse discrepancias entre la realidad y los diagramas generados.

Se recomienda utilizar los diagramas UML como una referencia inicial y no como la única fuente de información sobre la arquitectura del sistema.

Estos diagramas UML son proporcionados "tal cual" y no se garantiza su exactitud o idoneidad para ningún propósito específico. El uso de esta información está bajo su propia responsabilidad.

¡Gracias por su comprensión y precaución al utilizar los diagramas UML generados automáticamente!

### License

Copyright 2023 Javiermartinez13

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
