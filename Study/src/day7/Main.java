package day7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("연산자 입력 : ");
		char op = scan.next().charAt(0);
		System.out.print("두 번째 수 입력 : ");
		int num2 = scan.nextInt();
		
		Calculator c = new Calculator(num1, num2, op);
		
		if(c.cal())
			System.out.println("" + c.getNum1() +" "+ 
					c.getOperator() +" "+ c.getNum2() + " = "+ + c.getResult() );
		else
			System.out.println("계산이 이상이 있습니다.");
		scan.close();

	}
	

}
