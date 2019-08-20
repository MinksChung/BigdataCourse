package 연산자;

import javax.swing.JOptionPane;

public class naverloginpw {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("음식이름입력");
		String here = "chn rst";
		String there = "other place";
		if (data.equals("noodle")||data.equals("udon")) {
			System.out.print(here);
		} else {
			System.out.print(there);
		}
	}

}
