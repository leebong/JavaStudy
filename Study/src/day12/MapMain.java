package day12;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "홍길동");
		tm.put(2, "홍길동");
		tm.put(3, "홍길동");
		tm.put(1, "임꺽정");
		
		Iterator<Map.Entry<Integer,String>> it = tm.entrySet().iterator();
		while(it.hasNext()) { //주로사용한다.
			Map.Entry<Integer,String> tmp = it.next();
			System.out.println("Key : "+tmp.getKey());
			System.out.println("Value : "+tmp.getValue());
		}
		System.out.println("---------");
		System.out.println(tm);
		
		System.out.println("---------");
		for(Integer tmp : tm.keySet()) {
			System.out.println("Key : "+tmp);
			System.out.println("Value : "+tm.get(tmp));
		}
	}

}
