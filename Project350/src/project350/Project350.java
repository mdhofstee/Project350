package project350;
/**
 * Main class of the game, starts the game.
 * @author Hofstee Laptop
 * 
 */
public class Project350 {
	/**
	 * 
	 * @param args main thing
	 * main statement
	 */
	public static void main(final String[] args) {
		Yahtzee game = new Yahtzee();
		YahtzeeGUI board = new YahtzeeGUI();
		Yahtzee.run(game, board);		
	}
}

