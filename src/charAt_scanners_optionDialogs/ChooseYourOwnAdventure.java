package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	//JOptionPane.showOptionDialog(null, "It was an ordinary day, and you were taking a walk. You then see a mysterious looking house. What should you do?", "Option 1", "Go inside the house", "Turn around and go home", "Keep going on your walk");
//	 int walk = JOptionPane.showOptionDialog(null, "\"It was an ordinary day, and you were taking a walk. You then see a mysterious looking house. What should you do?\"",
//             "Option 1",
//             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, {"Go inside the house", "Turn around and go home"}
//             , "Keep going on your walk");
    	String[] options = {"Go inside the house", "Turn around and go home", "Keep going on your walk"};
	 int walk = JOptionPane.showOptionDialog(null, "It was an ordinary day, and you were taking a walk. You then see a mysterious looking house. What should you do?",
             "Option 1",
             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,  options, options[0]);
	 
	 
	 
	 if(walk==2) {
		 	String[] options2 = {"Attack it", "Run Away"};
			 int walk2 = JOptionPane.showOptionDialog(null, "You continued on with your walk. You then see a giant grizzly bear waiting to attack you! What should you do?",
		             "Option 2",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,  options2, options2[0]);
			 if(walk2==1) {
				 String[] options3 = {"Tell mom", "Keep it a secret"};
				 int walk3 = JOptionPane.showOptionDialog(null, "You make it home safely. You wonder if you should tell mom or not. What should you do?",
			             "Option 3",
			             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,  options3, options3[0]);
				 if(walk3==1) {
					 JOptionPane.showMessageDialog(null, "You decide to keep everything a secret. The next day you take a walk, and a grizzly bear kills you");
				 }
			 }
			 if(walk2==0) {
				JOptionPane.showMessageDialog(null, "You attack it with all of your might, and it dies! You can't wait to tell mom and the rest of the world about your epic kill!");
			 }
	 }
	
	 if(walk==1) {
		 	String[] options3 = {"Tell mom", "Keep it a secret"};
			 int walk3 = JOptionPane.showOptionDialog(null, "You make it home safely. You wonder if you should tell mom or not. What should you do?",
		             "Option 3",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,  options3, options3[0]);
			 System.out.println(walk3);
			 if(walk3==1) {
				 JOptionPane.showMessageDialog(null, "You decide to keep everything a secret. The next day you take a walk, and a grizzly bear kills you");
			 }
	 }
	 if(walk==0) {
		 	String[] options4 = {"Go inside the portal", "Turn around and go home"};
			 int walk4 = JOptionPane.showOptionDialog(null, "You step inside the house. You then see a portal, leading to another universe. What should you do?",
		             "Option 4",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,  options4, options4[0]);
	 }
	 
	 
}
}
