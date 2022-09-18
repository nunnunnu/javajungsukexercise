package javajungsuktestEx7;

class Product{
	int price; //제품의 가격
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10);
	}
//	Product(){} //오류 해결을 위해 조상클래스에 기본생성자 추가
}

class Tv extends Product {
	Tv() {//조상클래스에 기본 생성자가 없는데 자손클래스에서 기본생성자를 통해 클래스를 생성하려해서 오류남
		//
		super(0); //아니면 Product를 호출해줘도 됨
	} 

	public String toString() {
		return "Tv";
	}
}

public class ex7_3 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
