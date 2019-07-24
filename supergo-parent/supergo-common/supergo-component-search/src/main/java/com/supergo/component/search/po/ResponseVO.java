package com.supergo.component.search.po;

public class ResponseVO {

	private int status;

	private String msg;

	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ResponseVO build(int status, String msg) {
		ResponseVO responseVO = new ResponseVO();
		responseVO.status = status;
		responseVO.msg = msg;

		return responseVO;
	}

	public static ResponseVO ok() {
		ResponseVO responseVO = new ResponseVO();
		responseVO.status = 200;

		return responseVO;
	}

	public static ResponseVO ok(String msg) {
		ResponseVO responseVO = new ResponseVO();
		responseVO.status = 200;
		responseVO.msg = msg;

		return responseVO;
	}

	public static ResponseVO ok(Object data) {
		ResponseVO responseVO = new ResponseVO();
		responseVO.status = 200;
		responseVO.data = data;

		return responseVO;
	}
}
