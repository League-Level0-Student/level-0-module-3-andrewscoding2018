package loops;

import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	String years = JOptionPane.showInputDialog("When you born?");
	int numberyears = Integer.parseInt(years);
	while(numberyears < 2018)
	{
		JOptionPane.showMessageDialog(null, "You were alive in " + numberyears + " .");
		numberyears++;
	}
	JOptionPane.showMessageDialog(null, "You are alive in 2018.");
}
}
