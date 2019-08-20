package cellphone;

public class Cellphone {

	public static void main(String[] args) {
		Hardware h1 = new Hardware();
		h1.shape = "circle";
		h1.size = 5;
		System.out.println(h1.shape);
		System.out.println(h1.size);
		
		Software s1 = new Software();
		s1.calling();
		s1.texting();
		s1.websurffing();
	}

}
