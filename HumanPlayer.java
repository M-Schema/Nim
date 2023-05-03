
public class HumanPlayer {
	//private boolean isWinner;
	private String name;
	
	public HumanPlayer(String name) {
		//isWinner = false;
		this.name = name;
	}

	//public void setWinner(boolean isWinner) {this.isWinner = isWinner;}	
	//public boolean isWinner() {return isWinner;}
	
	public void setName(String name) {this.name = name;}	
	public String getName() {return name;}
	
	public boolean canDraw(int amount) {
		if (   amount == 1
			&& amount == 2
			&& amount == 3 ) {
				return true;
		}else {
				return false;
		}
	}
	
	public int draw(int amount) {
		if (this.canDraw(amount)) {
				return amount;
		}else {
				return 0;
		}
	}
	
}