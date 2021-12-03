Algoritmo Atenea_5
	Escribir "Esta parte es para buscar la raíz cuadrada de algún número";
	Escribir "";
	Escribir Sin Saltar "Ingresa el valor de numero:";
	Leer num;
	Si num>=0 Entonces
		raiz_cuadrada <- RC(num);
	SiNo
		raiz_cuadrada <- RC(-num);
		Escribir "raíz imaginaria";
	FinSi
	Escribir "";
	Escribir "Valor de raiz cuadrada: ", raiz_cuadrada;
FinAlgoritmo
