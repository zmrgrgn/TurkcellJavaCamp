package gameStore.core.abstracts;


import gameStore.entities.concretes.User;


public interface UserCheckService {
	boolean CheckIfRealPerson(User user);
}
