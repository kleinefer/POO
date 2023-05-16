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

caso de uso:

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

Aproxiamciones Diagrama de flujo:
 
Entender el anterior diagrama no debe presentar mayores problemas. Sin embargo, es conveniente realizar las siguientes 
aclaraciones y comentarios: 
• Aunque se puede condensar el código incluyendo las instrucciones del segundo “Para” dentro del primero, de manera 
intencional se ha dejado así intencionalmente para delimitar funcionalmente cada bloque de código. 
• En el algoritmo se captura información, como la identificación, el nombre y el curso, que no se utiliza; sin embargo, 
esta información se mantiene porque posteriormente puede ser útil para ampliar la funcionalidad de la aplicación. 
Inicialmente el algoritmo no contempla validaciones como impedir el doble ingreso de un mismo número de 
identificación

pseudocodigo:
Inicio
Caracteres: identificaciones [50], nombres [50], valor [50]
Real: pinturauno [50], pinturados [50], pinturatres [50]
Caracteres: identificacion, nombre, valor
Entero: clientes, i
Real: pintura1, pintura2, pintura3, total <- 0
Imprimir: ‘Digite el número de clientes:’
Asignar: cliente
Para i=0 hasta numeroEstudiantes - 1, 1
Imprimir: ‘Digite la identificación del cliente:’
Asignar: identificacion
Imprimir: ‘Digite el nombre del cliente:’
Asignar: nombre
Imprimir: ‘Digite valor 1 de pintura:’
Asignar: pintura1
Imprimir: ‘Digite valor 2 de pintura:’
Asignar: pintura2
Imprimir: ‘Digite valor 3 de pintura:’
Asignar: pintura 3
identificaciones[i] <- identificacion
nombres [i] <- nombre
pinturauno[i] <- pintura1
pinturados[i] <- pintura2
pinturatres[i] <- pintura3  
finPara
Para i=0 hasta cliente -1, 1
total <-
total +((pinturauno[i]+pinturados[i]+pinturatres[i]))cliente
finPara
Imprimir: ‘El total es:’ + total
Fin

[code](https://github.com/kleinefer/POO.git)