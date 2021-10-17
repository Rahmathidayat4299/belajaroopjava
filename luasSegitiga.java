/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphitungsegitiga;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class luasSegitiga {
    public double alas;
    public double tinggi;
    public double rumus = 0.5;
    public double luasSegitiga;
    Scanner nilai = new Scanner(System.in);

 

    
    
    
   void luasSegitiga(){
        System.out.print("masukkan nilai alas: ");
        alas = nilai.nextDouble();
        System.out.print("masukkan nilai tinggi: ");
        tinggi = nilai.nextDouble();
        luasSegitiga = rumus * alas * tinggi;
        
        System.out.println("luas segitiga "+luasSegitiga +"cm");
        
       
    }
}
