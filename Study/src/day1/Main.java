package day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ÿ��(�ڷ���)������
//		int phoneNumber = 34317755;
//		long number2 = 821034317755L;
//		float number3 = 3.14F;
//		double number4 = 3.140;
//		char ch = 'A';
//		boolean bool = true; //false �Է°��� ��°� ����

//		System.out.println(phoneNumber);
//		//�������� ���� ����� ���ڿ��� ���
//		System.out.println(number2+phoneNumber);
//		//�������� ���ڿ��� ����� �̾� �ٿ��� ���
//		System.out.println(""+number2+phoneNumber);
//		System.out.println(number2+phoneNumber+"");
//		System.out.println(number3);
//		System.out.println(number4);
//		System.out.println(ch);
//		System.out.println(bool);		
				
//		int num1 = 12;    //10���� 12
//		int num2 = 012;	  //8���� 2 = 8 + 2 = 10
//		int num3 = 0x12;  //16���� 12 = 16 + 2 = 18

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
//		System.out.println("�Ǽ� ���� �� : " + num2);
//		System.out.println("�Ǽ� ���� �� ����ȯ ��� : " + num2);
	
		
//		int num = 10;
//		int num1 = 10;
//		int num2 = 20;
//		double res = (double)num1/num2; //����ȯ�� ���Ͽ� 0.5 �Ǽ����� ����� �ش�

		
//		boolean tmp = 10 > 20;
//		System.out.println(tmp);

//		int num = 10;
//		boolean tmp = (num < 20) && (num < 10);
//		System.out.println(tmp);

//		int num = 10; // && AND���� 
//		boolean tmp = (num < 20) && (5 < num);
//		
//		System.out.println(num + "�� 20���� �۰�" + "5���� ũ��?");
//		System.out.println(tmp);
//		
//		int num2 = 30; // || OR���� 
//		boolean tmp2 = (num2 > 20) || (num2 < 5);
//		
//		System.out.println(num2 + "�� 20���� �۰�" + "5���� ũ��?");
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

//		//��ȣ������
//		int num = -10;
//		System.out.println(num);
//		System.out.println(-num);
		
//		//���������� : ������(++num), ������(num++)
//		int num = 10;
//		int tmp = 0;
//		
//		System.out.println(num);
//		tmp = ++num;
//		//num = num + 1; //����ǥ�� num +=1
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
//		//num�� 2�� ���� �������� 0�� ����
//		if(num % 2 == 0 )
//		{
//			System.out.println("¦���Դϴ�.");
//		}
//		else
//		{
//			System.out.println("Ȧ���Դϴ�.");
//		}
		
//		//2�� ������� 3�� ���, 6�� ������� Ȯ���ϴ� ����
//		int num = 10;
//		
//		if(num % 6 == 0)
//		{
//			System.out.println("6�� ����Դϴ�.");
//		}
//		else if(num % 2 == 0)
//		{
//			System.out.println("2�� ����Դϴ�.");
//		}
//		else if(num % 3 == 0)
//		{
//			System.out.println("3�� ����Դϴ�.");
//		}
//		else
//		{
//			System.out.println("2, 3, 6�� ����� �ƴմϴ�.");
//		}
//		
		
		// ���ǹ��� �̿��Ͽ� �л� ������ ���� ������ ����ϼ���.
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
//			System.out.println("���� = F");
//		}
//		else if(69 >= num)
//		{
//			System.out.println("���� = D");
//		}
//		else if(79 >= num)
//		{
//			System.out.println("���� = C");
//		}
//		else if(89 >= num)
//		{
//			System.out.println("���� = B");
//		}
//		else if(90 >= num)
//		{
//			System.out.println("���� = A");
//		}
//		

		
//		// ���ǹ��� �̿��Ͽ� �л� ������ ���� ������ ����ϼ���.
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
//			System.out.println("���� = A");
//		}
//		else if(score <= 89 && score >= 80)
//		{
//			System.out.println("���� = B");
//		}
//		else if(score <= 79 && score >= 70)
//		{
//			System.out.println("���� = C");
//		}
//		else if(score <=69 && score >= 60)
//		{
//			System.out.println("���� = D");
//		}
//		else if(score < 59 && score >= 0)
//		{
//			System.out.println("���� = F");
//		}
//		else
//		{
//			System.out.println("0 ~ 100������ ������ �Է��ϼ���.");
//		}
	
		
		//���� ���ǹ� (0�� ����ó��, 2,3�� ����� �ɼ� �ִ�)
		
/*		Scanner scan = new Scanner(System.in);
		
		int num = 10;
		System.out.print("������ �Է��ϼ���:");
		num = scan.nextInt();
		//num = (int)scan.nextDouble(); //�Ǽ����� ���Ͽ� (int)����ȯ�� ��������Ѵ�.
		System.out.print("�Ǽ��� �Է��ϼ���:");
		double num2 = scan.nextDouble();
		System.out.println(num2);
		
		if(num == 0) {
			System.out.println("0�Դϴ�.");
		}else if(num % 2 == 0) {
			if(num % 3 == 0) 
				System.out.println("6�� ���");
			else
				System.out.println("2�� ���");
		}
		else if(num % 3 == 0) {
			System.out.println("3�� ���");
		}
		else
			System.out.println("2,3,6�� ����� �ƴ�"); */
//		
//		
		
//		//3�׿�����
//		int num = 10;
//		boolean even = (num%2==0)?true:false;
//		System.out.println(even);
		
/*
		// Switch Case��
		int num = 1;
		switch(������ or Ư������ ������ ��) {
		case ������1:
			���๮;
			break;
		case ������2:
			���๮;
			break;
		case ������3:
			���๮;
			break;
		}
*/

/*	Scanner scan = new Scanner(System.in);
		System.out.print("�Է°��� �������� :");
		int num = 1;
		num = scan.nextInt();
				
		switch(num) {
		case 1: //if(num == 1)
			System.out.println("1�Դϴ�.");
			break;
		case 2: //if(num == 1)
			System.out.println("2�Դϴ�.");
			break;
		default: //else
			System.out.println("1�� 2�� �ƴմϴ�.");
		}
*/		

/*
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է°��� �������� : ");
		int num = 1;
		num = scan.nextInt();
				
		switch(num%2) {
		case 0: //if(num == 1)
			System.out.println("¦���Դϴ�.");
			break;
		case 1: //if(num == 1)
			System.out.println("Ȧ���Դϴ�.");
			break;
		default: //else
			System.out.println("�̷����� ����");
		}
*/
		
// ������ �Է¹޾� �ش��ϴ� ������ �޿� �ش��ϴ� ������ ���� ��� �ϼ���.
// ��) ���� �Է��ϼ��� : 2
//    2���� 28�ϱ��� �ֽ��ϴ�.
// 1, 3, 5, 7, 8, 10, 12 : 31 		
// 2 : 28		
// 4, 6, 9, 11 : 30
/*		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = 1;
		num = scan.nextInt();
				
		switch(num) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(num+"���� 31�ϱ��� �Դϴ�.");
			break;	
		case 2:
			System.out.println(num+"���� 28�ϱ��� �Դϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(num+"���� 30�ϱ��� �Դϴ�.");
			break;
		default: //else
			System.out.println("���� ���Դϴ�.");
		}
		
*/
/*		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = 1;
		num = scan.nextInt();
				
		switch(num) {
		case 1:
			System.out.println("1���� 31�ϱ��� �Դϴ�.");
			break;
		case 2:
			System.out.println("2����281�ϱ��� �Դϴ�.");
			break;
		case 3:
			System.out.println("3���� 31�ϱ��� �Դϴ�.");
			break;
		case 4:
			System.out.println("4���� 30�ϱ��� �Դϴ�.");
			break;
		case 5:
			System.out.println("5���� 31�ϱ��� �Դϴ�.");
			break;
		case 6:
			System.out.println("6���� 30�ϱ��� �Դϴ�.");
			break;
		case 7:
			System.out.println("7���� 31�ϱ��� �Դϴ�.");
			break;
		case 8:
			System.out.println("8���� 31�ϱ��� �Դϴ�.");
			break;
		case 9:
			System.out.println("9���� 30�ϱ��� �Դϴ�.");
			break;
		case 10:
			System.out.println("10���� 31�ϱ��� �Դϴ�.");
			break;
		case 11:
			System.out.println("11���� 30�ϱ��� �Դϴ�.");
			break;
		case 12:
			System.out.println("12���� 31�ϱ��� �Դϴ�.");
			break;	
		default: //else
			System.out.println("���� ���Դϴ�.");
		}
*/		
		
		
		char ch = 'A'; //65�� �ȵȴ� �׷���, 6�� ���ڷ� �ν��Ѵ�
		switch(ch) {
		case 'A':
			System.out.println("A�Դϴ�.");
			break;
		default:
			System.out.println("A�� �ƴմϴ�.");
		}
		
		
		
		
	}

}
