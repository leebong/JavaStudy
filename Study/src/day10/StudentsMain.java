package day10;

import java.util.Scanner;

public class StudentsMain {

	public static void main(String[] args) {
		
		/**
		 * 1. Students클래스의 객체 s를 new연산자를 통해 생성할 때 매개변수로 
		 * 	  이름, 학년, 반, 번호, 국어, 영어, 수학을 넘겨준다.
		 * 2. 객체 s를 통해 만들어 놓은 printStudents()메소드를 호출하여 결과를 확인
		 * 3. 객체 s를 통해 만들어 놓은 modifyStudens()메소드를 호출하여 정보를 수정하는데
		 *    이름, 학년, 반, 번호, 국어, 영어, 수학을 넘겨준다
		 * 4. 객체 s를 통해 만들어놓은 printStudents()메소들 호출하여 결과를 확인한다.
		 */
		
		/* 1차 출력
		Students s = new Students("홍길동", 1,1,1,90,80,70);
		s.printStudents();
		
		s.modifyStudents("대장금",1,1,1,100,100,100);
		System.out.println();
		System.out.println("++ 정보변경확인   ++");
		s.printStudents();
		*/
		
		/**
		 * StudentsManager이용 출력
		 * 1. StudentsManager클래스의 객체 sm을 생성하는데
		 * 		학생의 정보를 10개 저장하도록 객체를 생성
		 * 2. 학생 한명의 정보를 객체 sm이 가지고 있는 insertStudents메소드를 이요하여 출력 
		 */
		
		/*
		StudentsManager sm = new StudentsManager(10);
		sm.insertStudents("홍길동", 1,1,1,90,80,70);
		sm.insertStudents("임꺽정", 1,2,10,70,60,50);
		sm.printManager();
		//학년, 반, 번호를 조회하여 출력한다.
		//System.out.println(sm.searchIndexStudents(1, 1, 1));
		
		//수정 할  학년, 반, 번호를 조회한다.
		//int index  = sm.searchIndexStudents(1, 2, 10);
		//조회된 내용을 출력한다.
		System.out.println("수정후");
		try {
			sm.updateStudents(1, 1, 1, "장보고", 55, 55, 55);
			sm.updateStudents(1, 2, 1, "대장금", 99, 99, 99);
			sm.printManager();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		Scanner scan = new Scanner(System.in);
		StudentsManager sm = new StudentsManager(10);
		
		while(true) {
			
			printMenu();
			int menu = scan.nextInt();
			try {
				if(menu == 1) {
					System.out.println("이름 : ");
					String Name = scan.next();
					System.out.println("학년 : ");
					int Grade = scan.nextInt();
					System.out.println("학반 : ");
					int Half = scan.nextInt();
					System.out.println("번호 : ");
					int Number = scan.nextInt();
					System.out.println("국어 : ");
					int Korea = scan.nextInt();
					System.out.println("영어 : ");
					int English = scan.nextInt();
					System.out.println("수학 : ");
					int Mathemetics = scan.nextInt();
					sm.insertStudents(Name, Grade, Half, Number, 
									Korea, English, Mathemetics);
					
				}
				else if(menu == 2) {
					
					System.out.println("학년 : ");
					int Grade = scan.nextInt();
					System.out.println("학반 : ");
					int Half = scan.nextInt();
					System.out.println("번호 : ");
					int Number = scan.nextInt();
					try {
						sm.searchIndexStudents(Grade, Half, Number);
						
						System.out.println("이름 : ");
						String Name = scan.next();
						System.out.println("국어 : ");
						int Korea = scan.nextInt();
						System.out.println("영어 : ");
						int English = scan.nextInt();
						System.out.println("수학 : ");
						int Mathemetics = scan.nextInt();
						sm.updateStudents(Grade, Half, Number, Name, 
											Korea, English, Mathemetics);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
					
					
				
				}
				else if(menu == 3) {
					sm.printManager();
				}
				if(menu == 4) {
					System.out.println("________________");
					System.out.println("프로그램 종료되었습니다.");
					System.out.println("________________");
					break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}		
		}		
		scan.close();
			
	}
	
	/**
	 * 1. 메뉴를 출력하는 메소드
	 * 1.1 매개변수 : 없음
	 * 1.2 리턴타입 : 없음
	 * 1.3 메소드명 : printMenu
	 * 1.4 구현 - 아래와 같이 출력 system.out.pirntln()을 이용
	 * 메뉴
	 * 1. 학생정보 추가
	 * 2. 학생정보 수정
	 * 3. 학생정보 출력
	 * 4. 종료
	 * 
	 */
	
	public static void printMenu() {
		System.out.println("================");
		System.out.println("=     메뉴            =");
		System.out.println("================");
		System.out.println("1. 학생정보 추가 : ");
		System.out.println("2. 학생정보 수정 : ");
		System.out.println("3. 학생정보 출력 : ");
		System.out.println("4. 종료");
		System.out.println("================");
		System.out.println("메뉴선택 : ");
		
		
		
	}

}
