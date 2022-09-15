package javajungsuktestEx4;

public class ex4_8 {

	public static void main(String[] args) {
		//2x+4y=10의 모든 해를 출력. 0<=x<=10, 0<=y<=10
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i*2+4*j==10) System.out.println("x="+i+", y="+j);
			}
		}

	}

}
