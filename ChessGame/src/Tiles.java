import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Tiles {

	private Point coords;
	 JButton tiles;
	private boolean hasPiece = false;
	Tiles( int x, int y ){
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
	//add action listener to all the buttons 
}
