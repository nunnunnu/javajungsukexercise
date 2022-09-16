package javajungsuktestEx5;

public class ex5_8 {

	public static void main(String[] args) {
		//answer의 각 숫자 개수를 세서 개수만큼 '*'를 찍어서 그래프 그리기
//		int answer[] = {1,4,4,3,1,4,4,2,1,3,2};
//		int counter[] = new int[4];
//		
//		for(int i=0;i<counter.length;i++) {
//			int count = 0;
//			for(int j=0;j<answer.length;j++) {
//				if(i+1==answer[j]) count++;
//			}
//			counter[i] = count;
//			System.out.print(counter[i]);
//			for(int x=0;x<counter[i];x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//모르겠어서 걍 연습문제 코드 무시하고 만들어봄ㅜㅜㅜ
		int answer[] = {1,4,4,3,1,4,4,2,1,3,2};
		int counter[] = new int[4];
		
		for(int i=0;i<answer.length;i++) {
			counter[answer[i]-1]++; //배열의 인덱스(0~3)를 구하려면 배열크기에서 -1해줘야함
		//answer[0]이면 1나옴. 1-1해서 0자리에 counter[0]++해서 1이나올때마다 1씩 +됨
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			for(int j=0; j < counter[i];j++) {
			System.out.print("*"); 
			}
		System.out.println();
		}
		
	}

}
