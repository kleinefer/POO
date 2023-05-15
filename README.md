## EJERCICO BASE
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un empresario, que desea calcular el promedio de ventas mensual. Como información básica de cada venta se debe registrar cantidad de compradores, nombre e identificación del comprador y el precio del producto.
Aclaraciones:
•	Se supondrá que la aplicación solo se requiere para calcular el total de las ventas
•	No se realiza validación, ni se verifica calidad en los datos ingresados
ANALISIS DEL EJERCICIO
Yo como empresario,
Quiero poder capturar de las ventas mensuales el promedio de estas,
Para calcular el promedio de ventas.

Escenario 1: ingresar la información de las ventas del mes
Given que soy un empresario
Que ingreso correctamente la cantidad de compradores
Y que ingrese identificación del comprador correctamente
Que ingrese correctamente el nombre del comprador
Y que ingrese correctamente el valor de cada pintura
When calcular promedio
Then guardar la información del comprador como:
Identificación y el nombre completo, precio del producto y obtener el total de la compra

Aproximación caso de uso:
Descripción caso de uso
Nombre: Calcular total de productos
Actores: empresario
Propósito: Guardar identificación, nombre, cantidad y valor del producto para calcular total
Curso Normal de Eventos: 
1. El empresario ingresa la cantidad.
2. El Empresario ingresa la identificación, nombre valor del producto
3. Se calcula el total a partir de: 
(total + pinturauno[i] + pinturados[i];)
4. Se Muestra el total de las ventas
Postcondiciones: total Calculado
[code](https://github.com/kleinefer/POO.git)