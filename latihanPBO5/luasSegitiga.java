package latihanPBO5;
import java.util.Scanner;

public class luasSegitiga {
    private int alas, tinggi;
    Scanner sc = new Scanner(System.in);

    public void setAlas() {
       this.alas = sc.nextInt();
       System.out.println("alas = " + alas);
    }
    public void setTinggi() {
        this.tinggi = sc.nextInt();
        System.out.println("tinggi = " + tinggi);
    }

    public void hitungLuas(int alas, int tinggi){
        float luas = (float)(this.alas * this.tinggi) / 2;
        System.out.println(luas);
    }

}
