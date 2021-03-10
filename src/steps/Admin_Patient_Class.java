package steps;

import javax.swing.*;

public class Admin_Patient_Class {
	private String user, name, age, gender, address, phone;

	public Admin_Patient_Class(String user, String name, String age, String gender, String address, String phone) {
		this.user = user;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Admin_Patient_Class [user=" + user + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	

	
	
	
	
	

}
