package 전체검색;

import javax.swing.JOptionPane;

public class MemberMain {

	public static void main(String[] args) {
		String sId = JOptionPane.showInputDialog("검색할 ID입력");

		MemberDAO dao = new MemberDAO();
		try {
			MemberDTO dto = dao.select(sId);
			JOptionPane.showMessageDialog(null, dto.getId());
			JOptionPane.showMessageDialog(null, dto.getPw());
			JOptionPane.showMessageDialog(null, dto.getName());
			JOptionPane.showMessageDialog(null, dto.getTel());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
