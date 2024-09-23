package com.deloitte.lab05.ex03;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Ex03 {

    
    public static void checkSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException();
        }
        System.out.println("Salary is valid.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	double salary = sc.nextDouble(); 

        try {
            checkSalary(salary);  
        } catch (EmployeeException e) {
            System.out.println(e.getMessage()); 
        } finally {
			sc.close();
		}
    }
}
