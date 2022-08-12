import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Tiles {

	private Point coords;
	private JButton tiles;
	private boolean hasPiece = false;
	Tiles( int y, int x  ){
		tiles = new JButton();
		tiles.setBorder(BorderFactory.createEtchedBorder());
		coords = new Point(x,y);
		
	}
	
	public Point getTilesPosition() {
		return coords;
	}
	
	public void setPieceStatus() {
		hasPiece = true;
	}
	
	public boolean getPieceStatus() {
		return hasPiece;
	}
	
	public void addPiece(JButton button) {
		tiles.add(button);
	}
	
	
	public JButton getButton() {
		return  tiles;
	}
	//add action listener to all the buttons 
}
