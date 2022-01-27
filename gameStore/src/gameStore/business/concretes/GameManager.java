package gameStore.business.concretes;

import gameStore.business.abstracts.GameService;
import gameStore.dataAccess.abstracts.GameDao;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.User;

public class GameManager implements GameService{
	private GameDao gameDao;
	
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		gameDao.add(game);
		
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);
		
	}

	@Override
	public void gameSale(User user, Game game) {
		System.out.println(game.getName()+" oyununu "+user.getName()+" adlý kullanýcý satýn aldý.");
		
	}

}
