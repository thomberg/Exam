import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 Robot dog = new Robot();
    	// 3. ask the user what color they would like the Robot to draw
    String Color =	JOptionPane.showInputDialog("what color do you want");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(Color.equals("blue")){
    		dog.penDown();
    		dog.setPenColor(000, 68, 187);
    	}
    	if (Color.equals("yellow")) {
    		dog.penDown();
    		dog.setPenColor(204, 0, 0);
		}
    	
   	 // 2. set the pen width to 10
    	dog.setPenWidth(10);
    	
    	dog.penDown();
   	 // 1. make the Robot draw a shape
    for (int i = 0; i < 4; i++) {
		dog.move(400);
		dog.turn(90);
	}
    }

}