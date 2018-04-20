package day12;

import java.util.HashSet;
import java.util.Scanner;


public class StudentCollectionMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*StudentCollection std = new StudentCollection();
		std.setcName("홍").setcKorea(100).setcEnglish(100).setcMathemetics(100);
		
		//System.out.println(std);
		
		StudentCollection std1 = new StudentCollection(1,1,2);
		std1.setcName("홍").setcKorea(100).setcEnglish(100).setcMathemetics(100);
		
		HashSet<StudentCollection> hs = new HashSet();
		hs.add(std);
		hs.add(std1);
		for(StudentCollection tmp : hs) {
			System.out.println(tmp);
		}*/
		
		/*StudentCollectionManager sm = new StudentCollectionManager();
		sm.insert(new StudentCollection("홍길동", 1, 1, 1, 100.0, 90.0, 80.0));
		sm.insert(new StudentCollection("임꺽정", 1, 1, 2, 99.0, 89.0, 79.0));
		sm.print();
		
		System.out.println("--------  수정   -------");
		sm.modify(new StudentCollection("임꺽정", 1, 1, 2, 100.0, 100.0, 100.0));
		sm.print();
		
		System.out.println("--------  삭제   -------");
		sm.delete(new StudentCollection("임꺽정", 1, 1, 2, 100.0, 100.0, 100.0));
		sm.print();*/
		
		StudentCollectionManager sm = new StudentCollectionManager();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			printMenu();
			int menu = scan.nextInt();
			try {
				if(menu == 1) {
					System.out.println("이름 : ");
					String cName = scan.next();
					System.out.println("학년 : ");
					int cGrade = scan.nextInt();
					System.out.println("학반 : ");
					int cHalf = scan.nextInt();
					System.out.println("번호 : ");
					int cNumber = scan.nextInt();
					System.out.println("국어 : ");
					double cKorea = scan.nextInt();
					System.out.println("영어 : ");
					double cEnglish = scan.nextInt();
					System.out.println("수학 : ");
					double cMathemetics = scan.nextInt();
					sm.insert(new StudentCollection(cName, cGrade, cHalf, cNumber,
													cKorea, cEnglish, cMathemetics));
					
				}
				else if(menu == 2) {
					System.out.println("이름 : ");
					String cName = scan.next();
					System.out.println("학년 : ");
					int cGrade = scan.nextInt();
					System.out.println("학반 : ");
					int cHalf = scan.nextInt();
					System.out.println("번호 : ");
					int cNumber = scan.nextInt();
					System.out.println("국어 : ");
					double cKorea = scan.nextInt();
					System.out.println("영어 : ");
					double cEnglish = scan.nextInt();
					System.out.println("수학 : ");
					double cMathemetics = scan.nextInt();
					sm.modify(new StudentCollection(cName, cGrade, cHalf, cNumber,
							cKorea, cEnglish, cMathemetics));

				}
				else if(menu == 3) {
					System.out.println("이름 : ");
					String cName = scan.next();
					System.out.println("학년 : ");
					int cGrade = scan.nextInt();
					System.out.println("학반 : ");
					int cHalf = scan.nextInt();
					System.out.println("번호 : ");
					int cNumber = scan.nextInt();
					System.out.println("국어 : ");
					double cKorea = scan.nextInt();
					System.out.println("영어 : ");
					double cEnglish = scan.nextInt();
					System.out.println("수학 : ");
					double cMathemetics = scan.nextInt();
					sm.delete(new StudentCollection(cName, cGrade, cHalf, cNumber,
							cKorea, cEnglish, cMathemetics));
				}
				if(menu == 4) {
					sm.print();
				}
				if(menu == 5) {
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

	public static void printMenu() {
		System.out.println("================");
		System.out.println("=     메뉴            =");
		System.out.println("================");
		System.out.println("1. 학생정보 추가 : ");
		System.out.println("2. 학생정보 수정 : ");
		System.out.println("3. 학생정보 삭제 : ");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("================");
		System.out.println("메뉴선택 : ");	
	}
	
	
}
