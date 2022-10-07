public class Lingkaran {
    private double r;
    private final double PHI=3.14;

    public void setR(double jari) {
        this.r = jari;
    }
    public double getR() {
        return this.r;
    }
    public double luas(){
        return PHI*r*r;// bisa juga menggunakan Math.pow(r,2);
    }
    public double keliling(){
        return 2*this.PHI*this.r;
    }

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        ling.setR(7);
        System.out.println("Luas = " +ling.luas());
    }
}
