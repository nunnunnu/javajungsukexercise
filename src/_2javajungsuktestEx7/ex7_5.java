package _2javajungsuktestEx7;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price/10.0);
	}
	Product(){
		this(100);
	}
}
class Tv extends Product{
	Tv(){
//		super(100);
		}
	public String toStirng() {
		return "Tv";
	}
	
}

public class ex7_5 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv.price);
		System.out.println(tv.bonusPoint);
	}

}
