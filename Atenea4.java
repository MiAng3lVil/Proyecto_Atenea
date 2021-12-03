package atenea.pkg4;
import javax.swing.JOptionPane;
public class Atenea4 {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        float divi;
        int res;
        do{
        String num1=JOptionPane.showInputDialog(null,"Esta parte es para realizar una División de dos cantidades."+"\n"+"Escribe la primer cantidad:");
        numero1=Integer.parseInt(num1);
        String num2=JOptionPane.showInputDialog(null,"Escribe la segunda cantidad:");
        numero2=Integer.parseInt(num2);
        divi=numero1/numero2;
        JOptionPane.showMessageDialog(null,+numero1+" / "+numero2+" = "+divi+"\n"+"El resultado de la división es: "+""+divi);
        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
            res=Integer.parseInt(ar);
        } while (res==1);
    }
    
}
