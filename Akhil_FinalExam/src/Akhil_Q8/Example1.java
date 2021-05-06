/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q8;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example1 {
    public static void main(String args[]) {
      int a[] = new int[2];
      try {
          System.out.println("Answer for Question 8 Example 1: Akhil Kasuvojula");
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
          
         System.out.println("Exception thrown  :" + e);
      }
}

}