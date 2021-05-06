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
import java.util.ArrayList;  
public class Example1 {  
    public static void main(String[] args) {  
        String str1 = "Akhil";  
        ArrayList<String> list = new ArrayList<>();  
        list.add("Nikhil");   
        list.add("Akhil");  
        list.add("Ramesh");  
        list.add("Ajay");  
        for (String str : list) {  
            if (str.equals(str1)) {  
System.out.println("Answer to question 11 Example 1:Akhil Kasuvojula");
                System.out.println("Akhil is present");  
            }  
        }  
    }  
}
