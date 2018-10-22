package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickels=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int Five=Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
String Dimes=JOptionPane.showInputDialog("How many dimes do you have?");
// Convert their answer to an int using Integer.parseInt()
int Ten=Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarters=JOptionPane.showInputDialog("How many quarters do you have?");
// Convert their answer to an int using Integer.parseInt()
int TwentyFive=Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
double money=0.0;
money+=Five*0.05;
money+=Ten*0.1;
money+=TwentyFive*0.25;
JOptionPane.showMessageDialog(null, " You have " + money);
		// Tell the user how much money they have

	}
}

