package com.example.Practising;

public class MainProfitOrLoss {
	
	private  String productName ;
	private  String transactionType;
	private  double transactionAmount;
	public String getProductName() {
		return productName;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public MainProfitOrLoss(String productName, String transactionType, double transactionAmount) {
		super();
		this.productName = productName;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	
	

}
