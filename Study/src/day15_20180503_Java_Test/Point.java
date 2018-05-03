package day15_20180503_Java_Test;

public class Point {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Rect r = new Rect();
		r.draw();
		Rect r2 = new Rect(0,0,10,10);
		r2.draw();
	}
}


class Shape {
	private int x;
	private int y;
	private int width;
	private int height;
	
	//getter & setter 생성

	
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//생성자 생성
	public Shape() {}
	
	public Shape(int x, int y, int width, int height) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		
		this.move(x, y);
		this.resize(width, height);
	}
	
	//그리기 메서드
	public void draw() {
		System.out.println("도형입니다.");
	}
	
	//이동 메서드
	public void move(int x, int y) {
		this.setX(x); //this.x = x;
		this.setY(y); //this.y = y;
	}
	//변경 메서드
	public void resize(int width, int height) {
		this.setWidth(width); //this.width = width;
		this.setHeight(height); //this.height = height;
	}
	
}

//자식클래스
class Rect extends Shape{
	
	public Rect() {}
	
	public Rect(int x, int y, int width, int height) {
		super(x, y, width, height); //getX를 하지 않아도 됨
	}
	
	@Override
	public void draw() {
		System.out.println("사각형입니다.");
		System.out.println("왼쪽 위의 점 : " + getX()+","+getY());
		System.out.println("가로 : " + getWidth());
		System.out.println("세로 : " + getHeight());
	}
	
	
}
