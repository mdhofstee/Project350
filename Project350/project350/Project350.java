package project350;

public class Project350 {
	
	public static void main(String[] args) {
		Yahtzee game = new Yahtzee();
		YahtzeeGUI board = new YahtzeeGUI();
		Yahtzee.run(game, board);		
		board.load();
		board.turn();
	}	
}
