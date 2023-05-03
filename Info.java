
/**
 * @version 2023-05-03
 * @author Schema <WF221.M.Schema@BK-Duisdorf.de>
 */

public class Info {
	private boolean error;
	
	public Info() {
		this.error = false;
	}

	public void setError(boolean error) {this.error = error;}
	public boolean getError() {return error;}

	
	public String textBeginning() {
		return "Nim ist ein Spiel für Zwei, die gegeneinander spielen. \n"
				+"Gegeben ist ein Spielfeld mit einem Haufen von 13 Streichhoelzern. \n"
				+"Abwechselnd werden 1, 2 oder 3 Streichhoelzer gezogen. \n"
				+"Es gewinnt, wer den Haufen leerraeumt."
				;
	}
	
	public String textOptionMachine() {
		return "Gegen Spieler 2 oder die Maschine spielen? \n"
				+"[ (0)Spieler 2 ]  ||  [ (1)Die Maschine ]; "
				;
	}
	
	public String textStartTurn(String playerName, int matches, String field) {
		return playerName +" ist am Zug! \n"
				+"Es liegen "+ matches +" Streichhoelzer:\n"
				+ field
				+"\n\n"
				;
	}
	
	public String textAmountPlayer() {
		return "Wie viele moechtest Du ziehen,\n"
				+"[ (1) ], [ (2) ] oder [ (3) ]?"
				;
	}
	
	public String textAmountMachine(String machineName) {
		return machineName +" ueberlegt...";
	}
	
	public String textEndTurn(String playerName, int amount, int matches) {
		return playerName +" zieht: "+ amount +" Stueck!" +"\n"
				+"Es verbleiben: "+ matches +" Streichhoelzer."
				;
	}
	
	public String textWinner(String playerName, int turn) {
		return "Gewonnen hat: "+ playerName +"\n"
				+"Runden gespielt: "+ turn
				;
	}
	
	public String textError() {
		return "Eingabe war falsch! \n"
				+"Bitte wiederholen: "
				;
	}	
}