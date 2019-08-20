package 생성자;

public class TvMade {

	public static void main(String[] args) {
		TvMaker tv1 = new TvMaker();
		TvMaker2 tv2 = new TvMaker2(3);
		
		System.out.println(tv1);
		System.out.println(tv2);
	}
 
}
