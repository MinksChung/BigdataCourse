package 연산자;

import javax.swing.JOptionPane;

public class naverloginpw4 {

	public static void main(String[] args) {
	    String id = "jung";
		String data = JOptionPane.showInputDialog("아이디를 넣으시오");
		String pw = "1111";
		String pwdata = JOptionPane.showInputDialog("pw?");
		if (id.equals(data) && pw.equals(pwdata)) {
			System.out.print("login OK");
		} else {
			System.out.print("No login");
		}
	}

}
