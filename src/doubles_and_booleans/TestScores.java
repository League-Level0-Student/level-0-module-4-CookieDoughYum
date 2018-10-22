package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String TestScore=JOptionPane.showInputDialog("What is your test score?");
	double Test=Double.parseDouble(TestScore);
	if(Test<30.1 && Test>-0.1) {
		JOptionPane.showMessageDialog(null, "Sorry, that is not a good score. Better luck next time");
	}
	else if(Test>30.0 && Test<60.1) {
		JOptionPane.showMessageDialog(null, "It's ok but not the best");
	}
	else if(Test>60.0 && Test<100.1) {
		JOptionPane.showMessageDialog(null, "Wow that is an amazing score! Great job!");
	}
	else {
		JOptionPane.showMessageDialog(null, "That test score is not valid");
	}
}
}
