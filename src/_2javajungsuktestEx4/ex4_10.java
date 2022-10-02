package _2javajungsuktestEx4;

public class ex4_10 {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
	}

}
