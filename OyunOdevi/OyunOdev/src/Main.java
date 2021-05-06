import business.abstracts.GamerService;
import business.concretes.GamerManager;
import core.GamesmanagerAdapter;
import dataAccess.concretes.ACompany;
import entities.concretes.Gamers;

public class Main {

	public static void main(String[] args) {
		GamerService gameService =new GamerManager(new ACompany(),new GamesmanagerAdapter());
		Gamers gamers = new Gamers(2, "Hatice Nur", "KAYA", "123456", "26 Temmuz");
		gameService.add(gamers);
	}

}
