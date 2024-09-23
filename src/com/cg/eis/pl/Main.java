package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImp;

public class Main {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImp();

		// Get employee details from user
		Employee employee = employeeService.getEmployeeDetails();

		// Display employee details
		employeeService.displayEmployeeDetails(employee);
		System.out.println(employeeService.findInsuranceScheme(employee));
		
	}
}
