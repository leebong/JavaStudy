package day9;


public interface CalculatorInterface {
	public double sum(double a, double b);
	public double sub(double a, double b);
	public double mul(double a, double b);
	public double div(double a, double b) throws Exception;
	public double mod(double a, double b) throws Exception;
	public double calculate(double a, double b, char op) throws Exception;
	default void Test() {} //추상메서드 추가 생성 시 오류난다. 
						   //그래서 최신버전에서는 default를 사용하면 오류가 없다 
		
}
/*
class A implements CalculatorInterface{
	//A의 빨간줄에서 "구현되지않은 메서드 추가" 를 누르면 모두 생성된다.
}
*/

class Calc implements CalculatorInterface{
	
	@Override
	public void Test() { //default 로 생성시 별도 구현 
		
	}

	@Override
	public double sum(double a, double b) {
		// TODO 자동 생성된 메소드 스텁
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO 자동 생성된 메소드 스텁
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO 자동 생성된 메소드 스텁
		return a*b;
	}

	@Override
	public double div(double a, double b) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		if(b == 0) throw new Exception("0은 나누기 연산안돼");
		return a/b;		
	}

	@Override
	public double mod(double a, double b) throws Exception{
		// TODO 자동 생성된 메소드 스텁
		if(b == 0) throw new Exception("0은 나머지 연산안돼");
		return a%b;
	}

	@Override
	public double calculate(double a, double b, char op) throws Exception{
		// TODO 자동 생성된 메소드 스텁
			switch(op) {
				case '+': return sum(a,b);
				case '-': return sub(a,b);
				case '*': return mul(a,b);
				case '/': return div(a,b);
				case '%': return mod(a,b);
				default :
					throw new Exception("연산자 잘못입력");
			}
	}

}