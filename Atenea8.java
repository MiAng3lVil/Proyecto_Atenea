package atenea.pkg8;
import javax.swing.JOptionPane;
public class Atenea8 {
    public static void main(String[] args) {
        long fac=1;
        long fan=1;
        long fanl=1;
        int n;
        int k;
        int Y;
        int resta;
        double fato;
        double fito;
        int res;
        do{
        String fa=JOptionPane.showInputDialog(null,"Esta parte es para realizar combinaciones utilizando la formula."+"\n"+
                "C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                "Asi que por favor introduce el valor de n"+"\n"+"No olvides que (n>=1): ");
        n = Integer.parseInt(fa);
        String fal=JOptionPane.showInputDialog(null,"Ahora que por favor introduce el valor de k"+"\n"+"No olvides que (0<=k<=n): ");
        k = Integer.parseInt(fal);
        for (int i = n; i > 0; i--) {
            fac = fac * i;
        }
        JOptionPane.showMessageDialog(null,"El factorial de " + n + " es: " + fac);
        for (int i = k; i > 0; i--) {
            fan = fan * i;
        }
        JOptionPane.showMessageDialog(null,"El factorial de " + k + " es: " + fan);
        resta=n-k;
        Y=n-k;
        for (int i = Y; i > 0; i--) {
            fanl = fanl * i;
        }
        fito= fan * fanl;
        fato= fac / fito;
        JOptionPane.showMessageDialog(null,
               "La formula de la operación es: "+"C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                       "C(n;k)= n! /[k!*(n-k)!]"+"\n"+
                       "C( "+n+" ; "+k+" )= "+n+" ! /[ "+k+" !*( "+n+" - "+k+" )!] "+"\n"+
                       "C( "+n+" ; "+k+" )= "+n+" ! /[ "+k+" !* "+resta+" !]"+"\n"+
                       "C( "+n+" ; "+k+" )= "+fato+"\n"+
                       "El resultado de esta operación es: "+fato);
        String ar=JOptionPane.showInputDialog(null,"Quieres ocupar esta operación otra vez"+"\n"+"Escribe un 1 para SÍ o 2 para un NO");
                        res=Integer.parseInt(ar);
                        } while (res==1);
    }
    
}
