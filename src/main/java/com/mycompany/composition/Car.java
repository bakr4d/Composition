/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition;

/**
 *
 * @author Lenovo
 */
public class Car {
        // Attributes صفات 
          private int  speed ;
          private String color;
          private boolean isHatcheba;
          private String model;
          //
          //
          // I want to made this relation   ''CAR has An engine'' 
          //
          //
          private Engine myEngine;
          
          
          
          
          public Car (){
              
          }// a default constructor

    public Car(int speed, String color, boolean isHatcheba, String model,Engine myEngine) { // a constructor 
        this.speed = speed;
        this.color = color;
        this.isHatcheba = isHatcheba;
        this.model = model;
        this.myEngine=myEngine;
    }

    public Car(Engine myEngine) {
        this.myEngine = myEngine;
    }
    
    
    // Setter and getter 

    public Engine getMyEngine() {
        return myEngine;
    }

    public void setMyEngine(Engine myEngine) {
        this.myEngine = myEngine;
    }
    
    
    
      public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

       public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }
    
    public void setIsHatcheba(boolean isHatcheba) {
        this.isHatcheba = isHatcheba;
    }

   public boolean isIsHatcheba() {
        return isHatcheba;
    }


    public void setModel(String model) {
        this.model = model;
    }
        public String getModel() {
        return model;
    }
    
////////////////////////
          
          // Functions or methods 
          
          public void turnedOn(){
              
          }
          public void trunedOff(){
              
          }
          public void move(){
              
          }
          public void brake(){
              
          }
    
    
}
