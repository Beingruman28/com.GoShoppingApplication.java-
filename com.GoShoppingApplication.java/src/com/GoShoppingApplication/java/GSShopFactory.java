package com.GoShoppingApplication.java;

public class GSShopFactory extends ShopFactory {
	public String getNewPrimeAcc (int accNo , String accNm , float charges , boolean isPrime)
	{
	 return "PrimeAcc(Account No: "+ accNo +" | Account Name : "+accNm+" | Charges: "+charges+" | "+isPrime+")";
	}
	
	public String getNewNormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
				return "NormalAcc(Account No: "+ accNo +" | Account Name : "+accNm+" | Charges: "+charges+" | Delivery charges : "+deliveryCharges+")";
	}
public static void main(String[] args) {
		
		GSShopFactory gssf = new GSShopFactory();
		gssf.getNewPrimeAcc(555, "rishab pant", 66, true);
		System.out.println(gssf.getNewNormalAcc(10001, "kl rahul", 55, 15));
		System.out.println(gssf.getNewPrimeAcc(10002, "manish panday", 100, true));

	}

}
