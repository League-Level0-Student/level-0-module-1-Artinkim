import javax.swing.JOptionPane;

public class secretmessage {
	public static void main(String[] args) {
		String ps = "cool";
		String ms = JOptionPane.showInputDialog("type a message");
		String check = JOptionPane.showInputDialog("Guess the password to see the message");
		if (check.equals(ps)) {
			JOptionPane.showMessageDialog(null, ms);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER");
		}

	}

}
