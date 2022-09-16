package javajungsuktestEx5;

import java.util.Arrays;

public class ex5_5 {

	public static void main(String[] args) {
		//1~9의 중복되지 않는 3자리 숫자를 만들기
		int ballArr[]= {1,2,3,4,5,6,7,8,9};
		int ball3[] = new int[3];
		
		//배열 ballArr의 임의의 요소 2개를 골라서 위치 변경
		for(int x=0; x<20;x++) {
			int i=(int)(Math.random()*ballArr.length);
			int j=(int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		System.out.println(Arrays.toString(ballArr));
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		for(int i=0;i<ball3.length;i++) {
			System.out.println(ball3[i]);
		}
	}

}
