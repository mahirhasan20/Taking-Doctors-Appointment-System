package steps;

import javax.swing.*;

public class admin_Doc_Class {
	private String name, age, gender, time, phone,specialist,mbbs,mbbs_from,mbbs_country,mbbs_year,fcps,
					fcps_from,fcps_country,fcps_year;

	public admin_Doc_Class(String name, String age, String gender, String time, String phone, String specialist,
			String mbbs, String mbbs_from, String mbbs_country, String mbbs_year, String fcps, String fcps_from,
			String fcps_country, String fcps_year) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.time = time;
		this.phone = phone;
		this.specialist = specialist;
		this.mbbs = mbbs;
		this.mbbs_from = mbbs_from;
		this.mbbs_country = mbbs_country;
		this.mbbs_year = mbbs_year;
		this.fcps = fcps;
		this.fcps_from = fcps_from;
		this.fcps_country = fcps_country;
		this.fcps_year = fcps_year;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getMbbs() {
		return mbbs;
	}

	public void setMbbs(String mbbs) {
		this.mbbs = mbbs;
	}

	public String getMbbs_from() {
		return mbbs_from;
	}

	public void setMbbs_from(String mbbs_from) {
		this.mbbs_from = mbbs_from;
	}

	public String getMbbs_country() {
		return mbbs_country;
	}

	public void setMbbs_country(String mbbs_country) {
		this.mbbs_country = mbbs_country;
	}

	public String getMbbs_year() {
		return mbbs_year;
	}

	public void setMbbs_year(String mbbs_year) {
		this.mbbs_year = mbbs_year;
	}

	public String getFcps() {
		return fcps;
	}

	public void setFcps(String fcps) {
		this.fcps = fcps;
	}

	public String getFcps_from() {
		return fcps_from;
	}

	public void setFcps_from(String fcps_from) {
		this.fcps_from = fcps_from;
	}

	public String getFcps_country() {
		return fcps_country;
	}

	public void setFcps_country(String fcps_country) {
		this.fcps_country = fcps_country;
	}

	public String getFcps_year() {
		return fcps_year;
	}

	public void setFcps_year(String fcps_year) {
		this.fcps_year = fcps_year;
	}

	@Override
	public String toString() {
		return "admin_Doc_Class [name=" + name + ", age=" + age + ", gender=" + gender + ", time=" + time + ", phone="
				+ phone + ", specialist=" + specialist + ", mbbs=" + mbbs + ", mbbs_from=" + mbbs_from
				+ ", mbbs_country=" + mbbs_country + ", mbbs_year=" + mbbs_year + ", fcps=" + fcps + ", fcps_from="
				+ fcps_from + ", fcps_country=" + fcps_country + ", fcps_year=" + fcps_year + "]";
	}
}
