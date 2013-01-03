package net.java.amateras.xlsbeans.example;

import net.java.amateras.xlsbeans.annotation.Column;
import net.java.amateras.xlsbeans.annotation.Sheet;

@Sheet(name = "Users")
public class UserInformation {
	private String id;
	private String gendar;
	private String name;

	public String getId() {
		return id;
	}

	@Column(columnName = "ID")
	public void setId(String id) {
		this.id = id;
	}

	public String getGendar() {
		return gendar;
	}

	@Column(columnName = "Gender", merged = true)
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public String getName() {
		return name;
	}

	@Column(columnName = "Name")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s", id, name, gendar);
	}
}
