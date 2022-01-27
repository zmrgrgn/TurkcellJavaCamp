package gameStore.dataAccess.abstracts;

import gameStore.entities.concretes.Sales;

public interface SalesDao {
	public void add(Sales sales);
	public void delete(Sales sales);
}
