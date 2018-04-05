package day5;

public class Lotto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[6]; //�ڵ�������ȣ
		int[] ans = new int[6]; //��÷��ȣ
		int bonus = 0; //���ʽ� ��ȣ
		int min = 1; // ��ȣ : 1
		int max = 45; // ��ȣ : 45
		createAnswerArr(ans, min, max); //������ ��÷
		
		
		do {
			bonus = randomInt(min,max);
		}while(isDuplicated(ans,bonus));
		
		// ��÷��ȣ Ȯ���ϴ� �κ�
		for(int i =0; i<ans.length;i++) {			
			System.out.print(ans[i]+" ");
		}			
		System.out.println(bonus);
		System.out.println();
		
		int cnt = 0;
		while(cnt < 100)
		{
			createAnswerArr(input, min, max); //������ �ڵ�
			// �ڵ���ȣ Ȯ���ϴ� �κ�	
			for(int i=0;i<input.length;i++) {
				System.out.print(input[i] + " ");
			}
			System.out.println();
			int strike = 0;
			int ball = 0;
			strike = strikeCnt(ans, input);
			ball = ballCnt(ans, input);
			int rank = strike + ball;
			
			if(rank == 6)
				System.out.println(1);
			else if(rank == 5 && isDuplicated(input, bonus)) {
				System.out.println(2);
			}else if(rank == 5) {
				System.out.println(3);
			}else if(rank == 4) {
				System.out.println(4);
			}else if(rank == 3) {
				System.out.println(5);
			}
			else
				System.out.println("��");
			cnt++;
		}
	
	}
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
				if(arr[i] == num)
					return true;
			}
			return false;
		}
		
		
		public static void createAnswerArr(int[] ans, int min, int max) {
			for(int i=0;i<ans.length;) {			
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
			for(int i = 0; i<ans.length ;i++) {
				if(ans[i] == input[i])
					strike++;
			}
			return strike;
		}
		
		//�� Ȯ��
		public static int ballCnt(int[] ans, int[] input) {
			int ball = 0;
			for(int i=0;i<ans.length;i++) {
				for(int j=0;j<input.length;j++) {
					if(i==j)
						continue;
					if(ans[i] == input[j])
						ball++;
				}
			}
			return ball;
		}
		

}
