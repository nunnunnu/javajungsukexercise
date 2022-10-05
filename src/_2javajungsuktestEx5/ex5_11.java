package _2javajungsuktestEx5;

public class ex5_11 {

	public static void main(String[] args) {
		int score[][] = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int result[][] = new int[score.length+1][score[0].length+1];
		
		for(int i=0;i<score.length;i++) {
			int sum=0;
			for(int j=0;j<score[i].length;j++) {
				int sum2=0;
				result[i][j] = score[i][j];
				sum+=score[i][j];
				sum2+=score[i][j];
				result[i][score[i].length] = sum;
				result[score.length][j]+=sum2;
				result[score.length][score[i].length] += sum2;
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