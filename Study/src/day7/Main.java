package day7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° �� �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("������ �Է� : ");
		char op = scan.next().charAt(0);
		System.out.print("�� ��° �� �Է� : ");
		int num2 = scan.nextInt();
		
		Calculator c = new Calculator(num1, num2, op);
		
		if(c.cal())
			System.out.println("" + c.getNum1() +" "+ 
					c.getOperator() +" "+ c.getNum2() + " = "+ + c.getResult() );
		else
			System.out.println("����� �̻��� �ֽ��ϴ�.");
		scan.close();

	}
	

}
