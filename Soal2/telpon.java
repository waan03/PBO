package Soal2;
import java.util.Scanner;
public class telpon {
    public int convertJam (int a, int b){
        return (a-b)*3600;
    }
    public int convertMenit (int a, int b){
        return  (a-b)*60;
    }
    public int convertDetik (int a, int b){
        return  a-b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        telpon t = new telpon();
        int bayar=150;
        int startJ, startM,startD, endJ,endM,endD, J,M,D;
        System.out.print("Masukan jam awal : "); startJ= sc.nextInt();
        System.out.print("Masukan menit awal : "); startM= sc.nextInt();
        System.out.print("Masukan detik awal : "); startD= sc.nextInt();
        System.out.println("Waktu awal telpon : " + startJ + " : " + startM + " : " + startD);
        System.out.println("========================");
        System.out.print("Masukan jam akhir : "); endJ= sc.nextInt();
        System.out.print("Masukan menit akhir : "); endM= sc.nextInt();
        System.out.print("Masukan detik akhir : "); endD= sc.nextInt();
        System.out.println("Waktu akhir telpon : "+ endJ + " : " + endM + " : " + endD);
        System.out.println("========================");
        J=t.convertJam(endJ,startJ );
        M=t.convertMenit(endM,startM);
        D=t.convertDetik(endD,startD);
        System.out.println("Total pulsa yang dikurangi : Rp."+(J+D+M)*bayar+",00-");
        System.out.println("Waktu yang digunakan "+(endJ-startJ)+" : "+(endM-startM)+" : "+(endD-startD));
    }
}
