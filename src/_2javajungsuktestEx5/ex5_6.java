package _2javajungsuktestEx5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_6 {

	public static void main(String[] args) throws IOException {
		int coinUnit[]= {500,100,50,10};
//		int money=2680;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		System.out.println("money = "+money);
		for(int i=0;i<coinUnit.length;i++) {
			int count = money/coinUnit[i];
			money %= coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+count);
			
		}
	}

}
