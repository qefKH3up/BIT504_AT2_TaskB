import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.Timer;
// For Graphics
import java.awt.Graphics;
import java.awt.Graphics2D;
// For drawing
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

// This class will be handling the game logic along with anything related to the game, such as the score, ball, and paddles.
// This class inherits from JPanel class, which allows program to draw things in the frame.
// It also uses ActionListener and KeyListener libraries which allow program to respond to key presses and events.
// You need to add unimplemented methods automatically via error message on PongPanel
public class PongPanel extends JPanel implements ActionListener, KeyListener {
	// Setting the background colour which will remain the same.
	private final static Color BACKGROUND_COLOUR = Color.BLACK;
	// Sets the time between calls.
	private final static int TIMER_DELAY = 5;
	// When this becomes true game starts.
	// Bool not ideal to initialise sophisticated games that may want pause or title
	// screen etc features.
	// boolean gameInitialised = false;
	GameState gameState = GameState.INITIALISING;
	// Create new ball variable.
	Ball ball;
	Paddle paddle1, paddle2;

	public void createObjects() {
		// Start a new ball object with its width and height properties.
		ball = new Ball(getWidth(), getHeight());
		paddle1 = new Paddle(Player.One, getWidth(), getHeight());
		paddle2 = new Paddle(Player.Two, getWidth(), getHeight());
	}

	// If game is initialised, call createObjects to start game.
	// Create the objects here, not in a constructor, because the objects need panel
	// width/height initialised before they get created
	// (they depend on these values)
	/*
	 * private void update() { // If gameInitialised is false (! = not). if
	 * (!gameInitialised) { createObjects(); gameInitialised = true; } }
	 */
	private void update() {
		switch (gameState) {
		case INITIALISING: {
			createObjects();
			gameState = GameState.PLAYING;
			break;
		}
		case PLAYING: {
			break;
		}
		case GAMEOVER: {
			break;
		}
		}
	}

	private void paintSprite(Graphics g, Sprite sprite) {
		g.setColor(sprite.getColour());
		g.fillRect(sprite.getxPosition(), sprite.getyPosition(), sprite.getWidth(), sprite.getHeight());
	}

	public PongPanel() {
		// Import java.awt.Color for this.
		setBackground(BACKGROUND_COLOUR);
		// Adding a timer object
		// Updates the movement and positions of the objects and checks for a winner.
		// Requires library javax.swing.Timer;
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

	// actionPerformed method belonging to the ActionListener class.
	// Overriding a method from a parent class, in this case ActionListener.
	@Override
	public void actionPerformed(ActionEvent event) {
		// Calls the update method.
		update();
	}

	// paintComponent() method which paints graphics to the screen.
	// Requires import java.awt.Graphics; and import java.awt.Graphics2D;
	/*
	 * @Override public void paintComponent(Graphics g) { super.paintComponent(g);
	 * // Testing the graphics (draws a rectangle) // g.setColor(Color.WHITE); //
	 * g.fillRect(20, 20, 100, 100); // Calling the plaintDottedLine method
	 * super.paintComponent(g); paintDottedLine(g); if (gameInitialised) {
	 * paintSprite(g, ball); } paintDottedLine(g); }
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintDottedLine(g);
		if (gameState != GameState.INITIALISING) {
			paintSprite(g, ball);
			paintSprite(g, paddle1);
			paintSprite(g, paddle2);
		}
	}

	// Draws the dotted line down the middle. Will be called from the paintComponent
	// method.
	// Don't focus too much on trying to understand this bit.
	private void paintDottedLine(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
		g2d.setStroke(dashed);
		g2d.setPaint(Color.WHITE);
		// using the width and height of the window as parameters for drawing the line.
		g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
		g2d.dispose();
	}
}
