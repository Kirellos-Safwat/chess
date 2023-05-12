package com.chessgame.Pieces;

import java.awt.Color;
//import java.nio.file.Path;

import javax.swing.ImageIcon;

public class PieceImages {
	static Color WHITECOLOR = Color.WHITE;
	static Color BLACKCOLOR = Color.BLACK;

	static ImageIcon wk;
	static ImageIcon bk;
	static ImageIcon wr;
	static ImageIcon br;
	static ImageIcon wq;
	static ImageIcon bq;
	static ImageIcon wb;
	static ImageIcon bb;
	static ImageIcon wn;
	static ImageIcon bn;
	static ImageIcon wp;
	static ImageIcon bp;

	public PieceImages() {
		wk = new ImageIcon("wk.png");
		bk = new ImageIcon("bk.png");
		wr = new ImageIcon("wr.png");
		br = new ImageIcon("br.png");
		wq = new ImageIcon("wq.png");
		bq = new ImageIcon("bq.png");
		wb = new ImageIcon("wb.png");
		bb = new ImageIcon("bb.png");
		wn = new ImageIcon("wn.png");
		bn = new ImageIcon("bn.png");
		wp = new ImageIcon("wp.png");
		bp = new ImageIcon("bp.png");
	}
}
