package project350;

import javax.swing.*;
import java.awt.*;

public class YahtzeeGUI {
	
	JFrame guiFrame = new JFrame();
	JTextArea ones, twos, threes;
	public void load(){
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Yahtzee!");
		guiFrame.setSize(1980,1080);
		guiFrame.setVisible(true);
		ScoreBoxes();
	}
	
	public void ScoreBoxes(){
		ones = new JTextArea();
		ones.setSize(100,20);
		guiFrame.add(ones);
		
		twos = new JTextArea();
		twos.setSize(100,20);
		guiFrame.add(twos);
		
		threes = new JTextArea();
		threes.setSize(100,20);
		guiFrame.add(threes);
	}
}
