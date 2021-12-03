package atenea.pkg10;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Atenea10 {
    public static void main(String[] args) {
        int res;
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
                        res=Integer.parseInt(ar);
                        } while (res==1);
    }
    
}
