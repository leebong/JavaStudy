package day8;

public class Factorial_Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//System.out.println(fac(5));
		System.out.println(facRecursive(5));
	}
	
	public static int fac(int num) {
		if(num == 0)
			return 1;
		else {
			int res = 1;
			for(int i =2;i<=num;i++)
				res *= i; //res = res * i
			return res;
		}
		
	}
	
	public static int facRecursive(int num) {
		if(num == 0)
			return 1;
		else if(num == 1) //재귀 메소드를 빠져 나가기 위한 조건
			return 1;
		else
			return num * facRecursive(num-1);
		
	}

}
