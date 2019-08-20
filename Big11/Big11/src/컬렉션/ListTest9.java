package 컬렉션;

import java.util.ArrayList;

public class ListTest9 {

	public ArrayList<ListTest9DTO> selectAll() {
		ArrayList<ListTest9DTO> list = new ArrayList();
		ListTest9DTO dto1 = new ListTest9DTO("100", "100", "100", "100");
		ListTest9DTO dto2 = new ListTest9DTO("200", "200", "200", "200");
		list.add(dto1);
		list.add(dto2);
		System.out.println(list);
	
		return list;

	}

}
