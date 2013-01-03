package net.java.amateras.xlsbeans.example;

import java.util.List;

import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.LabelledCell;
import net.java.amateras.xlsbeans.annotation.LabelledCellType;
import net.java.amateras.xlsbeans.annotation.RecordTerminal;
import net.java.amateras.xlsbeans.annotation.Sheet;

@Sheet(name = "Users")
public class SheetObjectWithAnnotation extends SheetObject {

	private String title;

	private String lastupdate;

	private List<UserInformation> records;

	@Override
	@LabelledCell(label = "Title", type = LabelledCellType.Right)
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getLastupdate() {
		return lastupdate;
	}

	@Override
	@LabelledCell(label = "LastUpdated", type = LabelledCellType.Right)
	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	@HorizontalRecords(tableLabel = "User Informations", recordClass = UserInformation.class, terminal = RecordTerminal.Border)
	public void setRecords(List<UserInformation> records) {
		this.records = records;
	}

	public List<UserInformation> getRecords() {
		return records;
	}

}
