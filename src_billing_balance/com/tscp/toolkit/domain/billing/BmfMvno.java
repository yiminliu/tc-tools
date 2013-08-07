package com.tscp.toolkit.domain.billing;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bmf_mvno")
public class BmfMvno implements Serializable{
	
	@Id
	@Column(name="BILL_REF_NO")
	private Integer billRefNo;
	
	@Column(name="ACCOUNT_NO")
	private Integer accountNo;
	
	@Column(name="ORIG_BILL_REF_NO")
	private Integer origBillRefNo;
	
	@Column(name="BMF_TRANS_TYPE")
	private Integer bmfTransType;
	
	@Column(name="TRANS_DATE")
	private Date transDate;
	
	@Column(name="POST_DATE")
	private Date postDate;
	
	@Column(name="TRANS_AMOUNT")
	private double transAmount;
	
	@Column(name="GL_AMOUNT")
	private double glAmount;
	
	@Column(name="TRACKING_ID")
	private Integer trackingId;
	
	@Column(name="TRANS_SOURCE")
	private Integer transDource;
	
	@Column(name="TRANS_SUBMITTER")
	private String transSubmitter;
	
	@Column(name="CHG_DATE")
	private Date chgDate;
	
	@Column(name="NO_BILL")
	private Integer noBill;
	
	@Column(name="ACTION_CODE")
	private String actionCode;
	
	@Column(name="EXTERNAL_AMOUNT")
	private double externalAmount;

	public Integer getBillRefNo() {
		return billRefNo;
	}

	public void setBillRefNo(Integer billRefNo) {
		this.billRefNo = billRefNo;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getOrigBillRefNo() {
		return origBillRefNo;
	}

	public void setOrigBillRefNo(Integer origBillRefNo) {
		this.origBillRefNo = origBillRefNo;
	}

	public Integer getBmfTransType() {
		return bmfTransType;
	}

	public void setBmfTransType(Integer bmfTransType) {
		this.bmfTransType = bmfTransType;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public double getGlAmount() {
		return glAmount;
	}

	public void setGlAmount(double glAmount) {
		this.glAmount = glAmount;
	}

	public Integer getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(Integer trackingId) {
		this.trackingId = trackingId;
	}

	public Integer getTransDource() {
		return transDource;
	}

	public void setTransDource(Integer transDource) {
		this.transDource = transDource;
	}

	public String getTransSubmitter() {
		return transSubmitter;
	}

	public void setTransSubmitter(String transSubmitter) {
		this.transSubmitter = transSubmitter;
	}

	public Date getChgDate() {
		return chgDate;
	}

	public void setChgDate(Date chgDate) {
		this.chgDate = chgDate;
	}

	public Integer getNoBill() {
		return noBill;
	}

	public void setNoBill(Integer noBill) {
		this.noBill = noBill;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public double getExternalAmount() {
		return externalAmount;
	}

	public void setExternalAmount(double externalAmount) {
		this.externalAmount = externalAmount;
	}
	
	
	
}
