package latihanPBO5;
import java.util.Scanner;
public class menghitungLuas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        String luasApa,loop;
        do {
            System.out.print("Luas apa yang ingin dimasukan : "); luasApa = sc.nextLine().toLowerCase();
            System.out.println(" ");
            if (luasApa.equals("segitiga")){
                luasSegitiga luas1 = new luasSegitiga();
                System.out.print("Masukan alas segitiga : ");luas1.setAlas();
                System.out.print("Masukan tinggi segitiga : ");luas1.setTinggi();
                System.out.print("Hasil luas segitiga tsb adalah : ");luas1.hitungLuas(a, b);
                System.out.println("=============================== ");
            } else if (luasApa.equals("lingkaran")) {
                luasLingkaran luas2 = new luasLingkaran();
                System.out.print("Masukan jari jari lingkaran : ");luas2.setJJ();
                luas2.luaslings(a);
                System.out.println("=============================== ");
            }
            else{
                System.out.println("Input anda salah, mohon diulang.");
            }
            System.out.print("Apakah mau berhitung lagi gan ? [y/n]"); loop=sc.nextLine();
            System.out.println("=============================== ");
        }while (loop.equals("y")||loop.equals(("Y")));
        System.out.println("Terima kasih telah menggunakan aplikasi ini");
    }
}