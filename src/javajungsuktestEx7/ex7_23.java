package javajungsuktestEx7;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p=p;
	}
	
	abstract double calcArea(); //도형의 면적을 계산
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p=p;
	}
}
class Point{
	int x,y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+", "+y+"]";
	}
}
class Circle extends Shape{
	double r;
	Circle(double r){
		this(new Point(0,0),r);
	}
	Circle(Point p, double r){
		super(p); //조상멤버는 조상의 생성자가 초기화함
		this.r=r;
	}
	double calcArea() {
		return Math.PI*r*r;
	}
}
class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	Rectangle(Point p, double width, double height){
		super(p);
		this.width=width;
		this.height=height;
	}
	double calcArea(){
		return width*height;
	}
	boolean isSquare() {
		return width*height!=0 && width==height;
	}
}
public class ex7_23 {

	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0),new Rectangle(3,4),new Circle(1)};
		System.out.println("면적의 합 : "+sumArea(arr));

	}

	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].calcArea();
			//Shape타입인 arr배열은 Shape의 자손 인스턴스가 들어있어 추상매소드 calcArea를 호출해도 각 인스턴스에서 완전히 구현된 calcArea가 호출
		}
		return sum;
	}

}
