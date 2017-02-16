package project350;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class YahtzeeGUI {
	
	JFrame guiFrame = new JFrame();
	JTextArea ones, twos, threes, fours, player1;
	JLabel Lones, Ltwos, Lthrees, Lfours, Lplayer;
	Border border = BorderFactory.createLineBorder(Color.BLACK);

	public void load(){
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Yahtzee!");
		guiFrame.setSize(1980,1080);
		guiFrame.setVisible(true);
		guiFrame.setLayout(new GridLayout(5,2));
		ScoreBoxes();
	}
	
	public void ScoreBoxes(){
		Lplayer = new JLabel();
		guiFrame.add(Lplayer,0,0);
		Lplayer.setSize(100,20);
		Lplayer.setBorder(border);
		Lplayer.setText("Players: ");
		
		player1 = new JTextArea();
		guiFrame.add(player1, 0, 1);
		player1.setSize(100,20);
		player1.setBorder(border);
		player1.setText("Player 1");
		
		Lones = new JLabel();
		guiFrame.add(Lones, 0, 2);
		Lones.setSize(100, 20);
		Lones.setBorder(border);
		Lones.setText("Ones: ");
		
		ones = new JTextArea();
		guiFrame.add(ones,0,3);
		ones.setSize(100,20);
		ones.setBorder(border);
		ones.setText("0");
		
		Ltwos = new JLabel();
		guiFrame.add(Ltwos, 0, 4);
		Ltwos.setSize(100, 20);
		Ltwos.setBorder(border);
		Ltwos.setText("twos: ");
		
		twos = new JTextArea();
		guiFrame.add(twos,0,5);
		twos.setSize(100,20);
		twos.setBorder(border);
		twos.setText("0");
		
		Lthrees = new JLabel();
		guiFrame.add(Lthrees, 0, 6);
		Lthrees.setSize(100, 20);
		Lthrees.setBorder(border);
		Lthrees.setText("Threes: ");
		
		threes = new JTextArea();
		guiFrame.add(threes,0,7);
		threes.setSize(100,20);
		threes.setBorder(border);
		threes.setText("0");
		
		Lfours = new JLabel();
		guiFrame.add(Lfours, 0, 8);
		Lfours.setSize(100, 20);
		Lfours.setBorder(border);
		Lfours.setText("Fours: ");
		
		fours = new JTextArea();
		guiFrame.add(fours,0,9);
		fours.setSize(100,20);
		fours.setBorder(border);
		fours.setText("0");
		
	}
	
	public void generateBoard(){
		JOptionPane.
	}
}
