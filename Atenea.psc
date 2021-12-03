Algoritmo Atenea
	Definir op, respuesta Como Caracter;
	Definir C1 , C2, Resultado Como Real;
	Definir n, k Como entero
	Definir n1 Como Caracter;
	Definir n2 Como Entero;
	Definir a9 como entero;
	definir b9 como entero;
	definir c9 como entero;
	Definir d9 Como Entero;
	a9<-0;
	b9<-0;
	c9<-0;
	Escribir "Hola"; 
	Escribir "Buenos días";
	Escribir "Buenas Tardes";
	Escribir "Buenas noches";
	Escribir "¿Quieres acceso a nuestro menú de operaciones"; 
	Escribir "si o no";
	Leer respuesta;
	Mientras respuesta="si" o respuesta="Si" Hacer
		Limpiar Pantalla
		Escribir "Menu de operaciones";
		Escribir "1. Suma";
		Escribir "2. Resta";
		Escribir "3. Multiplicación";
		Escribir "4. División";
		Escribir "5. Raíz cuadrada";
		Escribir "6. Potencia";
		Escribir "7. Serie de Fibonacci";
		Escribir "8. Combinaciones con formula C(n;k)= n! /[k!*(n-k)!]";
		Escribir "9. Número mayor";
		Escribir "10. Repeticiones";
		Escribir "11. Combinaciones generalizadas";
		Escribir "";
		Escribir "*Puedes escribir el nombre o el número de operacion*";
		Escribir "";
		Escribir Sin Saltar "¿Qué operación quieres hacer?";
		leer op;
		segun op Hacer
			"1","suma", "Suma":
				Limpiar Pantalla
				Escribir "Esta parte es para realizar una suma de dos cantidades.";
				Escribir "";
				Escribir Sin Saltar "Escribe la primer cantidad";
				leer C1;
				Escribir Sin Saltar "Escribe la segunda cantidad";
				leer C2;
				Resultado <- C1 + C2;
				Escribir "";
				Escribir "Entonces ", C1 " más ", C2 " es igual a ", Resultado;
				Escribir " ";
				Escribir "Entonces ", C1 " + ", C2 " = ", Resultado;
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"2","resta", "Resta":
				Limpiar Pantalla
				Escribir "Esta parte es para realizar una resta de dos cantidades.";
				Escribir "";
				Escribir Sin Saltar "Escribe la primer cantidad";
				leer C1;
				Escribir Sin Saltar "Escribe la segunda cantidad";
				leer C2;
				Resultado <- C1 - C2;
				Escribir "";
				Escribir "Entonces ", C1 " menos ", C2 " es igual a ", Resultado;
				Escribir " ";
				Escribir "Entonces ", C1 " - ", C2 " = ", Resultado;
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"3","multiplicación","multiplicacion","Multiplicación","Multiplicacion":
				Limpiar Pantalla
				Escribir "Esta parte es para realizar una multiplicación de dos contidades.";
				Escribir "";
				Escribir Sin Saltar "Escribe la primer cantidad";
				leer C1;
				Escribir Sin Saltar "Escribe la segunda cantidad";
				leer C2;
				Resultado <- C1 * C2;
				Escribir "";
				Escribir "Entonces ", C1 " por ", C2 " es igual a ", Resultado;
				Escribir " ";
				Escribir "Entonces ", C1 " * ", C2 " = ", Resultado;
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"4","division","división","División", "Division":
				Limpiar Pantalla
				Escribir "Esto es para realizar una división de dos cantidades";
				Escribir "";
				Escribir Sin Saltar "Escribe la primer cantidad";
				leer C1;
				Escribir Sin Saltar "Escribe la segunda cantidad";
				leer C2;
				Resultado <- C1 / C2;
				Escribir "";
				Escribir "Entonces ", C1 " entre ", C2 " es igual a ", Resultado;
				Escribir " ";
				Escribir "Entonces ", C1 " / ", C2 " = ", Resultado;
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"5","Raíz cuadrada","raíz cuadrada","raiz","raíz","Raiz","Raíz":
				Limpiar Pantalla
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
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"6","Potencia","potencia":
				Limpiar Pantalla
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
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"7","Serie de Fubonacci","serie de fubonacci","Fubonacci","Serie","serie","SDF","SF","sdf","sf":
				Limpiar Pantalla
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
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"8", "combinaciones","Combinaciones":
				Limpiar Pantalla
				n<- leercombinatorio (k);
				comb_simplific(n,k);
				Escribir factorial( n )/(factorial( k )*factorial( n-k ));
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"9","mayor","Mayor","Numero mayor","Número mayor","numero mayor","número mayor","numero","número","Número","Numero":
				Limpiar Pantalla
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
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"10","repeticiones","Repeticiones","repetir","Repetir":
				Limpiar Pantalla
				Escribir "Esta parte es para saber cuantas letras, así como cuantas veces se repiten cada una de las letras.";
				Escribir "";
				Escribir "Escribe una palabra";
				leer n1
				separar(n1)
				n2 = longitud (n1)
				Escribir " ";
				Escribir "La palabra ", n1 " tiene ",n2 " letras ";
				Escribir "";
				Escribir "¿Desea regresar al menú?";
				Leer respuesta;
			"11","conbinaciones","generalizadas","Combinaciones","Generalizadas","combinaciones generalizadas","Combinaciones generalizadas":
				Limpiar Pantalla
				Escribir "Esta parte es para hacer combinaciones generalizadas de hasta 8 letras.";
				Escribir ""; 
				Escribir "Escribe N"
				leer N
				f<- 1
				pro<-""
				para i <- 1 Hasta N Con Paso 1 Hacer
					f = f*i
					si i<n Entonces
						pro=pro+ConvertirATexto(i)+"x"
					SiNo
						pro=pro+ConvertirATexto(i)
					FinSi
				FinPara
				Escribir "Solo se permiten ingresar 8 valores de K"
				Escribir ""
				Escribir "¿Cuantos valores tienes en k?"
				leer op3
				Segun op3 Hacer
					1:
						escribir "Escribe los valores de K"
						leer k1
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						Escribir N,"!/",k1,"!= ",res1;
						Escribir "";
						Escribir pro "/(",pro1,")= ",res1;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					2:
						escribir "Escribe los valores de K"
						leer k1,k2
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						Escribir N,"!/",k1,"!",K2,"!= ",res2;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")= ",res2;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					3:
						escribir "Escribe los valores de K"
						leer k1,k2,k3
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						f3<- 1
						pro3<-""
						para i <- 1 Hasta k3 Con Paso 1 Hacer
							f3= f3*i
							si i<n Entonces
								pro3=pro3+ConvertirATexto(i)+"x"
							SiNo
								pro3=pro3+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						res3= res2/f3
						Escribir N,"!/",k1,"!",K2,"!",k3,"!= ",res3;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")(",pro3,")= ",res3;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					4:
						escribir "Escribe los valores de K"
						leer k1,k2,k3,k4
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						f3<- 1
						pro3<-""
						para i <- 1 Hasta k3 Con Paso 1 Hacer
							f3= f3*i
							si i<n Entonces
								pro3=pro3+ConvertirATexto(i)+"x"
							SiNo
								pro3=pro3+ConvertirATexto(i)
							FinSi
						FinPara
						f4<- 1
						pro4<-""
						para i <- 1 Hasta k4 Con Paso 1 Hacer
							f4= f4*i
							si i<n Entonces
								pro4=pro4+ConvertirATexto(i)+"x"
							SiNo
								pro4=pro4+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						res3= res2/f3
						res4= res3/f4
						Escribir N,"!/",k1,"!",K2,"!",k3,"!",k4,"!= ",res4;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")(",pro3,")(",pro4,")= ",res4;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					5:
						escribir "Escribe los valores de K"
						leer k1,k2,k3,k4,k5
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						f3<- 1
						pro3<-""
						para i <- 1 Hasta k3 Con Paso 1 Hacer
							f3= f3*i
							si i<n Entonces
								pro3=pro3+ConvertirATexto(i)+"x"
							SiNo
								pro3=pro3+ConvertirATexto(i)
							FinSi
						FinPara
						f4<- 1
						pro4<-""
						para i <- 1 Hasta k4 Con Paso 1 Hacer
							f4= f4*i
							si i<n Entonces
								pro4=pro4+ConvertirATexto(i)+"x"
							SiNo
								pro4=pro4+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						res3= res2/f3
						res4= res3/f4
						res5= res4/f5
						Escribir N,"!/",k1,"!",K2,"!",k3,"!",k4,"!",k5,"!= ",res5;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")(",pro3,")(",pro4,")(",pro5,")= ",res5;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					6:
						escribir "Escribe los valores de K"
						leer k1,k2,k3,k4,k5,k6
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						f3<- 1
						pro3<-""
						para i <- 1 Hasta k3 Con Paso 1 Hacer
							f3= f3*i
							si i<n Entonces
								pro3=pro3+ConvertirATexto(i)+"x"
							SiNo
								pro3=pro3+ConvertirATexto(i)
							FinSi
						FinPara
						f4<- 1
						pro4<-""
						para i <- 1 Hasta k4 Con Paso 1 Hacer
							f4= f4*i
							si i<n Entonces
								pro4=pro4+ConvertirATexto(i)+"x"
							SiNo
								pro4=pro4+ConvertirATexto(i)
							FinSi
						FinPara
						f5<- 1
						pro5<-""
						para i <- 1 Hasta k5 Con Paso 1 Hacer
							f5= f5*i
							si i<n Entonces
								pro5=pro5+ConvertirATexto(i)+"x"
							SiNo
								pro5=pro5+ConvertirATexto(i)
							FinSi
						FinPara
						f6<- 1
						pro6<-""
						para i <- 1 Hasta k6 Con Paso 1 Hacer
							f6= f6*i
							si i<n Entonces
								pro6=pro6+ConvertirATexto(i)+"x"
							SiNo
								pro6=pro6+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						res3= res2/f3
						res4= res3/f4
						res5= res4/f5
						res6= res5/f6
						Escribir N,"!/",k1,"!",K2,"!",k3,"!",k4,"!",k5,"!",k6,"!= ",res6;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")(",pro3,")(",pro4,")(",pro5,")(",pro6,")= ",res6;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					7:
						escribir "Escribe los valores de K"
						leer k1,k2,k3,k4,k5,k6,k7
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						f3<- 1
						pro3<-""
						para i <- 1 Hasta k3 Con Paso 1 Hacer
							f3= f3*i
							si i<n Entonces
								pro3=pro3+ConvertirATexto(i)+"x"
							SiNo
								pro3=pro3+ConvertirATexto(i)
							FinSi
						FinPara
						f4<- 1
						pro4<-""
						para i <- 1 Hasta k4 Con Paso 1 Hacer
							f4= f4*i
							si i<n Entonces
								pro4=pro4+ConvertirATexto(i)+"x"
							SiNo
								pro4=pro4+ConvertirATexto(i)
							FinSi
						FinPara
						f5<- 1
						pro5<-""
						para i <- 1 Hasta k5 Con Paso 1 Hacer
							f5= f5*i
							si i<n Entonces
								pro5=pro5+ConvertirATexto(i)+"x"
							SiNo
								pro5=pro5+ConvertirATexto(i)
							FinSi
						FinPara
						f6<- 1
						pro6<-""
						para i <- 1 Hasta k6 Con Paso 1 Hacer
							f6= f6*i
							si i<n Entonces
								pro6=pro6+ConvertirATexto(i)+"x"
							SiNo
								pro6=pro6+ConvertirATexto(i)
							FinSi
						FinPara
						f7<- 1
						pro7<-""
						para i <- 1 Hasta k7 Con Paso 1 Hacer
							f7= f7*i
							si i<n Entonces
								pro7=pro7+ConvertirATexto(i)+"x"
							SiNo
								pro7=pro7+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						res3= res2/f3
						res4= res3/f4
						res5= res4/f5
						res6= res5/f6
						res7= res6/f7
						Escribir N,"!/",k1,"!",K2,"!",k3,"!",k4,"!",k5,"!",k6,"!",k7,"!= ",res7;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")(",pro3,")(",pro4,")(",pro5,")(",pro6,")(",pro7,")= ",res7;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					8:
						escribir "Escribe los valores de K"
						leer k1,k2,k3,k4,k5,k6,k7,k8
						f1<- 1
						pro1<-""
						para i <- 1 Hasta k1 Con Paso 1 Hacer
							f1= f1*i
							si i<n Entonces
								pro1=pro1+ConvertirATexto(i)+"x"
							SiNo
								pro1=pro1+ConvertirATexto(i)
							FinSi
						FinPara
						f2<- 1
						pro2<-""
						para i <- 1 Hasta k2 Con Paso 1 Hacer
							f2= f2*i
							si i<n Entonces
								pro2=pro2+ConvertirATexto(i)+"x"
							SiNo
								pro2=pro2+ConvertirATexto(i)
							FinSi
						FinPara
						f3<- 1
						pro3<-""
						para i <- 1 Hasta k3 Con Paso 1 Hacer
							f3= f3*i
							si i<n Entonces
								pro3=pro3+ConvertirATexto(i)+"x"
							SiNo
								pro3=pro3+ConvertirATexto(i)
							FinSi
						FinPara
						f4<- 1
						pro4<-""
						para i <- 1 Hasta k4 Con Paso 1 Hacer
							f4= f4*i
							si i<n Entonces
								pro4=pro4+ConvertirATexto(i)+"x"
							SiNo
								pro4=pro4+ConvertirATexto(i)
							FinSi
						FinPara
						f5<- 1
						pro5<-""
						para i <- 1 Hasta k5 Con Paso 1 Hacer
							f5= f5*i
							si i<n Entonces
								pro5=pro5+ConvertirATexto(i)+"x"
							SiNo
								pro5=pro5+ConvertirATexto(i)
							FinSi
						FinPara
						f6<- 1
						pro6<-""
						para i <- 1 Hasta k6 Con Paso 1 Hacer
							f6= f6*i
							si i<n Entonces
								pro6=pro6+ConvertirATexto(i)+"x"
							SiNo
								pro6=pro6+ConvertirATexto(i)
							FinSi
						FinPara
						f7<- 1
						pro7<-""
						para i <- 1 Hasta k7 Con Paso 1 Hacer
							f7= f7*i
							si i<n Entonces
								pro7=pro7+ConvertirATexto(i)+"x"
							SiNo
								pro7=pro7+ConvertirATexto(i)
							FinSi
						FinPara
						f8<- 1
						pro8<-""
						para i <- 1 Hasta k8 Con Paso 1 Hacer
							f8= f8*i
							si i<n Entonces
								pro8=pro8+ConvertirATexto(i)+"x"
							SiNo
								pro8=pro8+ConvertirATexto(i)
							FinSi
						FinPara
						res1= f/f1
						res2= res1/f2
						res3= res2/f3
						res4= res3/f4
						res5= res4/f5
						res6= res5/f6
						res7= res6/f7
						res8= res7/f8
						Escribir N,"!/",k1,"!",K2,"!",k3,"!",k4,"!",k5,"!",k6,"!",k7,"!",k8,"!= ",res8;
						Escribir "";
						Escribir pro "/(",pro1,")(",pro2,")(",pro3,")(",pro4,")(",pro5,")(",pro6,")(",pro7,")(",pro8,")= ",res8;
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
					De Otro Modo:
						Escribir "No se permiten más de 8 números";
						Escribir "";
						Escribir "¿Desea regresar al menú?";
						Leer respuesta;
				FinSegun
		FinSegun
	FinMientras
	Limpiar Pantalla
	Escribir "Entonces esperamos a ver sido de ayuda";
	Escribir "";
	Escribir "Puedes conocer más detalles de nuestro trabajo en: ";
	Escribir "";
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
SubProceso  resultado <- Potencia (base, exponente)
    Si exponente=0 Entonces
        resultado <- 1;
    sino 
        resultado <- base*Potencia(base,exponente-1); 
    FinSi
FinSubProceso