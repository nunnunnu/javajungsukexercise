package _2javajungsuktestEx6;

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){
		return kor+eng+math;
	}
	float getAverage() {
		return Math.round(getTotal()*10/ 3f)/10f;
	}
	Student(){
		
	}
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor = kor;
		this.eng=eng;
		this.math=math;
	}
	void info(){
		System.out.println(name+", "+ban+", "+no+", "+kor+", "+eng+", "+math);
	}
}

public class ex6_3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+s.getAverage());
		System.out.println();
		Student s2 = new Student("김길동",1,1,95,80,63);
		s2.info();
		System.out.println("이름 : "+s2.name);
		System.out.println("총점 : "+s2.getTotal());
		System.out.println("평균 : "+s2.getAverage());
		
	}

}
