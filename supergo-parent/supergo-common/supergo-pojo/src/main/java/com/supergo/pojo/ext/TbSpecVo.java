package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;

import com.supergo.pojo.TbSpec;
import com.supergo.pojo.TbSpecOption;

/**
 * 商品规格和规格选项VO类
 * 
 * @author yldjj
 *
 */
public class TbSpecVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private TbSpec spec;

	private List<TbSpecOption> specOptionList;

	public TbSpec getSpec() {
		return spec;
	}

	public void setSpec(TbSpec spec) {
		this.spec = spec;
	}

	public List<TbSpecOption> getSpecOptionList() {
		return specOptionList;
	}

	public void setSpecOptionList(List<TbSpecOption> specOptionList) {
		this.specOptionList = specOptionList;
	}

}
