package 컬렉션;

import java.util.ArrayList;

public class Test3 {
	public ArrayList<BbsDTO> selectAll() throws Exception {
		ArrayList<BbsDTO> list = new ArrayList();
		BbsDTO dto1 = new BbsDTO("1","java","fun java","park");
		BbsDTO dto2 = new BbsDTO("2","jsp","funfun","kim");
		list.add(dto1);
		list.add(dto2);
		System.out.println(list);
		
		for (int i=0; i<list.size(); i++) {
			BbsDTO dto = list.get(i);
		}
		return list;
	}
}
