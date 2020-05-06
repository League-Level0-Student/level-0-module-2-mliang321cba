//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below

	// 2. Make a variable that will hold a random number and put a random number
	//    into this variable using "new Random().nextInt(4)"
	
		
		int randomNum = new Random().nextInt(4);
	// 3. Print out this variable
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask a yes or no question.");
	// 5. If the random number is 0
		if (randomNum==0) {
	// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Without a doubt.");
		}
	// 6. If the random number is 1
		if (randomNum==1) {
			JOptionPane.showMessageDialog(null, "My sources say no.");
		}
	// -- tell the user "No"

	// 7. If the random number is 2
		if(randomNum==2) {
			JOptionPane.showMessageDialog(null, "...um, maybe you should ask Google.");
		}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		if(randomNum==3) {
			JOptionPane.showMessageDialog(null, "Ask again.");
			JOptionPane.showInputDialog("Ask a yes or no question.");
			if (randomNum==0) {
				
						JOptionPane.showMessageDialog(null, "Without a doubt.");
					}
					if (randomNum==1) {
						JOptionPane.showMessageDialog(null, "My sources say no.");
					}
					if(randomNum==2) {
						JOptionPane.showMessageDialog(null, "...um, maybe you should ask Google.");
					}
				
												
											}
								}
	// -- write your own answer
					}
					
					
		
