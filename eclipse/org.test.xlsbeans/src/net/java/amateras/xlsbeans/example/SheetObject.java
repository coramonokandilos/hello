package net.java.amateras.xlsbeans.example;

import java.util.List;

public class SheetObject {
	private String title;

	private String lastupdate;

	private List<UserInformation> records;

	public String getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	public List<UserInformation> getRecords() {
		return records;
	}

	public void setRecords(List<UserInformation> records) {
		this.records = records;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
