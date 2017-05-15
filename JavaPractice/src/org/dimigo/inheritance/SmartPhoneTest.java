/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 15.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone [] arr={
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		System.out.println(arr[0].toString());
		arr[0].turnOn();
		arr[0].pay();
		arr[0].useSpecialFunctional(arr[0]);
		arr[0].turnOff();
		
		System.out.println();
		
		System.out.println(arr[1].toString());
		arr[1].turnOn();
		arr[1].pay();
		arr[1].useSpecialFunctional(arr[1]);
		arr[1].turnOff();
	}

}
