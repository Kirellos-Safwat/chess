package com.chessgame.Pieces;
import com.chessgame.Board.Board;
import com.chessgame.Board.Move;

import javax.swing.*;

public class Knight extends Piece{
	
	public Knight(int x, int y, boolean isWhite, Board board, int value) {
		super(x, y, isWhite, board, value);
//		this.pieceImage = PieceImages.KNIGHT;
	}
	public Knight(boolean isWhite){
		super(isWhite);
		image = new ImageIcon(isWhite ? "wn.png" : "bn.png");
	}
	//to get the image of piece(knight)
	@Override
	public void initializeSide(int value){
		super.initializeSide(value);
		if(isWhite()) {
			image = PieceImages.wn;
		}
		else {
			image = PieceImages.bn;
		}
	}
	// to detect possible moves
	public boolean canMove(int x ,int y, Board board) {

			if((board.getPiece(x, y) != null && board.getPiece(x, y).isWhite() == isWhite())) {
				cannotMove(x,y,board);
				return false;
			}
			return knightMove(x,y,board);
	}
	public boolean knightMove(int x,int y,Board board){
		int i = Math.abs(x-xCord);
		int j = Math.abs(y-yCord);

		if(i == 2 && j == 3) return true;
		return i == 3 && j == 2;
	}
	public void cannotMove(int x, int y, Board board){
		if(knightMove(x,y,board))
			this.cannotMove.add(new Move(this.xCord,this.yCord,x,y,board.getPiece(x,y)));
	}
}
