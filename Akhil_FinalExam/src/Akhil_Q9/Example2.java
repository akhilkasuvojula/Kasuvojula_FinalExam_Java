/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q9;;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example2 {
       void method1() throws ArithmeticException{  
	throw new ArithmeticException("Calculation error"); 
   }  
   void method2() throws ArithmeticException{  
	method1();  
   }  
   void method3(){  
	try{  
	   method2();  
	}
	catch(ArithmeticException e){
	   System.out.println("ArithmeticException handled");
	}  
   }  
   public static void main(String args[]){  
	Example2 obj=new Example2();  
System.out.println("Answer for question 9 Example2: Akhil Kasuvojula");
	obj.method3();  
	System.out.println("End Of Program");  
   }  
}
    

