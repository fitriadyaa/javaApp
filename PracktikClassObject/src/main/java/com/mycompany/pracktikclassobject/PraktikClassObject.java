/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pracktikclassobject;

/**
 *
 * @author fitriadyaa
 */
public class PraktikClassObject {
    public static void main(String[] args){
        //membuat objek pelajar dan karyawan
        Orang pelajar = new Orang();
        Orang karyawan = new Orang();
        
        //mengisi atribut pelajar
        pelajar.namaAwal = "Cecep";
        pelajar.namaAkhir = "Muhammad";
        pelajar.umur = 16;
        
        //menjalankan method pelajar
        pelajar.Belajar();
        
        karyawan.namaAwal = "Asep";
        karyawan.namaAkhir = "Abdullah";
        karyawan.umur = 20;
        
        karyawan.Bersepeda();
    }
    
}
