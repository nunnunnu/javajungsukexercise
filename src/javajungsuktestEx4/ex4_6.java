package javajungsuktestEx4;

public class ex4_6 {

	public static void main(String[] args) {
		//주사위 두개를 던졌을때 눈금의 합이 6이되는 모든 경우의수를 출력
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(i+j == 6) System.out.println("{"+i+", "+j+"}");
			}//for문
		}//for문
	}//main
}
