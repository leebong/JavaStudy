package day7;
	
class Calculator{
	//�������
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
		this.setNum1(num1); //this �������� (����? this. �������� �߱⶧���� ��Ÿ�� ���ϼ� �ִ�)
		this.setNum2(num2);
		this.setOperator(operator);
			
	}
	
	//������
	public Calculator() {} //default ������ �ʼ�
	
	public Calculator(double num1, double num2, char operator) {
		setCalc(num1, num2, operator);
		
	}
	
	//����
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
