package day10;

public class StudentsManager {
	/**
	 * 1. 필요한 멤버변수
	 * 1-1 학생 클래스의 배열
	 * 1-2 학생의 최대수 저장하는 변수 : int
	 * 1-3 현재 저장된 학생의 수 : int
	 */
	
	private Students [] std ;
	private int maxCount;
	private int nowCount;
	
	/**
	 * 2. getter & setter생성
	 */
	
	public Students[] getStd() {
		return std;
	}
	public void setStd(Students[] std) {
		this.std = std;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getNowCount() {
		return nowCount;
	}
	public void setNowCount(int nowCount) {
		this.nowCount = nowCount;
	}
	
	/**
	 * 3. 생성자
	 * 3.1 디폴트생성자 - 멤버객체 std의 배열을 new 연산자를 통해 생성한다.
	 *    이때, 생성되는 배열의 갯수는 30개로 한다.
	 *    예)int arr[] = new int[30]; 
	 *    std는 위에서 배열선언 했으므로 배열표시생략, Students클래스에서 30개 배열선언
	 * 3.2 생성자 오버로딩 - 매개변수로 생성한 배열의 크기(int)를 넘겨받아 해당 크기를 이용하여 배열을 생성한다.   
	 */
	
	public StudentsManager() throws RuntimeException{
		//maxCount = 30;
		//std = new Students[maxCount]; 
		this(30); //this()는 생성자 호출하는것
	}
	
	public StudentsManager(int size) {
		if(size <= 0)
			throw new RuntimeException("배열의 크기는 0 또는, 음수 불가"); //예외발생하면 해당코드를 빠져나간다.
		
		maxCount = size;
		std = new Students[maxCount];
	}
	
	/**
	 * 4. 필요한 메소드 구현
	 * 4.1 학생정보를 추가하는 메소드
	 * 4.1.1  필요한 매개변수 : 학생정보들(이름, 학년, 반, 번, 국어, 영어, 수학)
	 * 4.1.2  리턴타입 : 없다(void)
	 * 4.1.3 메소드명 : insert
	 * 4.1.4.1 객체를 입력받은 매개변수들을 통해 생성해야 하는데 
	 * 		      생성하는 배열의 번지는 nowCount번지에 저장
	 * 4.1.4.2 현재 저장된 학생수(nowCount)를 증가
	 * 4.2 학생들의 정보를 출력하는 메소드
	 * 4.2.1 필요한 매개변수 : 없다(void)
	 * 4.2.2 리턴타입 : 없다(void)
	 * 4.2.3 메소드명 : printManager()
	 * 4.2.4 구현
	 * 4.2.4.1 반복문을 이용하여 학생정보가 저장되어 있는 배열(std)를 0번지부터 시작해서
	 * 		   	현재 저장된 학생수 (nowCnt)-1까지 정보를 출력하는데 학생 정보를 출력 할 때
	 * 			Students클래스의 멤버 메소드 printStudents메소드를 이용한다.
	 */
	
	public void insertStudents(String Name, int Grade, int Half, int Number,
								int Korea, int English, int Methemetics) {
		//std[nowCount] = new Students(Name, Grade, Half, Number, Korea, English, Methemetics);
		//nowCount++;
		//위 두 코드를 한줄로 쓴다(nowCount는 후위연산자)
		std[nowCount++] = new Students(Name, Grade, Half, Number, Korea, English, Methemetics);		
	}
	
	public void printManager() {	
		for(int i=0; i<nowCount; i++) {
			std[i].printStudents();				
		}
	}
	
}
