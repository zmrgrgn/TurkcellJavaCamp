package gameStore.business.abstracts;


import gameStore.entities.concretes.User;

public interface UserService {
	public void add(User user);
	public void update(User user);
	public void delete(User user);
}
