public class LatihanConstructor {
    public int getBilangan() {
        return bilangan;
    }
    public void setBilangan(int bilangan) {
        this.bilangan = bilangan;
    }

    int bilangan;
    public LatihanConstructor(int bil){
        System.out.println("Konstruktor dijalankan..");
        this.bilangan = bil;
    }

    public static void main(String[] args) {
        LatihanConstructor obj = new LatihanConstructor(300);
        System.out.println("bilangan : "+ obj.getBilangan());
        obj.setBilangan(100);
        System.out.println("bilangan : "+ obj.getBilangan());
    }
}
