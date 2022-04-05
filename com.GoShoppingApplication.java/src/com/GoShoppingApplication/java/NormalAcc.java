package com.GoShoppingApplication.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " normalacc")
public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;
	
	public NormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
		super(accNo,accNm,charges);
		this.deliveryCharges =100;
	}
	@Id
	@Column(name="accNo")
	public int accNo;
	@Column(name="accNm")
	public String accNm;
	@Column(name="charges")
	public float charges;
	@Column(name="deliverycharges")
	public float deliverycharges;
	
		
	public void bookProduct(float deliveryCharges) {
		System.out.println("Your delevery charge is :"+deliveryCharges);
	}
	public String toString() {
		return "NormalAcc(Account No: "+ getaccNo() +" | Account Name : "+getaccNm()+" | Charges: "+getcharges()+" | Delivery charges : "+getDeliveryCharges()+")";
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
}
