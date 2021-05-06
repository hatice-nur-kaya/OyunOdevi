package business.concretes;

import java.util.List;

import business.abstracts.GamerService;
import core.GamesService;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamers;

public class GamerManager implements GamerService {
 private GamerDao gamerDao;
 private GamesService gamesService;
	public  GamerManager(GamerDao gamerDao, GamesService gamesService) {
		super();
		this.gamerDao = gamerDao;
		this.gamesService =gamesService;
	}
	@Override
	public void add(Gamers gamers) {
		if(gamers.getId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return;// metod boþ return gördüðü anda aiaðý bakmaz.
		}
		
		this.gamerDao.add(gamers);
		this.gamesService.logToSystem("Oyun Eklendi. ");

	}

	@Override
	public List<Gamers> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
	