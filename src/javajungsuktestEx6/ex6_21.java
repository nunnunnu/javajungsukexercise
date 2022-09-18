package javajungsuktestEx6;
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL= 100;
	final int MIN_CHANNEL= 1;
	
	void turnOnOff() {
		//isPowerOn이 true면 false로 false면 true로
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		//volume이 MAX_VOLUME보다 작으면, 1씩 증가
		if(volume < MAX_VOLUME) volume++;
	}
	void volumeDown() {
	//volume이 MIN_VOLUME보다 크면, 1씩 감소
		if(volume>MIN_VOLUME) volume--;
	}
	void channelUp() {
		//channel값 1증가. channel이 MAX_CHANNEL과 같으면 MIN_CHANNEL로 바꿈
		if(channel == MAX_CHANNEL) channel = MIN_CHANNEL;
		else channel++;
	}
	void channelDown() {
		if(channel == MIN_CHANNEL) channel=MAX_CHANNEL;
		else channel--;
	}
}

public class ex6_21 {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		
		t.channel=100;
		t.volume=0;
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
	}

}
