package P2;

import P1.A;

public class D extends A{

void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

class E extends D{
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class F {
	void display() {
		A a  = new A();
		System.out.println(a.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
