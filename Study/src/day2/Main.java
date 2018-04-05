package day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		Scanner scan = new Scanner(System.in);				
		int num = 1;
		System.out.print("데이터를 입력하세요 : ");
		num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("훌수입니다.");
		}
*/
		//System.out.println("Hellow World");

		
/*		
//짝수인지 홀수인지를 if ~ else문과 Switch case문으로 각각 작성해 보세요
		
		Scanner scan = new Scanner(System.in);
		
		int num = 10;

		System.out.println("데이터를 입력하세요 : ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
				System.out.println("짝수입니다.");
		}else{
				System.out.println("홀수입니다.");
		}
			
		switch(num % 2) {
			case 0 :
				System.out.println("짝수입니다.");
				break;
			case 1 : 
				System.out.println("홀수입니다.");
				break;		
		}
*/		
		//3항연산자
		//boolean even=(num%2==0)?true:false;

		
		
/*
//switch문을 이용하여 정수 산술(+, -, *, /, %) 연산을 하는 프로그램을 작성하세요.
					
		int num1 = 0;		
		int num2 = 0;
		char op;
		double res = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = scan.nextInt();
		System.out.print("연사자 입력 : ");
		op = scan.next().charAt(0);
		
				
		switch (op) {
			case '+' :
				res = num1 + num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			case '-' :
				res = num1 - num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			case '*' :
				res = num1 * num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			case '/' :
				res = num1 / num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			case '%' :
				res = num1 % num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			default :
				System.out.println("연산자를 잘못 입력하였습니다");	
		
		}
		
*/		
		
/*		
//while문 문법

		조건식에서 사용하는 변수를 초기화;
		while(조건식){
			실행문;
			조건식에서 사용하는 변수를 증감연산;
		}
		
*/
/*		
		int i = 1;
		int j = 100;
		int s = 0;
		
		while(i<=j) {
			s=s+i;
			i++;
			System.out.println(i+"="+s);
			
		}
*/	
/*		
		//for문 문법
				
				for(1.초기화;2.조건식;4.7증감연산){ //for문은 초기화 한번만 한다
					3.6실행문;				
				}
				
		
		int i = 0;
		int s = 0;
		
		//for(i=1;i<=100;i++) {
		for(;i<=100;) {
			s=s+i;
			i++;
		}
			System.out.println("1부터 100까지의 합 = "+s);
		
*/
		
/*
 * 1부터 100까지의 짝수의 합을 구하세요.
 
		int i = 0;
		int s = 0;
		
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				s=s+i;
			}
		}
			System.out.println("1부터 100까지의 합 = "+s);
		
*/		
		
/*
	* 1부터 50까지의 합을 구한 후 결과에 2배
		 
				int i = 1;
				int s = 0;
				
				for(i=1;i<=100/2;i++) {
					
						s += i*2;
					
				}
					System.out.println("1부터 100까지의 합 = "+s);
		
*/		

		
		
/*
		// continue를 이용한 짝수의 합
		 
		int i = 1;
		int s = 0;
		
		for(i=1;i<=100;i++) {
			if(i%2 == 1)
				continue; //아래 실행문(s+=i)을 skip하고 위 증감연산(i++)으로 간다
				s += i;
				
		}
			System.out.println("1부터 100까지의 합 = "+s);
		
*/		

/*
		//while문에서 continue 사용
		int i = 1;
		int s = 0;
		
		while(i<=100) {
			if(i%2 == 1) {
				i++;
				continue; //아래 실행문(s+=i)을 skip하고 위 증감연산(i++)으로 간다		
			}
			s += i;
			i++;
		}
			System.out.println("1부터 100까지의 합 = "+s);	
*/
		
/*
        //정수가 소수인지 아닌지 판별하세요
		//소소 : 약수가 1과 자기자신밖에 없는 수, 약수의 갯수가 2개인 수
		//약수 : 나누어 떨어지는 수
		
		//1) 반복횟수는 num, 1 ~ num사이의 수를 이용
		//2) 1~num사이의 수중에서 num의 약수를 찾는다(i는 num의 약수이다)
		//3) num을 1~num사이의 수로 하나씩 나누 나머지가 0인 상황을 찾는다
		//4) 약수를 찾으면 약수의 갯수를 하나 중가한다.
		//5) 약수의 갯수가 2개이면 소수라고 출력, 아니면 합성수라고 출력
				
		int num=15;  //내가 원하는 정수
		int i = 0;   //반복횟수를 위해서
		int cnt = 0; //약수의 갯수를 저장하는 변수

		for(i=1;i<=num;i++) {   		//1)
			if(num%i==0) {      		//2)
				System.out.println(i);	
				cnt++;          		//3)				
			}			
		}
		System.out.println("약수의 갯수 : "+cnt);
		if(cnt==2)               		//4)	
			System.out.println("소수");
		else
			System.out.println("합성수");
		
*/		

/*		
		int num = 13;		//내가 원하는 정수
		int i = 0;			//반복 횟수를 위해서
		int div = 1;;		//자기자신을 제외한 약수중 가장 큰수를 저장하는 변수
		
		for(i=2;i<num;i++) {
			if(num%i == 0) {
				div=i; 		//내가 찾은 약수 i를 자신을 제외한 가장 큰수를
							//저장하는 변수 div에 저장
			}
		}
		System.out.println(div);
		if(div==1)	
			System.out.println("소수");
		else
			System.out.println("합성수");
*/

		
		
/*		
		//두수의 최대 공약수를 구하세요.
		//공약수는 두수의 약수들 중에서 공통적으로 있는 수
		//최대 공약수는 공약수 중에서 가장 큰수
		//12 : 1, 2, 3, 4, 6, 12
		//9 : 1, 2, 3, 8
		//공약수 : 1, 2, 4
		//최대 공약수 : 4
		//반복횟수 : 8(1 ~ 8)
		
		int num1 = 8;
		int num2 = 14;
		int i = 1;   //반복문에서 사용할 변수
		int gcd = 1; //최대공약수를 저장할 변수
		int min = 0; //두 수중 작은 수를 저장하는 변수 반복횟수를 의미함
		
		//1) 두 수중 작은 수를 min에 저장한다.
		//2) 반복문을 1부터 min까지 반복한다.
		//3) 1부터 min까지 두수의 공약수를 찾는다
		//3-1) nmu1을 i로 나눈 나머지(%)가 0이고(&&),
		//     num2를 i로 나눈 나머지(%)가 0이면(if) 공약수이다
		//4) 찾은 공약수를 gcd에 저장한다.
		//5) 반복문이 종료되면 저장된 초대 공약수 gcd를 출력 한다.	
		if(num1>num2)
			min = num2;
		else
			min = num1;
		//1번 문자의 다른 표현(min = (num1>num2)?num2:num1;
		
		for(i=1;i<min;i++) {    //--> 2)
			if(num1 % i == 0 && num2 % i == 0) { //-->3-1)
				gcd=i;			
			}
		}
		System.out.println(num1+"과"+num2+"의 최대공약수 : "+gcd);	
		
*/

/*		
		//두수의 최소 공배수를 구하여라
		//공배수는 두수의 배수들 중에 공통적으로 있는 수
		//3의 배수 : 3, 6, 9, 12, 15, ...
		//4의 배수 : 4, 8, 12, 16, 20, ...
		//3과 4의 공배수 : 12, 24, 36, ...
		//최소 공배수 : 12
		//방법1 : 1,2,3,4,...24순차적으로 계산하면서 확인하여 시간상 길어진다
		int num1 = 8;
		int num2 = 12;
		int i = 0;   //반복문에서 사용할 변수
		int l = 1;   //최소공약수를 저장할 변수
		
		for(i=1;i<=num1*num2;i++) { //1,2,3,4,5,6,7...,24
			if(i % num1 == 0 && i % num2 == 0) {
				l = i;
				break;	
				
			}
		}
		System.out.println(num1+"과"+num2+"의 최소공배수 : "+l);
		
		//방법2 : 1,4,8,24 시간상 짧아진다
		int num3 = 8;
		int num4 = 12;
		int j = 0;   //반복문에서 사용할 변수
		int g = 0;   //최소공약수를 저장할 변수
		
		for(j = num3;j<=num3*num4;j=j+num3) {  //8,16,24
			if(j%num4 == 0) {
				g = j;
				break;
			}
		}
		System.out.println(num1+"과"+num2+"의 최소공배수 : "+g);
		
*/		

/*		
		int i;
		int j;
		
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
*/
/*
 //모양출력

 //* 		
 //**
 //***
 //****

		int i;
		int j;
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if(j<=i)
				System.out.print("*");
				
			}
			System.out.println();
		}
*/		
/*		
		 //   * 		
		 //  **
		 // ***
		 //****
		//방법1
		int i;
		int j;
		
		for(i=1;i<=4;i++) {
			
			for(j=1;j<=4-i;j++) {
					System.out.print(" ");	
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
		}
			System.out.println();
		}
		
		//방법2
		for(i=1;i<=4;i++) {		
			for(j=1;j<=4;j++) {
				
				if(j<=4-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
*/

/*
		 //   * 		
		 //  ***
		 // *****
		 //*******
		
		int i;
		int j;
		//방법3-1
		for(i=1;i<=4;i++) {		
			for(j=1;j<=4;j++) {
					if(j<=4-i) {
						System.out.print(" ");
				    }else {
				    	System.out.print("*");
				    }
			}
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			
		System.out.println();
		}
		//방법3-2
		for(i=1;i<=4;i++) {
			for(j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//방법3-3
		for(i=1;i<=4;i++) {
			for(j=1;j<=i+3;j++) {
				if(j<=4-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

		
*/		
		//*****  i=1, *=5=6-i
		//****   i=2, *=4=6-i
		//***    i=3, *=3=6-i
		//**     i=4, *=2=6-i
		//*      i=5, *=1=6-i 
		int i;
		int j;
		//방법1
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j>=i)
				System.out.print("*");
				
			}
			System.out.println();
		}
		//방법2
		for(i=1;i<=5;i++) {
			for(j=1;j<=6-i;j++)
				System.out.print("*");
			System.out.println();
		}
		//방법3
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
