package Soal4;

public class grading {
    public void nilaikamu(double nilai){
        if (nilai>=0 && nilai<=39.99){
            System.out.print("E");
        }
        else if (nilai<=49.99){
            System.out.print("D");
        }
        else if (nilai<=54.99){
            System.out.print("C-");
        }
        else if (nilai<=59.99){
            System.out.print("C");
        }
        else if (nilai<=64.99){
            System.out.print("C+");
        }
        else if (nilai<=69.99){
            System.out.print("B-");
        }
        else if (nilai<=74.99){
            System.out.print("B");
        }
        else if (nilai<=79.99){
            System.out.print("B+");
        }
        else if (nilai<=89.99){
            System.out.print("A-");
        }
        else if (nilai<=100){
            System.out.print("A");
        }
        else{
            System.out.print("nilai gabener ajg");
        }

    }
}
