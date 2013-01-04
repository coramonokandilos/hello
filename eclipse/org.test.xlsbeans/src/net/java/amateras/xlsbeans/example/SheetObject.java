package net.java.amateras.xlsbeans.example;

import java.awt.Point;
import java.util.List;

public class SheetObject {
	private String title;

	private String lastupdate;

	private List<UserInformation> records;

	private Point lastupdatePosition;

	private Point titlePosition;

	private String sample;

	public String getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	public void setLastupdatePosition(int x, int y) {
		this.lastupdatePosition = new Point(x, y);
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

	public void setTitlePosition(int x, int y) {
		this.titlePosition = new Point(x, y);
	}

	public String getTitle() {
		return title;
	}

	public Point getTitlePosition() {
		return titlePosition;
	}

	public Point getLastupdatePosition() {
		return lastupdatePosition;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}

}
