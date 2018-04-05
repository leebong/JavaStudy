package day3;

import java.util.Scanner;

public class Main {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 방법1
/*		int i = 0;
		int j = 0;
		int k = 0;
		
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				k=i*j;
				System.out.println(i+"*"+j+"="+k);
			}		
		}
*/
/*
		//방법2
		int i = 0;
		int j = 0;
		
		for(i=2;i<=9;i++) {
				System.out.println(i+"단");
			for(j=1;j<=9;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}		
		}
*/		
		// Do While 문
		// 사용1
/*
		int sum = 0;
		int i = 1;
		do {
			sum += 1;
			i++;
		}while(i>2);
		System.out.println("sum"+sum);
		System.out.println(i);
		
		//사용2
		i = 1;
		sum = 0;
		while(i > 2) {
			sum += i;
			i++;
		}
		System.out.println("sum"+sum);
		System.out.println(i);
*/		

/*
		int manu = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("학생정보관리");
			System.out.println("메뉴");
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보수정");
			System.out.println("4. 프로그램종료");
			System.out.println("메뉴를 선택하세요");
			manu = scan.nextInt();
			System.out.println(manu + "이 선택되었습니다.");
			
		}while(manu != 4);
		scan.close();
		
*/

		
/*		
		// \n : enter -> 공백 
		// \t : tab  -> tab공백 후 a 표시
		// \n : 다음줄  -> 다음줄에 b 표시
		// \n : 다음줄  -> 다음줄에 c 표시
		// next() : 문자만 표시해준다
		// nextLine() : 공백까지 표시해준다
		// hasNext() : 다음줄에 문자기 있느냐 true / false 묻는다
		
		Scanner scan = new Scanner("\n\ta\nb\nc"+ "abcd\n");
		
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
			
		}
		scan.close();
		
*/		
		
		// 자료형 [] 배열이름 = new 자료형 [배열의 갯수] {배열갯수만큼 초기화};
		// int[] arr = new arr[3] {1, 2, 3}; 초기화 직접 넣기
		// int[] arr = new arr[] {1, 2, 3}; 배열을 초기화가 몇개인지 확인할 수 있다
		// int[] numArr = new int[9]; // 기본 0 으로 초기화
		// char[] numArr = new char[9]
		// 9개 배열은 -> "0" ~ "8" 까지 사용

/*		
		int[] arr = new int[9];
		
		for(int i = 0; i<9; i++) {
			arr[i] = i;
			System.out.println(i+"번지 : "+arr[i]);
		}
		


		// int[] arr = new int[9]; // 0 ~ 8번지
		int[] arr1 = new int[9];			
		// for(int i = 0 ; i<9 ; i++) {
		for(int i = 0 ; i<arr1.length ; i++) {
			
		// arr[i] = 2*(i+1);
		arr1[i] = 2*(i+1);	
			// System.out.println(i+"번지 : "+arr[i]);
			System.out.println(i+"번지 : "+arr1[i]);
		}
			
*/
		
/*		
		//5명 학생의 국어성적을 저장하기 우한 배열을 만들고 해당하는 배열에
		//성적을 입력하고 입력받은 성적을 출력하세요.
		//배열선어
		/*
		int[] score = new int[5];
		Scanner scan = new Scanner(System.in);
		//성적입력
		int i=0;

		while(i<score.length) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = scan.nextInt();
			i++;
		}
		//성적출력
		i = 0;
		while(i<score.length) {
			System.out.println(i+1+"번 학생 성적 : "+score[i]);
			i++;
		}
		scan.close();
*/		

		
/*		
		int[] score = new int[5];
		Scanner scan = new Scanner(System.in);
		//성적입력
		int i=0;
		for(;i<score.length;i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = scan.nextInt();
			
			
		}
		//성적출력
		for(i=0;i<score.length;i++) {
			System.out.println(i+1+"번 학생 성적 : "+score[i]);
			
		}
		//학생평균
		int j = 0;
		for(i=0;i<score.length;i++) {
			j += score[i];
		}
		double avr = (double)j/score.length;
		System.out.println("학생 총점 : "+ j);
		System.out.println("학생 평균 : "+ avr);
		scan.close();
		
*/

/*
		//야구게임
		//1. 랜덤한 수를 생성하여 배열에 저장한다
		//1.1 랜덤한 수를 저장하기 전에 중복여부를 확인한다.
		
		// Math.random()*9 ; // 0*9+1<=  <1*9+1 --> 0 부터 8까지 랜덤수를 생성
		//Math.random()는 0 <= 1사이의 수이다 그러므로 0.1 int 0 이다
		
		int cnt = 0;
		int[] arr = new int[3];
		//첫 번재 수
		arr[0]=(int)(Math.random()*9)+1;
		//두번째 수
		//첫 번재 수와 중복 여부를 검사
		while(true) {
			arr[1]=(int)(Math.random()*9)+1;
			if(arr[0] != arr[1])
				break;
			}		
		
		
		//세 번재 수
		//첫 번째 수와 두 번째 수의 중복 여부를 검사
		while(true){
			arr[2]=(int)(Math.random()*9)+1;
			if(arr[0] != arr[2] && arr[1] != arr[2]);
				break;
		}
		//출력

		while(cnt < 3) {			
			System.out.print(arr[cnt]+" ");
			cnt++;
		}
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		
		while(true) {    //무한루프	
		//숫자 3개 입력을 받아 배열에 저장
			for(int i=0;i<3;i++)
				input[i] = scan.nextInt();
			for(int i=0;i<3;i++)
					System.out.print(input[i] + " ");
			
			
					
		//스트라이크 판별
			int strike = 0;
			for(int i = 0; i<3 ;i++) {
				if(arr[i] == input[i])
					strike++;				
			}		
		//볼 판별
			//기본
			int ball = 0;
			
			if(arr[0] == input[1] || arr[0] == input[2])
				ball++;
			if(arr[1] == input[0] || arr[1] == input[2])
				ball++;	
			if(arr[1] == input[0] || arr[2] == input[1])
				ball++;
		//고급
			//i는 랜덤으로 생성된 정답의 번지를 접근하기 위해
			//j는 내가 입력한 수의 번지를 접근하기 위해
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j) //서로 같은 번지이면 비교할 필요 없음
						continue;
					if(arr[i] == input[j])
						ball++;
				}
			}	

		//3아웃인지 판별
			if(strike == 0 && ball == 0)
				System.out.println("30");
			if(strike != 0)
				System.out.print(strike+"S");
			if(ball != 0)
				System.out.print(ball+"B");
			if(strike == 3) {
				System.out.println("정답입니다.");
				break;
				
			}
		}
		scan.close();

		
*/
/*
		int[] input = new int[3];
		int[] ans = new int[3];
		int i = 0;
		int j = 0;
		int strike = 0;
		int ball = 0;
		
		for(i=0;i<3;) {
			//j는 i보다 앞에 생성된 수의 번지
			ans[i] = (int)(Math.random()*9)+1;
			for(j=0;j<i;j++) {
				if(ans[i] == ans[j]);
				break;
			}
			if(j==i)
				i++;			
		}
		//Strike
		for(i = 0;i<3;i++) {
			if(ans[i] == input[i])
				strike++;
		}
		//ball
		for(j=0;j<3;j++) {
			if(i == j)
				continue;
			if(ans[i] == input[j])
				ball++;
		}
		
*/		
		
		
/*		
		int[] arr = {1, 2, 3};
		/* 향상된 for문, for-each문
		 * 1. 배열의 값을 읽어서 사용만 할 때
		 *    => 배열에 값을 저장하지 않을 때
		 * 2. 모든 배열의 값을 순차적으로 가져옴
		 */

/*		for(int i : arr)
			System.out.println(i);
		//비교
		for(int j=0;j<arr.length;j++) {
			int i = arr[j];
			System.out.println(i);
		}

*/
		
		//설계도 ->  클래스
		//제품    ->  객체
		//동작    ->  메서드
/*		
	public static void main(String[] args) {
		int num = sum(1,2);
		System.out.println(sum(1,2));
	}
*/
	/* public(공공) : 접근제한자 중 하나 누구나 접근가능
	 * private, protected : 내가 지정한 사람만 접근가능
	 * 리턴타입 메소드 명(매개변수들){
	 * }
	 */
	 /* 자판기 예
	  * 매개변수(자료형, 객체) : 돈, 선택된 메뉴 ?필요없으면 안써도 된다
	  * 리턴타입(자료형 , 객체) : 음료수 ?반드시 써야 한다
	  * void : 리턴타입에서 아무것도 돌려줄 필요가 없을 때
	  * 역할 : 음료수를 제공
	  */
	//매개변수 a와 b의 합을 반환하는 메소드(c = 함수)

	
	public static int sum(int a, int b) {
		return a+b;
	
	}
/*	
	public static void main(String[] args) {
		if(isEvenNumber(10))
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}
	
*/	
	public static boolean isEvenNumber(int num) {
		if(num%2 ==0)
			return true;
		else
			return false;
	}
		

	
	/*
	 * 산술연산을 하는 계산기 프로그램을 메소드 단위로 만들어서 실행하세요.
	 */

	public static void main(String[] args) {
		calc();
		
		
	}
	
	//}
	
	public static void calc() {
		int num1 = 0;
		int num2 = 0;
		char op = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = scan.nextInt();
		System.out.print("연사자 입력 : ");
		op = scan.next().charAt(0);		
		System.out.println();
		
		double res = 0;
		
		switch (op) {
			case '+' :
				res = num1 + num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			case '-' :
				res = num1 - num2;
				break;
			case '*' :
				res = num1 * num2;
				break;
			case '/' :
				res = (double)num1 / num2;
				break;
			case '%' :
				res = num1 % num2;
				break;
			default :
				System.out.println("연산자를 잘못 입력하였습니다");	
		}
		scan.close();
	}

}
	
				
	
	

