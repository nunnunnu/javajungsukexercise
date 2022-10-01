package _2javajungsuktestEx3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cx3_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		char ch = br.readLine().charAt(0);
		boolean b= (ch>='A'&& ch<='z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9');
		
		System.out.println(b);
	}	

}
