package project350;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class YahtzeeGUI {
	
	JFrame guiFrame = new JFrame();
	int size;
	Border border = BorderFactory.createLineBorder(Color.BLACK);

	public void load(){
		size = Integer.parseInt(JOptionPane.showInputDialog("Number of Players?"));
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Yahtzee!");
		guiFrame.setSize(1980,1080);
		guiFrame.setLayout(new GridLayout(16, 0));
		guiFrame.setVisible(true);
		ScoreBoxes();
	}
	
	public void ScoreBoxes(){
		int i = size + 1;
		int j = 16;
		JPanel[][] PlaceHolder = new JPanel[i][j];
		for (i = 0; i < size + 1; i++){
			for(j = 0; j < 16; j++){
				PlaceHolder[i][j] = new JPanel();
				guiFrame.add(PlaceHolder[i][j]);
				PlaceHolder[i][j].setSize(1,2);
				PlaceHolder[i][j].setBorder(border);
				
				
			}
		}
	}
}