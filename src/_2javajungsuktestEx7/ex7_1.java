package _2javajungsuktestEx7;

class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard cards[] = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<CARD_NUM;i++) {
			int num = i%10+1;
			boolean isKwang = i<10&& (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		SutdaCard tmp;
		for(int i=0;i<cards.length*2;i++) {
			int n = (int)(Math.random()*CARD_NUM);
			int n2 = (int)(Math.random()*CARD_NUM);
			tmp = cards[n];
			cards[n] = cards[n2];
			cards[n2]=tmp;
		}
	}
	SutdaCard pick(int index){
		return cards[index];
	}
	SutdaCard pick() {
		int n = (int)(Math.random()*CARD_NUM);
		return cards[n];
	}
	
}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() {
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
public class ex7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0;i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+" ");
		}
		System.out.println();
		System.out.println(deck.pick(0));
		
	}

}
