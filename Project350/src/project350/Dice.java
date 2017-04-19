package project350;

import java.util.Random;

/**
 * Dice class for the 5 dice in the game so each is independent.
 * @author Hofstee and Overman
 * 
 */
public class Dice {

	/**
	 * Gives the amount of the random roll.
	 */
	private int value = 0;
	/**
	 * Provides for the randomness.
	 */
	private Random r = new Random();
	/**
	 * The number of sides to the dice since it will not change it is a
	 * final.
	 */
	private static final int SIDES = 6;

	/**
	 * sets the amount of the value of the dice.
	 */
	private void random() {
		value = (r.nextInt(SIDES) + 1);
	}

	/**
	 * a public method that gets called when a roll is needed.
	 * @return the value of the dice after the roll
	 */
	public int roll() {
		random();
		return value;
	}
}
