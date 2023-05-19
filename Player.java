import java.util.Random;

/**
 * @author Schema <WF221.M.Schema@BK-Duisdorf.de>
 */

public class Player {
	private String name;
	private boolean machine;
	private String input;
	private int amount;
	private boolean winner;

	public Player(String name) {
		this.name = name;
		this.machine = false;
		this.winner = false;
	}

	public void setName(String name) {this.name = name;}	
	public String getName() {return this.name;}
	
	private void setMachine(boolean machine) {this.machine = machine;}	
	public boolean isMachine() {return this.machine;}

	public void setInput(String input) {this.input = input;}	
	public String getInput() {return this.input;}
	
	public void setAmount(int amount) {this.amount = amount;}	
	public int getAmount() {return this.amount;}
	
	public void setWinner(boolean winner) {this.winner = winner;}	
	public boolean isWinner() {return this.winner;}
	
	
	public void optionMachine(String option) {
		if ( !option.equals("0") || option.equals("") ) {
			this.setMachine(true);		
		}else {
			this.setMachine(false);
		}
	}
	
	public void machineKillerStrategy(int matches) {
		if (this.machine && (matches%4 != 0) ) {
			this.setAmount(matches%4);
		}else if (matches == 12) {
			this.setAmount(1);
		}else {
			Random random = new Random();
			this.setAmount(random.nextInt(3)+1);
		}
	}
}
