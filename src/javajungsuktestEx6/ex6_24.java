package javajungsuktestEx6;

public class ex6_24 {
	int value;
	static int abs(int value) {
		return Math.abs(value);
	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대 값 : "+abs(value));
		value = -10;
		System.out.println(value+"의 절대 값 : "+abs(value));
	}

}
