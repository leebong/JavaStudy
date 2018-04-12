package day9;

public class ExceptionMainTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		try {
			Test();
		}
		catch(NumberException ne) {
			ne.printConsoleMessage();
		}
		catch(Exception e) {}
	}
	public static void Test()
	throws NumberException
	{
		throw new NumberException("상속받은 예외");
		
	}

}
