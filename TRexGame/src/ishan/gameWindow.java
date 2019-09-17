package ishan;

import javax.swing.JFrame;

public class gameWindow extends JFrame {
	
	public static final int SCREEN_WIDTH = 600;
	private gameScreen gameScreen;
	
	public gameWindow() {
		super("Java T-Rex game");
		setSize(SCREEN_WIDTH, 175);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		gameScreen = new gameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String args[]) {
		(new gameWindow()).startGame();
	}
}
