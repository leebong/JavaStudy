package day12;

public class ChainMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/**
		 * Chinning 기법
		 * 1. 일반적으로 클래스이 멤버 변수들을 설정할 때 사용하고, 
		 * 	     형태는 build.setNum1(100).setNum2(100).setUnm3(300);
		 * 
		 */	
		Number1 num = new Number1();
		num.setNum1(100).setNum2(200).setNum3(300);
		//출력방법1
		System.out.println(num.num1);
		System.out.println(num.num2);
		System.out.println(num.num3);
		//출력방법2
		System.out.println(num.getNum1());
		System.out.println(num.getNum2());
		System.out.println(num.getNum3());
		//출력방법3
		num.printNums();
		//출력방법4
		System.out.println(num);
		
	}

}

class Number1{
	int num1;
	int num2;
	int num3;
	
	Number1 setNum1(int num1) {
		this.num1 = num1;
		return this;
	}
	Number1 setNum2(int num2) {
		this.num2 = num2;
		return this;
	}
	Number1 setNum3(int num3) {
		this.num3 = num3;
		return this;
	}
	
	int getNum1() {
		return num1;
	}
	int getNum2() {
		return num2;
	}
	int getNum3() {
		return num3;
	}
	
	void printNums() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
	
	public String toString() {
		return "[" + "num1:" + num1 + ", " + "num2:" + num2 + ", "  + "num3:" + num3 + "]";
	}
}