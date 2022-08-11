import javax.swing.ImageIcon;
import javax.swing.JButton;

public class King {
	private JButton button = new JButton();
	private char color;
	King( Tiles tile, ImageIcon icon, char color) {
		button.setOpaque(false);
		button.setBorder(null);
		button.setContentAreaFilled(false);
		button.setIcon(icon);
		tile.addPiece(button);

		this.color = color;
		
		// TODO Auto-generated constructor stub
	}
	

	public char  getColor() {
		return color;
	}
	
}
