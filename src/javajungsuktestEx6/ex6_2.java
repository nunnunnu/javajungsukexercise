package javajungsuktestEx6;

class SutdaCard{
	int num;
	boolean isKwang ;
	
	SutdaCard() {
		this(1, true); //입력값 없을때 설정 될 기본 값
	}
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	String info() {
		return num + (isKwang?"K":"");
	}

}

public class ex6_2 {

	public static void main(String[] args) {
		//SutdaCard클래스에 두개의 생성자와 info()를 추가해서 실행
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
