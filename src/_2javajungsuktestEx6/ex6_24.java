package _2javajungsuktestEx6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_24 {
	
	static int abs(int value) {
		return Math.abs(value);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("절대값을 구할 수를 입력하세요. 종료하려면 0를 입력하세요. ");
			int value = Integer.parseInt(br.readLine());
			if(value == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		System.out.println(value +"의 절대값 : "+abs(value));
		
		}
	}

}
