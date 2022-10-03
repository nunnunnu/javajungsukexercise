package _2javajungsuktestEx4;

public class ex4_12 {

	public static void main(String[] args) {
//		for(int i=1,j=2;i<=3&&j<=11;j++) {
//			if(j==10&&i==3) break;
//			if(j%10==0 && i<=3) continue;
//			if(j>2 && j%3==2) {
//				System.out.println();
//				j-=3;
//				i++;
//				if(i>3) {
//					System.out.println();
//					i-=3;
//					j+=3;
//				}
//			}
//			System.out.print(j+" * "+i+" = "+i*j);
//			System.out.print("\t");
//		}
		

//		for(int i=2;i<9;i+=3) {
//			for(int y=1;y<=3;y++) {
//				for(int x=i;x<=i+2&&x<=9;x++) {
//					System.out.print(x+" * "+y+" = "+x*y);
//					System.out.print("\t");	
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=4;j++) {
				int x=j+(i-1)/3*3;
				int y=i%3==0?3:i%3;  
				
				if(x>9) break;
					System.out.print(x+" * "+y+" = "+x*y+"\t");
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}
	}
}
