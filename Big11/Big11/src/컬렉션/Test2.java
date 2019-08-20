package 컬렉션;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<BbsDTO> list = new ArrayList();
		BbsDTO dto1 = new BbsDTO("1","java","fun java","park");
		BbsDTO dto2 = new BbsDTO("2","jsp","funfun","kim");
		list.add(dto1);
		list.add(dto2);
		System.out.println(list);
		
		for (int i=0; i<list.size(); i++) {
			BbsDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getWriter());
			
			
			
		}

	}

}
