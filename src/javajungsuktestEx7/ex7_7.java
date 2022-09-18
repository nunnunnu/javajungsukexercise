package javajungsuktestEx7;
class Parent{
	int x=100;
	
	Parent(){
		this(200);
	}
	Parent(int x){
		//super(); 가 생략된 상태. Object 호출
		this.x=x;
	}
	int getX() {
		return x;
	}
}
class Child extends Parent{
	int x=300;
	
	Child(){
		this(1000);
	}
	Child(int x){
//		super();가 생략된 상태. Parent호출
		this.x=x;
	}
}
public class ex7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("x = "+c.getX());
	}

}
//main -> child()-> child(int x)-> Parent() -> Parent(int x)-> Object순으로 호출됨
//매개변수를 지정안해줬으니까 child클래스의 x는 1000, Parent클래스의 x는 200.
//child클래스에는 getX()가 정의되어있지않으니 Parent클래스의 x인 200이 출력됨