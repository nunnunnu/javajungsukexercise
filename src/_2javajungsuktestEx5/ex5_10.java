package _2javajungsuktestEx5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_10 {

	public static void main(String[] args) throws IOException {
		char abcCode[]= {'`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char numCode[] = {'q','w','e','r','t','y','u','i','o','p'};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String scr = br.readLine();
//		String scr = "abc123";
		String result = "";
		
		//문자열 scr의 문자를 하나씩 읽어서 변환 후 result에 저장
		for(int i=0;i<scr.length();i++) {
			char ch = scr.charAt(i);
			if(ch>='0' && ch<='9') 
				result += numCode[ch-'0'];
			else if(ch>='a' && ch<='z')
				result+=abcCode[ch-'a'];
			else {
				System.out.println("입력값이 잘못됐습니다.");
				System.exit(0);
			}
		}
		System.out.println("scr : "+scr);
		System.out.println("result : "+result);
	}

}
