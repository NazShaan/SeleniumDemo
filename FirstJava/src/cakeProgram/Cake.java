package cakeProgram;

public abstract class Cake 
{
	
	 private String cakeName;
	 private String cakeType;
	 private int cakePrice;
	 
	 
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public String getCakeType() {
		return cakeType;
	}
	public void setCakeType(String cakeType) {
		this.cakeType = cakeType;
	}
	public int getCakePrice() {
		return cakePrice;
	}
	public void setCakePrice(int cakePrice) {
		this.cakePrice = cakePrice;
	}
	 
	 void aboutCake()
	 {
		 System.out.println(" Your have chosen " + cakeName + " & the type is : " + cakeType+" ************");
		 recipe();
		 System.out.println();
		 System.out.println("My Fans are :\n");
		 myFans();
		 System.out.println();
		 System.out.println("The price of "+cakeName + " is : $ "+cakePrice);
		 
	 }
	
	public abstract void myFans();
	public abstract void recipe();
	
	
}
