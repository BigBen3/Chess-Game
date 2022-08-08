import java.awt.Point;

public class Tiles {
	Point coords;
	
	Tiles(int x, int y ){
		coords = new Point(x,y);
	}
	
	public Point getTilesPosition() {
		return coords;
	}
}
