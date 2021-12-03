package atenea.pkg6;
import javax.swing.JOptionPane;
public class Atenea6 {
    public static void main(String[] args) {
        int jam;
        int mon;
        int res;
        do{
        String num1=JOptionPane.showInputDialog(null,"Esta parte es para sacar un potencia de un numero cualquiera elevado a cualquier potencia."+"\n"+"Escribe la base:");
        jam=Integer.parseInt(num1);
        String num2=JOptionPane.showInputDialog(null,"Escribe la potencia:");
        mon=Integer.parseInt(num2);
        int number = jam;
        int power = mon;
        double result = calculatePower(number,power);
        JOptionPane.showMessageDialog(null,number+" ^ "+power+" = "+result+"\n"+"El resultado de la potencia es: "+""+result);
        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
            res=Integer.parseInt(ar);
        } while (res==1);
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
