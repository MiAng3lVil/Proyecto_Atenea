Algoritmo Atenea_11
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
	FinSegun
	
FinAlgoritmo
