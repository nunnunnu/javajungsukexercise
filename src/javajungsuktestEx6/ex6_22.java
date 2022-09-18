package javajungsuktestEx6;

public class ex6_22 {
	
	String str;
	
	static boolean isNumber(String str) {
		if(str == "" || str == null) return false;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch>='0' && ch<='9')) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "1234O";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = null;
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
	}

}
