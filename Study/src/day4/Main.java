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
		// �Ҽ����� �ƴ��� �޼��带 ȣ���Ͽ� Ȯ��
		int num = 22;
		if(isPrim(num))
			System.out.println(num+"�Ҽ��Դϴ�.");
		else
			System.out.println(num+"�Ҽ��� �ƴմϴ�.");
		*/
		
		/*
		//�ִ����� ���ϱ� �޼��带 �̿�Ȯ��
		int a = 16;
		int b = 12;
		int gcdNum = get_gcd(a, b); //get_gcd�޼��忡 a, b���� �־� ���� ���� ������
									//gcdNum�� �ִ´�
							
		System.out.println(a+"��"+b+"�� �ִ����� : "+gcdNum);	
		*/
		
		
		//�ּҰ���� : lcm
		//�ִ����� : gcd
		//�μ� :A, B
		
		
	//�迭 �޼��� ȣ��	
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
	
	//�迭�� ���� �޼���
	public static void printArr(int[] arr) {
		for(int i = 0; i <arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	public static int lcm(int a, int b) {
		return a + b / get_gcd(a, b); 
	}
	
	public static int get_gcd(int a, int b){
								
		    int max_div = 1;      //���� ū ������� ������ ����
		    int range = Math.min(a, b);//�� �� �� ���� �� ������ ����
		    for(int i=1; i<=range; i++)
		    { //i���� ������� ã�´�.
		        if( a % i == 0 && b % i == 0)
		        { // �� �� ����� ����� ���
		            max_div = i; //���� (i�� ���� �����ϹǷ�)
		        }
		    }
		    //System.out.println(max_div);
		    return max_div;
	}
	
	
	/*
	//�ִ����� ���ϱ�
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
	System.out.println(num1+"��"+num2+"�� �ִ����� : "+gcd);
	*/	
		
	/*
	//�Ҽ����ϱ�
	int num = 11;
	int i = 0;
	int cnt = 0;
	for(i=1;i<=num;i++) {
		if(num % i==0)
			cnt++;
	}
	if(cnt == 2)
		System.out.println("�Ҽ��Դϴ�.");
	else
		System.out.println("�Ҽ��� �ƴմϴ�.");
	*/	
		
	
	
	//�Ҽ����� �ƴ��� Ȯ�� �ϴ� �ڵ� �ۼ�
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
	
	
	
	
	
	
	//���� �޼���
	//alt + shift + j �Ʒ� parameter�� ���´� (�޼��忡 Ŀ���� ���� ������ �ּ����� ���´�)
	/**
	 * @param num1 ����1
	 * @param num2 ����2
	 * @param op ������(+, -, *, /, %)
	 * @return op �����ڿ� ���� ��� ���
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
		
	//���ϱ� �޼���
	public static double sum(double num1, double num2) {
		return num1 + num2;		
	}
	
	//���� �޼���
	public static double sub(double num1, double num2) {
		return num1 - num2;		
	}
	
	//���ϱ� �޼���
	public static double mul(double num1, double num2) {
		return num1 * num2;		
	}
	
	//������ �޼���
	public static double div(double num1, double num2) {
		return num1 / num2;		
	}
	
	//������ �޼���
	public static double mod(double num1, double num2) {
		return num1 % num2;		
	}

}
