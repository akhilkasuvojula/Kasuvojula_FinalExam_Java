/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Example1 {
    
public static void main(String args[]) throws FileNotFoundException, IOException 
   {
       System.out.println("Answer to question 6 Example 1: Akhil Kasuvojula");
	FileInputStream f = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception
         */
        f= new FileInputStream("input.txt"); 
	int a; 

	/* Method read() of FileInputStream class also throws 
	 * a checked exception: IOException
         */
	while(( a = f.read() ) != -1) 
	{ 
		System.out.print((char)a); 
	} 

	/*The method close() closes the file input stream
	 * It throws IOException*/
	f.close(); 	
   }
}
