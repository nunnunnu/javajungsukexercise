package _2javajungsuktestEx6;

import java.util.Arrays;

public class ex6_20 {

	static int[] shuffle(int arr[]) {
		if(arr==null || arr.length==0) return arr;
		int tmp=0;
		for(int i=0;i<arr.length;i++) {
			int x = (int)(Math.random()*arr.length);
			tmp=arr[i];
			arr[i] = arr[x];
			arr[x] = tmp;
			System.out.println(x);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int original[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int result[] = shuffle(original);
		System.out.println(Arrays.toString(result));

	}

}
