package Tv;

public class Tvmaker {
	int ch;
	int vol;
	boolean onOff;
	
	public void on() {
		System.out.println("on");
	}
	public void off() {
		System.out.println("off");
	}
	@Override
	public String toString() {
		return "Tvmaker [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}

	
}
