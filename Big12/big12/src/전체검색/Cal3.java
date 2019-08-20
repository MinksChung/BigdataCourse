package 전체검색;


public class Cal3 {
	public int add(int x, int y) {
		return x + y;
	}
	public double add(double x, double y) {
		return x + y;
	}
	
	public MemberDTO add(String id) {
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		return dto; 
	}
	
	public int[] add() {
		int[] num = {1,2,3};
		return num;
	}
	
	
	
	
}
