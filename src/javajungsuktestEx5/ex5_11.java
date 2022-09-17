package javajungsuktestEx5;

public class ex5_11 {

	public static void main(String[] args) {
		//주어진 2차원 배열보다 다로와 세로로 1씩 더 큰 배열생성, 배열의 행과 열의 마지막 요소에 각 열과 행의 총합 계산
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int result[][]=new int[score.length+1][score[0].length+1];
		System.out.println(result[0].length-1);
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				int sum=0;
				result[i][j]=score[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j]+=result[i][j];
				result[score.length][score[0].length] +=result[i][j];
			}
		}
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
		
	}

}
