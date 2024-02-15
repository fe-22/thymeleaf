package com.fthec.formview;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable {
	
	

	private static final long serialVersionUID = 1L;

	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;
	private String password;

	public User() {
	}

	public User(String name, Date birthDate, String password) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}



}
