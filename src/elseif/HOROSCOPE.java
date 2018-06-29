package elseif;

import javax.swing.JOptionPane;

public class HOROSCOPE {
	public static void main(String[] args) {
		String zodiac = JOptionPane.showInputDialog("What is your star sign?");
		if (zodiac.equals("Aries")) {
			JOptionPane.showMessageDialog(null,
					"Communicate with your colleagues at work today and\n" + " they'll see you as a natural leader.");
		} else if (zodiac.equals("Taurus")) {
			JOptionPane.showMessageDialog(null,
					("You want to recommit to a project or person today following information thats come your way."));
		} else if (zodiac.equals("Gemini")) {
			JOptionPane.showMessageDialog(null,
					("When work mates try to involve you in gossip today, go your own way and stay out of it."));
		} else if (zodiac.equals("Cancer")) {
			JOptionPane.showMessageDialog(null,
					("Hard work is the way to rewards today and the universe supports you in this, so put the effort in."));
		} else {
			JOptionPane.showMessageDialog(null, "I'm too lazy to put in the others or they don't exist.");
		}
	}
}
