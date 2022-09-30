package _2javajungsuktestEx3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(+num+"의 크면서도 가까운 10의 배수 : "+(10-num%10+num));
		System.out.println("나머지 수 : "+(10-num%10));
	}

}
