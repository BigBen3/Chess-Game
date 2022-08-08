import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Board {
	//matrix to keep track of the pieces
	public static Tiles tiles[][] = new Tiles[8][8];
	
	//keeps track of the images
	public ImageIcon[] images = new ImageIcon[12];
	
		Board(){
			
		}
		
		//creates the board 
		public void init(JFrame frame) {
			int j = 0;
			for(int i = 0; i < 64; i++) {
				//i is for the rows 
				//j is for the tiles
				
				 
				 //creates a new tile
				 Tiles tile = new Tiles(i,j);
				
	 
	 
			
			
	 
				if(i != 0 && i % 8 == 0 ) {
					j++;
	 
				}
				if(i % 2 == 0 && j % 2 == 0) {
					//brown I think
					tile.tiles.setBackground(new Color(150, 120, 77));
				}
				else if(i % 2 != 0 && j % 2 == 0 ) {
					//dark brown I think
					tile.tiles.setBackground(new Color(93, 67, 44));
				}
				else if(i % 2 == 0 && j % 2 != 0 ) {
					//dark brown I think
					tile.tiles.setBackground(new Color(93, 67, 44));
				
					
				}
				else if(i % 2 != 0 && j % 2 != 0 ) {
					//brown I think
					tile.tiles.setBackground(new Color(150, 120, 77));
				}
	 
	 
	 
	 
				frame.add(tile.tiles);
	 
			}
		}
}
