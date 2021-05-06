/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q8;
import java.io.*;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example2 {
   
void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
  } 




  public static void main(String args[]){ 
   try{ 
       System.out.println("Answer for Question 8 Example 2:Akhil Kasuvojula");
     Example2 obj=new Example2(); 
     obj.myMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}