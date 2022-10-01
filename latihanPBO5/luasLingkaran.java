package latihanPBO5;
import java.util.Scanner;
public class luasLingkaran {
    Scanner sc = new Scanner(System.in);
    private int JJ;
    public void setJJ() {
        this.JJ = sc.nextInt();
    }
    public void luaslings(int JJ){
        System.out.println("Jari-jari lingkaran = " + this.JJ);
        float luas = (float)((float)Math.PI*Math.pow(this.JJ, 2));
        System.out.println("Luas lingkaran = " + luas);
    }

}
