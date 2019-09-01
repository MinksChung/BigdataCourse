package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window3 extends JFrame implements ActionListener {
	JButton b, b2, b3;
	
	public Window3() {
		setTitle("이벤트 처리 연습");
		setSize(500,500);
		
		setLayout(new FlowLayout());
		
		b = new JButton("나를 눌러요");
		b2 = new JButton("나를 눌러요2");
		b3 = new JButton("나를 눌러요3");
		add(b);
		add(b2);
		add(b3);
		
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		// b버튼에 이벤트 처리를 할 것이라고 설정
		// addActionListener(이벤트처리할객체);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Window3 name = new Window3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			System.out.println("1 버튼을 눌렀군요.");
		}else if(e.getSource()==b2) {
			System.out.println("2 버튼을 눌렀군요.");
		}else if(e.getSource()==b3) {
			System.out.println("3 버튼을 눌렀군요.");
		}
		
		
	}

}
