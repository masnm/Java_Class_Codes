package Tasks;

public class Son extends Dad {
	
	private String favouriteGame;
	private String [] gamesArray;
	
	public Son ( String game, String educate, String first, String last, int year ) {
		super ( educate, first, last, year );
		favouriteGame = game;
		gamesArray = new String [] { "Doom", "Assassins", "Call of Duty", "Creed" };
	}

	public String getFavouriteGame() {
		return favouriteGame;
	}

	public void setFavouriteGame(String favouriteGame) {
		this.favouriteGame = favouriteGame;
	}
	
	public void addGame ( String game ) {
		int currentSize = gamesArray.length;
		String [] nextGamesArray = new String [ currentSize + 1 ];
		for ( int i = 0; i < gamesArray.length; i++ ) {
			nextGamesArray[i] = gamesArray[i];
		}
		// nextGamesArray[currentSize] = game;
		nextGamesArray[ nextGamesArray.length - 1 ] = game;
		this.gamesArray = nextGamesArray;
	}
	
	public void printGames() {
		System.out.print ( "gamesArray : [ " );
		for ( int i = 0; i < gamesArray.length; i++ ) {
			if ( i != 0 ) {
				System.out.print ( ", " );
			}
			System.out.print ( gamesArray[i] );
		}
		System.out.println ( " ]" );
	}
	
	public void removeGame ( String game ) {
		// find the index of game in the array
		int gameIndex = -1;
		for ( int i = 0; i < gamesArray.length; i++ ) {
			if ( game.equals ( gamesArray[i] ) ) {
				gameIndex = i;
			}
		}
		if ( gameIndex == -1 ) {
			// game is not present in the array so just return
			return;
		}
		// shift all the elements after the index to left one position
		for ( int i = gameIndex; i < gamesArray.length - 1; i++ ) {
			gamesArray[i] = gamesArray[i+1];
		}
		/*
		[abc] [rer] [dfd] [a] [re]
		 0		1     2    3   4
		 gameIndex = 2
		 [abc] [rer] [a] [a] [re]
		   0	1     2   3   4
		   [abc] [rer] [a] [re] 
			0	  1     2   3  
		*/
		// decrease the size of the array
		int currentSize = gamesArray.length;
		String [] ng = new String [currentSize - 1];
		// for ( int i = 0 ; i < ng.length; i++ ) {
		for ( int i = 0 ; i < gamesArray.length - 1; i++ ) {
			ng[i] = gamesArray[i];
		}
		this.gamesArray = ng;
	}

}
