package project350;

/**
 * A class to provide return and other functions of each player.
 * @author Hofstee Laptop
 * 
 */
public class Player {
	/**
	 * integer value to return value of Ones.
	 */
	private int ones;
	/**
	 * integer value to return value of Twos.
	 */
	private int twos;
	/**
	 * integer value to return value of Threes.
	 */
	private int threes;
	/**
	 * integer value to return value of Fours.
	 */
	private int fours;
	/**
	 * integer value to return value of Fives.
	 */
	private int fives;
	/**
	 * integer value to return value of Sixes.
	 */
	private int sixes;
	/**
	 * integer value to return value of Top Sub Score.
	 */
	private int topSubScore;
	/**
	 * integer value to return value of Bonus.
	 */
	private int bonus;
	/**
	 * integer value to return value of Top Score.
	 */
	private int topScore;
	/**
	 * integer value to return value of Three of Kind.
	 */
	private int threeKind;
	/**
	 * integer value to return value of Four of Kind.
	 */
	private int fourKind;
	/**
	 * integer value to return value of Full House.
	 */
	private int fullHouse;
	/**
	 * integer value to return value of Small Straight.
	 */
	private int smStraight;
	/**
	 * integer value to return value of Large Straight.
	 */
	private int lgStraight;
	/**
	 * integer value to return value of Yahtzee.
	 */
	private int yahtzee;
	/**
	 * integer value to return value of Chance.
	 */
	private int chance;
	/**
	 * integer value to return value of bottom Score.
	 */
	@SuppressWarnings("unused")
	private int bottomScore;
	/**
	 * integer value to return value of top Score.
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
	 * Value of Twos.
	 */
	private static final int TWO = 2;
	/**
	 * Value of Threes.
	 */
	private static final int THREE = 3;
	/**
	 * Value of Fours.
	 */
	private static final int FOUR = 4;
	/**
	 * Value of Fives.
	 */
	private static final int FIVE = 5;
	/**
	 * Value of SIXES.
	 */
	private static final int SIX = 6;
	
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
	 * 
	 * @return score of ones dice
	 */
	public int getOnes() {
		return ones;
	}
	
	/**
	 * 
	 * @param onesTemp total number of ones dice
	 */
	public void setOnes(final int onesTemp) {
		this.ones = onesTemp;
	}
	
	/**
	 * 
	 * @return score of twos dice
	 */
	public int getTwos() {
		return twos;
	}
	
	/**
	 * 
	 * @param twosTemp total number of twos dice
	 */
	public void setTwos(final int twosTemp) {
		this.twos = twosTemp;
	}
	
	/**
	 * 
	 * @return score of threes dice
	 */
	public int getThrees() {
		return threes;
	}
	
	/**
	 * 
	 * @param threesTemp total number of threes dice
	 */
	public void setThrees(final int threesTemp) {
		this.threes = threesTemp;
	}
	
	/**
	 * 
	 * @return score of fours dice
	 */
	public int getFours() {
		return fours;
	}
	
	/**
	 * 
	 * @param foursTemp total number of fours dice
	 */
	public void setFours(final int foursTemp) {
		this.fours = foursTemp;
	}
	
	/**
	 * 
	 * @return score of fives dice
	 */
	public int getFives() {
		return fives;
	}
	
	/**
	 * 
	 * @param fivesTemp total number of fives dice
	 */
	public void setFives(final int fivesTemp) {
		this.fives = fivesTemp;
	}
	
	/**
	 * 
	 * @return score of sixes dice
	 */
	public int getSixes() {
		return sixes;
	}
	
	/**
	 * 
	 * @param sixesTemp total number of sixes dice
	 */
	public void setSixes(final int sixesTemp) {
		this.sixes = sixesTemp;
	}
	
	/**
	 * 
	 * @return total top score 
	 */
	public int getTopSubScore() {
		return topSubScore;
	}
	/**
	 * 
	 */
	public void setTopSubScore() {
		this.topSubScore = getOnes() + (getTwos() * TWO) + (getThrees() * THREE)
			+ (getFours() * FOUR) + (getFives() * FIVE) + (getSixes() * SIX);
	}
	
	/**
	 * 
	 * @return bonus points int
	 */
	public int getBonus() {
		return bonus;
	}
	
	/**
	 * 
	 * @return bonus points boolean
	 */
	public boolean getHaveBonus() {
		return haveBonus;
	}
	
	/**
	 * 
	 */
	public void setHaveBonus() {
		if (getTopSubScore() > BONUSNEED) {
			this.haveBonus = true;
		} else {
			this.haveBonus = false;
		}
	}
	
	/**
	 * 
	 */
	public void setBonus() {
		if (getHaveBonus()) {
			bonus = BONUS;
		} else {
			bonus = 0;
		}
	}
	
	/**
	 * 
	 * @return top score of board
	 */
	public int getTopScore() {
		return topScore;
	}
	
	/**
	 * 
	 */
	public void setTopScore() {
		this.topScore = getBonus() + getTopSubScore();
	}
	
	/**
	 * 
	 * @return if there is a threeofkind
	 */
	public int getThreeKind() {
		return threeKind;
	}
	
	/**
	 * 
	 * @param threeKindTemp sets threeofakind score
	 */
	public void setThreeKind(final int threeKindTemp) {
		this.threeKind = threeKindTemp;
	}
	
	/**
	 * 
	 * @return if there is a fourofakind
	 */
	public int getFourKind() {
		return fourKind;
	}
	
	/**
	 * 
	 * @param fourKindTemp sets fourofakind score
	 */
	public void setFourKind(final int fourKindTemp) {
		this.fourKind = fourKindTemp;
	}
	
	/**
	 * 
	 * @return fullhouse points int
	 */
	public int getFullHouse() {
		return fullHouse;
	}
	
	/**
	 * 
	 * @return fullhouse points boolean
	 */
	public boolean getHaveFullHouse() {
		return haveFullHouse;
	}
	
	/**
	 * 
	 */
	public void setHaveFullHouse() {
		this.haveFullHouse = true;
	}
	
	/**
	 * 
	 */
	public void setFullHouse() {
		if (getHaveFullHouse()) {
			this.fullHouse = FULLHOUSE;
		} else {
			this.fullHouse = 0;
		}
	}
	
	/**
	 * 
	 * @return smstraight points int
	 */
	public int getSmStraight() {
		return smStraight;
	}
	
	/**
	 * 
	 * @return smstraight points boolean
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
	 * 
	 */
	public void setHaveSmStraight() {
		this.haveSmStraight = true;
	}
	
	/**
	 * 
	 */
	public void setHaveLgStraight() {
		this.haveLgStraight = true;
	}
	
	
	/**
	 * 
	 * @return lgstraight score int
	 */
	public int getLgStraight() {
		return lgStraight;
	}
	
	/**
	 * 
	 * @return lgstraight score boolean 
	 */
	public boolean getHaveLgStraight() {
		return haveLgStraight;
	}
	
	/**
	 * 
	 */
	public void setLgStraight() {
		if (getHaveLgStraight()) {
			this.lgStraight = LGSTRAIGHT;
		} else {
			this.lgStraight = 0;
		}
	}
	
	/**
	 * 
	 */
	public void setHaveYahtzee() {
		this.haveYahtzee = true;
	}
	
	/**
	 * 
	 * @return yahtzee score int
	 */
	public int getYahtzee() {
		return yahtzee;
	}
	
	/**
	 * 
	 * @return yahtzee score boolean
	 */
	public boolean getHaveYahtzee() {
		return haveYahtzee;
	}
	
	/**
	 * 
	 */
	public void setYahtzee() {
		if (getHaveYahtzee()) {
			this.yahtzee = YAHTZEE;
		} else {
			this.smStraight = 0;
		}
	}
	
	/**
	 * 
	 * @return chance score int
	 */
	public int getChance() {
		return chance;
	}
	
	/**
	 * 
	 * @param chanceTemp set chance score
	 */
	public void setChance(final int chanceTemp) {
		this.chance = chanceTemp;
	}
	
	/**
	 *
	 * @return the bottom Score of the board
	 */
	public int getBottomScore() { 
		return getThreeKind() + getFourKind() 
		+ getFullHouse() + getSmStraight() + getLgStraight() 
		+ getYahtzee() + getChance();
	}
	
	/**
	 * Returns the total score of each player.
	 * @return the total score of the game.
	 */
	public final int getTotalScore() {
		return totalScore;
	}	
}
