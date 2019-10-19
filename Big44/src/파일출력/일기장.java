package 파일출력;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 일기장 {

	public static void main(String[] args) throws IOException {
		String name = JOptionPane.showInputDialog("파일이름");
		FileWriter file = new FileWriter(name + ".txt");
		file.write("hello1" + "\n");
		file.write("hello2" + "\n");
		file.write("hello3" + "\n");
		file.close();
	}
}
