package com.aop.bo;

import com.aop.beans.Student;

public class InstituteServiceImpl implements InstituteService {

	@Override
	public void enquiry(Student std, String courseName) {

		System.out.println("student enquiry");
		System.out.println("student NAME:"+std.getName());
		System.out.println("student email id:"+std.getEmail());
		System.out.println("student Qualifications: "+std.getQualification());
		System.out.println("student MobileNo: "+std.getMobileNo());
	
		System.out.println("enquiry course name: "+courseName);
		System.out.println();
		
	}

	@Override
	public void registration(Student std, String courseName) {
		System.out.println("student course registration details ");
		System.out.println("student NAME: "+std.getName());
		System.out.println("student email id: "+std.getEmail());
		System.out.println("student Qualifications: "+std.getQualification());
		System.out.println("student MobileNo: "+std.getMobileNo());
	
		System.out.println("enquiry course name: "+courseName);
		
	}

}
