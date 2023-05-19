
/**
 * @author Schema <WF221.M.Schema@BK-Duisdorf.de>
 */

public class Field {
	private int turn;
	private int matches;
	
	public Field(int matches) {
		this.turn = 0; 
		this.matches = matches;
	}

	public void setTurn(int turn) {this.turn = turn;}
	public int getTurn() {return turn;}
	
	public void setMatches(int matches) {this.matches = matches;}
	public int getMatches() {return matches;}
	
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
