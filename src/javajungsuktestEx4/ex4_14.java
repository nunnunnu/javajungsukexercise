package javajungsuktestEx4;

import java.util.Scanner;

public class ex4_14 {

	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer에 저장
		int answer = (int)(Math.random()*100)+1;
		int input=0; //입력값 저장
		int count = 0; //횟수 저장
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요");
			input =s.nextInt(); //s를 input에 저장
			
			if(answer==input) { 
				System.out.println("정답입니다.");
				break;
			}
			else if(answer>input) System.out.println("더 큰 수를 입력해주세요");
			else if(answer<input) System.out.println("더 작은 수를 입력해주세요");
		} while(true); //무한반복문
		System.out.println("시도 횟수는 "+count+"번 입니다.");
	}

}
