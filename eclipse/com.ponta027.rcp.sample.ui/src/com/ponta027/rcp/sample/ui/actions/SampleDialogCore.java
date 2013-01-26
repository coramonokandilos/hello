package com.ponta027.rcp.sample.ui.actions;

import java.util.ArrayList;
import java.util.List;

public class SampleDialogCore {

	public List<SampleDialogData> create() {
		List<SampleDialogData> arrayList = new ArrayList<SampleDialogData>();
		arrayList.add(new SampleDialogData("Sample1"));
		arrayList.add(new SampleDialogData("Sample2"));
		arrayList.add(new SampleDialogData("Sample3"));
		arrayList.add(new SampleDialogData("Sample4"));
		arrayList.add(new SampleDialogData("Sample5"));
		return arrayList;
	}
}
