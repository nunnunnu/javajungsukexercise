package javajungsuktestEx4;

public class ex4_4 {
	public static void main(String[] args) {
		//1+(-2)+3+(-4)+... 같은 식으로 계속 더했을때 몇까지 더해야 총합이 100이상이 되는지 구하시오
		int sum = 0;
		int count = 0;
		for(int i=1; true; i++) {
			if(i%2==0) sum -=i;
			else sum +=i;
			count++;
			if(sum>=10) 
				break;
		}
		System.out.println("count = "+count);
		System.out.println("sum = "+sum);
		
//		//문제집 정답
//		int sum = 0, s=1, num = 0;
//		for(int i=1;true;i++,s=-s) { //반복마다 1,-1,1,-1.. 
//			num=i*s; //더할 값을 구함
//			sum += num;
//			
//			if(sum>=100) break;
//		}
//		System.out.println("num = "+num);
//		System.out.println("sum = "+sum);
	}
} 
