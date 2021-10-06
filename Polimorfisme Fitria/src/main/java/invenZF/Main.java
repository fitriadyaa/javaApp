/*
 * Fitria Widyani
 * XII RPL 2
 * Inventory Sederhana
 * 13-14 Agustus 2020
 */
package invenZF;
import java.util.Scanner;
import kasir.Keluar;
import kasir.Masuk;

/**
 *
 * @author fitriadyaa
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pass = 123456, pilih, pilih1, pil;
        
        //masukan password
        System.out.println("- - - Data ZF Two Store - - -");
        System.out.println("Masukan password : ");
        pass = input.nextInt();
        
        while(pass == 123456){
            System.out.println("- - - Selamat Datang Admin! - - -");
            System.out.println("|1| Data Gamis");
            System.out.println("|2| Data Kerudung");
            System.out.println("|3| Keluar");
            System.out.println("Pilih : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    //Pemanggilan class Masuk (Overriding)
                    System.out.println("DATA KERUDUNG");
                    System.out.println("1. Barang Masuk");
                    System.out.println("2. Barang Keluar");
                    System.out.println("Pilih");
                    pilih1 = input.nextInt();
                    
                    if(pilih1 == 1){
                        Gamis gamis = new Gamis();
                        gamis.masukBarang();
                    }
                    if(pilih1 == 2){
                        Gamis gamis = new Gamis();
                        gamis.keluarBarang();
                    }
                break;
                
                case 2:
                    //Pemanggilan class Masuk (Overriding)
                    System.out.println("DATA KERUDUNG");
                    System.out.println("1. Barang Masuk");
                    System.out.println("2. Barang Keluar");
                    System.out.println("Pilih");
                    pilih1 = input.nextInt();
                    
                    if(pilih1 == 1){
                        Kerudung kerudung = new Kerudung();
                        kerudung.masukBarang();
                    }
                    if(pilih1 == 2){
                        Kerudung kerudung = new Kerudung();
                        kerudung.keluarBarang();
                    }
                    
                break;  
                case 3: System.exit(0);
                break;
                default: System.out.println("Lagi ? 1. Ya 2. Tidak");
                System.out.println("Pilih : ");
                pil = input.nextInt();
            }
        }

    }
}
