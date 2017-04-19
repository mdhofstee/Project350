package project.cis350;

/**
 *
 * @author Hofstee Laptop
 * A class to provide return and other functions of each player.
 */
public class Player {
	/**
	 * interger value to return value of Ones.
	 */
	private int ones;
	/**
	 * interger value to return value of Twos.
	 */
	private int twos;
	/**
	 * interger value to return value of Threes.
	 */
	private int threes;
	/**
	 * interger value to return value of Fours.
	 */
	private int fours;
	/**
	 * interger value to return value of Fives.
	 */
	private int fives;
	/**
	 * interger value to return value of Sixes.
	 */
	private int sixes;
	/**
	 * interger value to return value of Top Sub Score.
	 */
	private int topSubScore;
	/**
	 * interger value to return value of Bonus.
	 */
	private int bonus;
	/**
	 * interger value to return value of Top Score.
	 */
	private int topScore;
	/**
	 * interger value to return value of Three of Kind.
	 */
	private int threeKind;
	/**
	 * interger value to return value of Four of Kind.
	 */
	private int fourKind;
	/**
	 * interger value to return value of Full House.
	 */
	private int fullHouse;
	/**
	 * interger value to return value of Small Straight.
	 */
	private int smStraight;
	/**
	 * interger value to return value of Large Straight.
	 */
	private int lgStraight;
	/**
	 * interger value to return value of Yahtzee.
	 */
	private int yahtzee;
	/**
	 * interger to store number of Extra Yahtzee.
	 */
	private int numberExtraYahtzee;
	/**
	 * interger value to return value of Extra Yahtzees.
	 */
	private int extraYahtzee;
	/**
	 * interger value to return value of Chance.
	 */
	private int chance;
	/**
	 * interger value to return value of Bottom Score.
	 */
	private int bottomScore;
	/**
	 * interger value to return value of Total Score.
	 */
	private int totalScore;
	
	/**
	 * Value needed for bonus minus one.
	 */
	private static final int BONUSNEED = 62;
	/**
	 * Value of Bonus.
	 */
	private static final int BONUS = 35;
	/**
	 * Value of Full House.
	 */
	private static final int FULLHOUSE = 25;
	/**
	 * Value of Small Straight.
	 */
	private static final int SMSTRAIGHT = 30;
	/**
	 * Value of Large Straight.
	 */
	private static final int LGSTRAIGHT = 40;
	/**
	 * Value of Yahtzee.
	 */
	private static final int YAHTZEE = 50;
	/**
	 * Value of Extra Yahtzee.
	 */
	private static final int EXTRAYAHTZEE = 100;
	/**
	 * Boolean to check for bonus.
	 */
	private boolean haveBonus = false;
	/**
	 * Boolean to check for Full House.
	 */
	private boolean haveFullHouse = false;
	/**
	 * Boolean to check for Small Straight.
	 */
	private boolean haveSmStraight = false;
	/**
	 * Boolean to check for Large Straight.
	 */
	private boolean haveLgStraight = false;
	/**
	 * Boolean to check for Yahtzee.
	 */
	private boolean haveYahtzee = false;
	
	/**
	 * returns the value of the ones.
	 * @return return the amount of ones.
	 */
	public int getOnes() {
		return ones;
	}
	
	/**
	 * sets the amount of ones by the number of ones.
	 * @param onesTemp the number of ones that is rolled
	 */
	public void setOnes(int onesTemp) {
		this.ones = onesTemp;
	}
	
	/**
	 * returns the value of the twos.
	 * @return return the amount of twos.
	 */
	public int getTwos() {
		return twos;
	}

	/**
	 * sets the amount of twos by the number of twos and times by two.
	 * @param twosTemp the number of twos that is rolled
	 */
	public void setTwos(int twosTemp) {
		this.twos = twosTemp;
	}

	/**
	 * returns the value of the threes.
	 * @return return the amount of threes.
	 */
	public int getThrees() {
		return threes;
	}

	/**
	 * sets the amount of threes by the number of threes and times by three.
	 * @param threesTemp the number of threes that is rolled
	 */
	public void setThrees(int threesTemp) {
		this.threes = threesTemp;
	}

	/**
	 * returns the value of the fours.
	 * @return return the amount of fours.
	 */
	public int getFours() {
		return fours;
	}

	/**
	 * sets the amount of fours by the number of fours and times by four.
	 * @param foursTemp the number of fours that is rolled
	 */
	public void setFours(int foursTemp) {
		this.fours = foursTemp;
	}

	/**
	 * returns the value of the fives.
	 * @return return the amount of fives.
	 */
	public int getFives() {
		return fives;
	}

	/**
	 * sets the amount of fives by the number of sixes and times by five.
	 * @param fivesTemp the number of fives that is rolled
	 */
	public void setFives(int fivesTemp) {
		this.fives = fivesTemp;
	}

	/**
	 * returns the value of the sixes.
	 * @return return the amount of sixes.
	 */
	public int getSixes() {
		return sixes;
	}

	/**
	 * sets the amount of sixes by the number of sixes and times by six.
	 * @param sixesTemp the number of sixes that is rolled
	 */
	public void setSixes(int sixesTemp) {
		this.sixes = sixesTemp;
	}

	/**
	 * provides the topsubscore for the player.
	 * @return the amount 
	 */
	public int getTopSubScore() {
		return topSubScore;
	}

	/**
	 * sets the subscore by adding all of the values from one to six.
	 */
	public void setTopSubScore() {
		this.topSubScore = getOnes() + getTwos() + getThrees() 
			+ getFours() + getFives() + getSixes();
	}

	/**
	 * returns the value of bonus.
	 * @return will provide the value of either 0 or 35.
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * private method to see if the bonus is true or not.
	 * @return boolean for if the bonus is set or not.
	 */
	private boolean getHaveBonus() {
		return haveBonus;
	}
	
	/**
	 * sets the haveBonus based upon if the topsubscore is true if above 64
	 * else it is false
	 */
	private void setHaveBonus() {
		if (getTopSubScore() > BONUSNEED) {
			this.haveBonus = true;
		} else {
			this.haveBonus = false;
		}
	}
	
	/**
	 * sets the bonus at 35 if it is true or 0 if it is false and 
	 * asks for the check. 
	 */
	public void setBonus() {
		setHaveBonus();
		if (getHaveBonus()) {
			bonus = BONUS;
		} else {
			bonus = 0;
		}
	}
	
	/**
	 * returns the top score
	 * @return provides the top score as an integer.
	 */
	public int getTopScore() {
		return topScore;
	}
	
	/**
	 * sets the topscore 
	 */
	public void setTopScore() {
		this.topScore = getBonus() + getTopSubScore();
	}
	
	/**
	 * Provides the value of all dice when it is selected.
	 * @return gives the integer value of three of a kind.
	 */
	public int getThreeKind() {
		return threeKind;
	}
	
	/**
	 * sets the value of all dice if it has been selected.
	 * @param threeKindTemp the total value of all the dice.
	 */
	public void setThreeKind(int threeKindTemp) {
		this.threeKind = threeKindTemp;
	}
	
	/**
	 * Provides the value of all dice when it is selected.
	 * @return gives the integer value of four of a kind.
	 */
	public int getFourKind() {
		return fourKind;
	}
	
	/**
	 * sets the value of all dice if it has been selected.
	 * @param fourKindTemp the total value of all the dice.
	 */
	public void setFourKind(int fourKindTemp) {
		this.fourKind = fourKindTemp;
	}
	
	/**
	 * returns the value of full house if it has been selected.
	 * @return either 0 or 25 if it has been hit.
	 */
	public int getFullHouse() {
		return fullHouse;
	}
	
	/**
	 * returns a boolean of true false depending if it has been used.
	 * @return boolean if it has been hit.
	 */
	public boolean getHaveFullHouse() {
		return haveFullHouse;
	}
	
	/**
	 * sets the value of have full house to true when selected.
	 */
	public void setHaveFullHouse() {
		this.haveFullHouse = true;
	}
	
	/**
	 * sets the value of full house if it has been selected.
	 */
	public void setFullHouse() {
		if (getHaveFullHouse()) {
			this.fullHouse = FULLHOUSE;
		} else {
			this.fullHouse = 0;
		}
	}
	
	/**
	 * returns the value of small straight.
	 * @return either 0 or 30 value of small straight.
	 */
	public int getSmStraight() {
		return smStraight;
	}
	
	/**
	 * returns the true false of having small straight.
	 * @return boolean of whether it has been set.
	 */
	public boolean getHaveSmStraight() {
		return haveSmStraight;
	}
	
	/**
	 * 
	 */
	public void setSmStraight() {
		if (getHaveSmStraight()) {
			this.smStraight = SMSTRAIGHT;
		} else {
			this.smStraight = 0;
		}
	}
	
	/**
	 * sets the boolean small straight to true.
	 */
	public void setHaveSmStraight() {
		this.haveSmStraight = true;
	}
	
	/**
	 * sets the large straight boolean to true 
	 */
	public void setHaveLgStraight() {
		this.haveLgStraight = true;
	}	
	
	/**
	 * returns the value of Large Straight.
	 * @return the value of Large Straight
	 */
	public int getLgStraight() {
		return lgStraight;
	}
	
	/**
	 * Returns the value of whether lg straight has been set.
	 * @return the value of whether it has a Lg Straight.
	 */
	public boolean getHaveLgStraight() {
		return haveLgStraight;
	}
	
	/**
	 * sets the value of Large Straight to 40 or 0.
	 */
	public void setLgStraight() {
		if (getHaveLgStraight()) {
			this.lgStraight = LGSTRAIGHT;
		} else {
			this.lgStraight = 0;
		}
	}
	
	/**
	 * sets the value of boolean yahtzee to true
	 */
	public void setHaveYahtzee() {
		this.haveYahtzee = true;
	}
	
	/**
	 * Gets the value of Yahtzee.
	 * @return The value of Yahtzee.
	 */
	public int getYahtzee() {
		return yahtzee;
	}
	
	/**
	 * Gets the boolean of having Yahtzee.
	 * @return A boolean of either true or false 
	 * if it has yahtzee.
	 */
	public boolean getHaveYahtzee() {
		return haveYahtzee;
	}
	
	/**
	 * Sets the value of Yahtzee of either 50 or 0.
	 */
	public void setYahtzee() {
		if (getHaveYahtzee()) {
			this.yahtzee = YAHTZEE;
		} else {
			this.yahtzee = 0;
		}
	}
	
	/**
	 * private function that returns the number of extra yahtzee's.
	 * @return returns the integer of number of extra yahtzee's.
	 */
	public int getNumberExtraYahtzee() {
		return numberExtraYahtzee;
	}

	/**
	 * Sets the number of Extra Yahtzee's.
	 * @param numberExtraYahtzee sets the number of extra Yahtzee's.
	 */
	public void setNumberExtraYahtzee(int numberExtraYahtzeeTemp) {
		this.numberExtraYahtzee = numberExtraYahtzeeTemp;
	}
	
	/**
	 * Gets the value of the Extra Yahtzee 
	 * @return The value of the Extra Yahtzee
	 */
	public int getExtraYahtzee() {
		return extraYahtzee;
	}
	
	/**
	 * Sets the value of Extra Yahtzee's.
	 * @param extraYahtzeeTemp The Number of Extra Yahtzee's.
	 */
	public void setExtraYahtzee() {
		this.extraYahtzee = getNumberExtraYahtzee() * EXTRAYAHTZEE;;
	}
	
	/**
	 * Gets the value of the chance. 
	 * @return Return the chance value
	 */
	public int getChance() {
		return chance;
	}
	
	/**
	 * Sets the amount of the chance with chanceTemp.
	 * @param chanceTemp the value all of the dice.
	 */
	public void setChance(int chanceTemp) {
		this.chance = chanceTemp;
	}
	
	/**
	 * returns the bottom score of the player
	 * @return the bottom score of the player
	 */
	public int getBottomScore() {
		return bottomScore;
	}
	
	/**
	 * Sets the bottom Score of the player.
	 * 
	 */
	public void setBottomScore() {
		int bottomScoreTemp = getThreeKind() + getFourKind() 
			+ getFullHouse() + getSmStraight() + getLgStraight() 
			+ getYahtzee() + getExtraYahtzee() + getChance();
		this.bottomScore = bottomScoreTemp;
	}
	
	/**
	 * Returns the total score of each player.
	 * @return the total score of the game.
	 */
	public final int getTotalScore() {
		return totalScore;
	}
	
	/**
	 * Sets the total Score in the game.
	 * 
	 */
	public void setTotalScore() {
		int totalScoreTemp = getBottomScore() + getTopScore();
		this.totalScore = totalScoreTemp;
	}
	
}
