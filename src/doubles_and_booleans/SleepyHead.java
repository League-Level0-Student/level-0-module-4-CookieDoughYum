package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation, isWeekend;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
   // JOptionPane.showConfirmDialog(null, "Is it a weekday)
        
int Weekday=JOptionPane.showConfirmDialog(null, "Is it a weekday?");
 int Vacation=JOptionPane.showConfirmDialog(null, "Is it vacation?");
 int Weekend=JOptionPane.showConfirmDialog(null, "Is it a weekend?");
if(Weekday==0) {
	isWeekday=true;
}
else {
	isWeekday=false;
}

if(Vacation==0) {
	isVacation=true;
}
else {
	isVacation=false;
}

if(Weekend==0) {
	isWeekend=true;
}
else {
	isWeekend=false;
}

if(isWeekday==true) {
	if(isVacation==true) {
		System.out.println("Sleep in");
	}
	else {
		System.out.println("Get up, lazybones!");
	}
}

if(isWeekend==true) {
	System.out.println("Sleep in");
}



        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
