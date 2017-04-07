/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_Snack
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 4. 7.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class Snack {
	public String name;
	public String company;
	public int price;
	public int number;
	
	public Snack(){
		
		
	}
	
	public Snack(String name, String company, int price, int number){
		this.name=name;
		this.company=company;
		this.price=price;
		this.number=number;
		
		
	}


	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	public String toString(){
		return "이름:" + name + "\n"+"제조사:"+company+"\n"+"가격:"+String.format("%,d",price)+"원\n"+"개수:"+number+"개\n";
	}
	
	
	public int calcPrice(Snack arr[]){
		int sum=0;
		sum+=price*number;
		return sum;
		
	}
	
}
