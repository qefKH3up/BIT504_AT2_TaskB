import java.awt.Color;
// For the rectangle object that can be used for the ball and paddles.
import java.awt.Rectangle;

// Both ball and paddle will inherit this base class.
// This is because they share: position they are current at, and velocity
public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	// The dimensions of the sprite.
	private int width, height;
	// Colour variable requires library java.awt.color.
	private Color colour;
	// Starting position of a sprite (used for both paddles and ball)
	private int initialXPosition;
	private int initialYPosition;

	// GETTER METHODS
	public int getxPosition() {
		return xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public int getxVelocity() {
		return xVelocity;
	}

	public int getyVelocity() {
		return yVelocity;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColour() {
		return colour;
	}

	// SETTER METHODS
	public void setColour(Color colour) {
		this.colour = colour;
	}

	// When calling this method the program needs to check if the new position is
	// outside the screen.
	// The next four methods demonstrate METHOD OVERLOADING
	// - more than one method has the same name, but different argument lists ()
	// - that way a metho can be called using one set of args or the other depending
	// on the situation.
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	// These methods will check if position is outside screen and return it to
	// screen edge if so.
	public void setxPosition(int newX, int panelWidth) {
		xPosition = newX;
		if (xPosition < 0) {
			xPosition = 0;
		} else if (xPosition + width > panelWidth) {
			xPosition = panelWidth - width;
		}
	}

	public void setyPosition(int newY, int panelHeight) {
		yPosition = newY;
		if (yPosition < 0) {
			yPosition = 0;
		} else if (yPosition + height > panelHeight) {
			yPosition = panelHeight - height;
		}
	}

	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}

	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// One method to set both ball and paddles initial starting place.
	public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}

	// Method to set the x and y position of the object to the initial x and y
	// positions.
	public void resetToInitialPosition() {
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}

	// Uses java.awt.Rectangle; to create rectangle object that will be used to make the paddles and ball.
	public Rectangle getRectangle() {
		return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
	}
}