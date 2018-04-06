package day8;

public class Main {

	public static void main(String[] args) {
		//부모 클래스 디폴트 생성자가 호출되는 예		
		Child c = new Child();
		Child c2 = new Child(1,2,3);
		ChildOther co = new ChildOther();
		ChildOther co2 = new ChildOther(1,2,3,4);
		
		System.out.println("Child x: "+c2.getX());
		System.out.println("Child y: "+c2.getY());
		System.out.println("Child z: "+c2.getZ());
		
		System.out.println("ChildOther x: "+co2.getX());
		System.out.println("ChildOther y: "+co2.getY());
		System.out.println("ChildOther z: "+co2.getZ());
		System.out.println("ChildOther z: "+co2.num);
		
		//사각형 클래스 연습
		Rect r = new Rect();
		r.draw();
		Rect r2 = new Rect(0,0,5,10);
		r2.draw();
		
		//Shape s = new Shape();
		Shape s = new Rect();
		if(s instanceof Shape) //instanceof : 형변환이 가능여부를 확인 해주는 제어자 이다
			System.out.println("OK");
		else
			System.out.println("Fail");
		
	}

}
