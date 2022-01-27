package gameStore.dataAccess.abstracts;

import gameStore.entities.concretes.User;

public interface UserDao {
	public void add(User user);
	public void update(User user);
	public void delete(User user);
}
