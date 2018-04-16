import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String answer = JOptionPane.showInputDialog("Why did the chicken cross the road");
		if (answer.equals("to get to the other side")) {
			JOptionPane.showMessageDialog(null, "you got it correct");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "wrong the answer is " + "to get to the other side");
		}

		answer = JOptionPane.showInputDialog("What starts with e ends with e, and contains one letter?");
		if (answer.equals("an envelope")) {
			JOptionPane.showMessageDialog(null, "you got it correct");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "wrong the answer is " + "an envelope");
		}
		JOptionPane.showMessageDialog(null, score);
	}
}
