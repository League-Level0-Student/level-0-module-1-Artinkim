import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String bd = JOptionPane.showInputDialog("what is your birth day (mm/dd)");
		if (bd.equals("4/15")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		} else {
			JOptionPane.showMessageDialog(null, "unbirthday");
		}

	}

}
