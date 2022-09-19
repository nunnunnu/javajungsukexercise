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
	double r; //반지름
	
	Circle(double r){
		this(new Point(0,0),r) //Circle(Pount p, double r) 호출
	}
	Circle(Point p, double r){
		super(p);
		this.r=r;
	}
	double calcArea() {
		return Math.PI*r*r;
	}
}
public class ex7_22 {

	public static void main(String[] args) {

	}

}
