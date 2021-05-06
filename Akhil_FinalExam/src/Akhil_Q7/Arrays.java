/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q7;

import java.util.Scanner;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Arrays {
    
public static void main(String[] args) {
                System.out.println("Answer for Question 7: Akhil Kasuvojula");

        
		Scanner scan = new Scanner(System.in);

		
		int[] array_name = getArray();

		
		System.out.print("Enter the index of the array: ");
		try {
		
			System.out.println("The corresponding element value is " + 
				array_name[scan.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	/** Returns an array with 100 randomly chosen integers */
	public static int[] getArray() {
		int[] array_name = new int[100];
		for (int i = 0; i < array_name.length; i++) {
			array_name[i] = (int)(Math.random() * 100) + 1;
		}
		return array_name;
	}
}