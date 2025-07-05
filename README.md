# Proyecto1-Java
# Descripción

Este proyecto es una aplicación de gestión de productos desarrollada en Java. Permite agregar, quitar, listar y ordenar productos utilizando una interfaz gráfica simple basada en `JOptionPane`. Los productos se almacenan en una lista y pueden ser ordenados por precio, nombre o cantidad. Además, se pueden visualizar totales y realizar búsquedas de manera interactiva.

## Funcionalidades principales

- **Agregar producto:** Permite ingresar un nuevo producto con sus datos.
- **Quitar producto:** Elimina un producto de la lista según su código.
- **Listar productos:** Muestra los productos ordenados por precio, nombre o cantidad.
- **Mostrar cantidad total:** Suma la cantidad de unidades de todos los productos.
- **Mostrar productos con total:** Muestra cada producto junto al total de su valor (precio x cantidad).
- **Listar con JOptionPane:** Permite mostrar los productos ordenados usando ventanas emergentes.

## Estructura del proyecto

- `src/Clases/Principal.java`: Clase principal con el menú y la lógica de la aplicación.
- `src/Clases/ProducPerez.java`: Clase que representa a cada producto.
- `bin/Clases/`: Carpeta donde se generan los archivos compilados `.class`.

## Herramientas utilizadas

- **Lenguaje:** Java
- **Editor:** Eclipse IDE
- **Interfaz gráfica:** JOptionPane (Swing)

## Cómo ejecutar el proyecto

1. **Compilar el código:**
   ```
   javac -d bin\Clases src\Clases\Principal.java src\Clases\ProducPerez.java
   ```

2. **Ejecutar la aplicación:**
   ```
   java -cp bin\Clases Clases.Principal
   ```

> **Nota:** Asegúrate de tener instalado el JDK y que la variable de entorno `PATH` esté configurada correctamente.

## Autor

Bautista Perez

