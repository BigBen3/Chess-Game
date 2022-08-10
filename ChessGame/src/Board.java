import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Board {
	//matrix to keep track of the pieces
	public static Tiles tiles[][] = new Tiles[8][8];
	
	//keeps track of the images
	public ImageIcon[] images = new ImageIcon[12];
	private Rook whiteRook1;
	private Rook whiteRook2;
	private Bishop whitpeBishop1;
	private Bishop whiteBishop2;
		Board(){
			
		}
		
		//creates the board 
		public void init(JFrame frame) {
			images[0] =  new ImageIcon("whiteRook-PhotoRoom.png");
			images[1] = new ImageIcon("whiteKnightRight-PhotoRoom.png");
			images[2] =  new ImageIcon("whiteBishop2-PhotoRoom.png");
			images[3] =  new ImageIcon("whiteQueen-PhotoRoom (1).png");
			images[4] = new ImageIcon("kingchess-PhotoRoom (1).png");
			images[5] = new ImageIcon("PawnPiece-removebg-preview.png");
			images[6] = new ImageIcon("blackChesspiecePawn-removebg-preview.png");
			images[7] = new ImageIcon("blackRook-PhotoRoom.png");
			images[8] =  new ImageIcon("blackNight-PhotoRoom.png");
			images[9] = new ImageIcon("blackBishop-PhotoRoom.png");
			images[10] = new ImageIcon("blackQueen-PhotoRoom.png");
			images[11] =  new ImageIcon("blackKing-PhotoRoom.png");
			
			int j = 0;
			for(int i = 0; i < 64; i++) {
				//i is for the rows 
				//j is for the tiles
				
				 
				 //creates a new tile
				 Tiles tile = new Tiles(i,j);
				 
				 //calls method for creating a piece
				 createPiece(tile,i,j);
				 
	 
			
			
	 
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
		
		public void createPiece( Tiles tile, int x, int y ) {
			JButton piece = new JButton();
			piece.setOpaque(false);
			piece.setBorder(null);
			piece.setContentAreaFilled(false);

	        //white pieces
	        if(y == 0 && x == 0 || x == 7) {
	            //creates rook
	        	Rook rook = new Rook(piece, 'w');
	        	
	        	//sets rook icon
	        	rook.getButton().setIcon(images[0]);
	        	
	        	//says this tile has a piece
	        	tile.setPieceStatus();
	        }
	        if(y == 0 && x == 1 || x == 6) {
	            //creates knight
	        	Knight knight = new Knight(piece, 'w');
	        	
	        	//sets knight icon
	        	knight.getButton().setIcon(images[1]);
	        	
	        	//says this tile has a piece
	        	tile.setPieceStatus();
	         
	        }
	        if(y == 0 && x == 2 || x == 5) {
	            //creates bishop
	        	Bishop bishop = new Bishop(piece, 'w');
	        	
	        	//sets bishop icon
	        	bishop.getButton().setIcon(images[2]);
	        	
	        	//says this tile has a piece
	        	tile.setPieceStatus();
	          
	        }
	        if(y == 0 && x == 3 ) {
	            //creates queen
	           Queen queen = new Queen(piece, 'w');
	           
	           //sets queen icon
	           queen.getButton().setIcon(images[3]);
	           
	           //says this tile has a piece
	           tile.setPieceStatus();
	        }
	        if(y == 0  && x == 4) {
	            //creates king
	           King king = new King(piece, 'w');
	           
	           //sets king icon
	           king.getButton().setIcon(images[4]);
	           
	           
	           //adds king image to board
	          tile.addPiece(king.getButton());
	           
	           //says this tile has a piece;
	           tile.setPieceStatus();
	        }
	        if(y == 1) {
	            //creates pawn
	        	Pawn pawn = new Pawn(piece, 'w');
	        	
	        	//sets pawn icon;
	        	pawn.getButton().setIcon(images[5]);
	        	
	        	//says this tile has a piece;
	        	tile.setPieceStatus();
	        }

	        //black pieces
	        if(y == 6) {
	        	//creates pawn
	        	Pawn pawn = new Pawn(piece, 'b');
	        	
	        	//sets pawn icon
	        	pawn.getButton().setIcon(images[6]);
	        	
	        	//says this tile has a piece
	        	tile.setPieceStatus();
	          }
	        if(y == 7 && x == 52 || x == 63) {
	            //creates rook
	        	Rook rook = new Rook(piece, 'b');
	        	
	        	//sets rook icon
	        	rook.getButton().setIcon(images[7]);
	        	
	        	//says this tile has a piece 
	           tile.setPieceStatus();
	        }
	        if(y == 7 && x == 53 || x ==  62) {
	            //creates knight
	           Knight knight = new Knight(piece, 'b');
	           
	           //sets knight icon
	           knight.getButton().setIcon(images[8]);
	           
	           //says  this tile has a piece
	           tile.setPieceStatus();
	        }
	        if(y == 7 && x == 54 || x == 61) {
	            //creates bishop
	        	Bishop bishop = new Bishop(piece, 'b');
	        	
	        	//sets bishop icon
	        	bishop.getButton().setIcon(images[9]);
	        	
	        	//says this tile has a piece 
	        	tile.setPieceStatus();

	        }
	        if(y == 7 && x == 55) {
	            //creates queen
	        	Queen queen = new Queen(piece, 'b');
	        	
	        	//sets queen icon
	        	queen.getButton().setIcon(images[10]);
	        	
	        	//says this tile has this piece
	        	tile.setPieceStatus();
	        }
	        if(y == 7 && x == 56) {
	            //creates king
	        	King king = new King(piece, 'b');
	        	
	        	//sets king icon
	        	king.getButton().setIcon(images[11]);
	        	
	            //adds king image to board
	        	  
		          tile.addPiece(king.getButton());
		           
	        	//says this tile has this piece
	        	tile.setPieceStatus();
	        }
	      
	    }
	
}

