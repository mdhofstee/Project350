package project350;

import java.util.Random;

public class Dice {

	private int value = 0;
	Random r = new Random();
	final int SIDES = 6;

	public void Random() {
		value = (r.nextInt(Sides) + 1);
	}

	public int Roll() {
		Random();
		return value;
	}
}
