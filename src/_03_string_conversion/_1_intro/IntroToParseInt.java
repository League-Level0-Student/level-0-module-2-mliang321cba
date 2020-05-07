package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class IntroToParseInt {

	public static void main(String[] args) {
		//I wasn't sure if I was supposed to do this.
		String quantity = JOptionPane.showInputDialog(null, "Enter a number.");
		int num = Integer.parseInt(quantity);
	}

}
