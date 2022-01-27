package gameStore.business.abstracts;

import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.User;

public interface GameService {
	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
	public void gameSale(User user, Game game);
}
