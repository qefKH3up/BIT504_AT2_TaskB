import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.Timer;

// This class will be handling the game logic along with anything related to the game, such as the score, ball, and paddles.
// This class inherits from JPanel class, which allows program to draw things in the frame.
// It also uses ActionListener and KeyListener libraries which allow program to respond to key presses and events.
// You need to add unimplemented methods automatically via error message on PongPanel
public class PongPanel extends JPanel implements ActionListener, KeyListener {
	
	// Setting the background colour which will remain the same.
	private final static Color BACKGROUND_COLOUR = Color.BLACK;
	private final static int TIMER_DELAY = 5;
	
	public PongPanel() {
		// Import java.awt.Color for this.
		setBackground(BACKGROUND_COLOUR);
		 Timer timer = new Timer(TIMER_DELAY, this);
         timer.start();
	}
	
	// Changed default variable name arg0 to event for improved clarity.
	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
	}
}
