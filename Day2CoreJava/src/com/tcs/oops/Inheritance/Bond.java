package com.tcs.oops.Inheritance;

public class Bond extends InvestmentInstrument {
	
	private String startDate;
	private String repayDate;
	
	public Bond() {
		// TODO Auto-generated constructor stub
	}

	public Bond(int iiId, String title, String type, double fund, String startDate, String repayDate)/*add the extra 2 attributes last*/ {
		super(iiId, title, type, fund);
		//generate constructor from super class
		this.startDate=startDate;
		this.repayDate=repayDate;
		
	}

	@Override
	public String toString() {
		return "Bond [startDate=" + startDate + ", repayDate=" + repayDate + ", getIiId()=" + getIiId()
				+ ", getTitle()=" + getTitle() + ", getType()=" + getType() + ", getFund()=" + getFund()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
