package application;

public class BuffMole extends Mole {
	public BuffMole() {
		super(10, "HEY!");
		
		}
@Override 
	public void handleClick() {
		increaseScore();
	}
public int getScoreValue() {
    return scoreValue;
}
		
}
