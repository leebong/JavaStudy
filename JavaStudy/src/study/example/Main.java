package study.example;

import study.example1.Circle;
import study.example1.Point;
import study.example1.Rect;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 직사각형 클래스(Rect)
		// 직사각형 생성을 위해서 필요한 요소를 멤버변수로 
		// 직사각형을 나타내기 위한 기능들을 멤버 메소드로 구현하여
		// Main 메소드에서 테스트 하세요
		
		Circle c1 = new Circle();
		c1.printCircle();
		c1.moveCenter(10, 10);
		c1.printCircle();
		c1.resize(10.1);
		c1.printCircle();
		
		Rect r = new Rect();
		r.print();
		Rect r2 = new Rect(0,0,10,-10);
		r2.print();
		Rect r3 = new Rect(new Point(0,0), new Point(10,-10));
		r3.print();

			
	}
	
}
