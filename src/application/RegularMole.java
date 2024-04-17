package application;

public class RegularMole extends Mole {

	public RegularMole() {
		super(1, "OUCH!");
	
	}
	@Override 
	public void handleClick() {
		increaseScore();
	}
	public int getScoreValue() {
        return scoreValue;
    }
}



	
	
	
	

