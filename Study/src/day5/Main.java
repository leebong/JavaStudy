package day5;

import java.util.Scanner;

// public : 공공
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point pt = new Point(); //new 참조된것
		Point pt = new Point();
		System.out.println("초기 좌표 위치");
		pt.printPoint();
		pt.printCount();
		System.out.println("좌표 (10, 10) 이동 후");
		pt.move(10,  10);
		pt.printPoint();
		pt.printCount();
		Point pt2 = new Point(pt);
		
		
		
	}

}


/* 2차원 좌표 평면의 점을 나타내기 위한 클래스 */
/* default class는 같은 Package day5;에 있는 클래스내에서 사용할 수 있다
 * 접근제한자
 * public : 아무나 사용
 * default(접근제한자를 아무것도 입력하지 않았을때) :같은 패키지 안에 있는 클래스들만 사용가능
 * protected : 자신 클래스와 상속받은 파생(자식)클래스만 사용
 * private : 자신 클래스만 사용가능
 */
class Point{
	private int x; //private는 내 Point Class에서만 접속가능함
	private int y;
	private static int count = 0;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void printPoint() {
		System.out.println(x+","+y);
	}
	
	/**
	 * setX : 멤버변수 x의 값을 설정하는 메소드
	 * @param _x : 설정하려는 x의 값
	 */
/*	
	void setX(int x) { //void 리턴값이 필요없다, setX : 남의 정보를 받아 동작을 하기 위함
		this.x = x; //매개변수 _x의 값을 멤버변수 x에 저장	
	}
	public int getX() { //내 정보로 동작
		return x;
	}
	void setY(int y) { //void 리턴값이 필요없다, setX : 남의 정보를 받아 동작을 하기 위함
		this.y = y; //매개변수 _x의 값을 멤버변수 x에 저장	
	}
	public int getY() { //내 정보로 동작
		return y;
	}
	
*/
	
	
	/* 생성자
	 * 1. 리턴타입이 없다. => void 가 아닙니다.
	 * 2. 메소드명이 클래스명과 동일하다.
	 * 3. 내가 원하는 때에 호출할 수 없고, 객체가 생성될 때 자동으로 호출된다.
	 */
	
	public Point() {
		count++;
		
	}
	
	

	

	
	/* 생성자 오버로딩 : 이름이 같은  생성자나 메소드가 여러개 일 때, 다음2개가지 조건중에
	 * 			   1가지를 만족하면 사용가능, 그렇지 않으면 불가능(에러)
	 * 1. 매개변수의 갯수가 다를 경우
	 * 2. 매개변수의 갯수가 같지만, 자료형이 다를 때
	 * 
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		count++;
	}
	
	public Point(Point pt) {
		this.x = pt.getX();
		//this.x = pt.x;
		//this.setX(pt.x);
		//this.setX(pt.getX());
		
		this.y = pt.getY();
		//this.y = pt.y;
		//this.setY(pt.y);
		//this.setY(pt.getY());
		
		

		
	}

	
	/* static  멤버 메소드에는 클래스 멤버 변수의 값을 사용하지 않는다.
	 * 지역변수나 static 멤버 변수만 사용
	 * 왜냐하면 static 멤버 메소드는 객체를 생성하지 않아도
	 * 호출 가능한데 일반 멤버 변수는 객체가 생서되어야 호출 할 수 있기 때문이다.
	 */
	public static void printCount() {
		System.out.println("현재 좌표 평면에 생성된 객체 수 : " + count);
	}
	
	public void move(int x, int y) {
		this.setX(x);
		this.setY(y);
	
	}
	
	
}








