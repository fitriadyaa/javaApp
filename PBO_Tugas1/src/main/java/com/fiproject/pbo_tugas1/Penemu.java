/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fiproject.pbo_tugas1;

/**
 *
 * @author fitriadyaa
 * Nama Program : Penemu
 * Fitria Widyani
 * XI RPL 2
 * Dibuat  tanggal 24 Maret
 * Program sederhana mengetahu nama penemu
 * dan apa temuannya
 */
public class Penemu {
    String nama;
    String temuan;
    
    public Penemu(String nama, String temuan) {
        this.nama = nama;
        this.temuan = temuan;
    }
 
    public void cetakPenemu() {
        System.out.println("Nama: " + nama);
        System.out.println("Temuan: " + temuan);
    }
    
}

