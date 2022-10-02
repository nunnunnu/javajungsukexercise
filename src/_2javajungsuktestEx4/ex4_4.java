package _2javajungsuktestEx4;

public class ex4_4 {

	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=0;true;i++) {
//			if(i%2==0) sum-=i;
//			else sum+=i;
//			
//			if(sum>=100) {
//				System.out.println(i);
//				break;
//			}
//			
//			
//		}
//		int sum=0,n=1;
//		for(int i=1;true;i++,n*=-1) {
//			sum += i*n;
//			if(sum>=100) {
//				System.out.println(i);
//				break;
//			}
//		}
		int sum=0,n=1,num=0;
		for(int i=1;true;i++,n=-n) {
			num=n*i;
			sum+=num;
			if(sum>=100) break;
		}
		System.out.println(num);
	}

}
