/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_SnackTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 4. 7.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack []arr=new Snack[5];
		
		arr[0]=new Snack("새우깡","농심",1100,2);
		arr[1]=new Snack("콘칲","크라운",1200,1);
		arr[2]=new Snack("허니버터칩","해태",1500,4);
		
		System.out.println(arr[0].toString());
		System.out.println(arr[1].toString());
		System.out.println(arr[2].toString());
		
		System.out.print("총 구매 금액:");
		
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=arr[i].calcPrice(arr);
		}
		System.out.println(String.format("%,d", sum));
	}

}
