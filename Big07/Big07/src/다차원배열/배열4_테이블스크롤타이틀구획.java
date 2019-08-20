package 다차원배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.nio.channels.InterruptedByTimeoutException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class 배열4_테이블스크롤타이틀구획 {

	public static void main(String[] args) {
		String[] items = {"번호","제목","내용","날짜"};
		Object[][] data = {
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"},
				{1,"java","fun java","2019-08-09"},
				{2,"jsp","fun jsp","2019-08-10"},
				{3,"spring","fun spring","2019-08-11"}
			};
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500,950);
		f.getContentPane().setLayout(new FlowLayout());
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		f.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("0.gif"));
		panel_1.add(lblNewLabel);
		JLabel title = new JLabel("게시판");
		title.setFont(new Font("굴림", Font.PLAIN, 48));
		panel_1.add(title);
		
		JTable table = new JTable(data,items);
		JScrollPane scroll = new JScrollPane(table);
		f.getContentPane().add(scroll);
		
		JButton push = new JButton("종료");
		push.setForeground(Color.BLACK);
		push.setBackground(Color.RED);
		push.setFont(new Font("굴림", Font.PLAIN, 46));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton btnNewButton = new JButton("창닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 46));
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(push);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		f.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton b1 = new JButton("글쓰기(새창)");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				글쓰기 name = new 글쓰기();
			}
		});
		b1.setBackground(Color.ORANGE);
		panel.add(b1);
		b1.setFont(new Font("굴림", Font.PLAIN, 19));
		JButton b2 = new JButton("글수정");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				글수정 name = new 글수정();
			}
		});
		b2.setBackground(Color.ORANGE);
		panel.add(b2);
		b2.setFont(new Font("굴림", Font.PLAIN, 19));
		JButton b3 = new JButton("글삭제");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				글삭제 name1 = new 글삭제();
			}
		});
		b3.setBackground(Color.ORANGE);
		panel.add(b3);
		b3.setFont(new Font("굴림", Font.PLAIN, 19));
		
		
		
		f.setVisible(true);
	}
}
