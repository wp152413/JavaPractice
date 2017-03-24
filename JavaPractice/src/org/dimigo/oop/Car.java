/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_Car
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 23.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	//메소드 선언
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
	//setter메소드
	public void setCompany(String newcompany){
		company=newcompany;
	}
	public void setModel(String newmodel){
		model=newmodel;
	}
	public void setColor(String newcolor){
		color=newcolor;
	}
	public void setMaxSpeed(int newmaxSpeed){
		maxSpeed=newmaxSpeed;
	}
	public void setPrice(int newprice){
		price=newprice;
	}




}

