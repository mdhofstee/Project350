package project350;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
/**
 * Creates and fills the Yahtzee board with Jcomponents.
 * @author Overman, Hofstee
 * 
 */
public class YahtzeeGUI implements ActionListener {
	/**
	 * The frame of the GUI.
	 */
	private JFrame guiFrame = new JFrame();
	/**
	 * 
	 */
	private int size = Integer.parseInt(JOptionPane.showInputDialog("Number of Players?"));
	/**
	 * 
	 */
	private JButton[][] buttons  = new JButton[21][size + 1];
	/**
	 * 
	 */
	private Font myFont = new Font("Serif", Font.BOLD, 16);
	/**
	 * 
	 */
	private int[] rolls = new int[5];
	/**
	 * 
	 */
	private int playerturn = 1;
	/**
	 * 
	 */
	private Player[] players = new Player[size];
	/**
	 * 
	 */
	private Player[] fakeplayers = new Player[size];
	/**
	 * 
	 */
	private JMenuBar menuBar;
	/**
	 * 
	 */
	private JMenu save, load, changeColor;
	/**
	 * 
	 */
	private JMenuItem red, blue, green, black;
	/**
	 * 
	 */
	private final JCheckBox checkBox1 = new JCheckBox();
	/**
	 * 
	 */
	private final JCheckBox checkBox2 = new JCheckBox();
	/**
	 * 
	 */
	private final JCheckBox checkBox3 = new JCheckBox();
	/**
	 * 
	 */
	private final JCheckBox checkBox4 = new JCheckBox();
	/**
	 * 
	 */
	private final JCheckBox checkBox5 = new JCheckBox();
	/**
	 * 
	 */
	private Color colorred = Color.red;
	private Color colorgreen = Color.green;
	private Color colorblue = Color.blue;
	private Color colorblack = Color.black; 
	@SuppressWarnings("unused")
	private Boolean nextTurn = false;
	/**
	 * 
	 */
	public void load() {
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Yahtzee!");
		guiFrame.setSize(1080, 970);
		guiFrame.setLayout(new GridLayout(21, size + 1));
		guiFrame.setVisible(true);
		
		for (int i = 0; i < size; i++) {
			players[i] = new Player();
			fakeplayers[i] = new Player();
		}
		
		menuBar = new JMenuBar();
		save = new JMenu("Save");
		save.addActionListener(this);
		save.setMnemonic(KeyEvent.VK_S);
		load = new JMenu("Load");
		load.addActionListener(this);
		load.setMnemonic(KeyEvent.VK_L);
		red = new JMenuItem("red");
		red.addActionListener(this);
		blue = new JMenuItem("blue");
		blue.addActionListener(this);
		green = new JMenuItem("green");
		green.addActionListener(this);
		black = new JMenuItem("black");
		black.addActionListener(this);
		changeColor = new JMenu("Change Background");
		changeColor.addActionListener(this);
		changeColor.setMnemonic(KeyEvent.VK_S);
		changeColor.add(red);
		changeColor.add(blue);
		changeColor.add(green);
		changeColor.add(black);
		menuBar.add(save);
		menuBar.add(load);
		menuBar.add(changeColor);
		guiFrame.setJMenuBar(menuBar);
		
		scoreBoxes();
		labels();
	}
	
	/**
	 * 
	 */
	public void scoreBoxes() {
		for (int r = 0; r < 21; r++) {
            for (int c = 0; c < size + 1; c++) {         
                buttons[r][c] = new JButton("0");
                buttons[r][c].setFont(myFont);
                buttons[r][c].setPreferredSize(new Dimension(200, 40));
                buttons[r][c].addActionListener(this);
                guiFrame.add(buttons[r][c]);
            }
        }  
		guiFrame.pack();
	}

	/**
	 * 
	 */
	public void labels() {
		buttons[0][0].setText("Players: "); 
		buttons[0][0].setFont(myFont);
		buttons[0][0].setEnabled(false);	
		
		for (int i = 1; i < size + 1; i++) {
			buttons[0][i].setText("Player " + i);
			buttons[0][i].setFont(myFont);
			buttons[0][i].setEnabled(false);
		}
		
		buttons[1][0].setText("Aces: ");
		buttons[1][0].setFont(myFont);
		buttons[1][0].setEnabled(false);
		
		buttons[2][0].setText("Twos: ");
		buttons[2][0].setFont(myFont);
		buttons[2][0].setEnabled(false);
		
		buttons[3][0].setText("Threes: ");
		buttons[3][0].setFont(myFont);
		buttons[3][0].setEnabled(false);
		
		buttons[4][0].setText("Fours: ");
		buttons[4][0].setFont(myFont);
		buttons[4][0].setEnabled(false);
		
		buttons[5][0].setText("Fives: ");
		buttons[5][0].setFont(myFont);
		buttons[5][0].setEnabled(false);
		
		buttons[6][0].setText("Sixes: ");
		buttons[6][0].setFont(myFont);
		buttons[6][0].setEnabled(false);
		
		buttons[7][0].setText("Total Score: ");
		buttons[7][0].setFont(myFont);
		buttons[7][0].setEnabled(false);
		
		buttons[8][0].setText("Bonus: ");
		buttons[8][0].setFont(myFont);
		buttons[8][0].setEnabled(false);
		
		buttons[9][0].setText("Total: ");
		buttons[9][0].setFont(myFont);
		buttons[9][0].setEnabled(false);
		
		buttons[10][0].setText("3 of a Kind: ");
		buttons[10][0].setFont(myFont);
		buttons[10][0].setEnabled(false);
		
		buttons[11][0].setText("4 of a Kind: ");
		buttons[11][0].setFont(myFont);
		buttons[11][0].setEnabled(false);
		
		buttons[12][0].setText("Full House: ");
		buttons[12][0].setFont(myFont);
		buttons[12][0].setEnabled(false);
		
		buttons[13][0].setText("Small Straight: ");
		buttons[13][0].setFont(myFont);
		buttons[13][0].setEnabled(false);
		
		buttons[14][0].setText("Large Straight: ");
		buttons[14][0].setFont(myFont);
		buttons[14][0].setEnabled(false);
		
		buttons[15][0].setText("Yahtzee: ");
		buttons[15][0].setFont(myFont);
		buttons[15][0].setEnabled(false);
		
		buttons[16][0].setText("Chance: ");
		buttons[16][0].setFont(myFont);
		buttons[16][0].setEnabled(false);
		
		buttons[17][0].setText("Yahtze Bonus: ");
		buttons[17][0].setFont(myFont);
		buttons[17][0].setEnabled(false);
		
		buttons[18][0].setText("Lower Total: ");
		buttons[18][0].setFont(myFont);
		buttons[18][0].setEnabled(false);
		
		buttons[19][0].setText("Upper Total: ");
		buttons[19][0].setFont(myFont);
		buttons[19][0].setEnabled(false);
		
		buttons[20][0].setText("Grand Total: ");
		buttons[20][0].setFont(myFont);
		buttons[20][0].setEnabled(false);
	}
	/**
	 * 
	 */
	public void turn() {		
		
		Dice dice = new Dice();
		
		Object[] nextturn = {"It's now player " + playerturn + "'s turn"};
		
		JOptionPane.showConfirmDialog(null, nextturn, "Player " + playerturn + "'s turn", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		for (int k = 0; k < 5; k++) {
			rolls[k] = dice.roll();
		}
		
		for (int j = 0; j < 2; j++) {
			Object[] inputFields = {"Reroll " + rolls[0] + "?", checkBox1,
					"Reroll " + rolls[1] + "?", checkBox2,
					"Reroll " + rolls[2] + "?", checkBox3, "Reroll " + rolls[3] + "?", checkBox4,
					"Reroll " + rolls[4] + "?", checkBox5 };

			JOptionPane.showConfirmDialog(null, inputFields, "Player" + playerturn + " turn",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			if (checkBox1.isSelected()) {
				rolls[0] = dice.roll();
			}
			if (checkBox2.isSelected()) {
				rolls[1] = dice.roll();
			}
			if (checkBox3.isSelected()) {
				rolls[2] = dice.roll();
			}
			if (checkBox4.isSelected()) {
				rolls[3] = dice.roll();
			}
			if (checkBox5.isSelected()) {
				rolls[4] = dice.roll();
			}
			Object[] rollMessage = {"You rolled a " 
					+ rolls[0] + ", " 
					+ rolls[1] + ", " 
					+ rolls[2] + ", " 
					+ rolls[3] + ", " 
					+ rolls[4] };

			JOptionPane.showConfirmDialog(null, rollMessage, "Player" + playerturn + " turn",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);	
		}
			for (int i = 0; i < 5; i++) {

 				if (rolls[i] == 1) {
 					players[playerturn - 1].setOnes(players[playerturn - 1].getOnes() + 1);
 				}
 				if (rolls[i] == 2) {
 					players[playerturn - 1].setTwos(players[playerturn - 1].getTwos() + 1);
 				}
 				if (rolls[i] == 3) {
 					players[playerturn - 1].setThrees(players[playerturn - 1].getThrees() + 1);
 				}
 				if (rolls[i] == 4) {
 					players[playerturn - 1].setFours(players[playerturn - 1].getFours() + 1);
 				}
 				if (rolls[i] == 5) {
 					players[playerturn - 1].setFives(players[playerturn - 1].getFives() + 1);
 				}
 				if (rolls[i] == 6) {
 					players[playerturn - 1].setSixes(players[playerturn - 1].getSixes() + 1);
 				}
			}
			
				buttons[1][playerturn].setText(Integer.toString(players[playerturn - 1].getOnes()));
				buttons[2][playerturn].setText(Integer.toString(players[playerturn - 1].getTwos() * 2));
				buttons[3][playerturn].setText(Integer.toString(players[playerturn - 1].getThrees() * 3));
				buttons[4][playerturn].setText(Integer.toString(players[playerturn - 1].getFours() * 4));
				buttons[5][playerturn].setText(Integer.toString(players[playerturn - 1].getFives() * 5));
				buttons[6][playerturn].setText(Integer.toString(players[playerturn - 1].getSixes() * 6));		
			
				nextTurn = false;
				System.out.println(playerturn);
	}  
	/**
	 * @param arg0 standard event listener 
	 */
	@Override
	public void actionPerformed(final ActionEvent arg0) {
		if (arg0.getSource() ==  buttons[1][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
			
		}
		
		if (arg0.getSource() ==  buttons[2][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[3][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[4][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[5][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[6][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[10][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[11][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[12][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[13][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[14][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[15][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[16][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() ==  buttons[17][playerturn]) {
			if (playerturn == size) {
				playerturn = 1;
			} else {
				playerturn += 1;
				
			}
			nextTurn = true;
			turn();
			
		}
		
		if (arg0.getSource() == save) {
			savePlayer(players[playerturn - 1]);
		}
		if (arg0.getSource() == load) {
			loadPlayer(fakeplayers[playerturn - 1]);
		}
		if(arg0.getSource() == red){
			guiFrame.setBackground(colorred);
			for (int r = 0; r < 21; r++) {
	            for (int c = 0; c < size + 1; c++) {         
	                buttons[r][c].setBackground(colorred);
	            }
			}
		}
		if(arg0.getSource() == blue){
			guiFrame.setBackground(colorblue);
			for (int r = 0; r < 21; r++) {
	            for (int c = 0; c < size + 1; c++) {         
	                buttons[r][c].setBackground(colorblue);
	            }
			}
		}
		if(arg0.getSource() == green){
			guiFrame.setBackground(colorgreen);
			for (int r = 0; r < 21; r++) {
	            for (int c = 0; c < size + 1; c++) {         
	                buttons[r][c].setBackground(colorgreen);
	            }
			}
		}
		if(arg0.getSource() == black){
			guiFrame.setBackground(colorblack);
			for (int r = 0; r < 21; r++) {
	            for (int c = 0; c < size + 1; c++) {         
	                buttons[r][c].setBackground(colorblack);
	            }
			}
		}
	}
	/**
	 * 
	 * @param temp player you want to save
	 */
	public void savePlayer(final Player temp) {
		fakeplayers[playerturn - 1].setOnes(temp.getOnes());
		fakeplayers[playerturn - 1].setTwos(temp.getTwos());
		fakeplayers[playerturn - 1].setThrees(temp.getThrees());
		fakeplayers[playerturn - 1].setFours(temp.getFours());
		fakeplayers[playerturn - 1].setFives(temp.getFives());
		fakeplayers[playerturn - 1].setSixes(temp.getSixes());
		fakeplayers[playerturn - 1].setTopSubScore();
		System.out.println(fakeplayers[playerturn - 1].getOnes());
	}
	/**
	 * @param temp player you want to load from
	 * 
	 */
	public void loadPlayer(final Player temp) {
		players[playerturn - 1].setOnes(temp.getOnes());
		players[playerturn - 1].setTwos(temp.getTwos());
		players[playerturn - 1].setThrees(temp.getThrees());
		players[playerturn - 1].setFours(temp.getFours());
		players[playerturn - 1].setFives(temp.getFives());
		players[playerturn - 1].setSixes(temp.getSixes());
		players[playerturn - 1].setTopSubScore();
		
		buttons[1][playerturn].setText(Integer.toString(players[playerturn - 1].getOnes()));
		buttons[2][playerturn].setText(Integer.toString(players[playerturn - 1].getTwos() * 2));
		buttons[3][playerturn].setText(Integer.toString(players[playerturn - 1].getThrees() * 3));
		buttons[4][playerturn].setText(Integer.toString(players[playerturn - 1].getFours() * 4));
		buttons[5][playerturn].setText(Integer.toString(players[playerturn - 1].getFives() * 5));
		buttons[6][playerturn].setText(Integer.toString(players[playerturn - 1].getSixes() * 6));
	}
		
		
	}



