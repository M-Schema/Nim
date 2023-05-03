import java.util.Random;

/**
 * @version 2023-05-03
 * @author Schema <WF221.M.Schema@BK-Duisdorf.de>
 */

public class Player {
	private String name = "";
	private boolean machine = false;
	private String input = "";
	private int amount = 0;
	private boolean winner = false;
	
	public Player() {
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, boolean machine) {
		this.name = name;
		this.machine = machine;
	}

	public void setName(String name) {this.name = name;}	
	public String getName() {return this.name;}
	
	public void setMachine(boolean machine) {this.machine = machine;}	
	public boolean isMachine() {return this.machine;}

	public void setInput(String input) {this.input = input;}	
	public String getInput() {return this.input;}
	
	public void setAmount(int amount) {this.amount = amount;}	
	public int getAmount() {return this.amount;}
	
	public void setWinner(boolean winner) {this.winner = winner;}	
	public boolean isWinner() {return this.winner;}
	
	
	public void optionMachine(String option) {
		if ( !option.equals("0") || option.equals("") ) {
				this.setName("Deus ex Machina");
				this.setMachine(true);		
		}else {
			this.setMachine(false);
		}
	}
	
	public void machineKillerStrategy(int matches) {
		if(this.machine && matches%4 != 0) {
			this.setAmount(matches%4);
		}else if(matches == 12) {
			this.setAmount(1);
		}else {
			Random random = new Random();
			this.setAmount(random.nextInt(3)+1);
		}
	}

}