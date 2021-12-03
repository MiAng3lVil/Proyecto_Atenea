package atenea.pkg1;
import javax.swing.JOptionPane;
public class Atenea1 {
    
    public static void main(String[] args) {
        int numero1;
        int numero2;
        float suma;
        int res;
        do{
            String num1=JOptionPane.showInputDialog(null,"Esta parte es para realizar una suma de dos cantidades."+"\n"+"Escribe la primer cantidad:");
            numero1=Integer.parseInt(num1);
            String num2=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
            numero2=Integer.parseInt(num2);
            suma=numero1+numero2;
            JOptionPane.showMessageDialog(null,+numero1+" + "+numero2+" = "+suma+"\n"+"El resultado de la suma es: "+""+suma);
            String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
            res=Integer.parseInt(ar);
        } while (res==1);
    }
}