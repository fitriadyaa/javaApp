/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismeFitria;

/**
 *
 * @author fitriadyaa
 */
public class Persegi extends BangunDatar{
    int s;
    
    public Persegi(int s) {
        this.s = s;
    }   
    
    @Override
    
    public float luas(){
        return this.s  * this.s;
    }
 
    @Override
    public float keliling(){
        return this.s * 4;
    }   
}