package day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		Scanner scan = new Scanner(System.in);				
		int num = 1;
		System.out.print("�����͸� �Է��ϼ��� : ");
		num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("�Ǽ��Դϴ�.");
		}
*/
		//System.out.println("Hellow World");

		
/*		
//¦������ Ȧ�������� if ~ else���� Switch case������ ���� �ۼ��� ������
		
		Scanner scan = new Scanner(System.in);
		
		int num = 10;

		System.out.println("�����͸� �Է��ϼ��� : ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
				System.out.println("¦���Դϴ�.");
		}else{
				System.out.println("Ȧ���Դϴ�.");
		}
			
		switch(num % 2) {
			case 0 :
				System.out.println("¦���Դϴ�.");
				break;
			case 1 : 
				System.out.println("Ȧ���Դϴ�.");
				break;		
		}
*/		
		//3�׿�����
		//boolean even=(num%2==0)?true:false;

		
		
/*
//switch���� �̿��Ͽ� ���� ���(+, -, *, /, %) ������ �ϴ� ���α׷��� �ۼ��ϼ���.
					
		int num1 = 0;		
		int num2 = 0;
		char op;
		double res = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		num2 = scan.nextInt();
		System.out.print("������ �Է� : ");
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
				System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�");	
		
		}
		
*/		
		
/*		
//while�� ����

		���ǽĿ��� ����ϴ� ������ �ʱ�ȭ;
		while(���ǽ�){
			���๮;
			���ǽĿ��� ����ϴ� ������ ��������;
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
		//for�� ����
				
				for(1.�ʱ�ȭ;2.���ǽ�;4.7��������){ //for���� �ʱ�ȭ �ѹ��� �Ѵ�
					3.6���๮;				
				}
				
		
		int i = 0;
		int s = 0;
		
		//for(i=1;i<=100;i++) {
		for(;i<=100;) {
			s=s+i;
			i++;
		}
			System.out.println("1���� 100������ �� = "+s);
		
*/
		
/*
 * 1���� 100������ ¦���� ���� ���ϼ���.
 
		int i = 0;
		int s = 0;
		
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				s=s+i;
			}
		}
			System.out.println("1���� 100������ �� = "+s);
		
*/		
		
/*
	* 1���� 50������ ���� ���� �� ����� 2��
		 
				int i = 1;
				int s = 0;
				
				for(i=1;i<=100/2;i++) {
					
						s += i*2;
					
				}
					System.out.println("1���� 100������ �� = "+s);
		
*/		

		
		
/*
		// continue�� �̿��� ¦���� ��
		 
		int i = 1;
		int s = 0;
		
		for(i=1;i<=100;i++) {
			if(i%2 == 1)
				continue; //�Ʒ� ���๮(s+=i)�� skip�ϰ� �� ��������(i++)���� ����
				s += i;
				
		}
			System.out.println("1���� 100������ �� = "+s);
		
*/		

/*
		//while������ continue ���
		int i = 1;
		int s = 0;
		
		while(i<=100) {
			if(i%2 == 1) {
				i++;
				continue; //�Ʒ� ���๮(s+=i)�� skip�ϰ� �� ��������(i++)���� ����		
			}
			s += i;
			i++;
		}
			System.out.println("1���� 100������ �� = "+s);	
*/
		
/*
        //������ �Ҽ����� �ƴ��� �Ǻ��ϼ���
		//�Ҽ� : ����� 1�� �ڱ��ڽŹۿ� ���� ��, ����� ������ 2���� ��
		//��� : ������ �������� ��
		
		//1) �ݺ�Ƚ���� num, 1 ~ num������ ���� �̿�
		//2) 1~num������ ���߿��� num�� ����� ã�´�(i�� num�� ����̴�)
		//3) num�� 1~num������ ���� �ϳ��� ���� �������� 0�� ��Ȳ�� ã�´�
		//4) ����� ã���� ����� ������ �ϳ� �߰��Ѵ�.
		//5) ����� ������ 2���̸� �Ҽ���� ���, �ƴϸ� �ռ������ ���
				
		int num=15;  //���� ���ϴ� ����
		int i = 0;   //�ݺ�Ƚ���� ���ؼ�
		int cnt = 0; //����� ������ �����ϴ� ����

		for(i=1;i<=num;i++) {   		//1)
			if(num%i==0) {      		//2)
				System.out.println(i);	
				cnt++;          		//3)				
			}			
		}
		System.out.println("����� ���� : "+cnt);
		if(cnt==2)               		//4)	
			System.out.println("�Ҽ�");
		else
			System.out.println("�ռ���");
		
*/		

/*		
		int num = 13;		//���� ���ϴ� ����
		int i = 0;			//�ݺ� Ƚ���� ���ؼ�
		int div = 1;;		//�ڱ��ڽ��� ������ ����� ���� ū���� �����ϴ� ����
		
		for(i=2;i<num;i++) {
			if(num%i == 0) {
				div=i; 		//���� ã�� ��� i�� �ڽ��� ������ ���� ū����
							//�����ϴ� ���� div�� ����
			}
		}
		System.out.println(div);
		if(div==1)	
			System.out.println("�Ҽ�");
		else
			System.out.println("�ռ���");
*/

		
		
/*		
		//�μ��� �ִ� ������� ���ϼ���.
		//������� �μ��� ����� �߿��� ���������� �ִ� ��
		//�ִ� ������� ����� �߿��� ���� ū��
		//12 : 1, 2, 3, 4, 6, 12
		//9 : 1, 2, 3, 8
		//����� : 1, 2, 4
		//�ִ� ����� : 4
		//�ݺ�Ƚ�� : 8(1 ~ 8)
		
		int num1 = 8;
		int num2 = 14;
		int i = 1;   //�ݺ������� ����� ����
		int gcd = 1; //�ִ������� ������ ����
		int min = 0; //�� ���� ���� ���� �����ϴ� ���� �ݺ�Ƚ���� �ǹ���
		
		//1) �� ���� ���� ���� min�� �����Ѵ�.
		//2) �ݺ����� 1���� min���� �ݺ��Ѵ�.
		//3) 1���� min���� �μ��� ������� ã�´�
		//3-1) nmu1�� i�� ���� ������(%)�� 0�̰�(&&),
		//     num2�� i�� ���� ������(%)�� 0�̸�(if) ������̴�
		//4) ã�� ������� gcd�� �����Ѵ�.
		//5) �ݺ����� ����Ǹ� ����� �ʴ� ����� gcd�� ��� �Ѵ�.	
		if(num1>num2)
			min = num2;
		else
			min = num1;
		//1�� ������ �ٸ� ǥ��(min = (num1>num2)?num2:num1;
		
		for(i=1;i<min;i++) {    //--> 2)
			if(num1 % i == 0 && num2 % i == 0) { //-->3-1)
				gcd=i;			
			}
		}
		System.out.println(num1+"��"+num2+"�� �ִ����� : "+gcd);	
		
*/

/*		
		//�μ��� �ּ� ������� ���Ͽ���
		//������� �μ��� ����� �߿� ���������� �ִ� ��
		//3�� ��� : 3, 6, 9, 12, 15, ...
		//4�� ��� : 4, 8, 12, 16, 20, ...
		//3�� 4�� ����� : 12, 24, 36, ...
		//�ּ� ����� : 12
		//���1 : 1,2,3,4,...24���������� ����ϸ鼭 Ȯ���Ͽ� �ð��� �������
		int num1 = 8;
		int num2 = 12;
		int i = 0;   //�ݺ������� ����� ����
		int l = 1;   //�ּҰ������ ������ ����
		
		for(i=1;i<=num1*num2;i++) { //1,2,3,4,5,6,7...,24
			if(i % num1 == 0 && i % num2 == 0) {
				l = i;
				break;	
				
			}
		}
		System.out.println(num1+"��"+num2+"�� �ּҰ���� : "+l);
		
		//���2 : 1,4,8,24 �ð��� ª������
		int num3 = 8;
		int num4 = 12;
		int j = 0;   //�ݺ������� ����� ����
		int g = 0;   //�ּҰ������ ������ ����
		
		for(j = num3;j<=num3*num4;j=j+num3) {  //8,16,24
			if(j%num4 == 0) {
				g = j;
				break;
			}
		}
		System.out.println(num1+"��"+num2+"�� �ּҰ���� : "+g);
		
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
 //������

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
		//���1
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
		
		//���2
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
		//���3-1
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
		//���3-2
		for(i=1;i<=4;i++) {
			for(j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//���3-3
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
		//���1
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j>=i)
				System.out.print("*");
				
			}
			System.out.println();
		}
		//���2
		for(i=1;i<=5;i++) {
			for(j=1;j<=6-i;j++)
				System.out.print("*");
			System.out.println();
		}
		//���3
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
