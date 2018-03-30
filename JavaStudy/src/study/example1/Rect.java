package study.example1;

public class Rect {
	private Point leftUp;
	private Point rightDown;
	private int width;
	private int height;
	public Point getLeftUp() {
		return leftUp;
	}
	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}
	public Point getRightDown() {
		return rightDown;
	}
	public void setRightDown(Point rightDown) {
		this.rightDown = rightDown;
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
	
	public void calWidth() {
		width = Math.abs(rightDown.getX() - leftUp.getX());		
	}
	
	public void calHeight() {
		height = Math.abs(rightDown.getY() - leftUp.getY());	
	}
	
	//생성자
	public Rect() {
		this.leftUp = new Point(0,10);
		this.rightDown = new Point(10,0);
		this.calWidth();
		this.calHeight();	
	}
	
	public Rect(int left, int up, int right, int down) {
		this.leftUp = new Point(left,up);
		this.rightDown = new Point(right,down);
		this.calWidth();
		this.calHeight();
	}
	
	public Rect(Point leftUp, Point rightDown) {
		this.leftUp = new Point(leftUp);
		this.rightDown = new Point(rightDown);
		this.calWidth();
		this.calHeight();
	}
	
	public void print() {
		System.out.println("사각형의 정보");
		System.out.print("좌상의 점 : ");
		leftUp.print();
		System.out.print("우상의 점 : ");
		rightDown.print();
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);	
	}
	
	public void resize(int width, int height) {
		//크기조정시 왼쪽 위의 점은 고정
		this.width = width;
		this.height = height;
		this.rightDown.move(this.leftUp.getX()+width, 
				this.leftUp.getY()-height);
		
		
		
	}
	public void move(int x, int y) {
		//위치 조정
		//x좌표로 매개변수 x픽셀만큼 이동하고,
		//y좌표로 매개변수 y픽셀만큼 이동한다.
		
		this.leftUp.move(
				this.leftUp.getX()+x, 
				this.leftUp.getY()+y);
		this.rightDown.move(
				this.rightDown.getX()+x, 
				this.rightDown.getY()+y);
		
	}
	
}

