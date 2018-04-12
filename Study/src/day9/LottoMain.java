package day9;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/**
		 * 1.   정수열 배열 생성
		 * 1-1. 당첨번호 배열 생성(7개짜리)
		 * 1-2. 생성번호 배열 생성(6개짜리)
		 * 2.   Lotto클래스 객체 lotto생성
		 * 3.   배열에 랜덤한 값을 이용한 초기화
		 * 3-1. 당첨번호 배열에 createLottoArr()를 이용하여 초기화
		 * 3-2. 생성번호 배열에 createLottoArr()를 이용하여 초기화
		 * 4.   등수 확인
		 * 4-1. rank()를 이용하여 당첨 결과를 변수에 저장
		 * 4-2. 변수에 저장 된 등수를 콘솔에 출력
		 */
		
		int[] win = new int[7];
		int[] arr = new int[6];
		lotto l = new lotto();
		
		/*char isContinue = 'y';
		Scanner scan = new Scanner(System.in);
		while(isContinue == 'y' || isContinue == 'Y'){*/
		int cnt = 0;
		while(cnt < 10000000)
		{
	
			try {
				l.createLottoArr(win, 1, 45);
				l.createLottoArr(arr, 1, 45);
						
				int rank = l.rank(win, arr);
				if(rank == 1) {
					l.printArr(arr);
					l.printArr(win);
					System.out.println(rank+"등");
				}
					
				
			}
			catch(Exception e) {
				//System.out.println(e.getMessage());
				
			}
			//System.out.println("더 하시겠습니까?(y/n) : ");
			//isContinue = scan.next().charAt(10);
			cnt++;
		}
	}

}
