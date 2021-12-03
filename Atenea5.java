package atenea.pkg5;
import javax.swing.JOptionPane;
public class Atenea5 {
    public static void main(String[] args) {
        float numero1;
        int res;
        do{
        String num1=JOptionPane.showInputDialog(null,"Esta parte es para sacar la raiz cuadrada de cualquier cantidad"+"\n"+"Escribe el número:");
        numero1=Integer.parseInt(num1);
        double arroz = numero1;
        double raiz = Math.sqrt(arroz);
        JOptionPane.showMessageDialog(null,"√"+numero1+" = "+raiz+"\n"+"El resultado de la raíz cuadrada es: "+""+raiz);
        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
            res=Integer.parseInt(ar);
        } while (res==1);
    }
    
}
