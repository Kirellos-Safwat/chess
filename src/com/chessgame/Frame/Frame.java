package com.chessgame.Frame;
<<<<<<< HEAD
import Login_Form.*;
import com.chessgame.Board.Board;
=======
import Login_Form.MainMenu;
import Login_Form.Player;
import Login_Form.SetUp;
>>>>>>> 6f9f3de27ca8010fdacf7e934d8f021d10b92ca1
import com.chessgame.Game.Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
//import java.io.Serial;

public class Frame extends JFrame {

	//	@Serial
//	private static final long serialVersionUID = -4442947819954124379L;
	public static final int x = 640;
	public static final int y = 640;

	public static LabelTimer label1;
	public static LabelTimer label2;
	public static Panel board ;
	JLabel player1 = new JLabel(SetUp.player1.name);
	JLabel player2 = new JLabel(SetUp.player2.name);
	public static JPanel wDead;
	public static JPanel bDead;
<<<<<<< HEAD

	private JButton BackButton;
	Music music = new Music();
	String soundEffect = "MenuSoundEffect.wav";
=======
>>>>>>> 6f9f3de27ca8010fdacf7e934d8f021d10b92ca1
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
		player1.setForeground(new Color(227,210,180));
		player2.setFont(new Font("mv boli",Font.BOLD,24));
		player2.setForeground(new Color(227,210,180));

		//	for the north panel that contains {timer,players' name,back timer}
		JPanel nPanel = new JPanel(new BorderLayout());
		nPanel.setPreferredSize(new Dimension(640,95));

		JPanel nLeftPanel = new JPanel(new BorderLayout());
		nLeftPanel.setPreferredSize(new Dimension(428,100));
		JPanel nRightPanel = new JPanel(new BorderLayout());
		nRightPanel.setPreferredSize(new Dimension(428,100));

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


<<<<<<< HEAD
		JPanel sPanel = new JPanel(new BorderLayout());
		BackButton = new JButton("Back");
		BackButton.setBackground(new Color(204, 204, 204));
		BackButton.setFont(new Font("Papyrus", 2, 24)); // NOI18N
		BackButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BackButtonActionPerformed(evt);
			}
		});
		sPanel.add(BackButton,BorderLayout.WEST);
//		sPanel.add(back, BorderLayout.WEST);
//		JPanel ePanel = new JPanel();
//		JPanel wPanel = new JPanel();
=======
//		JPanel sPanel = new JPanel(new BorderLayout());

>>>>>>> 6f9f3de27ca8010fdacf7e934d8f021d10b92ca1


		// Add components to containers
		JPanel centerContainer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		centerContainer.add(wDead);                  // adding from left to right
		centerContainer.add(board);
		centerContainer.add(bDead);

		add(centerContainer, BorderLayout.CENTER);
		add(nPanel, BorderLayout.NORTH);
//		add(sPanel, BorderLayout.SOUTH);



		JPanel bgPanel = new JPanel(new BorderLayout()) {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				ImageIcon bgImage = new ImageIcon("background2.jpg");
				g.drawImage(bgImage.getImage(), 0, 0, getWidth(), getHeight(), this);
			}
		};

// Set the layout of the content pane to BorderLayout
		getContentPane().setLayout(new BorderLayout());

// Set the opaque property of the board, wDead, and bDead panels to false
		centerContainer.setOpaque(false);

		board.setOpaque(false);
		wDead.setOpaque(false);
		bDead.setOpaque(false);


		nPanel.setOpaque(false);

		nRightPanel.setOpaque(false);
		nRightNorth.setOpaque(false);
		nRightSouth.setOpaque(false);


		nLeftPanel.setOpaque(false);
		nLeftNorth.setOpaque(false);
		nLeftSouth.setOpaque(false);

// Add the background panel to the content pane as the center component
		getContentPane().add(bgPanel, BorderLayout.CENTER);

// Add the other panels to the background panel
		bgPanel.add(nPanel,BorderLayout.NORTH);
		bgPanel.add(centerContainer,BorderLayout.CENTER);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
<<<<<<< HEAD

	private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		music.PlaySoundEffect(soundEffect);
//		Login.settings.setVisible(true);
		 this.dispose();
		 MainMenu mainMenu = new MainMenu();
		 mainMenu.setVisible(true);
		 Game.AllPieces =new ArrayList<>();
		 Game.board =new Board();
		 Game.allEnemyMove = new ArrayList<>();
		 label1.timer.stop();
		 label2.timer.stop();
		 Game.drag = false;
		 Game.player = true;
		 Game.gameOver = false;
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
=======
>>>>>>> 6f9f3de27ca8010fdacf7e934d8f021d10b92ca1
}




