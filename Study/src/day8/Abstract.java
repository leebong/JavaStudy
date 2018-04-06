package day8;

public class Abstract {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Maths m = new Maths();
		System.out.println("[절대값 메소드 테스트]");
		System.out.println(m.abs(-2));
		System.out.println(m.abs(2));
		System.out.println(m.abs(-1.2345));
		System.out.println(m.abs(9.8765));
		System.out.println("[제곱 메소드 테스트]");
		System.out.println(m.pow(10,3));
		System.out.println(m.pow(4,4));
		System.out.println("[렌덤 메소드 테스트]");
		System.out.println(m.randomInt(100, 111));
		System.out.println("[원의 넓이 메소드 테스트]");
		System.out.println(m.getAreaCircle(5));
		System.out.printf("%.2f", m.getAreaCircle(5)); // 소수점 2자리 반올림
		System.out.println();
		System.out.println("[오브젝트 메소드 테스트]");
		Test t1 = new Test();
		t1.num = 10;
		Test t2 = new Test();
		t2.num = 20;
		if(t1.equal(t1, t2))
			System.out.println("두 객체가 같음");
		else
			System.out.println("두 객체가 다름");
		
	}

}

interface MathInterface{
	public final double PI = Math.PI;
	public int abs(int num); //정수 num의 절대값
	public double abs(double num); //실수 num의 절대값
	public int pow(int a, int b); //a의 b제곱
	public int randomInt(int a, int b); //a보다 크거나 같고 b보다 작은 렌덤한 숫자를 생성
	public double getAreaCircle(int radius); //원의 넓이를 구한 메소드
}

class Maths implements MathInterface{

	@Override
	public int abs(int num) {
		// TODO 자동 생성된 메소드 스텁	
		if(num > 0)
			return num;
		else
			return -num;		
	}

	@Override
	public double abs(double num) {
		// TODO 자동 생성된 메소드 스텁
		return num>=0?num:-num;
	}

	@Override
	public int pow(int a, int b) {
		// TODO 자동 생성된 메소드 스텁
		int result = 1;
		for(int i=0;i<b;i++) {
			result *= a;
		}
		return result;
	}

	@Override
	public int randomInt(int a, int b) {
		// TODO 자동 생성된 메소드 스텁
		return (int)(Math.random()*(b-a+1)+a);
		//0*(b-a+1)<= r*(b-a+1)<(b-a+1)*1
		//0<= r*(b-a+1)<(b-a+1)
		//a<= r*(b-a+1)+a<b-a+1+a
		//a<= r*(b-a+1)+a<b+1
	}

	@Override
	public double getAreaCircle(int radius) {
		// TODO 자동 생성된 메소드 스텁
		return radius*radius*PI;
	}
	
	
	
}

interface Basic{
	public boolean equal(Object obj, Object obj1);
	public boolean equal(Object obj);
}

class Test implements Basic{
	int num;
	@Override
	public boolean equal(Object obj, Object obj1) {
		// Object는 최상위 클래스이기 때문에 형변환이 가능하다.
		if(((Test)obj).num == ((Test)obj1).num)
			return true;
		else
			return false;
	}
	public Test() {}
	@Override
	public boolean equal(Object obj) {
		// TODO 자동 생성된 메소드 스텁
		if(((Test)obj).num == this.num)
			return true;
		else
			return false;
	}
	
}






interface ShapeInterface{
	public abstract void draw();
	public abstract void resize(int width, int height);
	public abstract void move(int x, int y);	
}

class Shapes implements ShapeInterface{
	public int x;
	public int y;
	public int width;
	public int height;
	
	
	@Override
	public void draw() {
		
	}
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
		
	}

		
	
}

