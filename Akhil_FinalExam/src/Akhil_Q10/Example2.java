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
public class Example2 {
    
static int array[] = {10, 12, 54, 210, 321};
    
    /* Recursive Method to search x in arr[l..r] */
    static int recSearch(int array[], int k, int r, int x)
    {
         if (r < k)
            return -1;
         if (array[k] == x)
            return k;
         if (array[r] == x)
            return r;
         return recSearch(array, k+1, r-1, x);
    }
     
    // Driver method
    public static void main(String[] args)
    {
       int x = 54;
        
       //Method call to find x
       int index = recSearch(array, 0, array.length-1, x);
       System.out.println("Answer for Question 10 Example 2: Akhil Kasuvojula");
       if (index != -1)
          System.out.println("Element " + x + " is present at index " +
                                                   index);
       else
           System.out.println("Element " + x + " is not present");
       }
}

