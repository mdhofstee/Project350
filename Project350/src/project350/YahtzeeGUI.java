package project350;

import javax.swing.*;
import java.awt.*;

public class YahtzeeGUI {
	
	JFrame guiFrame = new JFrame();
	JTextArea ones, twos, threes, fours;
	public void load(){
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Yahtzee!");
		guiFrame.setSize(1980,1080);
		guiFrame.setVisible(true);
		ScoreBoxes();
	}
	
	public void ScoreBoxes(){
		ones = new JTextArea();
		guiFrame.add(ones);
		ones.setSize(100,20);
		
		twos = new JTextArea();
		guiFrame.add(twos);
		twos.setSize(100,20);
		
		threes = new JTextArea();
		guiFrame.add(threes);
		threes.setSize(100,20);
		
		fours = new JTextArea();
		guiFrame.add(fours);
		fours.setSize(100,20);
		
		
	}
}
