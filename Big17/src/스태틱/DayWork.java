package 스태틱;

public class DayWork {

	String work;
	int time;
	String place;
	static int sum;
	static int cnt;	
	
	public DayWork(String work, int time, String place) {
		super();
		cnt++;
		sum += time;
		this.work = work;
		this.time = time;
		this.place = place;
	}

	@Override
	public String toString() {
		return "DayWork [work=" + work + ", time=" + time + ", place=" + place + "]";
	}
	
}
