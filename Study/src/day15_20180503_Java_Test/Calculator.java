package day15_20180503_Java_Test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자 입력: ");
		char op = scan.next().charAt(0);
		
		System.out.print("두번째수 입력 : ");
		int num2 = scan.nextInt();
		
		CalManager c = new CalManager(num1, num2, op);
		
		if(c.cal()) 
		{
			System.out.println("" + c.getNum1() +" "+ 
					c.getOperator() +" "+ c.getNum2() + " = "+ + c.getResult() );
		}
		else
		{	
			System.out.println("다른수를 넣으세요.");
		}
		scan.close();
	}
}

class CalManager
{
	
	private double num1;
	private double num2;
	private char operator;
	private double result;
	
	//getter and setter
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

	
	public void setCalc(double num1, double num2, char operator) 
	{
		this.setNum1(num1);
		this.setNum2(num2);
		this.setOperator(operator);
			
	}
	
	
	public CalManager() {}
	
	public CalManager(double num1, double num2, char operator) 
	{
		setCalc(num1, num2, operator);
	}
	
	
	public void sum() 
	{
		result = num1 + num2;
	}
	public void sub() 
	{
		result = num1 - num2;
	}
	public void mul() 
	{
		result = num1 * num2;
	}
	public void mod() 
	{
		result = num1 % num2;
	}
	public boolean div() 
	{
		if(num2 == 0)
			return false;
		else
		{
			result = num1 / num2;
			return true;
		}
	}
	
	public boolean cal() 
	{
		switch(operator) 
		{
			case '+':
				sum();
				break;
			case '-':
				sub();
				break;
			case '*':
				mul();
				break;
			case '/':
				if(div())
					return true;
				else return false;
			case '%':
				mod();
				break;	
		}
		return true;
	}
}

