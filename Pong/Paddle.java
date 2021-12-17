import java.awt.Color;

public class Paddle extends Sprite {
	private static final int PADDLE_WIDTH = 10;
	private static final int PADDLE_HEIGHT = 100;
	private static final Color PADDLE_COLOUR = Color.WHITE;
	private static final int DISTANCE_FROM_EDGE = 40;

	public Paddle(Player player, int panelWidth, int panelHeight) {
		// Set the width, height, and colour.
		setWidth(PADDLE_WIDTH);
		setHeight(PADDLE_HEIGHT);
		setColour(PADDLE_COLOUR);
		// Setting the initial position of both paddles.
		int xPos;
		if (player == Player.One) {
			// Using DISTANCE_FROM_EDGE to determine the x position of both paddles.
			// Player.One paddle is simple on the left, but Player.Two needs a calculation to determine it's position on right.
			xPos = DISTANCE_FROM_EDGE;
		} else {
			// xPos = screen width – DISTANCE_FROM_EDGE – paddle width.
			xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
		}
		
		setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();
	}
}
