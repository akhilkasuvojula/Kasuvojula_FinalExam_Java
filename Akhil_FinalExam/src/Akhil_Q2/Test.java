/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q2;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("Answer for Question 2 :Akhil Kasuvojula");

        GeometricObject[] go = new GeometricObject[5];
        go[0] = new Square(4);
        go[1] = new Square(9);
        go[2] = new Square(14);
        go[3] = new Square(8);
        go[4] = new Square(12);

        for (int i = 0; i < go.length; i++) {
            System.out.println("Area of square " + (i + 1) + " :" + go[i].Area());
            if (go[i] instanceof Colorable) {
                ((Square) go[i]).howToColor();
            }
        }
    }
}