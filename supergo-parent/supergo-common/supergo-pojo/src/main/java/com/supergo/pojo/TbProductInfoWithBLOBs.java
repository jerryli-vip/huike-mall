package com.supergo.pojo;

import java.io.Serializable;

public class TbProductInfoWithBLOBs extends TbProductInfo implements Serializable {

	private static final long serialVersionUID = -7354963861230940245L;

	private String introduce;

	private String extrattribute;

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
	}

	public String getExtrattribute() {
		return extrattribute;
	}

	public void setExtrattribute(String extrattribute) {
		this.extrattribute = extrattribute == null ? null : extrattribute.trim();
	}

	@Override
	public String toString() {
		return "TbProductInfoWithBLOBs [introduce=" + introduce + ", extrattribute=" + extrattribute + "]";
	}

}