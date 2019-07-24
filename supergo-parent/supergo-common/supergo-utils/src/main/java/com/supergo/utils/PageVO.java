package com.supergo.utils;

import java.io.Serializable;
import java.util.List;
/**
 * 分页结果类
 * @author think
 *
 * @param <T>
 */
public class PageVO<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2370138623839675076L;
	// 总共条数
	private long total;
	// 当前页
	private int page;
	// 每页多少条
	private int size;
	// 总页数
	private int totalpage;
	private List<T> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

}
