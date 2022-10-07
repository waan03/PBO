package Soal3;
import java.util.Scanner;

public class warnetan {
    static double biayaInet(double a){
        if(a<=30){
            a=30;
        }
        return (a/60) * 4000;
    }
    static double biayaNgetik(double a){
        if(a<=30){
            a=30;
        }
        return (a/60) * 2000;
    }
    static double biayaGame(double a){
        if(a<=30){
            a=30;
        }
        return (a/60) * 5000;
    }
    static double biayaScan(double a){
        return a*1000;
    }
    static double biayaPWarna(double a){
        return a*500;
    }
    static double biayaPgrayscale(double a){
        return a*500;
    }
    static double biayaTehBotol(double a){
        return a*3000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inet, ngetik, game;
        int scan, pWarna, pHitam, tehBotol;
        double total;
        System.out.println("Selamat datang di warnet \"CONNECT\" Silakan input total waktu :");
        System.out.print("Lama internet                 : "); inet=sc.nextInt();
        System.out.print("Lama ngetik                   : "); ngetik=sc.nextInt();
        System.out.print("Lama game                     : "); game=sc.nextInt();
        System.out.println("-------------------------------");
        System.out.println("Silakan masukan extras :");
        System.out.print("Total scan (file)             : "); scan=sc.nextInt();
        System.out.print("Total print warna (lembar)     : "); pWarna=sc.nextInt();
        System.out.print("Total print grayscale (lembar): "); pHitam=sc.nextInt();
        System.out.print("Total teh botol               : "); tehBotol=sc.nextInt();
        System.out.println("===============================");
        System.out.print("Biaya internet                : Rp.");System.out.println(biayaInet(inet));
        System.out.print("Biaya ngetik                  : Rp.");System.out.println(biayaNgetik(ngetik));
        System.out.print("Biaya game                    : Rp.");System.out.println(biayaGame(game));
        System.out.print("Biaya scan                    : Rp.");System.out.println(biayaScan(scan));
        System.out.print("Biaya print (warna)           : Rp.");System.out.println(biayaPWarna(pWarna));
        System.out.print("Biaya print (warna)           : Rp.");System.out.println(biayaPgrayscale(pHitam));
        System.out.print("Biaya teh botol               : Rp.");System.out.println(biayaTehBotol(tehBotol));
        total = biayaInet(inet)+biayaNgetik(ngetik)+biayaGame(game)+biayaScan(scan)+biayaPWarna(pWarna)+biayaPgrayscale(pHitam)+biayaTehBotol(tehBotol);
        System.out.println("===============================");
        System.out.println("Total biaya warnet  \"CONNECT\" : Rp."+total);


    }

}
