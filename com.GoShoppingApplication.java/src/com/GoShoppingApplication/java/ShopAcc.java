package com.GoShoppingApplication.java;

public abstract class ShopAcc {
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
