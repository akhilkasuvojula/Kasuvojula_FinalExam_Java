/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example1 {
    static void checkgpa(int gpa) {
    if (gpa < 50) {
      throw new ArithmeticException("Access denied: cannot enroll in course");
    }
    else {
      System.out.println("Access granted - can enroll");
    }
  }

  public static void main(String[] args) {
System.out.println("Answer for Question 9 Example 1:Akhil Kasuvojula");
    checkgpa(45);
  }
}
