package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("How old are you?");
		int ageInt = Integer.parseInt(ageString);
		if(ageInt >= 18) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
			JOptionPane.showMessageDialog(null, "Okay then...");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares about what you think.");
		}

	}

}
