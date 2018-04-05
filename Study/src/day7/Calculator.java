package day7;
	
class Calculator{
	//멤버변수
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

	
	public void setCalc(double num1, double num2, char operator) {
		this.setNum1(num1); //this 생략가능 (이유? this. 변수명이 뜨기때문에 오타를 줄일수 있다)
		this.setNum2(num2);
		this.setOperator(operator);
			
	}
	
	//생성자
	public Calculator() {} //default 생성자 필수
	
	public Calculator(double num1, double num2, char operator) {
		setCalc(num1, num2, operator);
		
	}
	
	//연산
	public void sum() {
		result = num1 + num2;
	}
	public void sub() {
		result = num1 - num2;
	}
	public void mul() {
		result = num1 * num2;
	}
	public void mod() {
		result = num1 % num2;
	}
	public boolean div() {
		if(num2 == 0)
			return false;
		else{
			result = num1 / num2;
			return true;
		}
	}
	
	public boolean cal() {
		switch(operator) {
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
