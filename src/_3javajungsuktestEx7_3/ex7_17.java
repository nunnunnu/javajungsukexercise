package _3javajungsuktestEx7_3;

class Unit{
	int x, y;
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void stop() {}
}
class Marine extends Unit {
	void stimPack() {}
}
class Tank extends Unit {
	void changeMode() {}
}
class Droppship extends Unit{
	void load(){}
	void unload() {}
}

public class ex7_17 {

	public static void main(String[] args) {
		Marine m = new Marine();
		m.x=0;
		m.y=1;
		System.out.println(m.x+", "+m.y);
		m.move(5, 8);
		System.out.println(m.x+", "+m.y);
	}

}
