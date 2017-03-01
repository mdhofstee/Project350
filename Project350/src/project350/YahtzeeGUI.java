package project350;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YahtzeeGUI implements ActionListener {
	
	JFrame guiFrame = new JFrame();
	String[] options = { "Dice 1", "Dice 2", "Dice 3", "Dice 4", "Dice 5" };
	int size =  Integer.parseInt(JOptionPane.showInputDialog("Number of Players?"));
	JButton[][] buttons  = new JButton[21][size + 1];
	Border border = BorderFactory.createLineBorder(Color.BLACK);
	int rolls[] = new int[5];
	int playerturn = 1;
	Player[] players = new Player[size];
	
	final JCheckBox checkBox1 = new JCheckBox();
	final JCheckBox checkBox2 = new JCheckBox();
	final JCheckBox checkBox3 = new JCheckBox();
	final JCheckBox checkBox4 = new JCheckBox();
	final JCheckBox checkBox5 = new JCheckBox();
	
	
	
	public void load(){
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Yahtzee!");
		guiFrame.setSize(1080,970);
		guiFrame.setLayout(new GridLayout(21, size + 1));
		guiFrame.setVisible(true);
		
		for(int i = 0; i < size;i++){
			players[i] = new Player();
			System.out.println(players[i]);
		}
		
		ScoreBoxes();
		Labels();
	}
	
	public void ScoreBoxes(){
		
		for (int r = 0; r < 21; r++){
            for (int c = 0; c < size + 1; c++){         
                buttons[r][c] = new JButton("0");
                buttons[r][c].setPreferredSize(new Dimension(100,30));
                buttons[r][c].addActionListener(this);
                guiFrame.add(buttons[r][c]);
            }
        }  
		guiFrame.pack();
	}
	
	public void Labels(){
		
		buttons[0][0].setText("Players: "); 
		buttons[0][0].setEnabled(false);
		
		for(int i = 1; i < size + 1; i++){
			buttons[0][i].setText("Player " + i);
			buttons[0][i].setEnabled(false);
		}
		
		buttons[1][0].setText("Aces: ");
		buttons[1][0].setEnabled(false);
		
		buttons[2][0].setText("Twos: ");
		buttons[2][0].setEnabled(false);
		
		buttons[3][0].setText("Threes: ");
		buttons[3][0].setEnabled(false);
		
		buttons[4][0].setText("Fours: ");
		buttons[4][0].setEnabled(false);
		
		buttons[5][0].setText("Fives: ");
		buttons[5][0].setEnabled(false);
		
		buttons[6][0].setText("Sixes: ");
		buttons[6][0].setEnabled(false);
		
		buttons[7][0].setText("Total Score: ");
		buttons[7][0].setEnabled(false);
		
		buttons[8][0].setText("Bonus: ");
		buttons[8][0].setEnabled(false);
		
		buttons[9][0].setText("Total: ");
		buttons[9][0].setEnabled(false);
		
		buttons[10][0].setText("3 of a Kind: ");
		buttons[10][0].setEnabled(false);
		
		buttons[11][0].setText("4 of a Kind: ");
		buttons[11][0].setEnabled(false);
		
		buttons[12][0].setText("Full House: ");
		buttons[12][0].setEnabled(false);
		
		buttons[13][0].setText("Small Straight: ");
		buttons[13][0].setEnabled(false);
		
		buttons[14][0].setText("Large Straight: ");
		buttons[14][0].setEnabled(false);
		
		buttons[15][0].setText("Yahtzee: ");
		buttons[15][0].setEnabled(false);
		
		buttons[16][0].setText("Chance: ");
		buttons[16][0].setEnabled(false);
		
		buttons[17][0].setText("Yahtze Bonus: ");
		buttons[17][0].setEnabled(false);
		
		buttons[18][0].setText("Lower Total: ");
		buttons[18][0].setEnabled(false);
		
		buttons[19][0].setText("Upper Total: ");
		buttons[19][0].setEnabled(false);
		
		buttons[20][0].setText("Grand Total: ");
		buttons[20][0].setEnabled(false);
	}
	
	public void turn(){		
		Dice dice = new Dice();
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		
		for(int k = 0; k < 5; k++){
			rolls[k] = dice.Roll();
		}
		
		for(int j = 0; j < 2; j++){
			Object[] inputFields = {"Reroll " + rolls[0] + "?", checkBox1,
					"Reroll " + rolls[1] + "?", checkBox2,
					"Reroll " + rolls[2] + "?", checkBox3, "Reroll " + rolls[3] + "?", checkBox4,
					"Reroll " + rolls[4] + "?", checkBox5 };

			JOptionPane.showConfirmDialog(null, inputFields, "Player" + playerturn + " turn",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			if (checkBox1.isSelected()) {
				rolls[0] = dice.Roll();
			}
			if (checkBox2.isSelected()) {
				rolls[1] = dice.Roll();
			}
			if (checkBox3.isSelected()) {
				rolls[2] = dice.Roll();
			}
			if (checkBox4.isSelected()) {
				rolls[3] = dice.Roll();
			}
			if (checkBox5.isSelected()) {
				rolls[4] = dice.Roll();
			}
			
			Object[] rollMessage = {"You rolled a " +
					rolls[0] + ", " +
					rolls[1] + ", " +
					rolls[2] + ", " + 
					rolls[3] + ", " +
					rolls[4] };

			JOptionPane.showConfirmDialog(null, rollMessage, "Player" + playerturn + " turn",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			
		}
			for (int i = 0; i < 5; i++) {

				if (rolls[i] == 1 ) {
					ones += 1;
				}
				if (rolls[i] == 2) {
					twos += 1;
				}
				if (rolls[i] == 3) {
					threes += 1;
				}
				if (rolls[i] == 4) {
					fours += 1;
				}
				if (rolls[i] == 5) {
					fives += 1;
				}
				if (rolls[i] == 6) {
					sixes +=1;
				}
			}
				players[playerturn - 1].setOnes(ones);
				buttons[1][playerturn].setText(Integer.toString(players[playerturn - 1].getOnes()));
				
				players[playerturn - 1].setTwos(twos);
				buttons[2][playerturn].setText(Integer.toString(players[playerturn - 1].getTwos()));
				
				players[playerturn - 1].setThrees(threes);
				buttons[3][playerturn].setText(Integer.toString(players[playerturn - 1].getThrees()));
				
				players[playerturn - 1].setFours(fours);
				buttons[4][playerturn].setText(Integer.toString(players[playerturn - 1].getFours()));
				
				players[playerturn - 1].setFives(fives);
				buttons[5][playerturn].setText(Integer.toString(players[playerturn - 1].getFives()));
				
				players[playerturn - 1].setSixes(sixes);
				buttons[6][playerturn].setText(Integer.toString(players[playerturn - 1].getSixes()));
		
				
		
		if(playerturn == size){
			playerturn = 1;
		}
		else{
			playerturn += 1;
		}
		
		Object[] nextturn = {"It's now player " + playerturn + "'s turn"};
		
		JOptionPane.showConfirmDialog(null, nextturn , "Player " + playerturn + "'s turn",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	 
       
        
        
        public void actionPerformed(ActionEvent evt)
        {
        	if(buttons[1][playerturn].isSelected()){
        		buttons[1][playerturn].setEnabled(false);
        	}
        	
        	
		}
	}
