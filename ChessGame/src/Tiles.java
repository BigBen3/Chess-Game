import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Tiles {
	Point coords;
	JButton tiles;
	Tiles(int x, int y ){
		tiles = new JButton();
		tiles.setBorder(BorderFactory.createEtchedBorder());
		coords = new Point(x,y);
	}
	
	public Point getTilesPosition() {
		return coords;
	}
}
