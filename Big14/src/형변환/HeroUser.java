package 형변환;

public class HeroUser {

	public static void main(String[] args) {

		// IronMan i = new IronMan();
		SuperMan s = new SuperMan();
		HeroGroup hero1 = new HeroGroup(s);

	}

}
