# Proyecto1-Java

-PARCIAL 1 RECUPERATORIO LAB III

Se necesita generar un programa de con las siguientes consignas. Para ello se definio una arquitectura que debera respetar.
1. crear un proyecto con nombre: NombreApellido, siendo estos su nombre y apellido
2.crear una clase llamada ProducSUAPELLIDO

a. codigo(integer)
b.nombreDelProducto
c.precio(float)
d.cant(integer)
e. porcentajeGanancia(integer)

Metodos:
a.getter y setter de los atributos
b. toString

3. Una clase llamada Principal. que implemente el metodo main. En esta clase crear:
a. Una coleccion de tipo ArrayList
b.Se debera controlar que:
i. el codigo: este en el rango de 1000 y 9999
ii. Nombre de producto: tenga la priemera letra en mayusculas.
iii. El precio en el rango 0 - 10000
iv. Canti: cantidad de unidades: maximo 100
v. porcentaje de ganancias: maximo 100% de ganancia, por defecto 50%
vi. se debe poder ingresar nuevos productos solicitando sus datos.

c. el listado de elemntos debe realiarlo un metodo al que se le pase la coleccion utilizada.
d. un menu donde se pueda: (utilizar while)
i. Agregar elementos a la lista de productos comprados. esto incluye todos los datos necesarios para generar un objeto.
ii. quitar elementos de lal ista. (Solicitar codigo de producto)(utilizar iterator)
iii. Listar elementos ordenados por precio(comparable).
iv. Listar elementos ordenados por nombre de producto(comparator)
v. Listar elementos ordenados por cantidad de producto(comparator)
vi. Listar la cantidad total de elementos en nuestra coleccion.
vii. Listado elementos con total(precio * cantidad)
viii. En los listados debera utilizar el JOptionPane para aceptar datos asi como para mostrar los datos.
ix. PAra el menu no debe cerrarse si se ingresa un dato incorrecto.
x. Salir

4. Al iniciar el programa deben cargarse de forma automatica 5 elementos a la coleccion para facilitar los ensayos
