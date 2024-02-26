package com.tcs.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int tid;
	String tranDate;
	double tranAmount;
	int investorId;
	
	public Transaction1() {
		// TODO Auto-generated constructor stub
	}

	public Transaction1(int tid, String tranDate, double tranAmount, int investorId) {
		super();
		this.tid = tid;
		this.tranDate = tranDate;
		this.tranAmount = tranAmount;
		this.investorId = investorId;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public double getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(double tranAmount) {
		this.tranAmount = tranAmount;
	}

	public int getInvestorId() {
		return investorId;
	}

	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}

	@Override
	public String toString() {
		return "Transaction1 [tid=" + tid + ", tranDate=" + tranDate + ", tranAmount=" + tranAmount + ", investorId="
				+ investorId + "]";
	}

}
