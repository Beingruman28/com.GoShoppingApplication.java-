package com.GoShoppingApplication.java;

public abstract class ShopAcc {
	private int accNo;
    private String accNm;
    private float charges;
   
    public ShopAcc(int accNo , String accNm, float charges)
    {
    	super();
    	this.accNo = accNo;
    	this.accNm = accNm;
    	this.charges = charges;
    }
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
	  return charges ;
   }
   public void setcharges(float charges) {
	   this.charges=charges;
   }
   public void bookProduct(float bp) {
		bookProduct(bp);
	}
   public void items(float it) {
		items (it);
	}
	public String toString() {
		 return toString();
	}	
}
