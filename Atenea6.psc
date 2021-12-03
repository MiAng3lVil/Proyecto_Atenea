Algoritmo Atenea_6
	Escribir "Esta parte es para buscar un número elevando a cualquier potencia.";
	Escribir "";
	Escribir Sin Saltar "Ingrese Base:"
	Leer base
	Escribir ""
	Escribir Sin Saltar "Ingrese Exponente:"
	Leer exponente
	Escribir "";
	Escribir base,"^",exponente;
	Escribir "";
	Escribir "El resultado es: ",Potencia(base,exponente)
FinAlgoritmo
SubProceso  resultado <- Potencia (base, exponente)
    Si exponente=0 Entonces
        resultado <- 1;
    sino 
        resultado <- base*Potencia(base,exponente-1); 
    FinSi
FinSubProceso