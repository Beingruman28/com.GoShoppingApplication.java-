package com.GoShoppingApplication.java;

public class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
		super(accNo,accNm,charges,deliveryCharges);
	}
	
	public void bookProduct(float charges) {
		super.bookProduct(charges);
	}
	public String toString() {
		return super.toString();
	}	
	
	public static void main(String[] args) {
		 GSNormalAcc gsn =new GSNormalAcc(999, "sachin tendulkar", 200, 50);
		gsn.toString();
		gsn.bookProduct(400);
		System.out.println(gsn.toString());
	}

}
