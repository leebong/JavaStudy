package study.practice;

public class Main {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		/*
		System.out.println("���α׷� ����");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("���α׷� ����");
		*/
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();
				
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("�ݰ����ϴ�.");
		System.out.println("�� ���̴�" + age + "�� �Դϴ�.");
		System.out.println("���� Ű�� " + height + "Cm �Դϴ�.");
		
	}
	
	public static void byEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
		
	}

}
