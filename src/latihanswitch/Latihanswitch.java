/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanswitch;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Latihanswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner (System.in);
           System.out.println("Masukkan angka bulan :" );
           angka = input.nextInt();
           switch(angka)
                   {
               case 1 :
                   System.out.println("Bulan Januari");
                   break;
               case 2 :
                   System.out.println("Bulan Februari");
                   break;
               case 3 :
                   System.out.println("Bulan Maret");
                   break;
               case 4 :
                   System.out.println("Bulan April");
                   break;
               case 5 :
                   System.out.println("Bulan Mei");
                   break;
               case 6 :
                   System.out.println("Bulan Juni");
                   break;
               case 7 :
                   System.out.println("Bulan Juli");
                   break;
               case 8 :
                   System.out.println("Bulan Agustus");
                   break;
                   case 9 :
                   System.out.println("Bulan September");
                   break;
               case 10 :
                   System.out.println("Bulan Oktober");
                   break;
               case 11 :
                   System.out.println("Bulan November");
                   break;
               case 12 :
                   System.out.println("Bulan Desember");
                   break;
                   default :
                       System.out.println("Angka yang Anda masukkan salah");
                       break;
                   }
    }
    
}
