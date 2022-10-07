package _2javajungsuktestEx7;

class SutdaCard{
	//인스턴스 변수라서 생성자에서 초기화해줘도 됨
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
		SutdaCard card = new SutdaCard();
		System.out.println(card.toString());
	}

}
