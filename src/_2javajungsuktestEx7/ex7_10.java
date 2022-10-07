package _2javajungsuktestEx7;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	int getChannel(){
		return channel;
	}
	int getVolume(){
		return channel;
	}
	void setChannel(int channel) {
		prev = this.channel;
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL ) return;
		this.channel=channel;
	}
	void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME ) return;
		this.volume=volume;
	}
//	void gotoPrevChannel(){
//		int tmp;
//		tmp = channel;
//		channel = prev;
//		prev = tmp;
//	}
	void gotoPrevChannel(){
		setChannel(prev);
	}
	
	
}

public class ex7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : "+t.getChannel());
		
//		t.setVolume(20);
//		System.out.println("VOL : "+t.getVolume());
		
		t.setChannel(20);
		System.out.println("CH : "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : "+t.getChannel());
	}

}
