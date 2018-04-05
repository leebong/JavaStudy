package day5;

import java.util.Scanner;

// public : ����
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point pt = new Point(); //new �����Ȱ�
		Point pt = new Point();
		System.out.println("�ʱ� ��ǥ ��ġ");
		pt.printPoint();
		pt.printCount();
		System.out.println("��ǥ (10, 10) �̵� ��");
		pt.move(10,  10);
		pt.printPoint();
		pt.printCount();
		Point pt2 = new Point(pt);
		
		
		
	}

}


/* 2���� ��ǥ ����� ���� ��Ÿ���� ���� Ŭ���� */
/* default class�� ���� Package day5;�� �ִ� Ŭ���������� ����� �� �ִ�
 * ����������
 * public : �ƹ��� ���
 * default(���������ڸ� �ƹ��͵� �Է����� �ʾ�����) :���� ��Ű�� �ȿ� �ִ� Ŭ�����鸸 ��밡��
 * protected : �ڽ� Ŭ������ ��ӹ��� �Ļ�(�ڽ�)Ŭ������ ���
 * private : �ڽ� Ŭ������ ��밡��
 */
class Point{
	private int x; //private�� �� Point Class������ ���Ӱ�����
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
	 * setX : ������� x�� ���� �����ϴ� �޼ҵ�
	 * @param _x : �����Ϸ��� x�� ��
	 */
/*	
	void setX(int x) { //void ���ϰ��� �ʿ����, setX : ���� ������ �޾� ������ �ϱ� ����
		this.x = x; //�Ű����� _x�� ���� ������� x�� ����	
	}
	public int getX() { //�� ������ ����
		return x;
	}
	void setY(int y) { //void ���ϰ��� �ʿ����, setX : ���� ������ �޾� ������ �ϱ� ����
		this.y = y; //�Ű����� _x�� ���� ������� x�� ����	
	}
	public int getY() { //�� ������ ����
		return y;
	}
	
*/
	
	
	/* ������
	 * 1. ����Ÿ���� ����. => void �� �ƴմϴ�.
	 * 2. �޼ҵ���� Ŭ������� �����ϴ�.
	 * 3. ���� ���ϴ� ���� ȣ���� �� ����, ��ü�� ������ �� �ڵ����� ȣ��ȴ�.
	 */
	
	public Point() {
		count++;
		
	}
	
	

	

	
	/* ������ �����ε� : �̸��� ����  �����ڳ� �޼ҵ尡 ������ �� ��, ����2������ �����߿�
	 * 			   1������ �����ϸ� ��밡��, �׷��� ������ �Ұ���(����)
	 * 1. �Ű������� ������ �ٸ� ���
	 * 2. �Ű������� ������ ������, �ڷ����� �ٸ� ��
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

	
	/* static  ��� �޼ҵ忡�� Ŭ���� ��� ������ ���� ������� �ʴ´�.
	 * ���������� static ��� ������ ���
	 * �ֳ��ϸ� static ��� �޼ҵ�� ��ü�� �������� �ʾƵ�
	 * ȣ�� �����ѵ� �Ϲ� ��� ������ ��ü�� �����Ǿ�� ȣ�� �� �� �ֱ� �����̴�.
	 */
	public static void printCount() {
		System.out.println("���� ��ǥ ��鿡 ������ ��ü �� : " + count);
	}
	
	public void move(int x, int y) {
		this.setX(x);
		this.setY(y);
	
	}
	
	
}








