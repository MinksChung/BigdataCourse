package 인터페이스테스트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainTest2 extends JFrame implements ActionListener {

	public MainTest2() {
	
		setSize(500,500);
		
		JButton b = new JButton("클릭");
		add(b);
		
		b.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MainTest2 name = new MainTest2();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("내부에서 실행");
		
	}

}
