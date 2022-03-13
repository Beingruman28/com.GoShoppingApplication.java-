package com.GoShoppingApplication.java;

public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges=0;
	
	public GSPrimeAcc (int accNo , String accNm, float charges ,boolean isPrime)
	{
		super(accNo,accNm,charges,isPrime);
		//this.Charges = charges;
	}
	
	public float getCharges() {
		return Charges;
	}
	public void bookProduct(float bp) {
		 super.bookProduct(bp);
	}
	public String toString() {
		return super.toString();
	}	
	 
public static void main(String[] args) {
	GSPrimeAcc gsp = new GSPrimeAcc(1234, "Mohammed Ruman", 45, true);
	gsp.toString();
	GSPrimeAcc gsp1 = new GSPrimeAcc(2345, "virat kohli", 100, true);
	gsp1.toString();
	PrimeAcc pa=new GSPrimeAcc(5,"rohit sharma", 45, true);
	pa.toString();	
	gsp.bookProduct(50);
	
	System.out.println(pa.toString());
	System.out.println(gsp.toString());
	System.out.println(gsp1.toString());
}

}