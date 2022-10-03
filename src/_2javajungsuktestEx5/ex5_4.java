package _2javajungsuktestEx5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_4 {

	public static void main(String[] args) throws IOException {
//		int arr[][] = {
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][n2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n2;j++) {
				arr[i][j]+=Integer.parseInt(br.readLine());
			}
		}
		int total = 0;
		float average=0;
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total += arr[i][j];
				count++;
				}
			average = (float)total / count;
		}
		System.out.println("total = "+total);
		System.out.println("average = "+average);
	}

}
