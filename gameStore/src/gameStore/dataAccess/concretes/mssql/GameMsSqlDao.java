package gameStore.dataAccess.concretes.mssql;

import gameStore.dataAccess.abstracts.GameDao;
import gameStore.entities.concretes.Game;

public class GameMsSqlDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("Oyun Ms Sql Db'ye eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Ms Sql Db'de güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Ms Sql Db'den silindi.");
		
	}

}
