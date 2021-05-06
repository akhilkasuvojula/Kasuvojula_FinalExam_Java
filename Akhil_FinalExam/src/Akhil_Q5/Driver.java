/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q5;

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
        System.out.println("Answer for question 5: Akhil Kasuvojula");
        ComparableCircle c1 = new ComparableCircle(6.0);
        ComparableCircle c2 = new ComparableCircle(3.0);
        int compare = c1.compareTo(c2);
        if (compare == 1) {
            System.out.println("Circle1 is larger");
        } else if (compare == -1) {
            System.out.println("Circle2 is larger");
        } else {
            System.out.println("Both Circles are of equal area.");
        }

    }

    }
    

