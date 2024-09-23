package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
    
	Employee getEmployeeDetails();
    
    String findInsuranceScheme(Employee employee);
    
    void displayEmployeeDetails(Employee employee);
}
