package com.aop.bo;

import com.aop.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void displayEmployee(Employee emp) {

		System.out.println("emp no " + emp.getEno());
		System.out.println("emp Name " + emp.getEname());
		System.out.println("emp salary " + emp.getEsal());
		System.out.println("emp Emailid " + emp.getEmail());
		System.out.println("emp mobile no " + emp.getEmobile());
		System.out.println();
	}

	@Override
	public void getEmployeeDetails(Employee emp) {
		System.out.println();
		System.out.println("getemplyeeDetails() executed ");
		System.out.println("emp no " + emp.getEno());
		System.out.println("emp Name " + emp.getEname());
		System.out.println("emp salary " + emp.getEsal());
		System.out.println("emp Emailid " + emp.getEmail());
		System.out.println("emp mobile no " + emp.getEmobile());
	}

}
