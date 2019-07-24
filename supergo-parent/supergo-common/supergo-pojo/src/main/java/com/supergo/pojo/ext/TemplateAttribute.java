package com.supergo.pojo.ext;

import java.io.Serializable;

public class TemplateAttribute implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String optionName;

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public TemplateAttribute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemplateAttribute(String optionName) {
		super();
		this.optionName = optionName;
	}

	@Override
	public String toString() {
		return "TemplateAttribute [optionName=" + optionName + "]";
	}

}
