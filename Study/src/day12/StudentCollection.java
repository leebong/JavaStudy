package day12;

import java.util.ArrayList;
import java.util.Iterator;

import day10.Students;

public class StudentCollection {
	/* 1. 멤버변수 
	 * 학년, 반, 번호, 이릉, 국어, 영어, 수학
	 * */
	private String cName;
	private int cGrade;
	private int cHalf;
	private int cNumber;
	private double cKorea;
	private double cEnglish;
	private double cMathemetics;
	
	/* 2. getter & setter
	 * setter는 chaining 기법 
	 * */
	
	StudentCollection setcName(String cname) {
		this.cName = cname;
		return this;
	}
	StudentCollection setcGrade(int cgrade) {
		this.cGrade = cgrade;
		return this;
	}
	StudentCollection setcHalf(int chalf) {
		this.cHalf = chalf;
		return this;
	}
	StudentCollection setcNumber(int cnumber) {
		this.cNumber = cnumber;
		return this;
	}
	StudentCollection setcKorea(double ckorea) {
		this.cKorea = ckorea;
		return this;
	}
	StudentCollection setcEnglish(double cenglish) {
		this.cEnglish = cenglish;
		return this;
	}
	StudentCollection setcMathemetics(double cmathemetics) {
		this.cMathemetics = cmathemetics;
		return this;
	}


	String getcName() {
		return cName;
	}	
	int getcGrade() {
		return cGrade;
	}	
	int getcHalf() {
		return cHalf;
	}	
	int getcNumber() {
		return cNumber;
	}
	double getcKorea() {
		return cKorea;
	}
	double cEnglish() {
		return cEnglish;
	}
	double getcMathemectics() {
		return cMathemetics;
	}

	
	/* 3. 생성자 
	 * 생성자는 자유롭게
	 * */
	public StudentCollection() {}
	
	public StudentCollection(String cName, int cGrade, int cHalf, int cNumber, 
							double cKorea, double cEnglish, double cMathemetics) {
		this.setcName(cName);
		this.setcGrade(cGrade);
		this.setcHalf(cHalf);
		this.setcNumber(cNumber);
		this.setcKorea(cKorea);
		this.setcEnglish(cEnglish);
		this.setcMathemetics(cMathemetics);
	}

	/* 4. 멤버 메서드 
	 * 4.1 일반 메서드
	 * 4.2 부모 클래스의 메서드 오버라이딩
	 * 4.2.1 hashcode()
	 * 4.2.2 equals()
	 * 4.2.3 toString() -> 선택
	 * 
	 * */
	
	public int hashCode() {
		//return 1; //그룹을 학교 1개로 생성
		//return Grade; //학년을 통해 3개의 그룹생성
		return cGrade*100 + cHalf; //학년 반을 통해 30개의 그룹생성
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof StudentCollection) {
			StudentCollection tmp = (StudentCollection)obj;
			if(this.cNumber == tmp.cNumber)
				return true;
		}
		return false;		
	}
	
	public String toString() {
		return "[학생이름 :" + cName
				+ ", 학생학번:" + cGrade
				+ ", 학생반   :" + cHalf
				+ ", 학생번호:" + cNumber
				+ ", 국어성적:" + cKorea
				+ ", 국어성적:" + cEnglish
				+ ", 국어성적:" + cMathemetics
				+ "]";
	}
	

}
