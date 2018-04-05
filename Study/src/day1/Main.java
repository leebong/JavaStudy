package day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수타임(자료형)변수명
//		int phoneNumber = 34317755;
//		long number2 = 821034317755L;
//		float number3 = 3.14F;
//		double number4 = 3.140;
//		char ch = 'A';
//		boolean bool = true; //false 입력값과 출력값 같음

//		System.out.println(phoneNumber);
//		//두정수의 합의 결과를 문자열로 출력
//		System.out.println(number2+phoneNumber);
//		//두정수를 문자열로 만들어 이어 붙여서 출력
//		System.out.println(""+number2+phoneNumber);
//		System.out.println(number2+phoneNumber+"");
//		System.out.println(number3);
//		System.out.println(number4);
//		System.out.println(ch);
//		System.out.println(bool);		
				
//		int num1 = 12;    //10진수 12
//		int num2 = 012;	  //8진수 2 = 8 + 2 = 10
//		int num3 = 0x12;  //16진수 12 = 16 + 2 = 18

//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		
//		int num1 = 10;
//		double num2 = 20.123;
//		double res = num3;
//		int num2 = (int)num1;

//		System.out.println(res);
//		System.out.println(3+4);
//		System.out.println(3-4);
//		System.out.println(3*4);
//		System.out.println(3.0/4);
//		System.out.println(3%4);
//		System.out.println("실수 변수 값 : " + num2);
//		System.out.println("실수 변수 값 형변환 결과 : " + num2);
	
		
//		int num = 10;
//		int num1 = 10;
//		int num2 = 20;
//		double res = (double)num1/num2; //형변환을 통하여 0.5 실수값을 만들어 준다

		
//		boolean tmp = 10 > 20;
//		System.out.println(tmp);

//		int num = 10;
//		boolean tmp = (num < 20) && (num < 10);
//		System.out.println(tmp);

//		int num = 10; // && AND연산 
//		boolean tmp = (num < 20) && (5 < num);
//		
//		System.out.println(num + "은 20보다 작고" + "5보다 크다?");
//		System.out.println(tmp);
//		
//		int num2 = 30; // || OR연산 
//		boolean tmp2 = (num2 > 20) || (num2 < 5);
//		
//		System.out.println(num2 + "은 20보다 작고" + "5보다 크다?");
//		System.out.println(tmp2);
//		
//		
//		boolean tmp3 = true; //
//		System.out.println(!tmp3);
		
//		int num1 = 0;
//		int num2 = 0;
//		boolean tmp = ((num1=10)<0) && ((num2=20)<0);
//		
//		System.out.println(tmp);
//		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);

//		//부호연산자
//		int num = -10;
//		System.out.println(num);
//		System.out.println(-num);
		
//		//증감연산자 : 전위형(++num), 후위형(num++)
//		int num = 10;
//		int tmp = 0;
//		
//		System.out.println(num);
//		tmp = ++num;
//		//num = num + 1; //같은표현 num +=1
//		//tmp = num
//		System.out.println(tmp);
//		num = 10;
//		System.out.println(num);
//		tmp = num++;
//		//tmp = num;
//		//num = num + 1;
//		System.out.println(tmp);
//		
		
//		int num = 11;
//		//num을 2로 나눈 나머지가 0과 같다
//		if(num % 2 == 0 )
//		{
//			System.out.println("짝수입니다.");
//		}
//		else
//		{
//			System.out.println("홀수입니다.");
//		}
		
//		//2의 배수인지 3의 배수, 6의 배수인지 확인하는 예제
//		int num = 10;
//		
//		if(num % 6 == 0)
//		{
//			System.out.println("6의 배수입니다.");
//		}
//		else if(num % 2 == 0)
//		{
//			System.out.println("2의 배수입니다.");
//		}
//		else if(num % 3 == 0)
//		{
//			System.out.println("3의 배수입니다.");
//		}
//		else
//		{
//			System.out.println("2, 3, 6의 배수가 아닙니다.");
//		}
//		
		
		// 조건문을 이용하여 학생 성적에 따라 함점을 출력하세요.
		// 100 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 69 ~ 60 : D
		// 59 ~ 0 : F
		
//		int num = 69;
//		int A;
//		
//		if(59 >= num)
//		{
//			System.out.println("학점 = F");
//		}
//		else if(69 >= num)
//		{
//			System.out.println("학점 = D");
//		}
//		else if(79 >= num)
//		{
//			System.out.println("학점 = C");
//		}
//		else if(89 >= num)
//		{
//			System.out.println("학점 = B");
//		}
//		else if(90 >= num)
//		{
//			System.out.println("학점 = A");
//		}
//		

		
//		// 조건문을 이용하여 학생 성적에 따라 함점을 출력하세요.
//				// 100 ~ 90 : A
//				// 89 ~ 80 : B
//				// 79 ~ 70 : C
//				// 69 ~ 60 : D
//				// 59 ~ 0 : F
//		
//		int score = 101;
//				
//		if(score <= 100 && score >= 90)
//		{
//			System.out.println("학점 = A");
//		}
//		else if(score <= 89 && score >= 80)
//		{
//			System.out.println("학점 = B");
//		}
//		else if(score <= 79 && score >= 70)
//		{
//			System.out.println("학점 = C");
//		}
//		else if(score <=69 && score >= 60)
//		{
//			System.out.println("학점 = D");
//		}
//		else if(score < 59 && score >= 0)
//		{
//			System.out.println("학점 = F");
//		}
//		else
//		{
//			System.out.println("0 ~ 100사이의 점수를 입력하세요.");
//		}
	
		
		//이중 조건문 (0은 예외처리, 2,3의 배수가 될수 있다)
		
/*		Scanner scan = new Scanner(System.in);
		
		int num = 10;
		System.out.print("정수를 입력하세요:");
		num = scan.nextInt();
		//num = (int)scan.nextDouble(); //실수형에 대하여 (int)형변환을 시켜줘야한다.
		System.out.print("실수를 입력하세요:");
		double num2 = scan.nextDouble();
		System.out.println(num2);
		
		if(num == 0) {
			System.out.println("0입니다.");
		}else if(num % 2 == 0) {
			if(num % 3 == 0) 
				System.out.println("6의 배수");
			else
				System.out.println("2의 배수");
		}
		else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}
		else
			System.out.println("2,3,6의 배수가 아님"); */
//		
//		
		
//		//3항연산자
//		int num = 10;
//		boolean even = (num%2==0)?true:false;
//		System.out.println(even);
		
/*
		// Switch Case문
		int num = 1;
		switch(변수명 or 특정값을 가지는 식) {
		case 변수값1:
			실행문;
			break;
		case 변수값2:
			실행문;
			break;
		case 변수값3:
			실행문;
			break;
		}
*/

/*	Scanner scan = new Scanner(System.in);
		System.out.print("입력값을 넣으세요 :");
		int num = 1;
		num = scan.nextInt();
				
		switch(num) {
		case 1: //if(num == 1)
			System.out.println("1입니다.");
			break;
		case 2: //if(num == 1)
			System.out.println("2입니다.");
			break;
		default: //else
			System.out.println("1과 2가 아닙니다.");
		}
*/		

/*
		Scanner scan = new Scanner(System.in);
		System.out.print("입력값을 넣으세요 : ");
		int num = 1;
		num = scan.nextInt();
				
		switch(num%2) {
		case 0: //if(num == 1)
			System.out.println("짝수입니다.");
			break;
		case 1: //if(num == 1)
			System.out.println("홀수입니다.");
			break;
		default: //else
			System.out.println("이럴경우는 없음");
		}
*/
		
// 정수를 입력받아 해당하는 정수의 달에 해당하는 마지막 날을 출력 하세요.
// 예) 달을 입력하세요 : 2
//    2월은 28일까지 있습니다.
// 1, 3, 5, 7, 8, 10, 12 : 31 		
// 2 : 28		
// 4, 6, 9, 11 : 30
/*		
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int num = 1;
		num = scan.nextInt();
				
		switch(num) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(num+"월은 31일까지 입니다.");
			break;	
		case 2:
			System.out.println(num+"월은 28일까지 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(num+"월은 30일까지 입니다.");
			break;
		default: //else
			System.out.println("없는 월입니다.");
		}
		
*/
/*		
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int num = 1;
		num = scan.nextInt();
				
		switch(num) {
		case 1:
			System.out.println("1월은 31일까지 입니다.");
			break;
		case 2:
			System.out.println("2월은281일까지 입니다.");
			break;
		case 3:
			System.out.println("3월은 31일까지 입니다.");
			break;
		case 4:
			System.out.println("4월은 30일까지 입니다.");
			break;
		case 5:
			System.out.println("5월은 31일까지 입니다.");
			break;
		case 6:
			System.out.println("6월은 30일까지 입니다.");
			break;
		case 7:
			System.out.println("7월은 31일까지 입니다.");
			break;
		case 8:
			System.out.println("8월은 31일까지 입니다.");
			break;
		case 9:
			System.out.println("9월은 30일까지 입니다.");
			break;
		case 10:
			System.out.println("10월은 31일까지 입니다.");
			break;
		case 11:
			System.out.println("11월은 30일까지 입니다.");
			break;
		case 12:
			System.out.println("12월은 31일까지 입니다.");
			break;	
		default: //else
			System.out.println("없는 월입니다.");
		}
*/		
		
		
		char ch = 'A'; //65는 안된다 그러나, 6은 문자로 인식한다
		switch(ch) {
		case 'A':
			System.out.println("A입니다.");
			break;
		default:
			System.out.println("A가 아닙니다.");
		}
		
		
		
		
	}

}
