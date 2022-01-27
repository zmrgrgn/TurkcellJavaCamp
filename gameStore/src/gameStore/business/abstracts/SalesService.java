package gameStore.business.abstracts;

import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.Sales;
import gameStore.entities.concretes.User;

public interface SalesService {
	public void add(Sales sale);
	public void delete(Sales sale);
	public void gameSale(User user, Game game, Campaign campaign);
	
}
