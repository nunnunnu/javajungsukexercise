package javajungsuktestEx3;

public class ex3_8 {

	public static void main(String[] args) {
		byte a= 10;
		byte b = 20;
		byte c = (byte) (a+b); 
		//byte 덧셈연산하면 int 자동변환됨. byte로 형변환해줘야함
		
		char ch = 'A';
		ch = (char) (ch+2);
		//char 덧셈연산하면 int 자동변환됨. char로 형변환해줘야함
		
		float f = 3/2f; //f빠져서 int 처리됨.
		long l = 3000*3000*3000L; 
		//L빠져서 int 처리됨. 오버플로우때문에 이상한 값이 나옴
				
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		//타입이 달라서 false나옴. 형변환 필요
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
	}

}
