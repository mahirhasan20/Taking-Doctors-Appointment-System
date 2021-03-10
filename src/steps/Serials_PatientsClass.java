package steps;

public class Serials_PatientsClass {
	private String doctor_name, name, age, gender, address, phone;

	public Serials_PatientsClass(String doctor_name, String name, String age, String gender, String address,
			String phone) {
		this.doctor_name = doctor_name;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
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
		return "Serials_PatientsClass [doctor_name=" + doctor_name + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", address=" + address + ", phone=" + phone + "]";
	}
	

	
	
	
	

}
