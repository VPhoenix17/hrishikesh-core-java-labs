package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Enter Designation: ");
		String designation = scanner.nextLine();

		String insuranceScheme = findInsuranceScheme(new Employee(id, name, salary, designation, null));

		scanner.close();

		return new Employee(id, name, salary, designation, insuranceScheme);
	}

	@Override
	public String findInsuranceScheme(Employee employee) {
		if (employee.getSalary() < 30000) {
			return "No Insurance Scheme";
		} else if (employee.getSalary() >= 30000 && employee.getSalary() < 60000) {
			return "Scheme A";
		} else {
			return "Scheme B";
		}
	}

	@Override
	public void displayEmployeeDetails(Employee employee) {
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Salary: INR " + employee.getSalary());
		System.out.println("Designation: " + employee.getDesignation());
		System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
	}

}
