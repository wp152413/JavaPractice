/**
 * 
 */
package org.dimigo.abstractclass;

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
	
		for(SmartPhone a:arr){
			System.out.println(a.toString());
			a.turnOn();
			a.pay();
			a.useSpecialFunctional();
			a.turnOff();
			System.out.println();
		}
	}

}
