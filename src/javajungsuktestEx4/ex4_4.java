package javajungsuktestEx4;

public class ex4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for(int i=1; true; i++) {
			if(i%2==0) sum -=i;
			else sum +=i;
			count++;
			if(sum>=100) 
				break;
		}
		System.out.println("count = "+count);
		System.out.println("sum = "+sum);
	}
} 
