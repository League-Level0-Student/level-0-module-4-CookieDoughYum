package extra;
//swap varibles for decending order

import javax.swing.JOptionPane;

public class SimpleSorter {
public static void main(String[] args) {
	
	//ascending order
	String Sorter1=JOptionPane.showInputDialog("Pick a number");
	int one=Integer.parseInt(Sorter1);
	String Sorter2=JOptionPane.showInputDialog("Pick a number");
	int two=Integer.parseInt(Sorter2);
	String Sorter3=JOptionPane.showInputDialog("Pick a number");
	int three=Integer.parseInt(Sorter3);
	int temp=0;
	if(one>two) {
		temp=one;
		one=two;
		two=temp;
	}
	
	if(one>three) {
		temp=one;
		one=three;
		three=temp;
	}
	
	if(two>three) {
		temp=two;
		two=three;
		three=temp;
		//fix this problem, 2>3
	}
	
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
	 
	
	//decending order
	String Sorter4=JOptionPane.showInputDialog("Pick a number");
	int one1=Integer.parseInt(Sorter4);
	String Sorter5=JOptionPane.showInputDialog("Pick a number");
	int two1=Integer.parseInt(Sorter5);
	String Sorter6=JOptionPane.showInputDialog("Pick a number");
	int three1=Integer.parseInt(Sorter6);
	if(one1<two1) {
		temp=one1;
		one1=two1;
		two1=temp;
		
	}
	
	if(one1<three1) {
		temp=one1;
		one1=three1;
		three1=temp;
	}
	
	if(two1<three1) {
		temp=two1;
		two1=three1;
		three1=temp;
	}
	
	System.out.println(one1);
	System.out.println(two1);
	System.out.println(three1);
}
}
