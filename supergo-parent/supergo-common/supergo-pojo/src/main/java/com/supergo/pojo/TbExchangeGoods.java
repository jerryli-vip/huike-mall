package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbExchangeGoods implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer exchangeGoodsId;

    private String ordersubId;

    private String tbOrder;

    private String exchangeReason;

    private String auditStatus;

    private Date applyTime;

    private String exchangeGoodsStatus;

    private Date exchangeGoodsTime;

    private Integer createId;

    private Date createTime;

    private Integer updateId;

    private Date updateTime;

    private String exchangeStatus;

    private String bak2;

    private String bak3;

    public Integer getExchangeGoodsId() {
        return exchangeGoodsId;
    }

    public void setExchangeGoodsId(Integer exchangeGoodsId) {
        this.exchangeGoodsId = exchangeGoodsId;
    }

    public String getOrdersubId() {
        return ordersubId;
    }

    public void setOrdersubId(String ordersubId) {
        this.ordersubId = ordersubId == null ? null : ordersubId.trim();
    }

    public String getTbOrder() {
        return tbOrder;
    }

    public void setTbOrder(String tbOrder) {
        this.tbOrder = tbOrder == null ? null : tbOrder.trim();
    }

    public String getExchangeReason() {
        return exchangeReason;
    }

    public void setExchangeReason(String exchangeReason) {
        this.exchangeReason = exchangeReason == null ? null : exchangeReason.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getExchangeGoodsStatus() {
        return exchangeGoodsStatus;
    }

    public void setExchangeGoodsStatus(String exchangeGoodsStatus) {
        this.exchangeGoodsStatus = exchangeGoodsStatus == null ? null : exchangeGoodsStatus.trim();
    }

    public Date getExchangeGoodsTime() {
        return exchangeGoodsTime;
    }

    public void setExchangeGoodsTime(Date exchangeGoodsTime) {
        this.exchangeGoodsTime = exchangeGoodsTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExchangeStatus() {
        return exchangeStatus;
    }

    public void setExchangeStatus(String exchangeStatus) {
        this.exchangeStatus = exchangeStatus == null ? null : exchangeStatus.trim();
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

	@Override
	public String toString() {
		return "TbExchangeGoods [exchangeGoodsId=" + exchangeGoodsId + ", ordersubId=" + ordersubId + ", tbOrder="
				+ tbOrder + ", exchangeReason=" + exchangeReason + ", auditStatus=" + auditStatus + ", applyTime="
				+ applyTime + ", exchangeGoodsStatus=" + exchangeGoodsStatus + ", exchangeGoodsTime="
				+ exchangeGoodsTime + ", createId=" + createId + ", createTime=" + createTime + ", updateId=" + updateId
				+ ", updateTime=" + updateTime + ", exchangeStatus=" + exchangeStatus + ", bak2=" + bak2 + ", bak3="
				+ bak3 + "]";
	}
    
}