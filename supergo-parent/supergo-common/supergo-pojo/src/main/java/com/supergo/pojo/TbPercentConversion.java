package com.supergo.pojo;

import java.io.Serializable;

public class TbPercentConversion implements Serializable {

	private static final long serialVersionUID = -5220105853969403416L;

	private Integer percentConversionId;

	private String bak1;

	private String bak2;

	private String bak3;

	private String bak4;

	private String bak5;

	public Integer getPercentConversionId() {
		return percentConversionId;
	}

	public void setPercentConversionId(Integer percentConversionId) {
		this.percentConversionId = percentConversionId;
	}

	public String getBak1() {
		return bak1;
	}

	public void setBak1(String bak1) {
		this.bak1 = bak1 == null ? null : bak1.trim();
	}

	public String getBak2() {
		return bak2;
	}

	public void setBak2(String bak2) {
		this.bak2 = bak2 == null ? null : bak2.trim();
	}

	public String getBak3() {
		return bak3;
	}

	public void setBak3(String bak3) {
		this.bak3 = bak3 == null ? null : bak3.trim();
	}

	public String getBak4() {
		return bak4;
	}

	public void setBak4(String bak4) {
		this.bak4 = bak4 == null ? null : bak4.trim();
	}

	public String getBak5() {
		return bak5;
	}

	public void setBak5(String bak5) {
		this.bak5 = bak5 == null ? null : bak5.trim();
	}

	@Override
	public String toString() {
		return "TbPercentConversion [percentConversionId=" + percentConversionId + ", bak1=" + bak1 + ", bak2=" + bak2
				+ ", bak3=" + bak3 + ", bak4=" + bak4 + ", bak5=" + bak5 + "]";
	}

}