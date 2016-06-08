/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String child = JOptionPane.showInputDialog("how old are you");
		if(child.equals("30")){
			JOptionPane.showMessageDialog(null, "you are too old for this");
			
		}

		}
	}

