package 컬렉션;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap info = new HashMap<>();
		info.put("이름", "홍길동");
		info.put("나이", 100);
		info.put("키", 188);
		
		System.out.println(info.get("키"));
		
	}

}
