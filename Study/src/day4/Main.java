package day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int num1 = 10;
		int num2 = 5;
		char op = '/';
		double res = 0.0;
		
		res = cal(num1, num2, op);
		System.out.println(""+ num1 + op + num2 + "=" + res);
		*/
				
		
		/*
		// 소수인지 아닌지 메서드를 호출하여 확인
		int num = 22;
		if(isPrim(num))
			System.out.println(num+"소수입니다.");
		else
			System.out.println(num+"소수가 아닙니다.");
		*/
		
		/*
		//최대공약수 구하기 메서드를 이용확인
		int a = 16;
		int b = 12;
		int gcdNum = get_gcd(a, b); //get_gcd메서드에 a, b값을 넣어 구한 값을 가져와
									//gcdNum에 넣는다
							
		System.out.println(a+"와"+b+"의 최대공배수 : "+gcdNum);	
		*/
		
		
		//최소공배수 : lcm
		//최대공약수 : gcd
		//두수 :A, B
		
		
	//배열 메서드 호출	
		//int[] arr = new int[10];
		//printArr(arr);
		//setArr(arr);
		//printArr(arr);
		
	/*	int	num = 20;
		System.out.println(num);
		setNum(num);
		System.out.println(num);
	*/	
		
		
		
	
				
		
		
		
		
}	
	
	
	
	
	
	
	public static void setNum(int num) {
		num = 10;
	}
	
	
	public static void setArr(int[] arr) {
		for(int i = 0; i <arr.length;i++)
			arr[i] = i+1;
	}
	
	//배열에 대한 메서드
	public static void printArr(int[] arr) {
		for(int i = 0; i <arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	public static int lcm(int a, int b) {
		return a + b / get_gcd(a, b); 
	}
	
	public static int get_gcd(int a, int b){
								
		    int max_div = 1;      //가장 큰 공약수를 저장할 변수
		    int range = Math.min(a, b);//두 수 중 작은 값 까지만 조사
		    for(int i=1; i<=range; i++)
		    { //i부터 공약수를 찾는다.
		        if( a % i == 0 && b % i == 0)
		        { // 두 수 모두의 약수일 경우
		            max_div = i; //갱신 (i는 점점 증가하므로)
		        }
		    }
		    //System.out.println(max_div);
		    return max_div;
	}
	
	
	/*
	//최대공약수 구하기
	int num1 = 8;
	int num2 = 14;
	int i = 1;
	int gcd = 1;
	int min = 0;
	
	if(num1>num2)
		min = num2;
	else
		min = num1;	
	for(i=1;i<min;i++) {    //--> 2)
		if(num1 % i == 0 && num2 % i == 0) { //-->3-1)
			gcd=i;			
		}
	}
	System.out.println(num1+"과"+num2+"의 최대공약수 : "+gcd);
	*/	
		
	/*
	//소수구하기
	int num = 11;
	int i = 0;
	int cnt = 0;
	for(i=1;i<=num;i++) {
		if(num % i==0)
			cnt++;
	}
	if(cnt == 2)
		System.out.println("소수입니다.");
	else
		System.out.println("소수가 아닙니다.");
	*/	
		
	
	
	//소수인지 아닌지 확인 하는 코드 작성
	public static boolean isPrim(int num) {
		int i = 0;
		int cnt = 0;
		for(i=1;i<=num;i++) {
			if(num % i==0)
				cnt++;
		}
		if(cnt == 2)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	//계산기 메서드
	//alt + shift + j 아래 parameter가 나온다 (메서드에 커서를 같다 놓으면 주석문이 나온다)
	/**
	 * @param num1 숫자1
	 * @param num2 숫자2
	 * @param op 연산자(+, -, *, /, %)
	 * @return op 연산자에 따른 결과 계산
	 */
	public static double cal(double num1, double num2, char op) {
		switch (op) {
			case '+' :
				return sum(num1, num2);						
			case '-' :
				return sub(num1, num2);				
			case '*' :
				return mul(num1, num2);				
			case '/' :
				return div(num1, num2);				
			case '%' :
				return mod(num1, num2);				
			default :
				return 0.0;
		}
	}
		
	//더하기 메서드
	public static double sum(double num1, double num2) {
		return num1 + num2;		
	}
	
	//빼기 메서드
	public static double sub(double num1, double num2) {
		return num1 - num2;		
	}
	
	//곱하기 메서드
	public static double mul(double num1, double num2) {
		return num1 * num2;		
	}
	
	//나누기 메서드
	public static double div(double num1, double num2) {
		return num1 / num2;		
	}
	
	//나머지 메서드
	public static double mod(double num1, double num2) {
		return num1 % num2;		
	}

}
