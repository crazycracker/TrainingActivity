package com.ing.billing.beans;

public class Bill {
	
	private int billID; 
	private int noOfLocalSMS, noOfStdSMS, noOfLocalCalls, noOfStdCalls, internetDataUsageUnits;
	private String billMonth;
	private float totalBillAmount, localSMSAmount, stdSMSAmount, localCallAmount, stdCallAmount, internetDataUsageAmount, servicesTax, vat;
	private PostpaidAccount account;
	public Bill() {}
	


}