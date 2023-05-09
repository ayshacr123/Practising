/**
 * 
 */
package com.example.Practising;

/**
 * @author Administrator
 *
 */
public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + "]";
	}
	private String name;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name, String gender) {
		
		this.name = name;
		this.gender = gender;
	}

}
