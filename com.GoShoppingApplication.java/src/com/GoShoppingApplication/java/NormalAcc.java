package com.GoShoppingApplication.java;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;
	
	public NormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
		super(accNo,accNm,charges);
		this.deliveryCharges =deliveryCharges;
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
