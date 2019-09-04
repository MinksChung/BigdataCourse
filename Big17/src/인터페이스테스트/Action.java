package 인터페이스테스트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("메인과 별도 구현");
		
	}
	
}
