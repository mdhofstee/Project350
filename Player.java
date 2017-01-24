package project350;

public class Player {
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int topSubScore;
	private int bonus;
	private int topScore;
	private int threeKind;
	private int fourKind;
	private int fullHouse;
	private int smStraight;
	private int lgStraight;
	private int yahtzee;
	private int extraYahtzee;
	private int chance;
	private int bottomScore;
	private int totalScore;
	
	private static int BONUS = 35;
	private static int FULLHOUSE = 25;
	private static int SMSTRAIGHT = 30;
	private static int LGSTRAIGHT = 40;
	private static int YAHTZEE = 50;
	private static int EXTRAYAHTZEE = 100;
	
	private static int TWO = 2;
	private static int THREE = 3;
	private static int FOUR = 4;
	private static int FIVE = 5;
	private static int SIX = 6;
	
	private boolean haveBonus;
	private boolean haveFullHouse;
	private boolean haveSmStraight;
	private boolean haveLgStraight;
	private boolean haveYahtzee;
	
	public int getOnes() {
		return ones;
	}
	
	public void setOnes(int onesTemp) {
		this.ones = onesTemp;
	}
	
	public int getTwos() {
		return twos;
	}
	
	public void setTwos(int twosTemp) {
		this.twos = twosTemp * TWO;
	}
	
	public int getThrees() {
		return threes;
	}
	
	public void setThrees(int threesTemp) {
		this.threes = threesTemp * THREE;
	}
	
	public int getFours() {
		return fours;
	}
	
	public void setFours(int foursTemp) {
		this.fours = foursTemp * FOUR;
	}
	
	public int getFives() {
		return fives;
	}
	
	public void setFives(int fivesTemp) {
		this.fives = fivesTemp * FIVE;
	}
	
	public int getSixes() {
		return sixes;
	}
	
	public void setSixes(int sixesTemp) {
		this.sixes = sixesTemp * SIX;
	}
	
	public int getTopSubScore() {
		return topSubScore;
	}
	
	public void setTopSubScore() {
		this.topSubScore = getOnes() + getTwos() + getThrees() + getFours()
		+ getFives() + getSixes();
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public boolean getHaveBonus() {
		return haveBonus;
	}
	
	public void setHaveBonus() {
		if (getTopSubScore() > 62){
			this.haveBonus = true;
		} else {
			this.haveBonus = false;
		}
	}
	public void setBonus() {
		if (getHaveBonus()){
			bonus = BONUS;
		} else
			bonus = 0;
	}
	
	public int getTopScore() {
		return topScore;
	}
	
	public void setTopScore() {
		this.topScore = getBonus() + getTopSubScore();
	}
	
	public int getThreeKind() {
		return threeKind;
	}
	
	public void setThreeKind(int threeKindTemp) {
		this.threeKind = threeKindTemp;
	}
	
	public int getFourKind() {
		return fourKind;
	}
	
	public void setFourKind(int fourKindTemp) {
		this.fourKind = fourKindTemp;
	}
	
	public int getFullHouse() {
		return fullHouse;
	}
	
	public boolean getHaveFullHouse() {
		return haveFullHouse;
	}
	
	public void setFullHouse() {
		if (getHaveFullHouse()){
			this.fullHouse = 25;
		} else {
			this.fullHouse = 0;
		}
	}
	
	public int getExtraYahtzee() {
		return extraYahtzee;
	}
	
	public void setExtraYahtzee(int extraYahtzeeTemp) {
		this.extraYahtzee = extraYahtzeeTemp;
	}
	
	public int getChance() {
		return chance;
	}
	
	public void setChance(int chanceTemp) {
		this.chance = chanceTemp;
	}
	
	public int getBottomScore() {
		return bottomScore;
	}
	
	public void setBottomScore(int bottomScoreTemp) {
		this.bottomScore = bottomScoreTemp;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public void setTotalScore(int totalScoreTemp) {
		totalScoreTemp = getBottomScore() + getTopScore();
		this.totalScore = totalScoreTemp;
	}
	
}
