package com.aop.beans;

public class Student {
	String name;
	String qualification;
	String email;
	long mobileNo;

	@Override
	public String toString() {
		return "Student [name=" + name + ", qualification=" + qualification + ", email=" + email + ", mobileNo="
				+ mobileNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

}
