package 인터페이스;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window1 extends JFrame {

	public Window1() {
		setTitle("이벤트 처리 연습");
		setSize(500,500);
		
		JButton b = new JButton("나를 눌러요");
		add(b);
		
		이벤트처리2 e = new 이벤트처리2();
		b.addActionListener(e);
		// b버튼에 이벤트 처리를 할 것이라고 설정
		// addActionListener(이벤트처리할객체);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Window1 name = new Window1();

	}

}
