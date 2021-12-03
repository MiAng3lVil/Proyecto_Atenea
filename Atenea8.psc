Algoritmo Atenea_8
	n<- leercombinatorio (k);
	comb_simplific(n,k);
	Escribir factorial( n )/(factorial( k )*factorial( n-k ));
FinAlgoritmo
SubProceso  n <- leercombinatorio ( k Por Referencia )
	Definir n Como Entero;
	Repetir
		Escribir sin saltar "ingrese el valor de n(n>=1): "; 
		Leer n;
	Hasta Que n>=1
	Repetir
		Escribir sin saltar "ingrese el valor de k (0<=k<=n): ";
		leer k;
	Hasta Que k>=0 y k<=n
	Limpiar Pantalla
	Escribir "";
	Escribir sin saltar "La formula de la operación es: ";
	Escribir "C(n;k)= n! /[k!*(n-k)!]";
	Escribir "";
	Escribir "C(",n,";",k,")= ",n,"! /[",k,"!*(",n,"-",k,")!]";
	Escribir "";
	Escribir "C(",n,";",k,")= ",n,"! /[",k,"!*",n - k,"!]";
FinSubProceso
Funcion  comb_simplific ( n,k )
	Definir r,i Como Entero;
	Si k<(n-k) Entonces
		r<- k;
	SiNo
		r<- n-k;
	Fin Si
	Escribir "";
	Escribir sin saltar "C(",n,";",k,")=";
	Para i<-r Hasta 1 Con Paso -1 Hacer
		
		Si i<>1 Entonces
			Escribir sin saltar n,"*";
		SiNo
			Escribir sin saltar n," / ";
		Fin Si
		n<- n-1;
	Fin Para
	Para i<-r Hasta 1 Con Paso -1 Hacer
		Si i<>1 Entonces
			Escribir sin saltar i,"*";
		SiNo
			Escribir sin saltar i," = ";
		Fin Si
	Fin Para
Fin Funcion
Funcion f <- factorial ( n )
	Definir f Como Entero;
	f<- 1;
	Para i<-1 Hasta n Con Paso 1 Hacer
		f<- f*i;
	Fin Para
Fin Funcion
