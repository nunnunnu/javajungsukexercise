package _2javajungsuktestEx7;

abstract class Unit {
	int x,y;
	void stop() {}
	abstract void move(int x, int y);
}

class Marine extends Unit {
	int x,y;
	void move(int x, int y) {}
	void stop() {}
	void stimPack() {}
}
class Tank extends Unit{
	int x,y;
	void move(int x, int y) {}
	void stop() {}
	void changeMode() {}
}
class Dropship extends Unit{
	int x,y;
	void move(int x, int y) {}
	void stop() {}
	void load() {}
	void unload() {}
}

public class ex7_17 {
	public static void main(String[] args){
		
	}
}
