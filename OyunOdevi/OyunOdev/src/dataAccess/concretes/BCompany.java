package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamers;

public class BCompany implements GamerDao {

	@Override
	public void add(Gamers gamers) {
		System.out.println("B þirketi tarafýndan  eklendi "+ gamers.getFirstName()  );
		
	}

	@Override
	public void delete(Gamers gamers) {
		System.out.println("B þirketi tarafýndan  silindi "+ gamers.getFirstName()  );
		
	}

	@Override
	public void update(Gamers gamers) {
		System.out.println("B þirketi tarafýndan  güncellendi "+ gamers.getFirstName()  );
		
	}

	@Override
	public Gamers get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gamers> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
