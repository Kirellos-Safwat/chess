package com.chessgame.Frame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.io.Serial;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.chessgame.Game.*;
import com.chessgame.Pieces.Piece;


public class Panel extends JPanel {

//	@Serial
//	private static final long serialVersionUID = 1L;
	public Game game;
	int ti,tj;
	public static int xx, yy;
	Point point = this.getLocation();
	Panel(){
		this.setFocusable(true);
		this.addMouseListener(new Listener());
		//MouseListener handles events related to mouse clicks and button presses
		this.addMouseMotionListener(new Listener());
		//MouseMotionListener handles events related to mouse movement and position changes
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 37) {
					Game.board.undoMove(game);
					Game.drawDeadPieces();
				}
			}
		});
		game = new Game();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.draw(g, xx, yy, this);
	}




	class Listener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(SwingUtilities.isLeftMouseButton(e)) {
					int x = e.getX() / Piece.size;
					int y = e.getY() / Piece.size;
					Game.drag = false;
					game.active = null;
					game.selectPiece(x, y);
					revalidate();//ensures that the layout is updated correctly
					repaint();
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// temp index i and j for the gui
			if (e.getX() > point.getX() && e.getX() < (point.getX()+Frame.x) && e.getY() > point.getY() && e.getY() < (point.getY()+Frame.y)) {				ti = e.getX() / Piece.size;
				tj = e.getY() / Piece.size;
				if (Game.board.getPiece(ti, tj) != null) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				} else {
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
				revalidate();
				repaint();
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if(!Game.drag && game.active != null) {
				game.active = null;
			}
				if (SwingUtilities.isLeftMouseButton(e)) {
					game.selectPiece(e.getX() / Piece.size, e.getY() / Piece.size);
					Game.drag = true;
					xx = e.getX();
					yy = e.getY();
				}
				revalidate();
				repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
				int x = e.getX() / Piece.size;
				int y = e.getY() / Piece.size;
				game.move(x, y);             // when releasing the mouse it takes the coordinates and move the active piece
				revalidate();
				repaint();
		}
	}
}
