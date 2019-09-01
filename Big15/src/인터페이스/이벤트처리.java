package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 이벤트처리 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("나에요. 인터페이스 처리된 결과");
		
	}
	
}
