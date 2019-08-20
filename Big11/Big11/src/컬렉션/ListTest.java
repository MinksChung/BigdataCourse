package 컬렉션;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add(100);
		list.add(11.23);
		list.add(true);
		list.add('a');
		System.out.println(list);
		for (int i =0; i <list.size(); i++)
		System.out.println(list.get(i));

	}

}
