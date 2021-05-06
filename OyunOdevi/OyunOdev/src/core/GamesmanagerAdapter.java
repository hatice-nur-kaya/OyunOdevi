package core;

import Games.GamesManager;

public class GamesmanagerAdapter implements GamesService {

	@Override
	public void logToSystem(String message) {
 
		GamesManager  manager = new GamesManager();
		manager.log(message);
		
	}

}
