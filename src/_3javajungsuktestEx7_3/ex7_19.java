package _3javajungsuktestEx7_3;

class Buyer{
	int money=1000;
	Product cart[] = new Product[3];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println(p+"를 구매할 돈이 부족합니다");
			return;
		}
		else {
			money-=p.price;
			add(p);
		}
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product cart2[] = new Product[cart.length*2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart=cart2;
		}
		cart[i++] = p;
	}
	void summary() {
		int sum=0;
		String itemlist="";
//		for(int i=0;i<cart.length;i++) {
//			System.out.print(cart[i]+", ");
//			sum+=cart[i].price;
//		}
		for(int i=0;i<cart.length;i++) {
			itemlist += cart[i] + ", ";
			sum+=cart[i].price;
		}
//		System.out.println();
		System.out.println(itemlist);
		System.out.println("사용한 돈 : "+sum);
		System.out.println("남은 돈 : "+money);
	}
	
}
class Product{
	int price;
	
	Product(int price){
		this.price=price;
	}
}

class Tv extends Product{
	Tv(){super(100);}
	public String toString() {return "TV";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "COMPUTER";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "AUDIO";}
}

public class ex7_19 {

	public static void main(String[] args) {
		Buyer b= new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
