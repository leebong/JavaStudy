package study.example1;

public class Rect {
	private int x;
	private int y;
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
	
	public void move(int x, int y) {
		this.setX(x);
		this.setY(y);		
	}
	
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	
}


















/*

private int centerX;
private int centerY;
private int R1X;
private int R1Y;
private int R2X;
private int R2Y;
private int R3X;
private int R3Y;




	public int getCenterX() {
	return centerX;
}

public void setCenterX(int centerX) {
	this.centerX = centerX;
}

public int getCenterY() {
	return centerY;
}

public void setCenterY(int centerY) {
	this.centerY = centerY;
}

public int getR1X() {
	return R1X;
}

public void setR1X(int r1x) {
	R1X = r1x;
}

public int getR1Y() {
	return R1Y;
}

public void setR1Y(int r1y) {
	R1Y = r1y;
}

public int getR2X() {
	return R2X;
}

public void setR2X(int r2x) {
	R2X = r2x;
}

public int getR2Y() {
	return R2Y;
}

public void setR2Y(int r2y) {
	R2Y = r2y;
}

public int getR3X() {
	return R3X;
}

public void setR3X(int r3x) {
	R3X = r3x;
}

public int getR3Y() {
	return R3Y;
}

public void setR3Y(int r3y) {
	R3Y = r3y;
}


public void setCenter(int x, int y) {
	this.setCenterX(x);
	this.setCenterY(y);
}

public void printRect() {
	System.out.println("»ç°¢ÇüÀÇ Á¤º¸");
	System.out.println("Ã¹¹øÂ° ÁÂÇ¥ : " + centerX + "," + centerY);
	System.out.println("µÎ¹øÂ° ÁÂÇ¥ : " + R1X + "," + R1Y);
	System.out.println("¼¼¹øÂ° ÁÂÇ¥ : " + R2X + "," + R2Y);
	System.out.println("³×¹øÂ° ÁÂÇ¥ : " + R3X + "," + R3Y);
}

public void moveCenter(int x, int y) {
	this.setCenter(x, y);
}
public void moveR1(int x, int y) {
	this.moveR1(x, y);
}
public void moveR2(int x, int y) {
	this.moveR2(x, y);
}
public void moveR3(int x, int y) {
	this.moveR3(x, y);
	
}

*/