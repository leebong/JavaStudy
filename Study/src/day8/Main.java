package day8;

public class Main {

	public static void main(String[] args) {
		//부모 클래스 디폴트 생성자가 호출되는 예		
		Child c = new Child();
		Child c2 = new Child(1,2,3);
		ChildOther co = new ChildOther();
		ChildOther co2 = new ChildOther(1,2,3,4);

	}

}
