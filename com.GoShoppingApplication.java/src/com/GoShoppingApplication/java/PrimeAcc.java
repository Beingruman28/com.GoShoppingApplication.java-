package com.GoShoppingApplication.java;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	private static  float deliveryCharges;
	
	public PrimeAcc (int accNo , String accNm, float charges , boolean isPrime)
	{
		super(accNo,accNm,charges);
		this.isPrime = isPrime;
	}
	public boolean getisPrime() {
		return isPrime;
	}
	public float getdeliveryCharges() {
		return deliveryCharges;
	}
	public void bookProduct(float bp) {
		 super.bookProduct(bp);
	}
	public String toString() {
		return super.toString();
	}	
}
