Algoritmo Atenea_10
	Escribir "Esta parte es para saber cuantas letras, así como cuantas veces se repiten cada una de las letras.";
	Escribir "";
	Escribir "Escribe una palabra";
	leer n1
	separar(n1)
	n2 = longitud (n1)
	Escribir " ";
	Escribir "La palabra ", n1 " tiene ",n2 " letras ";
FinAlgoritmo
Funcion veces <- buscarcaracter ( n,letra )
	Definir cont Como Entero;
	Para i<-1 Hasta Longitud(n) Con Paso 1
		si (Subcadena(n,i,i)=letra) Entonces
			cont = cont+1
		FinSi
	FinPara
	veces = cont
Fin Funcion
Funcion   separar ( palabra )
	Definir size,veces Como Entero;
	size<-Longitud(palabra)
	Para i<-1 Hasta size Con Paso 1
		veces = buscarcaracter(palabra, Subcadena(palabra,i,i))
		Escribir "La ", Subcadena(palabra,i,i) " se repite ", veces;
	FinPara
Fin Funcion