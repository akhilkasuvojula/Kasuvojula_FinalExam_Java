/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akhil_Q1interface;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Demo implements MyInterfaceEx2 {

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
       System.out.println("implementation of method2");
    }
    public static void main(String arg[])
   {
	MyInterfaceEx2 obj = new Demo();
        System.out.println("Answer to question 1 Interface Example2:Akhil Kasuvojula");
	obj.method1();
   }
    
}
