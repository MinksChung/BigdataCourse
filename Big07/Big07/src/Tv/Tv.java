package Tv;

public class Tv {

	public static void main(String[] args) {
		Tvmaker tv1 = new Tvmaker();
		tv1.ch = 11;
		tv1.vol = 7;
		tv1.onOff = true;
		
		Tvmaker tv2 = new Tvmaker();
		tv2.ch = 13;
		tv2.vol = 1;
		tv2.onOff = false;
		
		tv1.on();
		tv2.off();
		System.out.println(tv1);
		System.out.println(tv2);
	}

}
