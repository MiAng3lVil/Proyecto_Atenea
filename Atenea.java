package atenea;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Atenea {
    public static void main(String[] args) {
        int op=0;
        int numero;
        do{
        String a=JOptionPane.showInputDialog(null,"Hola"+"\n"+
                "Buenos días"+"\n"+
                "Buenas tardes"+"\n"+
                "Buenas noches"+"\n"+
                "El proposito de todo esto es ayudarle con la realización de diversas operaciones."+"\n"+
                "¿Quieres acceso a nuestro menú de operaciones"+"\n"+
                "si o no"+"\n"+
                "Escribe un 1 para SÍ o 2 para un NO");
        op=Integer.parseInt(a);
        switch (op){
            case 1:
              String num=JOptionPane.showInputDialog(null,
                      "menu de operaciones"+"\n"+ 
                              "1. Suma"+"\n"+
                              "2. Resta"+"\n"+
                              "3. Multiplicación"+"\n"+
                              "4. División"+"\n"+
                              "5. Raíz cuadrada"+"\n"+
                              "6. Potencia"+"\n"+
                              "7. Serie de finonacci"+"\n"+
                              "8. Combinaciones con formula C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                              "9. Número mayor"+"\n"+
                              "10. Repeticiones"+"\n"+
                              "11. Combinaciones generalizadas");
                numero=Integer.parseInt(num);
                switch (numero){
                    case 1:
                        int numero1;
                        int numero2;
                        float suma;
                        int su;
                        do{
                        String num1=JOptionPane.showInputDialog(null,"Esta parte es para realizar una suma de dos cantidades."+"\n"+"Escribe la primer cantidad:");
                        numero1=Integer.parseInt(num1);
                        String num2=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
                        numero2=Integer.parseInt(num2);
                        suma=numero1+numero2;
                        JOptionPane.showMessageDialog(null,+numero1+" + "+numero2+" = "+suma+"\n"+"El resultado de la suma es: "+""+suma);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        su=Integer.parseInt(ar);
                        } while (su==1);
                        break;
                    case 2:
                        float numero11;
                        float numero21;
                        float resta;
                        int res;
                        do {
                        String num11=JOptionPane.showInputDialog(null,"Esta parte es para realizar una resta de dos cantidades."+"\n"+"Escribe la primer cantidad:");
                        numero11=Integer.parseInt(num11);
                        String num12=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
                        numero21=Integer.parseInt(num12);
                        resta=numero11-numero21;
                        JOptionPane.showMessageDialog(null,+numero11+" - "+numero21+" = "+resta+"\n"+"El resultado de la suma es: "+""+resta);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        res=Integer.parseInt(ar);
                        } while (res==1);
                        break;
                    case 3:
                        float numero13;
                        float numero23;
                        float Multi;
                        int rs;
                        do{
                        String num13=JOptionPane.showInputDialog(null,"Esta parte es para realizar una multiplicación de dos cantidades."+"\n"+"Escribe la primer cantidad:");
                        numero13=Integer.parseInt(num13);
                        String num23=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
                        numero23=Integer.parseInt(num23);
                        Multi=numero13*numero23;
                        JOptionPane.showMessageDialog(null,+numero13+" * "+numero23+" = "+Multi+"\n"+"El resultado de la multiplicación es: "+""+Multi);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        rs=Integer.parseInt(ar);
                        } while (rs==1);
                        break;
                    case 4:
                        float numero14;
                        float numero24;
                        float divi;
                        int reas;
                        do{
                        String num14=JOptionPane.showInputDialog(null,"Esta parte es para realizar una División de dos cantidades."+"\n"+"Escribe la primer cantidad:");
                        numero14=Integer.parseInt(num14);
                        String num24=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
                        numero24=Integer.parseInt(num24);
                        divi=numero14/numero24;
                        JOptionPane.showMessageDialog(null,+numero14+" / "+numero24+" = "+divi+"\n"+"El resultado de la división es: "+""+divi);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        reas=Integer.parseInt(ar);
                        } while (reas==1);
                        break;
                    case 5:
                        float numero15;
                        int resr;
                        do{
                        String num15=JOptionPane.showInputDialog(null,"Esta parte es para sacar la raiz cuadrada de cualquier cantidad"+"\n"+"Escribe el número:");
                        numero15=Integer.parseInt(num15);
                        double arroz = numero15;
                        double raiz = Math.sqrt(arroz);
                        JOptionPane.showMessageDialog(null,"√"+numero15+" = "+raiz+"\n"+"El resultado de la raíz cuadrada es: "+""+raiz);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        resr=Integer.parseInt(ar);
                        } while (resr==1);
                        break;
                    case 6:
                        int jam;
                        int mon;
                        int rest;
                        do{
                        String num16=JOptionPane.showInputDialog(null,"Esta parte es para sacar un potencia de un numero cualquiera elevado a cualquier potencia."+"\n"+"Escribe la base:");
                        jam=Integer.parseInt(num16);
                        String num26=JOptionPane.showInputDialog(null,"Escribe la potencia:");
                        mon=Integer.parseInt(num26);
                        int number = jam;
                        int power = mon;
                        double result = calculatePower(number,power);
                        JOptionPane.showMessageDialog(null,number+" ^ "+power+" = "+result+"\n"+"El resultado de la potencia es: "+""+result);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        rest=Integer.parseInt(ar);
                        } while (rest==1);
                        break;
                    case 7:
                        int numer,fibo1,fibo2,m;
                        int resy;
                        do{ 
                        do{
                            String fib=JOptionPane.showInputDialog(null,"Esta parte es para conocer los número que quieras de la serie de Fibonacci."+"\n"+"Asi que hasta que número de la serie de Fibonacci quieres conocer: ");
                            numer = Integer.parseInt(fib);
                        }while(numer<=0);
                        JOptionPane.showMessageDialog(null,"En seguida te dira número por número."+"\n"+"Asi que los " + numer+ " primeros términos de la serie de Fibonacci son:");                 
                        fibo1=0;
                        fibo2=1;
                        JOptionPane.showMessageDialog(null,"El termino 1 es: "+fibo1 + " ");
                        for(m=2;m<=numer;m++){
                            JOptionPane.showMessageDialog(null,"El termino "+(m+(0))+" es: "+fibo2+" ");
                            fibo2 = fibo1 + fibo2;
                            fibo1 = fibo2 - fibo1;
                        }
                        JOptionPane.showMessageDialog(null,"Esos fueron los "+numer+" primeros terminos solicitados");
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        resy=Integer.parseInt(ar);
                        } while (resy==1);
                        break;
                    case 8:
                        long facc=1;
                        long fann=1;
                        long fanll=1;
                        int n;
                        int k;
                        int Y;
                        int resta1;
                        double fato;
                        double fito;
                        int resu;
                        do{ 
                        String faa=JOptionPane.showInputDialog(null,"Esta parte es para realizar combinaciones utilizando la formula."+"\n"+
                                "C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                                "Asi que por favor introduce el valor de n"+"\n"+"No olvides que (n>=1): ");
                        n = Integer.parseInt(faa);
                        String fall=JOptionPane.showInputDialog(null,"Ahora que por favor introduce el valor de k"+"\n"+"No olvides que (0<=k<=n): ");
                        k = Integer.parseInt(fall);
                        for (int i = n; i > 0; i--) {
                            facc = facc * i;
                        }
                        JOptionPane.showMessageDialog(null,"El factorial de " + n + " es: " + facc);
                        for (int i = k; i > 0; i--) {
                            fann = fann * i;
                        }
                        JOptionPane.showMessageDialog(null,"El factorial de " + k + " es: " + fann);
                        resta1=n-k;
                        Y=n-k;
                        for (int i = Y; i > 0; i--) {
                            fanll = fanll * i;
                        }
                        fito= fann * fann;
                        fato= facc / fito;
                        JOptionPane.showMessageDialog(null,
                               "La formula de la operación es: "+"C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                                       "C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                                       "C( "+n+" ; "+k+" )= "+n+" ! /[ "+k+" !*( "+n+" - "+k+" )!] "+"\n"+
                                       "C( "+n+" ; "+k+" )= "+n+" ! /[ "+k+" !* "+resta1+" !]"+"\n"+
                                       "C( "+n+" ; "+k+" )= "+fato+"\n"+
                                       "El resultado de esta operación es: "+fato);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        resu=Integer.parseInt(ar);
                        } while (resu==1);
                        break;
                    case 9:
                        int resi;
                        do{
                        String n91=JOptionPane.showInputDialog(null,"Esta parte es introducir una serie de numeros y saber cual es el mayor o menor de esta."+"\n"+"Por lo tanto, ¿Cuantos números quieres comparar? ");
                        int n0 = Integer.parseInt(n91);
                        int array [] = new int [n0];
                        for (int p = 0; p < array.length; p++) {
                            String arr=JOptionPane.showInputDialog(null,"Ingrese dato "+(p+1)+": ");
                            array [p] = Integer.parseInt(arr);
                        }
                        int mayor, menor;
                        mayor = menor = array [0];
                        for (int i = 0; i < array.length; i++) {
                            if(array [i] > mayor) {
                                mayor = array[i];
                            }
                            if(array[i]<menor) {
                                menor = array[i];
                            }
                        }
                        JOptionPane.showMessageDialog(null,"El valor mayor es: "+mayor+"\n"+"El valor menor es: "+menor);
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        resi=Integer.parseInt(ar);
                        } while (resi==1);
                        break;
                    case 10:
                        int reso;
                        do{ 
                        Scanner lector = new Scanner(System.in);
                        String cadena =" ";
                        char [] Arraycadena;
                        char caracter;
                        int contador = 0;
                        String j8=JOptionPane.showInputDialog(null,"Esta parte es para saber cuantas veces se repite una letra y cuantas tiene."+"\n"+"Escribe una palabra");
                        cadena =(j8);
                        Arraycadena = cadena.toCharArray();
                        for (int i = 0 ; i < Arraycadena.length; i++){
                            caracter = Arraycadena[i];
                            for (int j = 0 ; j < Arraycadena.length; j++){
                                if (Arraycadena[j] == caracter ) {
                                    contador++;
                                }
                            }
                            JOptionPane.showMessageDialog(null,"De la palara "+cadena+" la "+Arraycadena[i]+" se repite " +contador+ " veces");
                            contador = 0;
                        }
                        String exampleString = (cadena);
                        long totalCharacters = exampleString.chars().filter(ch -> ch != ' ').count();
                        JOptionPane.showMessageDialog(null,"La palabra "+exampleString+" tiene en total "+totalCharacters + " letras.");
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        reso=Integer.parseInt(ar);
                        } while (reso==1);
                        break;
                    case 11:
                        long fac=1;
                        long fan=1, fan1=1, fan2=1, fan3=1, fan4=1, fan5=1, fan6=1, fan7=1;
                        int np;
                        int kp,kp1,kp2,kp3,kp4,kp5,kp6,kp7;
                        int LA;
                        double fato8,fato1,fato2,fato3,fato4,fato5,fato6,fato7;
                        int resw;
                        do{ 
                        String fa=JOptionPane.showInputDialog(null,"Esta parte es para realizar combinaciones generalizadas."+"\n"+"Asi que por favor introduce el valor de n");
                        np = Integer.parseInt(fa);
                        for (int i = np; i > 0; i--) {
                            fac = fac * i;
                        }
                        JOptionPane.showMessageDialog(null,"El factorial de " + np + " es: " + fac);
                        String LO=JOptionPane.showInputDialog(null,"¿Cuantos valores tienes en k?"+"\n"+"*Nota: Solo se permiten ingresar 8 valores de K*");
                        LA = Integer.parseInt(LO);
                        switch (LA){
                            case 1:
                                String fa1l10=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fa1l10);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                fato8= fac / fan;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"!= "+fato8+"\n"+"El resultado es: "+fato8);
                                break;
                            case 2:
                                String fa1l1=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fa1l1);
                                String fa1l1121=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fa1l1121);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"!= "+fato1+"\n"+"El resultado es: "+fato1);
                                break;
                            case 3:
                                 String fa1l=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fa1l);
                                String fa1l120=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fa1l120);
                                String fa1l2=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*3cer valor*");
                                kp2= Integer.parseInt(fa1l2);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                for (int i = kp2; i > 0; i--) {
                                    fan2 = fan2 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                fato2= fato1 / fan2;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"! "+kp2+"!= "+fato2+"\n"+"El resultado es: "+fato2);
                                break;
                            case 4:
                                String fal=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fal);
                                String fal1=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fal1);
                                String fal2=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*3cer valor*");
                                kp2= Integer.parseInt(fal2);
                                String fal3=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*4to valor*");
                                kp3= Integer.parseInt(fal3);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                for (int i = kp2; i > 0; i--) {
                                    fan2 = fan2 * i;
                                }
                                for (int i = kp3; i > 0; i--) {
                                    fan3 = fan3 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                fato2= fato1 / fan2;
                                fato3= fato2 / fan3;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"! "+kp2+"! "+kp3+"!= "+fato3+"\n"+"El resultado es: "+fato3);
                                break;
                            case 5:
                                String fal912=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fal912);
                                String fal1012=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fal1012);
                                String fal2112=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*3cer valor*");
                                kp2= Integer.parseInt(fal2112);
                                String fal3112=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*4to valor*");
                                kp3= Integer.parseInt(fal3112);
                                String fal214=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*5to valor*");
                                kp4= Integer.parseInt(fal214);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                for (int i = kp2; i > 0; i--) {
                                    fan2 = fan2 * i;
                                }
                                for (int i = kp3; i > 0; i--) {
                                    fan3 = fan3 * i;
                                }
                                for (int i = kp4; i > 0; i--) {
                                    fan4 = fan4 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                fato2= fato1 / fan2;
                                fato3= fato2 / fan3;
                                fato4= fato3 / fan4;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"! "+kp2+"! "+kp3+"! "+kp4+"!= "+fato4+"\n"+"El resultado es: "+fato4);
                                break;
                            case 6:
                                String fal92=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fal92);
                                String fal102=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fal102);
                                String fal212=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*3cer valor*");
                                kp2= Integer.parseInt(fal212);
                                String fal312=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*4to valor*");
                                kp3= Integer.parseInt(fal312);
                                String fal24=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*5to valor*");
                                kp4= Integer.parseInt(fal24);
                                String fal52=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*6to valor*");
                                kp5= Integer.parseInt(fal52);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                for (int i = kp2; i > 0; i--) {
                                    fan2 = fan2 * i;
                                }
                                for (int i = kp3; i > 0; i--) {
                                    fan3 = fan3 * i;
                                }
                                for (int i = kp4; i > 0; i--) {
                                    fan4 = fan4 * i;
                                }
                                for (int i = kp5; i > 0; i--) {
                                    fan5 = fan5 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                fato2= fato1 / fan2;
                                fato3= fato2 / fan3;
                                fato4= fato3 / fan4;
                                fato5= fato4 / fan5;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"! "+kp2+"! "+kp3+"! "+kp4+"! "+kp5+"!= "+fato5+"\n"+"El resultado es: "+fato5);
                                break;
                            case 7:
                                String fal91=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fal91);
                                String fal110=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fal110);
                                String fal211=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*3cer valor*");
                                kp2= Integer.parseInt(fal211);
                                String fal311=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*4to valor*");
                                kp3= Integer.parseInt(fal311);
                                String fal14=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*5to valor*");
                                kp4= Integer.parseInt(fal14);
                                String fal15=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*6to valor*");
                                kp5= Integer.parseInt(fal15);
                                String fal61=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*7mo valor*");
                                kp6= Integer.parseInt(fal61);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                for (int i = kp2; i > 0; i--) {
                                    fan2 = fan2 * i;
                                }
                                for (int i = kp3; i > 0; i--) {
                                    fan3 = fan3 * i;
                                }
                                for (int i = kp4; i > 0; i--) {
                                    fan4 = fan4 * i;
                                }
                                for (int i = kp5; i > 0; i--) {
                                    fan5 = fan5 * i;
                                }
                                for (int i = kp6; i > 0; i--) {
                                    fan6 = fan6 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                fato2= fato1 / fan2;
                                fato3= fato2 / fan3;
                                fato4= fato3 / fan4;
                                fato5= fato4 / fan5;
                                fato6= fato5 / fan6;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"! "+kp2+"! "+kp3+"! "+kp4+"! "+kp5+"! "+kp6+"!= "+fato6+"\n"+"El resultado es: "+fato6);
                                break;
                            case 8:
                                String fal9=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*1er valor*");
                                kp= Integer.parseInt(fal9);
                                String fal10=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*2do valor*");
                                kp1= Integer.parseInt(fal10);
                                String fal21=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*3cer valor*");
                                kp2= Integer.parseInt(fal21);
                                String fal31=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*4to valor*");
                                kp3= Integer.parseInt(fal31);
                                String fal4=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*5to valor*");
                                kp4= Integer.parseInt(fal4);
                                String fal5=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*6to valor*");
                                kp5= Integer.parseInt(fal5);
                                String fal6=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*7mo valor*");
                                kp6= Integer.parseInt(fal6);
                                String fal7=JOptionPane.showInputDialog(null,"Por favor introduce el valor de k"+"\n"+"*8vo valor*");
                                kp7= Integer.parseInt(fal7);
                                for (int i = kp; i > 0; i--) {
                                    fan = fan * i;
                                }
                                for (int i = kp1; i > 0; i--) {
                                    fan1 = fan1 * i;
                                }
                                for (int i = kp2; i > 0; i--) {
                                    fan2 = fan2 * i;
                                }
                                for (int i = kp3; i > 0; i--) {
                                    fan3 = fan3 * i;
                                }
                                for (int i = kp4; i > 0; i--) {
                                    fan4 = fan4 * i;
                                }
                                for (int i = kp5; i > 0; i--) {
                                    fan5 = fan5 * i;
                                }
                                for (int i = kp6; i > 0; i--) {
                                    fan6 = fan6 * i;
                                }
                                for (int i = kp7; i > 0; i--) {
                                    fan7 = fan7 * i;
                                }
                                fato8= fac / fan;
                                fato1= fato8 / fan1;
                                fato2= fato1 / fan2;
                                fato3= fato2 / fan3;
                                fato4= fato3 / fan4;
                                fato5= fato4 / fan5;
                                fato6= fato5 / fan6;
                                fato7= fato6 / fan7;
                                JOptionPane.showMessageDialog(null,"La operación es"+np+"!/"+kp+"! "+kp1+"! "+kp2+"! "+kp3+"! "+kp4+"! "+kp5+"! "+kp6+"! "+kp7+"!= "+fato7+"\n"+"El resultado es: "+fato7);
                                break;
                                
                        }
                        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        resw=Integer.parseInt(ar);
                        } while (resw==1);
                }
            case 2:
                JOptionPane.showMessageDialog (null,"Te recuerpo que puedes visitarnos en:");
        }
        }while(op==1 ); 
        
    }
     static int calculatePower(int num, int power){
        int answer = 1;
        if(num > 0 && power==0){
            return answer;
        }
        else if(num == 0 && power>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= power; i++){
                answer = answer*num;
            }
            return answer;
        }
    }
}
