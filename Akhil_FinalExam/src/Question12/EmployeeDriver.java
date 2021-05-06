/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Akhil Kasuvojula
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 12: Akhil Kasuvojula");;
        ArrayList<Employee> employeelist = new ArrayList<>();

        employeelist.add(new Employee(102, "Pranay", 8000));
        employeelist.add(new Employee(100, "arjun", 7250));
        employeelist.add(new Employee(107, "Rahul", 10000));
        employeelist.add(new Employee(110, "sambu", 6000));
        employeelist.add(new Employee(104, "hari hara", 5000));

        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Collections.sort(employeelist);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Comparator<Employee> compareBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                }
                if (e1.getEmpSalary() < e2.getEmpSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(employeelist, compareBySalary);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Comparator<Employee> compareByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        };
        Collections.sort(employeelist, compareByName);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }
    }
}

    
    

