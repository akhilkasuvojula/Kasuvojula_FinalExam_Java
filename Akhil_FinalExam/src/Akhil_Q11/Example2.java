/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q11;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example2 {
     private String Name;

    public Example2(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void main(String[] args) {
        System.out.println("Answer to Question 11 Example 2");
        Example2 ex1 = new Example2("AKhil");
        System.out.println(ex1.getName());
        System.out.println(ex1.hashCode());
        Example2 ex2 = new Example2("Akhil");
        System.out.println(ex2.getName());
        System.out.println(ex2.hashCode());
        System.out.println(ex2.equals(ex1));
    }
}

