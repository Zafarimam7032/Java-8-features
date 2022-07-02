package com.zafar.opt.classlevel;

import java.util.Optional;

public class ClassLevelOptional {

	private int id;
	private String name;
	private String collageName;
	private Optional<String> mobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public Optional<String> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Optional<String> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public ClassLevelOptional(int id, String name, String collageName, Optional<String> mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.collageName = collageName;
		this.mobileNumber = mobileNumber;
	}
	public ClassLevelOptional() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClassLevelOptional [id=" + id + ", name=" + name + ", collageName=" + collageName + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
}
