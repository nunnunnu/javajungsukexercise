package javajungsuktestEx7;

abstract class Unit{
	int x,y;
	abstract void move(int x, int y); //추상클래스
	void stop() {}// 정지
}

class Marine extends Unit{//보병
	void stimPack() {} //스팀팩 사용
	void move(int x, int y) {
	}
}
class Tank extends Unit{ //탱크
	void move(int x, int y) {} //지정위치로 이동
	void changeMode() {}//공격모드 변환
}
class Dropship extends Unit{
	void load() {} //선택 대상을 탑승시킴
	void unload() {}//하차시킴
	void move(int x, int y) {
	}
	
}
public class ex7_17 {

	public static void main(String[] args) {

	}

}
