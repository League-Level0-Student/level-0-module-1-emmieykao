package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog(null, "When is your birthday (mm/dd)");
	if (birthday.equals("05/26")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
	JOptionPane.showMessageDialog(null, "Have a very merry unbirthday!");
	}
}
}
