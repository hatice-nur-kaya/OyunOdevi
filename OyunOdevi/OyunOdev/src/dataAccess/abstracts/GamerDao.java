package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Gamers;

public interface GamerDao {

	void add(Gamers gamers);

	void delete(Gamers gamers);

	void update(Gamers gamers);
	Gamers get (int id);
	List <Gamers>getAll();

}
