package javajungsuktestEx7;
class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard cards[]= new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	//카드 배열 섞기
	void shuffle(SutdaCard Cards[]) {
		SutdaCard tmp = new SutdaCard();
		for(int i=0;i<cards.length;i++) {
			int num = (int)((Math.random()*20));
			tmp = cards[num];
			cards[num]=cards[i];
			cards[i]=tmp;
		}
	}
	//지정한 위치의 카드 반환
	SutdaCard pick(int index) {
		if(index<0 || index>cards.length) return null;
		return cards[index];
	}
	//랜덤한 위치의 카드 반환
	void pick() {
		System.out.println(cards[(int)(Math.random()*20)]);
	}
}
class SutdaCard{
	final int num ;
	final boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	//info()대신 Object클래스의 toString을 오버라이딩할거임
	public String toString() {
		return num +  ( isKwang ? "K":"");
	}
}
public class ex7_1 {
	
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println();
		
		deck.pick(0);
		deck.pick(50); //null반환됨
		deck.pick();
		deck.shuffle(deck.cards);
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
	}
}
//다 했는데 pick(index)에서 유효성 검하를 안해줌ㅜ