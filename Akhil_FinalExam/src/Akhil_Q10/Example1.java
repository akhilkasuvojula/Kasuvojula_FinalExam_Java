/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q10;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example1 {
    
 public static void main(String[] args) {
    int result = sum(10);
    System.out.println("Answer for Question 10 Example 1: Akhil Kasuvojula");
    System.out.println("The addition of numbers is :"+result);
  }
  public static int sum(int n) {
    if (n > 0) {
      return n + sum(n - 1);
    } else {
      return 0;
    }
  }
}
