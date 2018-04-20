package day12;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//HashSet<Integer> hs = new HashSet();
		/**
		 * Set에서는 중복 검사를 하는데
		 * 1. hashcode가 같은지 확인하여 다르면 다른 객체로 저장
		 * 2. hashcode가 같으면 equals메소드의 결과가 같은지를 확인하여 같으면 중복으로 처리, 다르면 다른 객체로 저장
		 */
		HashSet<Integer> hs = new HashSet<Integer>(); //Integer는 int의 Wrapper(포장) class이다
		hs.add(10);
		hs.add(10);
		hs.add(10);
		for(Integer tmp : hs) {
			System.out.println(tmp);
		}
		System.out.println("--------");
		hs.add(new Integer(10));
		hs.add(new Integer(10));
		hs.add(new Integer(10));
		for(Integer tmp : hs) {
			System.out.println(tmp);
		}
		System.out.println("--------");
		HashSet<Number> nhs = new HashSet<Number>();
		nhs.add(new Number(10,10));
		nhs.add(new Number(10,10));
		nhs.add(new Number(10,10));
		for(Number tmp : nhs) {
			System.out.println(tmp);
		}
		
	}

}

class Number{
	int num1;
	int num2;
	Number(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;		
	}
	@Override
	public int hashCode() {
		return (num1+num2)%3;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Number) {
			Number tmp = (Number)obj; //위 obj instanceof(형변환가능여부) Number가 형변환
			if(this.num1 == tmp.num1 && this.num2 == tmp.num2)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "[ num1 : " + num1 + ", num2 : " + num2 + " ]";
	}
}