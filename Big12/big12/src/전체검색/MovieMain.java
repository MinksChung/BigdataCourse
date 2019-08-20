package 전체검색;

import javax.swing.JOptionPane;

public class MovieMain {

	public static void main(String[] args) {
		String sId = JOptionPane.showInputDialog("검색할 ID입력");

		MovieDAO dao = new MovieDAO();
		try {
			MovieDTO dto = dao.select(sId);
			JOptionPane.showMessageDialog(null, dto.getId());
			JOptionPane.showMessageDialog(null, dto.getTitle());
			JOptionPane.showMessageDialog(null, dto.getCompany());
			JOptionPane.showMessageDialog(null, dto.getActor());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
