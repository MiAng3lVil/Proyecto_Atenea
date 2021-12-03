package atenea.pkg11;
import javax.swing.JOptionPane;
public class Atenea11 {
    public static void main(String[] args){
        int res;
        do{
        long fac=1;
        long fan=1, fan1=1, fan2=1, fan3=1, fan4=1, fan5=1, fan6=1, fan7=1;
        int np;
        int kp,kp1,kp2,kp3,kp4,kp5,kp6,kp7;
        int LA;
        double fato8,fato1,fato2,fato3,fato4,fato5,fato6,fato7;
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
                        res=Integer.parseInt(ar);
                        } while (res==1);
    }
    
}
