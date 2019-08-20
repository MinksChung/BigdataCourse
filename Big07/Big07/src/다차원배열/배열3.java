package 다차원배열;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class 배열3 {

	public static void main(String[] args) {
		String[] items = {"math","English","Korean","japanese"};
		Object[][] data = {
				{3,2,1,0},
				{6,7,8,9},
				{1,2,3,4}
		};
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JTable table = new JTable(data,items);
		f.add(table);
		f.setVisible(true);
	}

}
