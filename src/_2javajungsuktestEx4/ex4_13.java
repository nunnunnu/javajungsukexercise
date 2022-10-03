package _2javajungsuktestEx4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4_13 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0;i<value.length();i++) {
			ch=value.charAt(i);
			if(ch>='0' && ch<='9') {
				isNumber=true;
				}
			else {
				isNumber = false;
				break;
			}
		}
		if(isNumber) System.out.println(value+"는 숫자입니다");
		else System.out.println(value+"는 숫자가 아닙니다.");
	}

}
