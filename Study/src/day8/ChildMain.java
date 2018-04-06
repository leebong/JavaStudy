package day8;

public class ChildMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Childes c1 = new Childes();
		c1.setX(1);
		c1.setY(2);
		c1.setZ(3);
		Childes c2 = new Childes();
		c2.setX(1);
		c2.setY(2);
		c2.setZ(3);
		if(c1.equals(c2))
			System.out.println("같음");
		else
			System.out.println("다름");
		System.out.println(c1);
		System.out.println(c2);
		
		
	}

}

class Childes /*extends Object 생략된것임*/ {
	private int x;
	private int y;
	private int z;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}


	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Childes))
			return false;
		Childes c = (Childes)obj;
		if(x == c.x && y == c.y && z == c.z)
			return true;
		else
			return false;
	}
	
	@Override //변경할 수 있다
	public String toString() {
		return this.getClass().getName()+"@ "+"x:" + x + ", y:" + y +", z:" + z;
		//return this.getClass().getName()+"@"+Integer.toHexString(this.hashCode());
	}
}
