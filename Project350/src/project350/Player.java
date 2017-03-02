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
	 */
	public int getOnes() {
		return ones;
	}
	
	/**
	 * 
	 */
	public void setOnes(int onesTemp) {
		this.ones = onesTemp;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTwos() {
		return twos;
	}
	
	/**
	 * 
	 * @param twosTemp
	 */
	public void setTwos(int twosTemp) {
		this.twos = twosTemp * TWO;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getThrees() {
		return threes;
	}
	
	/**
	 * 
	 * @param threesTemp
	 */
	public void setThrees(int threesTemp) {
		this.threes = threesTemp * THREE;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFours() {
		return fours;
	}
	
	/**
	 * 
	 * @param foursTemp
	 */
	public void setFours(int foursTemp) {
		this.fours = foursTemp * FOUR;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFives() {
		return fives;
	}
	
	/**
	 * 
	 * @param fivesTemp
	 */
	public void setFives(int fivesTemp) {
		this.fives = fivesTemp * FIVE;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSixes() {
		return sixes;
	}
	
	/**
	 * 
	 * @param sixesTemp
	 */
	public void setSixes(int sixesTemp) {
		this.sixes = sixesTemp * SIX;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTopSubScore() {
		return topSubScore;
	}
	
	/**
	 * 
	 */
	public void setTopSubScore() {
		this.topSubScore = getOnes() + getTwos() + getThrees() 
			+ getFours() + getFives() + getSixes();
	}
	
	/**
	 * 
	 * @return
	 */
	public int getBonus() {
		return bonus;
	}
	
	/**
	 * 
	 * @return
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
	 * @return
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
	 * @return
	 */
	public int getThreeKind() {
		return threeKind;
	}
	
	/**
	 * 
	 * @param threeKindTemp
	 */
	public void setThreeKind(int threeKindTemp) {
		this.threeKind = threeKindTemp;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFourKind() {
		return fourKind;
	}
	
	/**
	 * 
	 * @param fourKindTemp
	 */
	public void setFourKind(int fourKindTemp) {
		this.fourKind = fourKindTemp;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFullHouse() {
		return fullHouse;
	}
	
	/**
	 * 
	 * @return
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
	 * @return
	 */
	public int getSmStraight() {
		return smStraight;
	}
	
	/**
	 * 
	 * @return
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
	 * @return
	 */
	public int getExtraYahtzee() {
		return extraYahtzee;
	}
	
	/**
	 * 
	 * @param extraYahtzeeTemp
	 */
	public void setExtraYahtzee(int extraYahtzeeTemp) {
		this.extraYahtzee = extraYahtzeeTemp;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getChance() {
		return chance;
	}
	
	/**
	 * 
	 * @param chanceTemp
	 */
	public void setChance(int chanceTemp) {
		this.chance = chanceTemp;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getBottomScore() {
		return bottomScore;
	}
	
	/**
	 * 
	 * @param bottomScoreTemp
	 */
	public void setBottomScore(int bottomScoreTemp) {
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
	 * sets the total Score in the game.
	 * @param totalScoreTemp the value for a player of their current total 
	 * score
	 */
	public void setTotalScore(int totalScoreTemp) {
		totalScoreTemp = getBottomScore() + getTopScore();
		this.totalScore = totalScoreTemp;
	}
	
}
