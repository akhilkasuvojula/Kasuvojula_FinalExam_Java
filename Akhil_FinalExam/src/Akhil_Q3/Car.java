/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q3;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Car extends Vehicle{
    private String colour;
    private String model;

    public Car(String colour, String model, String name, String type, int cost) {
        super(name, type, cost);
        this.colour = colour;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + "colour=" + colour + ", model=" + model + '}';
    }
    

    
}
