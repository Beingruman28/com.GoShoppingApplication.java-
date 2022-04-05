package com.GoShoppingApplication.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name= "gsprime")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
		super(accNo,accNm,charges,deliveryCharges);
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int accNo ;
	@Column( name= "accNm")
	public String accNm ; 
	@Column( name= "charges")
	public float charges;
	@Column( name= "deliveryCharge")
	public float deliveryCharge;
	
	public void bookProduct(float charges) {
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+getDeliveryCharges());

	}
	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getaccNm() + ", charges=" + getCharges() + ", toString()=" + super.toString()
		+ ", getAccNm()=" + getaccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public static void main(String[] args) {
		 GSNormalAcc gsn =new GSNormalAcc(999, "sachin tendulkar", 200, 50);
		gsn.toString();
		gsn.bookProduct(400);
		System.out.println(gsn.toString());
	}

}
