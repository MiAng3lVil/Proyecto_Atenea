package atenea.pkg9;
import javax.swing.JOptionPane;
public class Atenea9 {
    public static void main(String[] args) {
        int res;
        do{
        String n9=JOptionPane.showInputDialog(null,"Esta parte es introducir una serie de numeros y saber cual es el mayor o menor de esta."+"\n"+"Por lo tanto, ¿Cuantos números quieres comparar? ");
        int n = Integer.parseInt(n9);
        int array [] = new int [n];
        for (int i = 0; i < array.length; i++) {
            String arr=JOptionPane.showInputDialog(null,"Ingrese dato "+(i+1)+": ");
            array [i] = Integer.parseInt(arr);
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
                        res=Integer.parseInt(ar);
                        } while (res==1);
    }
    
}