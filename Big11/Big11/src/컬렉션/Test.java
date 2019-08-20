package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		ArrayList run = new ArrayList<>();
		run.add("박소정");
		run.add("김정민");
		run.add(23.69);
		run.add(100);
		System.out.println(run);
		String s1 = (String) run.get(0);
		int int1 = (int) run.get(3);
		System.out.println(s1);
		System.out.println(int1);
		
		
		HashMap cms = new HashMap();
		cms.put(100, "김데이");
		cms.put(200, "김사전");
		cms.put(300, "김구조");
		cms.put(400, "김자료");
		System.out.println(cms);
		
		
//		cms.remove(200);
//		System.out.println(cms);
//		cms.put(300,"김충성");
//		System.out.println(cms);
//		
//		HashSet team = new HashSet<>();
//		team.add("프로그램머");
//		team.add("프로그램머");
//		team.add("웹디자이너");
//		team.add("프로젝트매니저");
//		team.add("DB관리자");
//		System.out.println(team);
//		
//		HashSet trip = new HashSet<>();
//		team.add("유럽");
//		team.add("일본");
//		team.add("일본");
//		team.add("캐나다");
//		team.add("미국");
//		System.out.println(trip);
	
		ArrayList<Double> eyesight= new ArrayList<>();
		eyesight.add(0.9);
		eyesight.add(0.5);
		eyesight.add(0.1);
		System.out.println(eyesight);
	}

}
