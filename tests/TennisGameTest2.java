import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest2 {

	@Test
	public void testTennisGame_Player1_3Points_Score_40_to_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Score incorrect", "40 - love", score);		
	}
	
	@Test
	public void testTennisGame_Player1With4Points_Wins() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Win does not happen correctly", "player1 wins", score);		
	}
	
	@Test
	public void testTennisGame_Player2With4Points_Wins() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Win does not happen correctly", "player2 wins", score);		
	}
	
	@Test
	public void testTennisGame_EachPlayerWinOnePoint_Score_15_to_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "15 - 15", score);		
	}
	
	@Test
	public void testTennisGame_EachPlayerWin2Points_Score_30_to_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "30 - 30", score);		
	}
	
	@Test
	public void testTennisGame_OneToTwoPoints_Score_15_to_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Score incorrect", "15 - 30", score);		
	}
	
	@Test
	public void testTennisGame_EachPlayerWin3Points_Score_Deuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "deuce", score);		
	}
	
	@Test
	public void testTennisGame_Score_Player1Advantage() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();

		game.player1Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Advantage score incorrect", "player1 has advantage", score);		
	}
	
	@Test
	public void testTennisGame_Score_Player2Advantage() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();

		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Advantage score incorrect", "player2 has advantage", score);		
	}
}
