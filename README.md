# Proyecto de selección Devco automatización Web
El proyecto es un reto de Devco, donde se se crearon 15 escenarios manuales y las siguientes automatizaciones a la pagina web https://www.travelocity.com/:

- Realizar un reserva de una habitación de hotel
- Validar el máximo numero de personas a la hora de buscar una habitación en un hotel
- Reservar una actividad turística en el módulo de Things To Do dentro de la página web
- Reservar tiquetes de aviones ida y vuelta
- Rentar un vehiculo


## Tecnologías Implementadas
- Management Tool : Gradle
- Framework Test : SerenityBDD
- Framework Test : Serenity-Cucumber
- Test-Driven : Junit

### Instrucciones de ejecución
Ejecutar desde terminal:

-En la terminal o consola estando ubicados en la carpeta del proyecto en la terminal escribimos `gradle build`, y esperamos que descargue las dependencias y realice las ejecuciones de las pruebas.

Ejecutar desde un IDE o Proyecto ya abierto:
- PASO 1: Ubicado dentro de la carpeta principal del proyecto, abrimos la terminal.
- PASO 2: Abrimos el proyecto con cualquier ide y descargamos las dependencias
- PASO 3: Escribimos el siguiente comando `gradlew clean test aggregate`, esto hace que se ejecuten todas las pruebas.
- PASO 4: Esperamos que las pruebas se completen.
- PASO 5: Dentro del proyecto se genera la carpeta Target con el contenido del reporte `target\site\serenity\index.html`.

