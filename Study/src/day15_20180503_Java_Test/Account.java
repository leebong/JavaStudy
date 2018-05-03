package day15_20180503_Java_Test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Account {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("lee", "lee123");
		tm.put("kim", "kim123");
		tm.put("park", "park123");
		tm.put("lee", "lee456");
		
		Iterator<Map.Entry<String,String>> it = tm.entrySet().iterator();
		while(it.hasNext()) { //주로사용한다.
			Map.Entry<String,String> tmp = it.next();
			System.out.println("ID : "+tmp.getKey());
			System.out.println("PASS : "+tmp.getValue());
		}
		System.out.println("===============================================");
		System.out.println(tm);
		
		System.out.println("===============================================");

	}

}
