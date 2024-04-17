package application;

public abstract class Mole {

protected int scoreValue;
protected String hitsound;
protected int TotalScore = 0;

//Abstract mole class to make defaults for every mole type
public Mole (int scoreValue, String hitsound) {
	this.scoreValue = scoreValue;
	this.hitsound = hitsound;

}

public abstract void handleClick();

protected void increaseScore() {
	TotalScore += scoreValue;
}

}
