/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_PersonTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 8.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] arr={
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
				
		};
		
		for(Person p:arr){
			greeting(p);
		}
		
	}
	
	private static void greeting(Person a){
		System.out.println(a.toString());
		a.sayHello();
		a.sayBye();
		System.out.println();
	}

}
