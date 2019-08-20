package 연산자;

import javax.swing.JOptionPane;

public class naverlogin2 {

	public static void main(String[] args) {
	    String id = "jung";
		String data = JOptionPane.showInputDialog("아이디를 넣으시오");
		if (id.equals(data)) {
			System.out.print("login OK");
		} else {
			System.out.print("No login");
		}
	}

}
