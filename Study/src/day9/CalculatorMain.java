package day9;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Calc c = new Calc();
		double res = 0;
		try {
			res = c.calculate(1, 0, '/');
			System.out.println(res);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
