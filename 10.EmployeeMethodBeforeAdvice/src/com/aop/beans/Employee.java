package com.aop.beans;

public class Employee {
	private int eno;
	private String ename;
	private float esal;

	public void setEsal(float esal) {
		this.esal = esal;
	}

	private String email;
	private String emobile;

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", email=" + email + ", emobile="
				+ emobile + "]";
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public float getEsal() {
		return esal;
	}

	public String getEmail() {
		return email;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmobile() {
		return emobile;
	}

	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}

}
