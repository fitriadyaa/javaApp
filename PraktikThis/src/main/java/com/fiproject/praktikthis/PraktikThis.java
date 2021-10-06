/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fiproject.praktikthis;

/**
 *
 * @author fitriadyaa
 */
public class PraktikThis {
    public static void main(String[] args){
        Kendaraan kendaraan1 = new Kendaraan("D1234CW", "Kawasaki Ninja");
        Kendaraan kendaraan2 = new Kendaraan("B1234CW", "Honda CBR");
        
        kendaraan1.infoKendaraan();
        kendaraan2.infoKendaraan();
    }
}
