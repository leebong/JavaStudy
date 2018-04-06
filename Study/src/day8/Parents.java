package day8;

class Parents {
	public int x;
	protected int y;
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
	
	public void prints() {
		System.out.println("부모입니다.");
	}
	
	public Parents() {
		System.out.println("부모 디폴드 생성자");
	}
	
	public Parents(int x, int y, int z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		System.out.println("부모 생성자 오버로딩");
	}
	
	
}

class Child extends Parents{
	
	public void print() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(getZ());
	}
	
	@Override
	public void prints() {
		System.out.println("자식입니다.");
	}
	
	public Child() {
		//super 생략 -> 우선 호출한다(부모 디폴드생성자)
		System.out.println("자식 디폴트 생성자");
	}

	public Child(int x, int y, int z) {
		super(x,y,z); //호출은 맨 처음줄에 필수 생성한다
		System.out.println("자식 생성자 오버로딩");
	}	
	
}


class ChildOther extends Parents{
	public int num;
	
	public ChildOther() {
		System.out.println("다른 자식 디폴트 생성자");
	}
	
	public ChildOther(int x, int y, int z, int num) {
		super(x, y, z);
		this.num = num;
		System.out.println("다른 자식 생성자 오버로드");
	}
	
	
	
}