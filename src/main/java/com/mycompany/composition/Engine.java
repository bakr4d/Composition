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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public float getRatedSpeed() {
        return ratedSpeed;
    }

    public void setRatedSpeed(float ratedSpeed) {
        this.ratedSpeed = ratedSpeed;
    }
    
}
