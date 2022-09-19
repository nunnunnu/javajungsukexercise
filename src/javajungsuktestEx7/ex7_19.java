package javajungsuktestEx7;

import java.util.Arrays;

class Buyer{
	int money = 1000;
	Product1 cart[] = new Product1[3];
	int i=0; //cart의 인덱스
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("잔액부족. "+ p +"구매 불가");
			return;
		}
		money-=p.price;
		add(p);
	}
	void add(Product1 p) {
		if(i>=cart.length) {
			Product1 tmp[] = new Product1[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++] = p;
	}
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			
			itemList += cart[i]+", ";
			sum += cart[i].price;
		}
		System.out.println("구매 목록 : "+itemList);
		System.out.println("물건 가격 : "+sum);
		System.out.println("남은 금액 : "+money);
	}
}

class Product1{
	int price;
	
	Product1(int price) {
		this.price = price;
	}
}
class Tv1 extends Product1{
	Tv1(){ super(100);}
	public String toString() { return "Tv";}
}
class Computer extends Product1{
	Computer(){ super(200);}
	public String toString() { return "Computer";}
}
class Audio extends Product1{
	Audio(){ super(50);}
	public String toString() { return "Audio";}
}
public class ex7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		
	}
}
