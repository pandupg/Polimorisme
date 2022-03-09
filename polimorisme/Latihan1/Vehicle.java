/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorisme.Latihan1;

/**
 *
 * @author Pandu Putrakelana G
 */
public abstract class Vehicle {
    
    public void function(){
        System.out.println("Tools Transportation");
    }
    public void fuel(){
        System.out.println("Fuels");
    }
    public abstract void walk(); // penulisan method abstract
}
