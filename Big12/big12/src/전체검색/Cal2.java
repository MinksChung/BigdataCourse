package 전체검색;

import java.util.ArrayList;

public class Cal2 {
	public int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public String add(String x, String y) {
		String z = x + y;
		return z;
	}

	public double add(double x, double y) {
		double z = x + y;
		return z;
	}

	public MemberDTO add() {
		MemberDTO dto = new MemberDTO();
		dto.setId("pen");
		dto.setPw("pen");
		dto.setName("pen");
		dto.setTel("pen");
		return dto;
	}

	public ArrayList add(String s) {
		ArrayList list = new ArrayList();
		list.add("pen");
		list.add("pencil");
		list.add(s);
		return list;
	}

	public ArrayList<String> add(String s1, String s2, String s3) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
//		list.add(100);
		
		return list;
	}
}
