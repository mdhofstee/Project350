package project.cis350;

/**
 * Control class for the Yahtzee game.
 * @author Hofstee Laptop
 *
 */
public class Yahtzee {

	/**
	 * This is to prevent a person making a default constructor.
	 */
	protected Yahtzee() {
	}
	/**
	 * This is to run the Yahtzee game.
	 * @param game this is the default game for Yahtzee.
	 * @param board this is the default board for Yahtzee.
	 */
	public static void run(final Yahtzee game, final YahtzeeGUI board) {
		board.load();
		board.turn();
	}
	
}
