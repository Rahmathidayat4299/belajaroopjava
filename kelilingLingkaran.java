
import java.io.IOException;
import java.util.Scanner;


public class kelilingLingkaran {
    Scanner masukkanR = new Scanner (System.in);
     double phi = 3.14;
     double r;
     double kelilingLingkaran;
     
     public double kelilingLingkaran() throws IOException{
         System.out.println("menghitung keliling lingkaran");
         
         System.out.println("masukkan jari-jari lingkaran :");
         r = masukkanR.nextInt();
         
         kelilingLingkaran = 2*phi*r;
         
         System.out.println("hasil keliling lingkaran  :");
         
        return kelilingLingkaran;
         
     }
}
