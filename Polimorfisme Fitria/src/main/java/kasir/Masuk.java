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
public class Masuk extends Menu{
    Scanner input = new Scanner(System.in);
    
    int masukin, total = 100;
    
    @Override
    public int masukBarang(){
        System.out.println("- - - Data Gamis - - -");
        System.out.println("Barang masuk : ");
        masukin = input.nextInt();
        
        total = masukin + total;
        System.out.println("Jumlah Gamis Sekarang : " + total);
        return 0;
    }
    
    @Override
    public int keluarBarang(){
        System.out.println("- - - Data Gamis - - -");
        System.out.println("Barang Keluar : ");
        masukin = input.nextInt();
        
        total = masukin + total;
        System.out.println("Jumlah Gamis Sekarang : " + total);
        return 0;
    }
}
