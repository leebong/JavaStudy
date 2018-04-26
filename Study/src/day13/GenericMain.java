package day13;

public class GenericMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		GenericEx<Integer> ge = new GenericEx();
		ge.data = 10;
		System.out.println(ge);
	}

}

class GenericEx<T>{
	T data;
	public GenericEx() {}
	
	public String toString() {
		return this.getClass().getName()+" :Generic 클래스 :";
	}
	
}
