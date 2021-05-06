/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q6;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example2 {
    public static void main(String args[])
   {
	try{
       int arr[] ={1,2,3,4,5};
	
	System.out.println(arr[7]);
   }catch(ArrayIndexOutOfBoundsException e)
   {
       System.out.println("Answer for Question6 Example 2: Akhil Kasuvojula");
       System.out.println("Exception:The value is out of index");
   }
   }

}
