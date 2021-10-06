/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fiproject.praktikthis;

/**
 *
 * @author fitriadyaa
 * Fitria Widyani
 * XI RPL 2
 */
public class Kendaraan {
    String nomor;
    String nama;
    
//    public Kendaraan(String nomor, String nama){
//        this.nomor=nomor;
//        this.nama=nama;
//    }
    
      public Kendaraan(String plat, String merk){
        nomor = plat;
        nama = merk;
    }
    
    public void infoKendaraan(){
        System.out.println("nomor plat = "+nomor+", nama kendaraan = "+nama);
    }
}
