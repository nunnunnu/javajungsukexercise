package _2javajungsuktestEx4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4_15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int tmp=number;
		
		int result =0;
		
		while(tmp!=0) {
			result = tmp%10+result*10;
			tmp/=10;
		}
		if(number == result) System.out.println(number+"는 회문수입니다.");
		else System.out.println(number+"는 회문수가 아닙니다.");
	}

}
