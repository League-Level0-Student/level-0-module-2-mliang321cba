package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		int randy = new Random().nextInt(50-1);
		JOptionPane.showMessageDialog(null, randy + randy  + randy +  + randy + randy + randy);

	}

}
