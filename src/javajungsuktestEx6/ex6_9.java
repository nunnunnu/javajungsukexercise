package javajungsuktestEx6;
//marine클래스의 멤버 중 static을 붙여야하는 곳에 붙이기
class Marine{
	int x=0,y=0; //marine의 위치 좌표
	int hp = 60; //현재체력
	static int weapon=6; //공격력. 
	static int armor=0; //방어력
	
	static void weaponUp() {
		weapon++;
	}
	static void armorUp() {
		armor++;
	}
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ex6_9 {

	public static void main(String[] args) {
		
	}

}
//현재체력은 marine마다 다르지만 공격력과 방어력은 모든 marine이 같기 때문에 static을 붙임