package com.chessgame.Frame;
import Login_Form.MainMenu;
import Login_Form.Player;
import Login_Form.SetUp;
import com.chessgame.Game.Game;

import javax.swing.*;
import java.awt.*;
//import java.io.Serial;

public class Frame extends JFrame {

	//	@Serial
//	private static final long serialVersionUID = -4442947819954124379L;
	public static final int x = 640;
	public static final int y = 640;

	public static LabelTimer label1 = new LabelTimer(Player.minute,Player.second);
	public static LabelTimer label2 = new LabelTimer(Player.minute,Player.second);
	public static Panel board ;
	JLabel player1 = new JLabel(SetUp.player1.name);
	JLabel player2 = new JLabel(SetUp.player2.name);
	public static JPanel wDead;
	public static JPanel bDead;
	public Frame() {

		this.setSize(1000, 820);
		this.setLayout(new BorderLayout());
		this.setTitle("Chess");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		board = new Panel();
		board.setPreferredSize(new Dimension(x, y));

		wDead = new JPanel(new GridLayout(8,2));
		wDead.setPreferredSize(new Dimension(160,640));
		bDead = new JPanel(new GridLayout(8,2));
		bDead.setPreferredSize(new Dimension(160,640));

		player1.setFont(new Font("mv boli",Font.BOLD,24));
		player2.setFont(new Font("mv boli",Font.BOLD,24));
		//back button
//		JButton back = new JButton("Back");
//		back.addActionListener(this::backActionPerformed);//	back button listener
//		back.setPreferredSize(new Dimension(70,30));
		//	for the north panel that contains {timer,players' name,back timer}
		JPanel nPanel = new JPanel(new BorderLayout());
		nPanel.setPreferredSize(new Dimension(640,95));

//		JPanel nCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//		nCenterPanel.add(back);

		JPanel nLeftPanel = new JPanel(new BorderLayout());
		nLeftPanel.setPreferredSize(new Dimension(428,100));
		JPanel nRightPanel = new JPanel(new BorderLayout());
		nRightPanel.setPreferredSize(new Dimension(428,100));
//		JPanel nNorthPanel = new JPanel();
//		nNorthPanel.setPreferredSize(new Dimension(680,40));

//		nPanel.add(nNorthPanel,BorderLayout.NORTH);
//		nPanel.add(nCenterPanel,BorderLayout.CENTER);
		nPanel.add(nLeftPanel,BorderLayout.WEST);

		JPanel nLeftNorth = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel nLeftSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel nRightNorth = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel nRightSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
		nPanel.add(nRightPanel,BorderLayout.EAST);

		nLeftPanel.add(nLeftNorth,BorderLayout.NORTH);
		nLeftPanel.add(nLeftSouth,BorderLayout.SOUTH);

		nLeftNorth.add(player1);
		nLeftSouth.add(label1);

		nRightPanel.add(nRightNorth,BorderLayout.NORTH);
		nRightPanel.add(nRightSouth,BorderLayout.SOUTH);


		nRightNorth.add(player2);
		nRightSouth.add(label2);


		JPanel sPanel = new JPanel(new BorderLayout());
//		sPanel.add(back, BorderLayout.WEST);
//		JPanel ePanel = new JPanel();
//		JPanel wPanel = new JPanel();


		// Add components to containers
		JPanel centerContainer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		centerContainer.add(wDead);                  // adding from left to right
		centerContainer.add(board);
		centerContainer.add(bDead);

		add(centerContainer, BorderLayout.CENTER);
		add(nPanel, BorderLayout.NORTH);
		add(sPanel, BorderLayout.SOUTH);
//		add(ePanel, BorderLayout.EAST);
//		add(wPanel, BorderLayout.WEST);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
//	private void backActionPerformed(java.awt.event.ActionEvent evt){
////		System.exit(0);
//		this.dispose();
//		MainMenu mainMenu = new MainMenu();
//		mainMenu.setVisible(true);
//		Game.board.lastMoves.clear();
//		Game.board.deadPieces.clear();
//		Game.AllPieces.clear();
//	}
}




