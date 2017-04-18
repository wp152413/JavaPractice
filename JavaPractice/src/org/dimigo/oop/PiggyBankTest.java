/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 4. 18.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember[] a={
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
				
		};
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(a[0], 10000);
		PiggyBank.putMoney(a[1], 5000);
		PiggyBank.putMoney(a[2], 2000);
		PiggyBank.putMoney(a[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(a[2], 1000);
		PiggyBank.printBalance();
			
		
	}

}
