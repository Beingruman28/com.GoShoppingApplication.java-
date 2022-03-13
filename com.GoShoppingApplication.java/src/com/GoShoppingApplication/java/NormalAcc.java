package com.GoShoppingApplication.java;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;
	
	public NormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
		super(accNo,accNm,charges);
		this.deliveryCharges =100;
	}
	public float getdeliveryCharges() {
		return deliveryCharges;
	}
	
	public void bookProduct(float deliveryCharges) {
		System.out.println("Your delevery charge is :"+deliveryCharges);
	}
	public String toString() {
		return "NormalAcc(Account No: "+ getaccNo() +" | Account Name : "+getaccNm()+" | Charges: "+getcharges()+" | Delivery charges : "+deliveryCharges+")";
	}	
}
