Algoritmo Atenea_7
	Escribir "Esta parte es para saber los numeros de la serie de Fubonacci";
	Escribir "";
	Escribir "¿Que cantidad de numeros quieres conocer?";
	Escribir "Introduce n: ";
	leer n;
	a<- 0
	b<- 1
	para i<- 1 hasta n Hacer
		escribir a 
		c<- a+b
		a<-b
		b<-c 
	FinPara
FinAlgoritmo
