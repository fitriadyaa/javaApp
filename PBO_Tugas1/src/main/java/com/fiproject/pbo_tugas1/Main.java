/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fiproject.pbo_tugas1;

/**
 *
 * @author fitriadyaa
 */
public class Main {
      public static void main(String[] args) {
        Penemu penemu1 = new Penemu("Albert Einstein", "Teori Ralativitas");
        Penemu penemu2 = new Penemu("Al khawarizmi", "Aljabar");
        Penemu penemu3 = new Penemu("B.J Habibie", "Crack Propagation Theory");
        
        penemu1.cetakPenemu();
        penemu2.cetakPenemu();
        penemu3.cetakPenemu();
    }
}
