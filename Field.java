
/**
 * @author Schema <WF221.M.Schema@BK-Duisdorf.de>
 */

public class Field {
	private int matches;
	private int turn;
	
	public Field(int matches) {
		this.matches = matches;
		this.turn = 0; 
	}
	
	private void setMatches(int matches) {this.matches = matches;}
	public int getMatches() {return this.matches;}
	
	private void setTurn(int turn) {this.turn = turn;}
	public int getTurn() {return this.turn;}
	
	public void nextTurn() {
		setTurn( getTurn()++ );
	}
	
	public boolean canDrawMatches(String amount) {
		if (   amount.equals("1")
			|| amount.equals("2")
			|| amount.equals("3") ) {
				return true;
		}else {
				return false;
		}
	}
	
	public void drawMatches(int draw) {
		if (draw > this.matches) {
				draw = this.matches;
		}
		if (draw>0) {
			setMatches( this.matches -= draw );
		}
	}	
	
	public String buildField() {
		String field ="";
		for (int i=0; i<this.matches; i++) {
			field += " | ";
		}	
		return field;
	}	
}
