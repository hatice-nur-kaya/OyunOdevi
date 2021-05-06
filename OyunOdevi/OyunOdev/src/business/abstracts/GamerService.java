package business.abstracts;

import java.util.List;

import entities.concretes.Gamers;

public interface GamerService {

	void add(Gamers gamers); 
	List<Gamers> getAll();	
}
