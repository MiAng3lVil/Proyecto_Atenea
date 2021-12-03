Algoritmo Atenea_9
	Escribir "Esta parte es para saber cual es el número mayor.";
	Escribir "";
	Escribir "¿cuantos digitos son?";
	leer d9;
	Repetir
		Escribir "ingresa numero por numero";
		leer a9;
		c9<- c9+1;
		si b9<a9 Entonces
			b9<- a9;
		FinSi
	Hasta Que c9=d9
	Escribir "El número mayor es: ", b9;
FinAlgoritmo
