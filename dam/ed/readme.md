# UD 5 Testing

**Autor: **

## Introducción

Crear documentación con Readme en proyectos alojados en repositorios de versiones como GitHub es una práctica recomendada, donde facilitas infomación relevante acerca de tu proyeto

# Ejemplo de Readme.md para proyecto:

**Proyecto Java: Gestor de Tareas**

## Descripción

Este proyecto es una aplicación sencilla de consola escrita en Java que permite gestionar tareas. Los usuarios pueden agregar, listar y marcar tareas como completadas.

## Características

* Agregar nuevas tareas
* Listar tareas pendientes
* Marcar tareas como completadas
* Guardado de tareas en un archivo de texto

## Requisitos

* Java 11 o superior
* IDE como IntelliJ IDEA, Eclipse o VS Code
* (Opcional) Maven o Gradle para gestionar dependencias

## Instalación y Ejecución

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/usuario/gestor-tareas-java.git
   cd gestor-tareas-java
   ```
2. **Compilar el proyecto**
   ```bash
   javac src/com/proyecto/Main.java -d bin
   ```
3. **Ejecutar la aplicación**
   ```bash
   java -cp bin com.proyecto.Main
   ```

## Tecnologías

* Java SE
* Manejo de archivos con `File` y `BufferedReader/Writer`
* Uso de `ArrayList` para gestionar las tareas

## Ejemplo de Uso

```
Bienvenido al Gestor de Tareas
1. Agregar tarea
2. Listar tareas
3. Marcar como completada
4. Salir
Selecciona una opción: 1
Introduce el nombre de la tarea: "Estudiar UML"
Tarea agregada con éxito.
```

## Licencia

Este proyecto está bajo la licencia [CC-BY-SA.](https://creativecommons.org/licenses/by/4.0/deed.es)
