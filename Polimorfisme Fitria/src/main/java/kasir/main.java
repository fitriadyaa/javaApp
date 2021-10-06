/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;


/**
 *
 * @author fitriadyaa
 */

public class main {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        int lagi = 1;
        int pass = 123456, pilih, pilih1, pil;
        

        System.out.println("- - - Data ZF Two Store - - -");
        System.out.println("Masukan password : ");
        pass = input.nextInt();
        
        while(pass == 123456){
            System.out.println("- - - Selamat Datang Admin! - - -");
            System.out.println("|1| Data Gamis");
            System.out.println("|2| Data Kerudung");
            System.out.println("|3| Total Data Masuk dan Keluar");
            System.out.println("Pilih : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    //Pemanggilan class Masuk (Overriding)
                    System.out.println("1. Barang Masuk");
                    System.out.println("2. Barang Keluar");
                    System.out.println("Pilih");
                    pilih1 = input.nextInt();
                    
                    if(pilih1 == 1){
                        Masuk masuk = new Masuk();
                        masuk.masukBarang();
                    }
                    if(pilih1 == 2){
                        Masuk masuk = new Masuk();
                        masuk.keluarBarang();
                    }
                break;
                
                case 2:
                    //Pemanggilan class Masuk (Overriding)
                    System.out.println("1. Barang Masuk");
                    System.out.println("2. Barang Keluar");
                    System.out.println("Pilih");
                    pilih1 = input.nextInt();
                    
                    if(pilih1 == 1){
                        Keluar keluar = new Keluar();
                        keluar.masukBarang();
                    }
                    if(pilih1 == 2){
                        Keluar keluar = new Keluar();
                        keluar.keluarBarang();
                    }
                    
                break;    
                default: System.out.println("Lagi ? 1. Ya 2. Tidak");
                System.out.println("Pilih : ");
                pil = input.nextInt();
            }
        }

    }
}
