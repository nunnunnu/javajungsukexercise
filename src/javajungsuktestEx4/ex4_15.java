package javajungsuktestEx4;

public class ex4_15 {

	public static void main(String[] args) {
		//회문수(palindrome, 숫자를 거꾸로 읽어도 앞으로 읽는것과 같은 수) 구하기
		//나머지 연산자 사용
		int number = 12321;
		int tmp = number;
		
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
			result = result*10 + tmp%10;
			tmp = tmp/10;
			
		}
		
		if(number==result) System.out.println(number+"는 회전수입니다");
		else System.out.println(number+"는 회전수가 아닙니다.");
	}

}
