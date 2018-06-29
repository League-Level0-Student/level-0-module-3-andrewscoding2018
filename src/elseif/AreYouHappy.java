package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("ARE YOU HAPPY?");
		if (happy.equals("YES")) {
			JOptionPane.showMessageDialog(null, "KEEP DOING WHATEVER YOU'RE DOING");
		} else if (happy.equals("NO")) {
			String want = JOptionPane.showInputDialog("DO YOU WANT TO BE HAPPY?");
			if (want.equals("YES")) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHING.");
			} else {
				if (want.equals("NO")) {
					JOptionPane.showMessageDialog(null, "YOU STRANGE.");
				}
			}
			{

			}
		}
	}
}
