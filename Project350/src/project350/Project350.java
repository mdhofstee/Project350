package project.cis350;
/**
 * 
 * @author Hofstee Laptop
 * Main class.
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
	/**
	 * This is stop other classes form accessing this project.
	 */
	protected Project350() { }
}
