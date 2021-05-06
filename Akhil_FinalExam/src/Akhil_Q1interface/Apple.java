/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q1interface;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Apple implements Fruit {
    
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    public String getFruitType(){
        return "sessonal fruit";
    }
}