/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * <pre>
 * org.dimigo.collection
 *  |_MelonChart
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 6. 5.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--<<멜론 차트>>--");
		List<Music> list=new ArrayList<>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?","언니쓰"));
		printList(list);
		System.out.println();
		
		System.out.println("--<<2위 곡 추가>>--");
		list.add(1,new Music("SIGNAL","트와이스"));
		printList(list);
		System.out.println();
		
		System.out.println("--<<3위 곡 변경>>--");
		list.set(2, new Music("팔레트","아이유"));
		printList(list);
		System.out.println();
		
		System.out.println("--<<전체 리스트 삭제>>--");
		list.clear();
	
		
	}
	public static void printList(List<Music> list){
		int index=1;
		for(Music a:list){
			System.out.println(index+"."+a.toString());
			index=index+1;
		}
	}

}
