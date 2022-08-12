import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Board {
	// matrix to keep track of the pieces
	public static Tiles tiles[][] = new Tiles[8][8];

	// keeps track of the images
	public ImageIcon[] images = new ImageIcon[12];
	private Rook whiteRook1;
	private Rook whiteRook2;
	private Knight whiteKnight1;
	private Knight whiteKnight2;
	private Bishop whiteBishop1;
	private Bishop whiteBishop2;
	private Queen whiteQueen;
	private King whiteKing;
	private Pawn whitePawn1;
	private Pawn whitePawn2;
	private Pawn whitePawn3;
	private Pawn whitePawn4;
	private Pawn whitePawn5;
	private Pawn whitePawn6;
	private Pawn whitePawn7;
	private Pawn whitePawn8;
	
	private Pawn blackPawn1;
	private Pawn blackPawn2;
	private Pawn blackPawn3;
	private Pawn blackPawn4;
	private Pawn blackPawn5;
	private Pawn blackPawn6;
	private Pawn blackPawn7;
	private Pawn blackPawn8;
	private Rook blackRook1;
	private Rook blackRook2;
	private Knight blackKnight1;
	private Knight blackKnight2;
	private Bishop blackBishop1;
	private Bishop blackBishop2;
	private Queen blackQueen;
	private King  blackKing;
	Board() {

	}

	// creates the board
	public void init(JFrame frame) {
		images[0] = new ImageIcon("whiteRook-PhotoRoom.png");
		images[1] = new ImageIcon("whiteKnightRight-PhotoRoom.png");
		images[2] = new ImageIcon("whiteBishop2-PhotoRoom.png");
		images[3] = new ImageIcon("whiteQueen-PhotoRoom (1).png");
		images[4] = new ImageIcon("kingchess-PhotoRoom (1).png");
		images[5] = new ImageIcon("PawnPiece-removebg-preview.png");
		images[6] = new ImageIcon("blackChesspiecePawn-removebg-preview.png");
		images[7] = new ImageIcon("blackRook-PhotoRoom.png");
		images[8] = new ImageIcon("blackNight-PhotoRoom.png");
		images[9] = new ImageIcon("blackBishop-PhotoRoom.png");
		images[10] = new ImageIcon("blackQueen-PhotoRoom.png");
		images[11] = new ImageIcon("blackKing-PhotoRoom.png");

		int j = 0;
		for (int i = 0; i < 64; i++) {
			// i is for the rows
			// j is for the tiles
			if (i != 0 && i % 8 == 0) {
				j++;

			}
			// creates a new tile
			Tiles tile = new Tiles(j, i);

			// calls method for creating a piece
			createPiece(tile, i, j);

		
			if (i % 2 == 0 && j % 2 == 0) {
				// brown I think
				tile.getButton().setBackground(new Color(150, 120, 77));
			} else if (i % 2 != 0 && j % 2 == 0) {
				// dark brown I think
				tile.getButton().setBackground(new Color(93, 67, 44));
			} else if (i % 2 == 0 && j % 2 != 0) {
				// dark brown I think
				tile.getButton().setBackground(new Color(93, 67, 44));

			} else if (i % 2 != 0 && j % 2 != 0) {
				// brown I think
				tile.getButton().setBackground(new Color(150, 120, 77));
			}

			frame.add(tile.getButton());
		
		}
	}

	public void createPiece( Tiles tile, int x, int y) {


		// white pieces
		if (y == 0 && x == 0) {
			// creates rook
			whiteRook1 = new Rook(tile, images[0], 'w');

			// says this tile has a piece
			tile.setPieceStatus();
		}
		
		if (y == 0 && x == 7) {
			// creates rook
			whiteRook2 = new Rook(tile, images[0], 'w');

			// says this tile has a piece
			tile.setPieceStatus();
			
		}
		if (y == 0 && x == 1) {
			// creates knight
			whiteKnight1 = new Knight(tile, images[1], 'w');

			// says this tile has a piece
			tile.setPieceStatus();

		}
		if (y == 0 && x == 6) {
			// creates knight
			whiteKnight2 = new Knight(tile, images[1], 'w');

			// says this tile has a piece
			tile.setPieceStatus();

		}if (y == 0 && x == 2 ) {
			// creates bishop
			whiteBishop1 = new Bishop(tile, images[2], 'w');
 
		
			// says this tile has a piece
			tile.setPieceStatus();
 
		}
		if (y == 0 && x == 5) {
			// creates bishop
			whiteBishop2 = new Bishop(tile, images[2], 'w');
 
		
			// says this tile has a piece
			tile.setPieceStatus();
 
		}
		if (y == 0 && x == 3) {
			// creates queen
			whiteQueen = new Queen(tile, images[3], 'w');
 
		
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 0 && x == 4) {
			// creates king
			 whiteKing = new King(tile, images[4], 'w');
 
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 8) {
			// creates pawn
			whitePawn1 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 9) {
			// creates pawn
			whitePawn2 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 10) {
			// creates pawn
			whitePawn3 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 11) {
			// creates pawn
			whitePawn4 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 12) {
			// creates pawn
			whitePawn5 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 13) {
			// creates pawn
			whitePawn6 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 14) {
			// creates pawn
			whitePawn7 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		if (y == 1 && x == 15) {
			// creates pawn
			whitePawn8 = new Pawn(tile, images[5], 'w');
		
			// says this tile has a piece;
			tile.setPieceStatus();
		}
		
		
		
		//creates black pieces
		
		if (y == 6 && x == 48) {
			// creates pawn
			blackPawn1 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 49) {
			// creates pawn
			blackPawn2 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 50) {
			// creates pawn
			blackPawn3 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 51) {
			// creates pawn
			blackPawn4 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 52) {
			// creates pawn
			blackPawn5 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 53) {
			// creates pawn
			blackPawn6 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 54) {
			// creates pawn
			blackPawn7 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 6 && x == 55) {
			// creates pawn
			blackPawn8 =  new Pawn(tile, images[6], 'b');
 
			
			// says this tile has a piece
			tile.setPieceStatus();
		}
		if (y == 7 && x == 56 ) {
			// creates rook
			blackRook1 = new Rook(tile, images[7], 'b');

			// says this tile has a piece
			tile.setPieceStatus();
		}
		
		
		
		if(y == 7 && x ==  63) {
			// creates rook
			blackRook2 = new Rook(tile, images[7], 'b');

			// says this tile has a piece
			tile.setPieceStatus();
	

	}
		if (y == 7 && x == 57) {
			// creates knight
			blackKnight1 = new Knight(tile, images[8], 'b');
 
		
 
			// says this tile has a piece
			tile.setPieceStatus();
 
		}
		if (y == 7 && x == 62 ) {
			// creates knight
			blackKnight2 = new Knight(tile, images[8], 'b');
 
		
 
			// says this tile has a piece
			tile.setPieceStatus();
 
		}
		if (y == 7 && x == 58 ) {
			// creates bishop
			//bishop image doesn't work
			blackBishop1 = new Bishop(tile, images[9], 'b');
 
		
			// says this tile has a piece
			tile.setPieceStatus();
 
		}
		if (y == 7 && x == 61) {
			// creates bishop
			blackBishop2 = new Bishop(tile, images[9], 'b');
 
		
			// says this tile has a piece
			tile.setPieceStatus();
 
		}
		if (y == 7 && x == 59) {
			// creates queen
			blackQueen = new Queen(tile, images[10], 'b');
			
		
 
			// says this tile has this piece
			tile.setPieceStatus();
		}
		if (y == 7 && x == 60) {
			// creates king
			blackKing = new King(tile, images[11], 'b');
 
			
 
			// says this tile has this piece
			tile.setPieceStatus();
		}

}
}
