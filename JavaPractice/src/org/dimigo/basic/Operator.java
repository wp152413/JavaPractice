/**
 * 
 */
package org.dimigo.basic;

/**  
 * <pre>
 * org.dimigo.basic
 *  |_Operator
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 14.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		int money=1700000;
		int p=3;
		int n=1500;
		
		
		System.out.println("월 평균 급여 :"+String.format("%,d",money));
		System.out.println("점포 내 직원 수 :"+p+"명");
		System.out.println("점포 수 :"+String.format("%,d",n)+"개");
		
		System.out.printf("연간 인건비 :"+String.format("%,d",(long)money*n*p*12)+"원");
		
	}

}
