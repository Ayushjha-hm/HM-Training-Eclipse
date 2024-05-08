package P1;


class C{
	public int a =10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class  B extends C{
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


public class A{
	
	public static void main(String args[]) {
			
			C c = new C();
			System.out.println(c);
			
		
	}
	
}
