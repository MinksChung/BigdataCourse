package bean;

public class SingleToneTest {

	public static void main(String[] args) {
		
		SingleTone single1 = SingleTone.getInstance();
		System.out.println(single1);
		SingleTone single2 = SingleTone.getInstance();
		System.out.println(single2);
		System.out.println(SingleTone.cnt);

		BbsDTO dto1 = new BbsDTO();
		System.out.println(dto1);
		BbsDTO dto2 = new BbsDTO();
		System.out.println(dto2);
		
		String[] a = {"aa", "bb", "cc"};
		String[] b = a;
		String[] c = {"aa", "bb", "cc"};
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
