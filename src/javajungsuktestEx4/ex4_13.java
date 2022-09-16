package javajungsuktestEx4;

public class ex4_13 {

	public static void main(String[] args) {
		//value가 숫자인지 판별
		String value = "12o45";
		char ch = ' ';
		boolean isNumber = true;
		
		//반복문과 charAt(int i)를 통해 문자열의 문자를 하나씩 읽어 검사
		for(int i=0;i<value.length();i++) {
//			if(!(value.charAt(i)>='1' && value.charAt(i)<='9')) { //앞에 변수 ch있는거 까먹음;;
			ch = value.charAt(i);
			if(!(ch>='1' && ch<='9')) {
				isNumber = false;
			}
		}
		if(isNumber) System.out.println(value+"는 숫자입니다.");
		else System.out.println(value+"는 숫자가 아닙니다.");
	}

}
