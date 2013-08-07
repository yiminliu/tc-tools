package com.tscp.toolkit.domain.billing;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="charge_history")
public class ChargeHistory implements Serializable{
	
	@Id
	@Column(name="account_no")
	private Integer accountNo;
	
	@Id
	@Column(name="date_and_time")
	private Date dateAndTime;
	
	@Column(name="type")
	private String type;
	
	@Column(name="usage")
	private Integer usage;
	
	@Column(name="rate")
	private Float rate;
	
	@Column(name="amount")
	private Float amount;
	
	@Column(name="discount")
	private Float discount;
	
	@Column(name="start_time")
	private Date startTime;
	
	@Column(name="end_time")
	private Date endTime;

	@Column(name="notes")
	private String notes;
	  
	@Column(name="external_id")
	private String externalId;
	
	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUsage() {
		return usage;
	}

	public void setUsage(int usage) {
		this.usage = usage;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNo;
		result = prime * result
				+ ((dateAndTime == null) ? 0 : dateAndTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChargeHistory other = (ChargeHistory) obj;
		if (accountNo != other.accountNo)
			return false;
		if (dateAndTime == null) {
			if (other.dateAndTime != null)
				return false;
		} else if (!dateAndTime.equals(other.dateAndTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChargeHistory [accountNo=" + accountNo + ", dateAndTime="
				+ dateAndTime + ", type=" + type + ", usage=" + usage
				+ ", rate=" + rate + ", amount=" + amount + ", discount="
				+ discount + ", startTime=" + startTime + ", endTime="
				+ endTime + ", notes=" + notes + ", externalId=" + externalId
				+ "]";
	}
				
}
