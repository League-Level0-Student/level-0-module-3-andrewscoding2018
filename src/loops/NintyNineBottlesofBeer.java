package loops;

import javax.swing.JOptionPane;

public class NintyNineBottlesofBeer {
	public static void main(String[] args) {
		int bottles = 99;
		for (int repeat = 99; repeat >= 2; repeat--) {
			JOptionPane.showMessageDialog(null,
					bottles + " bottles of beer  on the wall, \n" + bottles + " bottles of beer.");
			bottles--;
			JOptionPane.showMessageDialog(null,
					"Take one down and pass it around, \n" + bottles + " bottles of beer on the wall.");

		}
		JOptionPane.showMessageDialog(null, "No more bottles of beer on the wall, no more bottles of beer. \n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}
