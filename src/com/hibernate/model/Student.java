package com.hibernate.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Student {
    private StudentPK pk;
	private int age;
	@Transient
	private String yourWifeName;

	public String getYourWifeName() {
		return yourWifeName;
	}
	public void setYourWifeName(String yourWifeName) {
		this.yourWifeName = yourWifeName;
	}
	@EmbeddedId
	public StudentPK getPk() {
		return pk;
	}
	public void setPk(StudentPK pk) {
		this.pk = pk;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
