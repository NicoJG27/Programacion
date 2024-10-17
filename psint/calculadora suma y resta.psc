Algoritmo prueba
	Escribir 'CALCULADORA DE DOS DIGITOS'
	Escribir 'introduzca 1 para sumar o 2 para restar'
	Leer operacion
	Si operacion=1 Entonces
		Escribir ' Introduzca los dos digitos'
		Leer num1, num2
		suma <- num1+num2
		Escribir 'El resultado de la suma es:', suma
	SiNo 
		Si operacion = 2 Entonces
			Escribir ' Introduzca los dos digitos'
			Leer num1, num2
			suma <- num1-num2
			Escribir 'El resultado de la resta es:', suma
		SiNo
			Escribir "Error: operacion no permitida";
			
		FinSi
	FinSI
	
	
FinAlgoritmo
