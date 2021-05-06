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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle= new Vehicle("BMW","4wheeler",6000);
    System.out.println("Answer to question 3 Example 2: Akhil Kasuvojula");
    Car c=new Car("Red","2020","BMW","4wheeler",6000);
    vehicle=c;
    c=(Car)vehicle;
    System.out.println(c);
    
     }

    }
    

