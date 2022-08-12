import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Knight{
	private JButton button = new JButton();
	private char color;
	Knight(Tiles tile, ImageIcon icon, char color) {
		button.setOpaque(false);
		button.setBorder(null);
		button.setContentAreaFilled(false);
		button.setIcon(icon);
		tile.addPiece(button);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	public JButton getButton() {
		return button;
	
}
}
