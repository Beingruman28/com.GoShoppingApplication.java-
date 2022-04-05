package com.GoShoppingApplication.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " primeacc")
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
	@Id
	@Column(name = "accNo")
	public int accNo ;
	@Column(name = "accNm")
	public String accNm; 
	@Column(name = "charges")
	public float charges; 
	@Column(name = "IsPrime")
	public boolean IsPrime;
	
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
