package atenea.pkg2;
import javax.swing.JOptionPane;
public class Atenea2 {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        float resta;
        int res;
        do{
            String num1=JOptionPane.showInputDialog(null,"Esta parte es para realizar una resta de dos cantidades."+"\n"+"Escribe la primer cantidad:");
            numero1=Integer.parseInt(num1);
            String num2=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
            numero2=Integer.parseInt(num2);
            resta=numero1-numero2;
            JOptionPane.showMessageDialog(null,+numero1+" - "+numero2+" = "+resta+"\n"+"El resultado de la suma es: "+""+resta);
            String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                res=Integer.parseInt(ar);
        } while (res==1);
    }
    
}
