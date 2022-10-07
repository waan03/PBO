package Soal4;

import java.util.Scanner;

public class empat {
    public static void main(String[] args) {
        double nilai;
        Scanner sc = new Scanner(System.in);
        grading g = new grading();
        System.out.print("Masukan total nilai : "); nilai=sc.nextDouble();
        System.out.println("Nilai angka : " +nilai);
        System.out.print("Nilai huruf : ");g.nilaikamu(nilai);
    }
}
