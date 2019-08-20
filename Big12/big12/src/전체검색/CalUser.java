package 전체검색;

public class CalUser {

	public static void main(String[] args) {
		Cal3 cal = new Cal3();
		System.out.println(cal.add(200, 100));
		int result = cal.add(500, 100);
		
		double d = cal.add(22.11,  33.44);
		System.out.println(d);
		
		MemberDTO dto = cal.add("홍길동");
		System.out.println(dto.getId());
		
//		int[] num = new int[];
		int[] num = cal.add();
		for (int i : num) {
			System.out.println(i);
		}
	}
}
