/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoliforfismeFitriaW;

/**
 *
 * @author fitriadyaa
 */
public class Anjing extends Animal {
    @Override
    protected void suaraHewan() {
       System.out.println("Anjing :");
       System.out.println("Guk Guk..");
    }
    
    @Override
    protected void kakiHewan(){
        System.out.println("4 kaki");
    }
}
