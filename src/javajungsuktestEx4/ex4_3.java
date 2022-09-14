package javajungsuktestEx4;

public class ex4_3 {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		int sum = 0;
		int total=0;
		for(int i = 1; i<=10; i++) {
			sum+=i;
			total += sum;
		}
		System.out.println(total);
	}
}
