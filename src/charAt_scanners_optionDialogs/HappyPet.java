package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What type of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for(int i=0; i<5; i++) {
		int task = JOptionPane.showOptionDialog(null, "What would you do to make your pet happy?", "Pet Happiness", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cuddle", "feed", "let them take a nap" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
		
	// his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	if (task == 0) {
		cuddle();
	}

	if (task == 1) {
		feed();
	}
	// 6. If you determine the happiness level is large enough, tell the
	if (task == 2) {
		letThemTakeANap();
	} // user that he loves
	if(happinessLevel>=5) {
		JOptionPane.showMessageDialog(null, "I love you!");
	}
		}
		
	}
	static void cuddle() {
		happinessLevel += 1;
		JOptionPane.showMessageDialog(null, "Ahhh");
	}

	static void feed() {
		happinessLevel += 1;
		JOptionPane.showMessageDialog(null, "Yum");
	}

	static void letThemTakeANap() {
		happinessLevel += 1;
		JOptionPane.showMessageDialog(null, "zzzzz");
	}
}