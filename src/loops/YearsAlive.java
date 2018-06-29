package loops;

import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	String years = JOptionPane.showInputDialog("When you born?");
	int numberyears = Integer.parseInt(years);
	while(numberyears <= 2018)
	{
		JOptionPane.showMessageDialog(null, numberyears);
		numberyears++;
	}
}
}
