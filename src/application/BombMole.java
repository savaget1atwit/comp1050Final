package application;

public class BombMole extends Mole {

	public BombMole() {
		super(-5, "GOT YOU!");
		
	}
	@Override 
	public void handleClick() {
		increaseScore();
	}
	public int getScoreValue() {
        return scoreValue;
    }
	
		
}
