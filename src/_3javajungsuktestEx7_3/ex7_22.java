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
public class ex7_22 {

	public static void main(String[] args) {

	}

}
