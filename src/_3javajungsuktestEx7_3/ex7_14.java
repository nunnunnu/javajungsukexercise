package _3javajungsuktestEx7_3;

class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard cards[] = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<CARD_NUM;i++) {
			int n = i%10+1;
			boolean isKwang = i<10 && (n==1 || n==3 || n==8);
			cards[i] = new SutdaCard(n,isKwang);
		}
	}
	void shupple(){
		for(int i=0;i<cards.length*2;i++) {
			int n= (int)(Math.random()*CARD_NUM);
			int n2= (int)(Math.random()*CARD_NUM);
			SutdaCard tmp;
			tmp = cards[n];
			cards[n] = cards[n2];
			cards[n2] = tmp;
			
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int n = (int)Math.random()*CARD_NUM;
		return cards[n];
	}
}

class SutdaCard{
	final int num;
	final boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	public String toString() {
		return num+(isKwang?"K":"");
	}
}

public class ex7_14 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
			
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shupple();
		
		for(int i=0;i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+", ");
		}
		System.out.println();
		System.out.println(deck.pick());
		System.out.println(deck.pick(0));
	}

}
