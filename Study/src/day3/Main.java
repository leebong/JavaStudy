package day3;

import java.util.Scanner;

public class Main {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���1
/*		int i = 0;
		int j = 0;
		int k = 0;
		
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				k=i*j;
				System.out.println(i+"*"+j+"="+k);
			}		
		}
*/
/*
		//���2
		int i = 0;
		int j = 0;
		
		for(i=2;i<=9;i++) {
				System.out.println(i+"��");
			for(j=1;j<=9;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}		
		}
*/		
		// Do While ��
		// ���1
/*
		int sum = 0;
		int i = 1;
		do {
			sum += 1;
			i++;
		}while(i>2);
		System.out.println("sum"+sum);
		System.out.println(i);
		
		//���2
		i = 1;
		sum = 0;
		while(i > 2) {
			sum += i;
			i++;
		}
		System.out.println("sum"+sum);
		System.out.println(i);
*/		

/*
		int manu = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("�л���������");
			System.out.println("�޴�");
			System.out.println("1. �л������Է�");
			System.out.println("2. �л��������");
			System.out.println("3. �л���������");
			System.out.println("4. ���α׷�����");
			System.out.println("�޴��� �����ϼ���");
			manu = scan.nextInt();
			System.out.println(manu + "�� ���õǾ����ϴ�.");
			
		}while(manu != 4);
		scan.close();
		
*/

		
/*		
		// \n : enter -> ���� 
		// \t : tab  -> tab���� �� a ǥ��
		// \n : ������  -> �����ٿ� b ǥ��
		// \n : ������  -> �����ٿ� c ǥ��
		// next() : ���ڸ� ǥ�����ش�
		// nextLine() : ������� ǥ�����ش�
		// hasNext() : �����ٿ� ���ڱ� �ִ��� true / false ���´�
		
		Scanner scan = new Scanner("\n\ta\nb\nc"+ "abcd\n");
		
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
			
		}
		scan.close();
		
*/		
		
		// �ڷ��� [] �迭�̸� = new �ڷ��� [�迭�� ����] {�迭������ŭ �ʱ�ȭ};
		// int[] arr = new arr[3] {1, 2, 3}; �ʱ�ȭ ���� �ֱ�
		// int[] arr = new arr[] {1, 2, 3}; �迭�� �ʱ�ȭ�� ����� Ȯ���� �� �ִ�
		// int[] numArr = new int[9]; // �⺻ 0 ���� �ʱ�ȭ
		// char[] numArr = new char[9]
		// 9�� �迭�� -> "0" ~ "8" ���� ���

/*		
		int[] arr = new int[9];
		
		for(int i = 0; i<9; i++) {
			arr[i] = i;
			System.out.println(i+"���� : "+arr[i]);
		}
		


		// int[] arr = new int[9]; // 0 ~ 8����
		int[] arr1 = new int[9];			
		// for(int i = 0 ; i<9 ; i++) {
		for(int i = 0 ; i<arr1.length ; i++) {
			
		// arr[i] = 2*(i+1);
		arr1[i] = 2*(i+1);	
			// System.out.println(i+"���� : "+arr[i]);
			System.out.println(i+"���� : "+arr1[i]);
		}
			
*/
		
/*		
		//5�� �л��� ������� �����ϱ� ���� �迭�� ����� �ش��ϴ� �迭��
		//������ �Է��ϰ� �Է¹��� ������ ����ϼ���.
		//�迭����
		/*
		int[] score = new int[5];
		Scanner scan = new Scanner(System.in);
		//�����Է�
		int i=0;

		while(i<score.length) {
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = scan.nextInt();
			i++;
		}
		//�������
		i = 0;
		while(i<score.length) {
			System.out.println(i+1+"�� �л� ���� : "+score[i]);
			i++;
		}
		scan.close();
*/		

		
/*		
		int[] score = new int[5];
		Scanner scan = new Scanner(System.in);
		//�����Է�
		int i=0;
		for(;i<score.length;i++) {
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = scan.nextInt();
			
			
		}
		//�������
		for(i=0;i<score.length;i++) {
			System.out.println(i+1+"�� �л� ���� : "+score[i]);
			
		}
		//�л����
		int j = 0;
		for(i=0;i<score.length;i++) {
			j += score[i];
		}
		double avr = (double)j/score.length;
		System.out.println("�л� ���� : "+ j);
		System.out.println("�л� ��� : "+ avr);
		scan.close();
		
*/

/*
		//�߱�����
		//1. ������ ���� �����Ͽ� �迭�� �����Ѵ�
		//1.1 ������ ���� �����ϱ� ���� �ߺ����θ� Ȯ���Ѵ�.
		
		// Math.random()*9 ; // 0*9+1<=  <1*9+1 --> 0 ���� 8���� �������� ����
		//Math.random()�� 0 <= 1������ ���̴� �׷��Ƿ� 0.1 int 0 �̴�
		
		int cnt = 0;
		int[] arr = new int[3];
		//ù ���� ��
		arr[0]=(int)(Math.random()*9)+1;
		//�ι�° ��
		//ù ���� ���� �ߺ� ���θ� �˻�
		while(true) {
			arr[1]=(int)(Math.random()*9)+1;
			if(arr[0] != arr[1])
				break;
			}		
		
		
		//�� ���� ��
		//ù ��° ���� �� ��° ���� �ߺ� ���θ� �˻�
		while(true){
			arr[2]=(int)(Math.random()*9)+1;
			if(arr[0] != arr[2] && arr[1] != arr[2]);
				break;
		}
		//���

		while(cnt < 3) {			
			System.out.print(arr[cnt]+" ");
			cnt++;
		}
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		
		while(true) {    //���ѷ���	
		//���� 3�� �Է��� �޾� �迭�� ����
			for(int i=0;i<3;i++)
				input[i] = scan.nextInt();
			for(int i=0;i<3;i++)
					System.out.print(input[i] + " ");
			
			
					
		//��Ʈ����ũ �Ǻ�
			int strike = 0;
			for(int i = 0; i<3 ;i++) {
				if(arr[i] == input[i])
					strike++;				
			}		
		//�� �Ǻ�
			//�⺻
			int ball = 0;
			
			if(arr[0] == input[1] || arr[0] == input[2])
				ball++;
			if(arr[1] == input[0] || arr[1] == input[2])
				ball++;	
			if(arr[1] == input[0] || arr[2] == input[1])
				ball++;
		//���
			//i�� �������� ������ ������ ������ �����ϱ� ����
			//j�� ���� �Է��� ���� ������ �����ϱ� ����
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j) //���� ���� �����̸� ���� �ʿ� ����
						continue;
					if(arr[i] == input[j])
						ball++;
				}
			}	

		//3�ƿ����� �Ǻ�
			if(strike == 0 && ball == 0)
				System.out.println("30");
			if(strike != 0)
				System.out.print(strike+"S");
			if(ball != 0)
				System.out.print(ball+"B");
			if(strike == 3) {
				System.out.println("�����Դϴ�.");
				break;
				
			}
		}
		scan.close();

		
*/
/*
		int[] input = new int[3];
		int[] ans = new int[3];
		int i = 0;
		int j = 0;
		int strike = 0;
		int ball = 0;
		
		for(i=0;i<3;) {
			//j�� i���� �տ� ������ ���� ����
			ans[i] = (int)(Math.random()*9)+1;
			for(j=0;j<i;j++) {
				if(ans[i] == ans[j]);
				break;
			}
			if(j==i)
				i++;			
		}
		//Strike
		for(i = 0;i<3;i++) {
			if(ans[i] == input[i])
				strike++;
		}
		//ball
		for(j=0;j<3;j++) {
			if(i == j)
				continue;
			if(ans[i] == input[j])
				ball++;
		}
		
*/		
		
		
/*		
		int[] arr = {1, 2, 3};
		/* ���� for��, for-each��
		 * 1. �迭�� ���� �о ��븸 �� ��
		 *    => �迭�� ���� �������� ���� ��
		 * 2. ��� �迭�� ���� ���������� ������
		 */

/*		for(int i : arr)
			System.out.println(i);
		//��
		for(int j=0;j<arr.length;j++) {
			int i = arr[j];
			System.out.println(i);
		}

*/
		
		//���赵 ->  Ŭ����
		//��ǰ    ->  ��ü
		//����    ->  �޼���
/*		
	public static void main(String[] args) {
		int num = sum(1,2);
		System.out.println(sum(1,2));
	}
*/
	/* public(����) : ���������� �� �ϳ� ������ ���ٰ���
	 * private, protected : ���� ������ ����� ���ٰ���
	 * ����Ÿ�� �޼ҵ� ��(�Ű�������){
	 * }
	 */
	 /* ���Ǳ� ��
	  * �Ű�����(�ڷ���, ��ü) : ��, ���õ� �޴� ?�ʿ������ �Ƚᵵ �ȴ�
	  * ����Ÿ��(�ڷ��� , ��ü) : ����� ?�ݵ�� ��� �Ѵ�
	  * void : ����Ÿ�Կ��� �ƹ��͵� ������ �ʿ䰡 ���� ��
	  * ���� : ������� ����
	  */
	//�Ű����� a�� b�� ���� ��ȯ�ϴ� �޼ҵ�(c = �Լ�)

	
	public static int sum(int a, int b) {
		return a+b;
	
	}
/*	
	public static void main(String[] args) {
		if(isEvenNumber(10))
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
	}
	
*/	
	public static boolean isEvenNumber(int num) {
		if(num%2 ==0)
			return true;
		else
			return false;
	}
		

	
	/*
	 * ��������� �ϴ� ���� ���α׷��� �޼ҵ� ������ ���� �����ϼ���.
	 */

	public static void main(String[] args) {
		calc();
		
		
	}
	
	//}
	
	public static void calc() {
		int num1 = 0;
		int num2 = 0;
		char op = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		num2 = scan.nextInt();
		System.out.print("������ �Է� : ");
		op = scan.next().charAt(0);		
		System.out.println();
		
		double res = 0;
		
		switch (op) {
			case '+' :
				res = num1 + num2;
				System.out.println(""+ num1 + op + num2 + "=" + res);
				break;
			case '-' :
				res = num1 - num2;
				break;
			case '*' :
				res = num1 * num2;
				break;
			case '/' :
				res = (double)num1 / num2;
				break;
			case '%' :
				res = num1 % num2;
				break;
			default :
				System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�");	
		}
		scan.close();
	}

}
	
				
	
	

