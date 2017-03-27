/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_CarTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 23.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	static Car3 c1=new Car3("현대자동차","제네시스","검정색",225,50000000);
	static Car3 c2=new Car3("기아자동차","K7","흰색",246);
	static Car3 c3=new Car3("삼성자동차","SM7","회색");
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 :"+ c1.getCompany());
		System.out.println("모델명 :"+c1.getModel());
		System.out.println("색상 :"+c1.getColor());
		System.out.println("최대속도 :"+c1.getMaxSpeed()+"km");
		System.out.println("가격 :"+String.format("%,d", c1.getPrice())+"원");
		
		System.out.println();
		System.out.println("제조사명 :"+ c2.getCompany());
		System.out.println("모델명 :"+c2.getModel());
		System.out.println("색상 :"+c2.getColor());
		System.out.println("최대속도 :"+c2.getMaxSpeed()+"km");
		System.out.println("가격 :"+String.format("%,d", c2.getPrice())+"원");
		
		System.out.println();
		System.out.println("제조사명 :"+ c3.getCompany());
		System.out.println("모델명 :"+c3.getModel());
		System.out.println("색상 :"+c3.getColor());
		System.out.println("최대속도 :"+c3.getMaxSpeed()+"km");
		System.out.println("가격 :"+String.format("%,d", c3.getPrice())+"원");

		
	}

}
