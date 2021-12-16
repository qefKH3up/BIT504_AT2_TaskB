import javax.swing.JFrame;

// Pong class inherits from JFrame class and allows JFrame methods to be used to create frame/window.
public class Pong extends JFrame {
	// Fixed value variables - OOP convention is to declare these in the class in
	// which they will be used.
	// If they are needed outside of this class then methods will be used to access
	// them.
	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;

	// Creating a single Pong class and setting variables.
	public Pong() {
		// Using variable names eg: WINDOW_TITLE to refer to final static variables.
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		// Add the panel to the frame using JFrame method.
		add(new PongPanel());
		// Used in certain applications that have multiple windows.
		setVisible(true);
		// Determines what happens when the user clicks the close option.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// Creating a Swing GUI, an API for providing a graphic user interface for the
		// program.
		// Swing GUI components are not thread-safe and should only be accessed from one
		// thread called the the Event Dispatch thread (EDT).
		// The EDT invokes callback methods paint() and update() as well as Event
		// Listener interfaces ActionListener and KeyListener.
		// SwingUtilities.invokeLater() method will delay the GUI creation task until
		// the initial thread's tasks have been completed.
		// The invokeLater() method can be called from any thread to request the
		// event-dispatching thread to run certain code.
		// You must put the code you want to run in the run method of a Runnable object
		// and specify the Runnable object as the argument to invokeLater().
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong();
			}
		});
		new Pong();
	}
}