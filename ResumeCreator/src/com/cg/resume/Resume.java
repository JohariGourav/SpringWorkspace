package com.cg.resume;

import java.util.Arrays;

public class Resume {
	private String firstName;
	private String lastName;
	private String gender;
	private String highestQualification;
	private String dob;
	private String hobbies;
	private String address;
	private String[] skills;
	private String email;
	private String website;
	private String telNo;
	private String description;
	
	

	public Resume(String firstName, String lastName, String gender, String highestQualification, String dob,
			String hobbies, String address, String[] skills, String email, String website, String telNo,
			String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.highestQualification = highestQualification;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.website = website;
		this.telNo = telNo;
		this.description = description;
	}
	
	

	@Override
	public String toString() {
		return "Resume [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", highestQualification=" + highestQualification + ", dob=" + dob + ", hobbies=" + hobbies
				+ ", address=" + address + ", skills=" + Arrays.toString(skills) + ", email=" + email + ", website="
				+ website + ", telNo=" + telNo + ", description=" + description + "]";
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public String getDob() {
		return dob;
	}

	public String getHobbies() {
		return hobbies;
	}

	public String getAddress() {
		return address;
	}

	public String[] getSkills() {
		return skills;
	}

	public String getEmail() {
		return email;
	}

	public String getWebsite() {
		return website;
	}

	public String getTelNo() {
		return telNo;
	}

	public String getDescription() {
		return description;
	}

}
