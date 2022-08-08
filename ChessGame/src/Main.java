import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		//setting up the frame
		JFrame frame = new JFrame();
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setTitle("Test program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(8,8));
		frame.setResizable(true);
		
		
		//creating the board
		Board board = new Board();
		board.init(frame);
		
		
		//making the frame visible
		frame.setVisible(true);
	}
}
