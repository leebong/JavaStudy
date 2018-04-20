package day12;

import java.util.HashSet;

public class StudentCollectionManager {

	/**
	 * 1.멤버변수
	 * HashSet이 필요
	 */
	public HashSet<StudentCollection> hs;
	
	
	/**
	 * 2. getter & setter생성
	 * 직접 호출이 없기 때문에 만들지 않아도 된다
	 */
	
	
	/**
	 * 3. 디폴트 생성자에서 HashSet에 객체를 생성
	 */
	public StudentCollectionManager() {
		hs = new HashSet<StudentCollection>();		
	}
	/**
	 * 4. 멤버 메소드
	 * 학생추가 HashSet의 add메소드
	 * 학생 수정 탐색을 해서 있는지 확인 후
	 * 		있으면 수정 없으면 수정 할 수 없음
	 * 		HashSet의 remove메소드와
	 * 		Hashset의 add메소드 이용
	 * 학생 삭제 탐색을 해서 있는지 확인 후
	 * 		있으면 삭제 없으면 삭제 할 수 없음
	 * 		HashSet의 remove메소드 이용
	 * 학생 출력 탐색을 하면서 학생 정보를 출력
	 * 
	 */
	public void insert(StudentCollection std) {
		hs.add(std);
	}
	
	public void print() {
		for(StudentCollection tmp : hs) {
			System.out.println(tmp);
		}
	}
	
	public void delete(StudentCollection std) {
		hs.remove(std);
	}
	
	public void modify(StudentCollection std) {
		hs.remove(std);
		hs.add(std);
		if(hs.remove(std))
			hs.add(std);
	}
	
	
	
}
