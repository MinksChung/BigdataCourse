package 변수;

import javax.swing.JButton;
import javax.swing.JFrame;

// joption만 사용, 배고파? 네:먹자, 아니요:코딩더, 취소:재질문
public class test1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		JButton b1 = new JButton("맞아요");
		JButton b2 = new JButton("아니요");
		JButton b3 = new JButton("취소");
		f.add(b1); f.add(b2); f.add(b3);
		
		
		
		f.setVisible(true);
	}

}
