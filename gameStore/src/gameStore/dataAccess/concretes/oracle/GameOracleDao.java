package gameStore.dataAccess.concretes.oracle;

import gameStore.dataAccess.abstracts.GameDao;
import gameStore.entities.concretes.Game;

public class GameOracleDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("Oyun Oracle Db'ye eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Oracle Db'de güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Oracle Db'den silindi.");
		
	}

}
