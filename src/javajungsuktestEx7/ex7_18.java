package javajungsuktestEx7;
class Robot{}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤");
	}
}
class SingRobot extends Robot{
	void sing(){
		System.out.println("노래");
	}
}
class DrawRobot extends Robot{
	void draw(){
		System.out.println("그림");
	}
}
public class ex7_18 {
public static void action(Robot r) {
	if(r instanceof DanceRobot) {
		DanceRobot dance = (DanceRobot)r;
		dance.dance();
	}
	if(r instanceof SingRobot) {
		SingRobot sing = (SingRobot)r;
		sing.sing();
	}
	if(r instanceof DrawRobot) {
		DrawRobot draw = (DrawRobot)r;
		draw.draw();
	}
}
	public static void main(String[] args) {
		Robot arr[] = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0;i<arr.length;i++) {
			action(arr[i]);
		}
	}

}
