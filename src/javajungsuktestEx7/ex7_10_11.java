package javajungsuktestEx7;
class MyTv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int PrevChannel;
	
	final int MAX_VOLUME =100;
	final int MIN_VOLUME =0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	public void setChannel(int channel) {
		if(channel>MAX_VOLUME || channel<MIN_VOLUME) return;
		PrevChannel=this.channel;
		this.channel=channel;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume<MIN_VOLUME) return;
		this.volume=volume;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public void gotPrevChannel() {
		setChannel(PrevChannel);
	}
}
public class ex7_10_11 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH : "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : "+t.getVolume());
		t.setChannel(20);
		System.out.println("CH : "+t.getChannel());
		t.gotPrevChannel();
		System.out.println("CH : "+t.getChannel());
		t.gotPrevChannel();
		System.out.println("CH : "+t.getChannel());
	}
}
