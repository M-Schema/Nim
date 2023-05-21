//package com.github.breakfastclubwf.nim;

import javax.swing.JOptionPane;

/**
 * @version 2023-05-19
 * @author Schema <WF221.M.Schema@BK-Duisdorf.de>
 */

public class Main {

	public static void main(String[] args) {
		
		Field field = new Field(13);
		Info info = new Info();
		Player player = new Player("Game Master");
		
		Player playerA = new Player("Minerva");
		Player playerB = new Player("Apollo");
		
		JOptionPane.showMessageDialog(null, info.textBeginning()
				, "Nim-Spiel", JOptionPane.INFORMATION_MESSAGE
				);

		playerB.optionMachine(
				JOptionPane.showInputDialog(info.textOptionMachine())
				);
		if ( playerB.isMachine() ) {
			playerB.setName("Deus ex Machina");
		}
		
		
		while ( !player.isWinner() ) {
			field.nextTurn();
			if ( field.getTurn() %2 == 1 ) { player = playerA; }
			if ( field.getTurn() %2 == 0 ) { player = playerB; }
	
			if ( player.isMachine() == false ) {		
				
				player.setInput("");
				info.setErrorStatus(false);
				while ( field.canDrawMatches( player.getInput() ) == false ) {
					if ( info.isErrorStatus() ) {
						JOptionPane.showMessageDialog(null,	
							info.textError()
							, "Error", JOptionPane.ERROR_MESSAGE
							);
					}
					
					player.setInput(
							JOptionPane.showInputDialog(
								info.textStartTurn( player.getName(),
													field.getMatches(),
													field.buildField()
										 		 	)
								+ info.textAmountPlayer()
								)
							);
					player.lockAmount( player.getInput() );
					info.setErrorStatus(true);
				}
			}else {
				JOptionPane.showMessageDialog(null,
					info.textStartTurn( player.getName(),
										field.getMatches(),
										field.buildField() 
							  			)
					+ info.textAmountMachine(player.getName())
					, player.getName() +" ist am Zug.", JOptionPane.INFORMATION_MESSAGE
					);
				
				player.machineKillerStrategy( field.getMatches() );	
			}
			
			
			field.drawMatches( player.getAmount() );
			
			
			JOptionPane.showMessageDialog(null, 
				info.textEndTurn( player.getName(), 
								player.getAmount(), 
								field.getMatches()
								)
				, "Ergebnis Runde " + field.getTurn(), JOptionPane.INFORMATION_MESSAGE
				);
			
			
			if ( field.getMatches() <= 0 ) { player.setWinner(true); }
		}
		
		JOptionPane.showMessageDialog(null,
					info.textWinner( player.getName(), field.getTurn() )
					, "Spielende", JOptionPane.INFORMATION_MESSAGE
					);	
	}
}
