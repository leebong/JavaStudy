package day9;

public interface LottoInterface {
	public boolean isDuplicated(int [] arr, int num, int size) throws Exception;
	public int randomUnsignedInteger(int min, int max) throws Exception;
	public void createLottoArr(int [] arr, int min, int max) throws Exception;
	public int rank(int [] win, int [] arr) throws Exception;
}

class lotto implements  LottoInterface{

	@Override
	public boolean isDuplicated(int[] arr, int num, int size) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		if(size < 0)
			throw new Exception("탐색할 갯수는 음수일 수 없음");
		if(size > arr.length)
			throw new Exception("탐색할 갯수는 배열의 크기보다" + "클수 없음");
		for(int i = 0; i < size; i++){
				if(arr[i] == num)
					return true;
			}
			return false;
	}

	@Override
	public int randomUnsignedInteger(int min, int max) throws Exception {
		// TODO 자동 생성된 메소드 스텁
			if(min < 0 || max < 0) throw new Exception("음수를 랜덤으로 생성할 수 없음");
			if(max < min){
				int tmp = min;
				min = max;
				max = tmp;
			}
			return (int)(Math.random()*(max-min+1))+min;
		
	}

	@Override
	public void createLottoArr(int[] arr, int min, int max) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		if(arr.length>Math.abs(max-min)) throw new Exception("랜덤 범위보다 배열의 크기가 큼");	
		for(int cnt = 0; cnt < arr.length;) {			
			int tmp = randomUnsignedInteger(min, max);
			if(!isDuplicated(arr,tmp,cnt)) {
				arr[cnt] = tmp;
				cnt++;
			}
		}
	}

	/**
	 * @param win
	 * @param arr
	 * @return 로또 당첨 등수
	 * 리턴 값에 따른 의미
	 * 1 : 1등, 2 : 2등, 3 : 3등, 4 : 4등, 5 : 5등, -1 : 꽝
	 */
	@Override
	public int rank(int [] win, int [] arr) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		int cnt = 0; //맞힌 갯수
		boolean isBonus = false;
		if(win.length !=7 || arr.length !=6) 
			throw new Exception("당첨번호 또는 생성번호 갯수가 잘못되었습니다.");
		for(int i = 0; i < arr.length; i++) {
			if(isDuplicated(arr,win[i],arr.length)) {
				cnt++;
				
			}
		}
		if(isDuplicated(arr,win[6],arr.length))
			isBonus = true;
		if(cnt == 6) return 1;
		else if(cnt == 5) {
			if(isBonus) return 2;
			else		return 3;
		}
		else if(cnt == 4) return 4;
		else if(cnt == 3) return 5;
		else			  return (-1);
	}
		
	public void printArr(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	
	
	
}
