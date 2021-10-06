/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoliforfismeFitriaW;

/**
 *
 * @author fitriadyaa
 * Fitria Widyani
 * XII RPL 2
 * Minggu - Rabu 10 - 12 Agustus 
 * 
 * Animal Sound 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Anjing anjing = new Anjing();
        Kucing kucing = new Kucing();
        Ayam ayam = new Ayam();
        
        kucing.suaraHewan();
        kucing.kakiHewan();
        ayam.suaraHewan();
        ayam.kakiHewan();
        anjing.suaraHewan();
        anjing.kakiHewan();
        
        

    }
 
}
