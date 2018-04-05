package day4;

import java.util.Scanner;

public class BaseballGame {
	
	//������ �� ����
	public static int randomInt(int min, int max) {

		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	
	public static boolean isDuplicated(int[] arr, int num) {
		for(int i = 0; i <arr.length;i++) {
			if(arr[0] == num)
				return true;
		}
		return false;
	}
	
	
	public static void createAnswerArr(int[] ans, int min, int max) {
		for(int i=0;i<3;) {			
			int tmp = randomInt(min, max);
			if(!isDuplicated(ans,tmp)) {
				ans[i] = tmp;
				i++;
			}
		}				
	}
	
	//��Ʈ����ũ Ȯ��
	public static int strikeCnt(int[] ans, int[] input ) {
		int strike = 0;
		for(int i = 0; i<3 ;i++) {
			if(ans[i] == input[i])
				strike++;
		}
		return strike;
	}
	
	//�� Ȯ��
	public static int ballCnt(int[] ans, int[] input) {
		int ball = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j)
					continue;
				if(ans[i] == input[j])
					ball++;
			}
		}
		return ball;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int strike;
		int ball;
		
		int[] input = new int[3];
		int[] ans = new int[3];
		
		
		createAnswerArr(ans, 1, 9);
		strike = strikeCnt(ans, input);		
		ball = ballCnt(ans, input);

		//���

		for(int i =0; i<3;i++) {			
			System.out.print(ans[i]+" ");
			//i++;
		}
			
		System.out.println();
		
		Scanner scan = new Scanner(System.in);		
		while(true) {    //���ѷ���	
		//���� 3�� �Է��� �޾� �迭�� ����
			for(int i=0;i<3;i++)
				input[i] = scan.nextInt();
			for(int i=0;i<3;i++)
					System.out.print(input[i] + " ");
			
			
			
		//3�ƿ����� �Ǻ�
			if(strike == 0 && ball == 0)
				System.out.println("30");
			if(strike != 0)
				System.out.print(strike+"S");
			if(ball != 0)
				System.out.print(ball+"B");
			if(strike == 3)
				System.out.println("�����Դϴ�.");
				break;
		}
		
		
		//�� �Ǻ�
			//�⺻
			
							
		scan.close();		
				
		
	}
}
