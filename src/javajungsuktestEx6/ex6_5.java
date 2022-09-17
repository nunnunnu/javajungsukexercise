package javajungsuktestEx6;

class Student1{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int sum = kor+eng+math; //6_4에서 만든 getTotal이랑 동일
	float average= sum/3f; //6_4에서 만든 getAverage랑 동일
	
	Student1(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.sum=kor+eng+math;
		this.average= (Math.round((sum/3f)*10))/10f;
	}
	String info() {
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+sum+", "+average;
	}
}
public class ex6_5 {

	public static void main(String[] args) {
		Student1 s = new Student1("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}

}
