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
		System.out.println(gssf.getNewPrimeAcc(555, "rishab pant", 66, true));
		System.out.println(gssf.getNewPrimeAcc(97, "yuvraj singh", 22, true));
		System.out.println(gssf.getNewPrimeAcc(12, "ms dhoni", 06, true));
		System.out.println(gssf.getNewPrimeAcc(88, "zaheer kkhan", 70, true));
		System.out.println(gssf.getNewNormalAcc(111, "jasprit bhumrah", 99, 150));
		System.out.println(gssf.getNewNormalAcc(112, "mohammed shami", 661, 150));
		System.out.println(gssf.getNewNormalAcc(113, "yuzi chahal", 40, 150));
		System.out.println(gssf.getNewNormalAcc(114, "kuldeep yadav", 41, 150));
		System.out.println(gssf.getNewNormalAcc(10001, "kl rahul", 55, 15));
		System.out.println(gssf.getNewPrimeAcc(10002, "manish panday", 100, true));

	}

}
