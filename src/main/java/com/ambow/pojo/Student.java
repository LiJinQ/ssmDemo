package com.ambow.pojo;

import java.util.Date;

public class Student {
	private int id;
	private String number;
	private String name;
	private String password;
	private String sex;
	private String telephone;
	private Date birthday;
	private int classId;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String number, String name, String password, String sex, String telephone, Date birthday,
			int classId) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.telephone = telephone;
		this.birthday = birthday;
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", number=" + number + ", name=" + name + ", password=" + password + ", sex=" + sex
				+ ", telephone=" + telephone + ", birthday=" + birthday + ", classId=" + classId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
}
