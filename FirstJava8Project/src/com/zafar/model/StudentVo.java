package com.zafar.model;

public class StudentVo {
	private int id;
	private String studentName;
	private String address;
	private String mobileNumber;
	private String collegeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public StudentVo() {
	}
	public StudentVo(int id, String studentName, String address, String mobileNumber, String collegeName) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", studentName=" + studentName + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", collegeName=" + collegeName + "]";
	}
}
