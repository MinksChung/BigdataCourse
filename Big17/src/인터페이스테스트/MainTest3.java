package 인터페이스테스트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainTest3 extends JFrame {

	public MainTest3() {
	
		setSize(500,500);
		
		JButton b = new JButton("클릭");
		add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명으로 실행");
				
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MainTest3 name = new MainTest3();
		

	}

}
