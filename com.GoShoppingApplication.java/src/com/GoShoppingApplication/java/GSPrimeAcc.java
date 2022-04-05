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
public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges=0;
	
	public GSPrimeAcc (int accNo , String accNm, float charges ,boolean isPrime)
	{
		super(accNo,accNm,charges,isPrime);
		//this.Charges = charges;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( name= "accNo")
	public int accNo;
	@Column( name= "accNo")
	public String accNm;
	@Column( name= "accNo")
	public float charges;
	@Column( name= "accNo")
	public boolean isPrime;
	
	public float getCharges() {
		return Charges;
	}
	public void bookProduct(float bp) {
		System.out.println("Dear Prime User, Your Product Charges are: "+bp);
	}

	
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
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