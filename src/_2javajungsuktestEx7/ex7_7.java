package _2javajungsuktestEx7;

class Parent{
	int x=100;
	
	Parent(){
		this(200);
	}
	Parent(int x){
		this.x=x;
	}
	int getx() {
		return x;
	}
}
class Child extends Parent{
	int x=3000;
	Child(){
		this(1000);
	}
	Child(int x){
		this.x=x;
	}
}

public class ex7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println(c.getx());

	}

}
