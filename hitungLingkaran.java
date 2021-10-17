

import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class hitungLingkaran {
     Scanner masukkanR = new Scanner (System.in);
        
        //Deklarasi nilai
         double phi = 3.14;
         double r;
         double hasilLuas;
         double kelilingLingkaran;
         
         //input jari-jari lingkaran
        public double hitungLingkaran() throws IOException{
            System.out.println("Selamat datang di penghitungan lingkaran ");
            System.out.print("Masukkan jari- jari lingkaran :");
            r=masukkanR.nextInt();
         
        //menghitung luas lingkaran rumusnya phi*r*r
        
            hasilLuas = phi* r *r;
            
            System.out.println("hasil luas lingkaran");
        
           
                   
          
            return hasilLuas;
           
             
         }
        
     
         
      
    public static void main(String[] args)throws IOException{
         hitungLingkaran luas = new hitungLingkaran();
         System.out.println(luas.hitungLingkaran());
         kelilingLingkaran keliling = new kelilingLingkaran();
         System.out.println(keliling.kelilingLingkaran());
        
        
    }
    
}
