package javajungsuktestEx5;

public class ex5_7 {

	public static void main(String[] args) {
//		//거스름돈. 보유동전이 부족하면 "거스름돈이 부족합니다"출력. 충분하면 남은동전수 출력
//		if(args.length!=1) {
//			System.out.println("USAGE : java Exercise5_7 3120");
//			System.exit(0);
//		}
//		//문자열 숫자 변환. 입력 값이 숫자가 아니면 예외발생
//		int money = Integer.parseInt(args[0]);
//		System.out.println("money = " +money);
//		
//		int coinUnit[] = {500,100,50,10};//동전단위
//		int coin[] = {5,5,5,5}; //단위별 동전 개수
//		
//		for(int i=0;i<coinUnit.length;i++) {
//			int coinNum = 0;
//			//money를 동전단위로 나눠서 필요한 동전 갯수(coinNum) 구하기
//			//배열 coin에서 coinNum만큼의 동전을 뺌
//			//만약 동전이 부족하다면 배열 coin에 있는만큼만 뺌
//			//money에서 coinNum과 동전단위를 곱한 값을 뺌
//			coinNum = money / coinUnit[i]; 
//			money %= coinUnit[i]; 
//			if(coin[i]<coinNum) {
//				money = money + ((coinNum - coin[i])*coinUnit[i]); //670
//				coinNum = coin[i];
//				}
//			coin[i] -= coinNum; 
//			System.out.println(coinUnit[i]+"원 : "+coinNum);
//		}
//		if(money > 0) {
//			System.out.println("거스름돈이 부족합니다");
//			System.exit(0); //프로그램 종료
//		}
//		System.out.println("====남은 동전 개수====");
//		for(int i=0;i<coinUnit.length;i++) {
//			System.out.println(coinUnit[i]+"원 : "+coin[i]);
//		}
		//자바의 정석 답(내식으로 살짝 수정함)
		if(args.length!=1) {
			System.out.println("USAGE : java Exercise5_7 3120");
			System.exit(0);
		}
		//문자열 숫자 변환. 입력 값이 숫자가 아니면 예외발생
		int money = Integer.parseInt(args[0]);
		System.out.println("money = " +money);
		
		int coinUnit[] = {500,100,50,10};//동전단위
		int coin[] = {5,5,5,5}; //단위별 동전 개수
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			//money를 동전단위로 나눠서 필요한 동전 갯수(coinNum) 구하기
			coinNum = money / coinUnit[i]; 
			//배열 coin에서 coinNum만큼의 동전을 뺌
			//만약 동전이 부족하다면 배열 coin에 있는만큼만 뺌
			if(coin[i]<coinNum) {
				coinNum = coin[i];
				coin[i] = 0;
			}
			else coin[i]-=coinNum;
			//money에서 coinNum과 동전단위를 곱한 값을 뺌
			money-= coinNum * coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+coinNum);
		}
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다");
			System.exit(0); //프로그램 종료
		}
		System.out.println("====남은 동전 개수====");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 : "+coin[i]);
		}
	}
}

