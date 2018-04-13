package day10;

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
		
	}

}
