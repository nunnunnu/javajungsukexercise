package _2javajungsuktestEx4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4_14 {

	public static void main(String[] args) throws IOException {
		int answer = (int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
//		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		do {
			count++;
			System.out.println("1~100사이의 값을 입력하세요 : ");
			input= Integer.parseInt(br.readLine());
			
			if(input>answer) System.out.println("더 작은 수를 입력하세요.");
			else if(input<answer) System.out.println("더 큰 수를 입략하세요.");
			else {
				System.out.println("정답입니다. 시도횟수는 "+count+"번 입니다.");
				break;
			}
		}while(true);
	}

}
