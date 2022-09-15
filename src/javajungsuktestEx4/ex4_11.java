package javajungsuktestEx4;

public class ex4_11 {

	public static void main(String[] args) {
		//피보나치수열(앞의 두 수를 더해서 다음 수를 만들어 나가는 수열)의 10번째수를 계산
		//fibonnaci 수열의 시작의 첫 두수는 1,1
		int num1=1, num2=1, num3=0;
		System.out.print(num1+", "+num2);
		
		for(int i=0;i<8;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(", "+num3);
		}

	}

}
