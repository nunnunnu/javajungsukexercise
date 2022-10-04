package _2javajungsuktestEx5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_8 {

	public static void main(String[] args) throws IOException {
//		int answer[] = {1,4,4,3,1,4,4,2,1,3,2};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer[] = new int[11];
		String str[] = br.readLine().split(" ");
		for(int i=0;i<str.length;i++) {
			answer[i] = Integer.parseInt(str[i]);
		}
		int counter[] = new int[4];
		
//		for(int i=0;i<answer.length;i++) {
//			int arr[] = {1,2,3,4};
//			for(int j=0;j<arr.length;j++) {
//				if(answer[i]==arr[j])
//					counter[arr[j]-1]+=1;
//			}
//		}
		for(int i=0;i<answer.length;i++) {
			counter[answer[i]-1]++;
		}
		for(int i=0;i<counter.length;i++) {
			System.out.print(counter[i]);
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
