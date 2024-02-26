package com.tcs.oops.Inheritance;

public class InvestmentInstrument {

	private int iiId; //instrument could be a share, bond, deposit, security
	private String title;
	private String type;
	private double fund;
	
	public InvestmentInstrument() {
		
	}
	
	public InvestmentInstrument(int iiId, String title, String type, double fund) {
		super();
		this.iiId = iiId;
		this.title = title;
		this.type = type;
		this.fund = fund;
	}
	public int getIiId() {
		return iiId;
	}
	public void setIiId(int iiId) {
		this.iiId = iiId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getFund() {
		return fund;
	}
	public void setFund(double fund) {
		this.fund = fund;
	}

	@Override
	public String toString() {
		return "InvestmentInstrument [iiId=" + iiId + ", title=" + title + ", type=" + type + ", fund=" + fund + "]";
	}
	
	
	
}
