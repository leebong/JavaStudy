package day10;

public class Students {
	/** 학생성적프로그램
	 * 접근제한자 private(나만접근), public(모두접근), default(같은패키지안에접근), Protected(같은패키지+상속클래스)
	 * 1. 이름 : String
	 * 2. 학년 : int
	 * 3. 학반 : int
	 * 4. 학번 : int
	 * 5. 국어성적 : double
	 * 6. 영어성적 : double
	 * 7. 수학성적 : double
	 */
	private String Name;
	private int Grade;
	private int Half;
	private int Number;
	private double Korea;
	private double English;
	private double Mathemetics;
	
	/**
	 * 외부접근을 위한 getter와 setter를 자동생성
	 * 마우스 R클릭 소스/getter & setter 생성
	 * @return
	 */
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public int getHalf() {
		return Half;
	}
	public void setHalf(int half) {
		Half = half;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public double getKorea() {
		return Korea;
	}
	public void setKorea(double korea) {
		Korea = korea;
	}
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}
	public double getMathemetics() {
		return Mathemetics;
	}
	public void setMathemetics(double mathemetics) {
		Mathemetics = mathemetics;
	}
	
	/**
	 * 3. 생성자
	 * 3-1 디폴트 생성자 만들기 - 매개변수가 없는
	 * 3-2 생성자 오버로딩을 이용하여 매개변수가 이름, 학년, 반, 번호, 국어, 영어, 수학이 주어졌을 때,
	 *     각 멤버변수에 해당하는 매개 변수 값들을 저장
	 * 3-3 생성자 오버로딩을 이용하여 매개변수가 이름, 학년, 반, 번호가 주어졌을 때 
	 *     각 멤버변수에 해당하는 매개 변수 값을 저장하는데 3-2에서 생성한 생성자를 이용할 수 있다.
	 * @return 
	 */
	
	public  Students() {}
	
	public Students(String Name, int Grade, int Half, int Number, 
					double Korea, double English, double Mathemetics) {
		this.setName(Name);
		this.setGrade(Grade);
		this.setHalf(Half);
		this.setNumber(Number);
		this.setKorea(Korea);
		this.setEnglish(English);
		this.setMathemetics(Mathemetics);
	}
	
	public Students(String Name, int Grade, int Half, int Number) {
		this(Name, Grade, Half, Number,0,0,0);
	}
	

	/**
	 * 4. 메소드 생성
	 * 4-1 출력메소드 - 학생 정보를 출력하는 메소드 
	 * 				필요한 매개변수는 없다.
	 * 				리턴타입은 없다.
	 * 				메소드명 : printStudents
	 * 4-1-1 System.out.println을 이용하여 학생정보를 출력한다.
	 * 4-2 정보수정메소드 - 학생 정보를 수정한다.
	 *     필요한 매개변수는 이름, 학년, 반, 번호, 국어, 영여, 수학
	 *     리턴타입은 없다.(void)
	 *     메소드명 : modifyStudents
	 * 4-2-1 setter(set메소드)를 통해서 각 매개변수 값들로 변경
	 *
	 */
	
	public void printStudents() {
		System.out.println("===============");
		System.out.println("      학생정보출력   ");
		System.out.println("===============");
		System.out.println(" 학생이름 : "+Name);
		System.out.println(" 학생학번 : "+Grade);
		System.out.println(" 학생   반 : "+Half);
		System.out.println(" 학생번호 : "+Number);
		System.out.println(" 국어성적 : "+Korea);
		System.out.println(" 영어성적 : "+English);
		System.out.println(" 수학성적 : "+Mathemetics);
		System.out.println("===============");
	}
	
	public void modifyStudents(String Name, int Grade, int Half, int Number,
								double Korea, double English, double Mathemetics) {
		this.setName(Name);
		this.setGrade(Grade);
		this.setHalf(Half);
		this.setNumber(Number);
		this.setKorea(Korea);
		this.setEnglish(English);
		this.setMathemetics(Mathemetics);
	}
	
	
}
