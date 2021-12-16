import javax.swing.JFrame;

// Pong class inherits from JFrame class and allows JFrame methods to be used to create frame/window.
public class Pong extends JFrame {
	// Fixed value variables.
    private final static String WINDOW_TITLE = "Pong";
    private final static int WINDOW_WIDTH = 800;
    private final static int WINDOW_HEIGHT = 600;
	// Creating a single Pong class and setting variables.
	public Pong() {
		// Using variable names eg: WINDOW_TITLE to refer to final static variables.
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		// Used in certain applications that have multiple windows. 
		setVisible(true);
		// Determines what happens when the user clicks the close option.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Pong();
	}
}