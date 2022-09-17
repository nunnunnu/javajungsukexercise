package javajungsuktestEx6;


	//두점 사이 거리 계산. Math.sqrt(double a)사용
//	static double getDistance(int x, int y, int x1, int y1) {
////		return Math.sqrt(Math.pow(x-x1, 2)+Math.pow(y-y1, 2));
//		return Math.sqrt((x-x1)*(x-x1)+(y-y1)+(y-y1)); //성능상 이게 나음. 메소드 호출하면 비용이 많이 듬
//	}
//getDistance를 인스턴스화
class MyPoint{
		int x; //인스턴스 변수
		int y;
		
		MyPoint(int x, int y){
			this.x=x;
			this.y=y;
		}
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); //성능상 이게 나음. 메소드 호출하면 비용이 많이 듬
	}
}
public class ex6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		//p와 (2,2)의 거리 구하기
		System.out.println(p.getDistance(2, 2));

	}

}
