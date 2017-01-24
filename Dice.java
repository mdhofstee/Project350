package project350;

import java.util.Random;

public class Dice {

	int Value = 0;
	Random r = new Random();
	final int Sides = 6;

	public void Random() {
		Value = (r.nextInt(Sides) + 1);
	}

	public int Roll() {
		Random();
		return Value;
	}
}
