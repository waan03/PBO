import java.util.Scanner;
public class Lat7 {
    static Scanner sc = new Scanner(System.in);
    public static int  waker, lembur,gol;
    public static double gaji,tunjangan,gajiakhir;
    static void kurangwaktu(){
        do{
            System.out.print("Masukan waktu kerja     : ");waker=sc.nextInt();
            lembur = waker - 173;
            if (waker<173){
                System.out.println("Input salah (min. 173 jam) ");
                System.out.println(" ");
            }
        }while (waker<173);
    }
    public static void gol1(){
        gaji = 1486500-((double)1486500*0.005);
        tunjangan = 250000-((double)250000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur anda       : "+lembur+" jam");
        lembur = lembur*20000;
        gajiakhir = gaji+tunjangan+lembur;
        System.out.println("Waktu kerja anda        : "+waker+" jam");
        System.out.println("Gaji anda               : Rp."+gaji);
        System.out.println("Tunjangan anda          : Rp."+tunjangan);
        System.out.println("Gaji lembur anda        : Rp."+lembur);
        System.out.println("=====================================");
        System.out.println("Total gaji anda = Rp."+gajiakhir);
        System.out.println("=====================================");
    }
    public static void gol2(){
        gaji = 1926000-((double)1926000*0.005);
        tunjangan = 300000-((double)300000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur anda       : "+lembur+" jam");
        lembur = lembur*20000;
        gajiakhir = gaji+tunjangan+lembur;
        System.out.println("Waktu kerja anda        : "+waker+" jam");
        System.out.println("Gaji anda               : Rp."+gaji);
        System.out.println("Tunjangan anda          : Rp."+tunjangan);
        System.out.println("Gaji lembur anda        : Rp."+lembur);
        System.out.println("=====================================");
        System.out.println("Total gaji anda = Rp."+gajiakhir);
        System.out.println("=====================================");
    }
    public static void gol3(){
        gaji = 2456700-((double)2456700*0.005);
        tunjangan = 350000-((double)350000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur anda       : "+lembur+" jam");
        lembur = lembur*20000;
        gajiakhir = gaji+tunjangan+lembur;
        System.out.println("Waktu kerja anda        : "+waker+" jam");
        System.out.println("Gaji anda               : Rp."+gaji);
        System.out.println("Tunjangan anda          : Rp."+tunjangan);
        System.out.println("Gaji lembur anda        : Rp."+lembur);
        System.out.println("=====================================");
        System.out.println("Total gaji anda = Rp."+gajiakhir);
        System.out.println("=====================================");
    }
    public static void gol4(){
        gaji = 2899500-((double)2899500*0.005);
        tunjangan = 400000-((double)400000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur anda       : "+lembur+" jam");
        lembur = lembur*20000;
        gajiakhir = gaji+tunjangan+lembur;
        System.out.println("Waktu kerja anda        : "+waker+" jam");
        System.out.println("Gaji anda               : Rp."+gaji);
        System.out.println("Tunjangan anda          : Rp."+tunjangan);
        System.out.println("Gaji lembur anda        : Rp."+lembur);
        System.out.println("=====================================");
        System.out.println("Total gaji anda = Rp."+gajiakhir);
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        String jawab;
        do {
            System.out.print("Masukan golongan (1/2/3/4) : "); gol=sc.nextInt();
            switch (gol){
                case 1 -> gol1();
                case 2 -> gol2();
                case 3 -> gol3();
                case 4 -> gol4();
                default -> System.out.println("Silakan input ulang");
            }
            System.out.print("Input ulang (y/n) ? "); jawab=sc.next().toUpperCase();
            System.out.println(" ");
            }while(jawab.equals("Y"));
        System.out.println("Terima kasih. Selamat menikmati gaji anda");
        }
    }