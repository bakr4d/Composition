/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition;

/**
 *
 * @author Lenovo
 */
public class Engine {
     
    // some attributes
    private String power  ;
    private String type ;
    private float ratedSpeed;

    public Engine() {
    }//default constructor 

    
    
    public Engine(String power, String type, float ratedSpeed) {
        this.power = power;
        this.type = type;
        this.ratedSpeed = ratedSpeed;
    }
    
}
