package _3javajungsuktestEx7_3;

class Parent{
	int x=100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int x=200;
	void method() {
		System.out.println("Child Method");
	}
}

public class ex7_20 {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.x : "+p.x);
		p.method();
		System.out.println("c.x : "+c.x);
		c.method();
	}

}
