package javajungsuktestEx4;

public class ex4_9_10 {

	public static void main(String[] args) {
		//숫자로 이루어진 문자열 str의 각자리의 합을 더한 결과를 출력
		//String클래스의 chatAt(i)를 사용
		String str = "12345";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			sum+=str.charAt(i)-'0'; //문자코드를 숫자로 바꾸려면 문자코드'0'을 빼주면 됨
		}
		System.out.println(sum);
		
		//문자열변환 없이 사용
		int num = 12345;
		int sum2 = 0;
		while(num>0) {
			sum2+=num%10;
			num=num/10;
		}
		System.out.println(sum2);
	}
}
