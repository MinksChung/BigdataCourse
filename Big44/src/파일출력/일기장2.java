package 파일출력;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 일기장2 {

	public static void main(String[] args) throws IOException {
		String name = JOptionPane.showInputDialog("날짜 입력");
		FileWriter file = new FileWriter(name + ".txt");
		file.write(name + "\n");
		file.write(JOptionPane.showInputDialog("제목입력") + "\n");
		file.write(JOptionPane.showInputDialog("내용입력") + "\n");
		file.close();
	}
}
