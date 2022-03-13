package com.GoShoppingApplication.java;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	private static final float deliveryCharges = 100;
	
	public PrimeAcc (int accNo , String accNm, float charges , boolean isPrime)
	{
		super(accNo,accNm,charges);
		this.setaccNo(accNo);
		 this.setaccNo(accNo);
		this.isPrime = isPrime;
	}
	public boolean getisPrime() {
		return isPrime;
	}
	public float getdeliveryCharges() {
		return deliveryCharges;
	}
	public void bookProduct(float charges) {
		System.out.println("Your delivery charge is :"+charges);
	}
	public String toString() {
	 return "PrimeAcc(Account No: "+ getaccNo() +" | Account Name : "+getaccNm()+" | Charges: "+deliveryCharges+" | "+isPrime+")";
	}	
}
