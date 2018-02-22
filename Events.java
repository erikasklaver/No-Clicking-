
import objectdraw.*;
import java.awt.*;

/**
 * Erika Sklaver
 * Lab 1 - No Clicking Sign
 * Section 2
 * 1/28/15
 * 
 * Draws a yellow, rectangular traffic sign labled CLICKING with a circle around the label and a slash through the label. When the mouse button is depressed
 * the circle with the diagonal line through the text disappears and reappears when the mouse is released. When the mouse is moved over the window, the text
 * "Clicking" turn red and when the mouse is moved off the window, the text goes back to black
 */
public class Events extends FrameWindowController {
private Text message;
private FramedOval circle;
private Line diagonal;
private FilledRect yellow;
// Assignment statements for the sign CLICKING, the circle, the slash and the yellow box
 

    public void begin() {
        resize(400,400);
        new FramedRect(150,50,100,100, canvas);
        // draws a rectangle when the program begins
        yellow = new FilledRect(151,51,99,99, canvas);
        //draws a filled rectangle when the program begins 
        yellow.setColor(Color.YELLOW);
        //draws a yellow rectangle when the program beg
        new FilledRect(199,150,2,150, canvas);
        // draws the sign post when the program begins
        circle = new FramedOval(150,50,100,100, canvas);
        // draws the circle inside the rectangle when the program begins
        message = new Text ("CLICKING", 170, 95, canvas);
        // draws text within the circle and rectangle when the program begins
        new Line (150,300,250,300, canvas);
        // draws the base of the sign post when the program begins
        diagonal = new Line (165,65,235,135, canvas);
        // draws a line through the text when the program begins
    }

    public void onMousePress(Location point) {
        circle.hide();
        diagonal.hide();
        // Executed after the user presses the mouse. The circle and slash disappear.
    }

    public void onMouseRelease(Location point) {
        circle.show();
        diagonal.show();
        // Executed after the user releases the mouse. The circle and slash re-appear
    }


    public void onMouseEnter(Location point) {
        message.setColor(Color.RED);
        // Executed when the mouse arrow enters the program's canvas. Turns the words "CLICKING" red
    }

    public void onMouseExit(Location point) {
        message.setColor(Color.BLACK);
        // Executed when the mouse arrow leaves the program's canvas. Turns the words "CLICKING" back to black
    }

}
