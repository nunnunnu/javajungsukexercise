package _2javajungsuktestEx6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_22 {
	
	static boolean isNumber(String str) {
		if(str.equals("") || str == null) return false;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch>='0' && ch<= '9')) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
//		String str = "123";
//		System.out.println(str +"는 숫자입니까?" + isNumber(str));
//
//		String str2 = "123o";
//		System.out.println(str2 +"는 숫자입니까?" + isNumber(str2));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str +"는 숫자입니까?" + isNumber(str));
		
	}

}
