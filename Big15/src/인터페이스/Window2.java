package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window2 extends JFrame implements ActionListener {
	JButton b; // 선언의 위치가 사용할 수 있는 범위
	// 전역변수로 선언해주면 클래스내 모든 곳에서 사용
	
	public Window2() {
		setTitle("이벤트 처리 연습");
		setSize(500,500);
		
		b = new JButton("나를 눌러요");
		add(b);
		
		b.addActionListener(this);
		// b버튼에 이벤트 처리를 할 것이라고 설정
		// addActionListener(이벤트처리할객체);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Window2 name = new Window2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b.setText("눌렀구나?");
		
	}

}
