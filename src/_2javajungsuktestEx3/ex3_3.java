package _2javajungsuktestEx3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(num>0?"양수":num<0?"음수":0);
		
	}
}
