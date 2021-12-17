import java.awt.Color;

// Ball class which will inherit from the Sprite class.
public class Ball extends Sprite {
	private static final int BALL_WIDTH = 25;
	private static final int BALL_HEIGHT = 25;
	private static final Color BALL_COLOUR = Color.WHITE;
	

	// Constructor to set the initial width, height and colour of the ball.
	public Ball(int panelWidth, int panelHeight) {
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setColour(BALL_COLOUR);
		// Positions the ball in the centre of the screen. 
		// Takes width of the panel and divides in half then subtracts half of the ball width. 
		// So the middle of the ball is in the middle of the axis. Then the same is done for height.
		// If the ball width or height changes it will automatically adjust.
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();
	}
}
