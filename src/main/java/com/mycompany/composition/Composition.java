/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composition;

/**
 *
 * @author Lenovo
 */
public class Composition {

    public static void main(String[] args) {
        
      Engine e =new Engine ("12cc","Germany",100);    
      Car c = new Car (e);
        System.out.println("The Car Engine Type is from "+c.getMyEngine().getType());

    }
}