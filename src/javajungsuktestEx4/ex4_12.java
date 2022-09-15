package javajungsuktestEx4;

public class ex4_12 {

	public static void main(String[] args) {
		//구구단 세로출력
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
		//구구단 가로출력
//		for(int k=2;k<=9;k+=3) {
//			for(int i=1;i<=3;i++) {//곱하는 수
//				for(int j=k;j<=k+2&&j<=9;j++) {//단
//					System.out.printf("%d * %d = %d\t",j,i,i*j);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
//		//문제집 정답(이해하기쉽게 살짝 수정함)
		for(int i=1;i<=9;i++) { 
			for(int j=2;j<=4;j++) { 
				//i가 4이상이 되면 j에 값을 더해서 2~4단 에서 5~7, 8~9단
				int x = j+(i-1)/3*3; //단
				//곱할 수가 1~3에서 머물게 하기 위해 i%3을 사용함. 
				int y = i%3==0? 3: i%3; //곱할 수
				
				System.out.print(x+" * "+y+" = "+x*y+"\t");
			}
			System.out.println();
			if(i%3==0) System.out.println(); //y가 3이 됐으면 줄바꿈(i==3으로 하면 실질적인 i의 수가 1~9범위라서 생각한거처럼 안나옴
		}
	}
}
