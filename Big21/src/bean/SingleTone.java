package bean;

public class SingleTone {

	public static SingleTone single;
	public static int cnt;
	
	public SingleTone() {
		System.out.println("나야나");
		cnt++;
	}
	
	public static SingleTone getInstance() {
		if(single==null) {
			single = new SingleTone();
		}
		return single;
	}
	
}
