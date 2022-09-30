package _2javajungsuktestEx3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3_2 {

	public static void main(String[] args) throws IOException {
//		int numOfApples = 123;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfApples = Integer.parseInt(br.readLine());
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0?1:0);
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}

}
