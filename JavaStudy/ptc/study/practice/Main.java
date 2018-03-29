package study.practice;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*
		System.out.println("프로그램 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램 종료");
		*/
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();
				
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("반갑습니다.");
		System.out.println("제 나이는" + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "Cm 입니다.");
		
	}
	
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
		
	}

}
