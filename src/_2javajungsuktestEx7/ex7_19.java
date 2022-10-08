package _2javajungsuktestEx7;

import java.util.Arrays;

class Buyer{
	int money =1000;
	Product cart[] = new Product[3];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("가진 돈이 부족합니다. "+p+"를 구매할 수 없습니다.");
			return;
		}
			money-=p.price;
			add(p);
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product cart2[] = new Product[cart.length*2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart=cart2;
		}
		cart[i++]=p;
	}
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			sum+=cart[i].price;
			itemList += cart[i] + ", ";
//			System.out.print(cart[i]+", ");
		}
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("사용 금액 : "+sum);
		System.out.println("남은 금액 : "+money);
	}
}
class Product{
	int price;
	
	Product(int price){
		this.price=price;
	}
}
class Tv2 extends Product{
	Tv2(){super(100);}
	public String toString () {return "Tv";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString () {return "Computer";}

}
class Audio extends Product{
	Audio(){super(50);}
	public String toString () {return "Audio";}
}

public class ex7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
		
	}

}
