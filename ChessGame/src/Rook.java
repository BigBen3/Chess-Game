import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Rook {
	private JButton button = new JButton();
	private char color;
	Rook(Tiles tile, ImageIcon icon, char color) {
		button.setOpaque(false);
		button.setBorder(null);
		button.setContentAreaFilled(false);
		button.setIcon(icon);
		tile.addPiece(button);
		this.color = color;
		// TODO Auto-generated constructor stub
		
	}
	
	

}
