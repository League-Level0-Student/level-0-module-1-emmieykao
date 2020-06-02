package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog(null, "What travels the world but stays in one corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.contains("stamp")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is, 'a stamp'.");
}
		// 6. Add some more riddles
String answer1 = JOptionPane.showInputDialog(null, "What has two hands, one longer than the other, and no arms? It also has a face but no eyes.");
if (answer1.contains("clock")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is 'a clock'.");
}


String answer2 = JOptionPane.showInputDialog(null, "What belongs to you but is used by others?");
if (answer2.contains("name")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is 'your name'.");
	}
	String answer3 = JOptionPane.showInputDialog(null, "What are five little things you use every day; you find them all in 'a tennis court'");
	if (answer3.contains("vowels")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is 'vowels'.");
	}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score + ". Great job! The highest possible score is 4. Thanks for taking this quiz!");
	
	}}

