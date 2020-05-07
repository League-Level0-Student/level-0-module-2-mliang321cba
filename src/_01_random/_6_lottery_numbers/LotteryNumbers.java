package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		int randy = new Random().nextInt(51);
		int randy2 = new Random().nextInt(51);
		int randy3 = new Random().nextInt(51);
		int randy4 = new Random().nextInt(51);
		int randy5 = new Random().nextInt(51);
		int randy6 = new Random().nextInt(51);
		JOptionPane.showMessageDialog(null, randy + ", " + randy2  + ", " + randy3 + ", " + randy4 + ", " + randy5 + ", " + randy6);

	}

}
