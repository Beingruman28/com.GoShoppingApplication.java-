package com.GoShoppingApplication.java;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public abstract class ShopAcc implements Serializable{
	private int accNo;
    private String accNm;
    private float charges;
   
    public ShopAcc(int accNo , String accNm, float charges)
    {
    	super();
    	 this.setaccNo(accNo);
		 this.setaccNm(accNm);
		 this.setCharges(charges);
    }
    @Id
    @Column(name="accNo")
    public int accno ;
    @Column(name="accNm")
    public String accnm;
    @Column(name="Charges")
    public float Charges;
    
   public  int getaccNo()
   {
	  return accNo ;
   }
   public void setaccNo(int accNo) {
	   this.accNo=accNo;
   }
   public  String getaccNm()
   {
	  return accNm ;
   }
   public void setaccNm(String accNm) {
	   this.accNm=accNm;
   }
   public  float getcharges()
   {
	  return charges;
   }
   public void setcharges(float charges) {
	   this.setcharges(charges);
   }
   public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
   public void bookProduct(float charges) {
		this.setcharges(charges);
	}
   public void items(float charges) {
	   this.setcharges(charges);
	}
	public String toString() {
		
		 return "ShopAcc(Account No: "+ getaccNo() +"Charges: "+getcharges()+" Account Name : "+getaccNm()+")";
	}	
}
