package javajungsuktestEx4;

public class ex4_1 {

	public static void main(String[] args) {
//		1. int형 변수 x가 10보다 크고 20 보다 작을 때 true인 조건식
		int x= 20;
		System.out.println(x>=10&&x<=20);
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 'a';
		System.out.println(ch!=' ' && ch!='\t');
//		3. char형 변수 ch가 ‘x'또는 ’X' 일 때 true인 조건식
		char ch2 = 'X';
		System.out.println(ch2=='x' || ch2 =='X');
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		char ch3 = '1';
		System.out.println(ch3>='0' && ch3<='9');
//		5. char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식
		char ch4 = 'A';
		System.out.println((ch4>='a' && ch4<='z') ||( ch4>='A' && ch4<='Z'));
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지않을 때 true인 조건식
		int year = 120;
		System.out.println((year%4==0 && year%100!=0)|| year%400==0 );
//		7. boolean형 변수가 powerOn false 일 때 true인 조건식
		boolean powerOn = false;
		System.out.println(!powerOn);
//		8. 문자열 참조변수 str이 “yes” 일 때 true인 조건식
		String str = "yes";
		System.out.println(str.equals("yes"));
	}

}
