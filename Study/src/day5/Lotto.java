package day5;

public class Lotto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[6]; //자동생성번호
		int[] ans = new int[6]; //당첨번호
		int bonus = 0; //보너스 번호
		int min = 1; // 번호 : 1
		int max = 45; // 번호 : 45
		createAnswerArr(ans, min, max); //생성된 당첨
		
		
		do {
			bonus = randomInt(min,max);
		}while(isDuplicated(ans,bonus));
		
		// 당첨번호 확인하는 부분
		for(int i =0; i<ans.length;i++) {			
			System.out.print(ans[i]+" ");
		}			
		System.out.println(bonus);
		System.out.println();
		
		int cnt = 0;
		while(cnt < 100)
		{
			createAnswerArr(input, min, max); //생성된 자동
			// 자동번호 확인하는 부분	
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
				System.out.println("꽝");
			cnt++;
		}
	
	}
		//랜덤한 수 생성
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
		
		//스트라이크 확인
		public static int strikeCnt(int[] ans, int[] input ) {
			int strike = 0;
			for(int i = 0; i<ans.length ;i++) {
				if(ans[i] == input[i])
					strike++;
			}
			return strike;
		}
		
		//볼 확인
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
