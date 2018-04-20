package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		
		//ArrayList<Student> alist = new ArrayList(); //아래 함수를 불러올 수 있다
		ArrayList<Integer> alist = new ArrayList();
		alist.add(100);
		alist.add(40);
		alist.add(5);
		alist.add(1000);

		ArrayList<Integer> alist2 = new ArrayList();
				
		System.out.println(alist);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("----------");
		
		alist.remove(0); //0번지 100을 지운다(뺀다)
		alist.removeAll(alist2); //모든번지 값을 지운다.
		
		Iterator it = alist.iterator(); //iterator(반복자)
		//100-> 40 5 
		while(it.hasNext()) { //화살표 다음 값이 있느냐 참(true)로 아래 이동
			int num = (Integer)it.next(); //화살표가 next로 이동하고 100은 num으로 넘겨준다 100 ->40 5 1000
			System.out.println(num); // num 값 출력
		}
		System.out.println("----------");
		for(Integer tmp : alist) {
			System.out.println(tmp);
		}
		
		System.out.println("----------");
		System.out.println("alist2 출력");
		System.out.println("----------");
		for(Integer tmp : alist2) {
			System.out.println(tmp);
		}
		System.out.println(alist2);
	}

}


class Student{
	String name;
	int grade;
	int classnum;
}