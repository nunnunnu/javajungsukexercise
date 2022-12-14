package _3javajungsuktestEx7_3;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p=p;
	}
	
	abstract double calcArea(); //도형 면적 계산 후 반환
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p=p;
	}
	
}
class Point{
	int x, y;
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "[" + x+", "+y+"]";
	}
}

class Circle extends Shape{
	double r; //반지름
	
	Circle(double r){
		this(new Point(0,0),r);
	}
	Circle(Point p, double r){
		super(p); //조상의 멤버는 조상의 생성자가 초기화 하도록
		this.r=r;
	}
	
	double calcArea() {
		return Math.PI*r*r;
	}
}
class Rectangle extends Shape{
	double width, height;
	
	Rectangle(double width, double height){
		this(new Point(0,0),width, height);
	}
	Rectangle(Point p, double width, double height){
		super(p); //조상의 멤버는 조상의 생성자가 초기화 하도록
		this.height=height;
		this.width=width;
	}
	
	double calcArea() {
		return width *height;
	}
	boolean isSquare(){
		if(width == height) return true;
		else return false;
	}
}
public class ex7_22 {

	static double sumArea(Shape arr[]) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].calcArea();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Shape arr[] = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : "+sumArea(arr));
	}

}
