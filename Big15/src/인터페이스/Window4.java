package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window4 extends JFrame {
	JButton b, b2, b3;
	
	public Window4() {
		setTitle("이벤트 처리 연습");
		setSize(500,500);
		
		setLayout(new FlowLayout());
		
		b = new JButton("나를 눌러요");
		b2 = new JButton("나를 눌러요2");
		b3 = new JButton("나를 눌러요3");
		add(b);
		add(b2);
		add(b3);
		
		// 익명클래스
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째 버튼 클릭");
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼 클릭");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("세번째 버튼 클릭");
				
			}
		});
		// b버튼에 이벤트 처리를 할 것이라고 설정
		// addActionListener(이벤트처리할객체);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Window4 name = new Window4();

	}

}
