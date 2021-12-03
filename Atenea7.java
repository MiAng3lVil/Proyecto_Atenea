package atenea.pkg7;
import javax.swing.JOptionPane;
public class Atenea7 {
    public static void main(String[] args) {
        int numero,fibo1,fibo2,i;
        int res;
        do{
        do{
            String fib=JOptionPane.showInputDialog(null,"Esta parte es para conocer los número que quieras de la serie de Fibonacci."+"\n"+"Asi que hasta que número de la serie de Fibonacci quieres conocer: ");
            numero = Integer.parseInt(fib);
        }while(numero<=0);
        JOptionPane.showMessageDialog(null,"En seguida te dira número por número."+"\n"+"Asi que los " + numero + " primeros términos de la serie de Fibonacci son:");                 
        fibo1=0;
        fibo2=1;
        JOptionPane.showMessageDialog(null,"El termino 1 es: "+fibo1 + " ");
        for(i=2;i<=numero;i++){
            JOptionPane.showMessageDialog(null,"El termino "+(i+(0))+" es: "+fibo2+" ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        JOptionPane.showMessageDialog(null,"Esos fueron los "+numero+" primeros terminos solicitados");
        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
            res=Integer.parseInt(ar);
        } while (res==1);
    }
}
