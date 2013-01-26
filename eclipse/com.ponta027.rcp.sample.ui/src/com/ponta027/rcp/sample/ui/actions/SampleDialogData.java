package com.ponta027.rcp.sample.ui.actions;

import java.io.Serializable;

public class SampleDialogData implements Serializable {

	private String name;

	public SampleDialogData(String string) {
		name = string;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
