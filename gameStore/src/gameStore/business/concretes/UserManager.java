package gameStore.business.concretes;


import gameStore.business.abstracts.UserService;
import gameStore.core.abstracts.UserCheckService;
import gameStore.dataAccess.abstracts.UserDao;
import gameStore.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserCheckService checkService;
	private UserDao userDao;
	
	public UserManager(UserCheckService checkService, UserDao userDao) {
		super();
		this.checkService = checkService;
		this.userDao=userDao;
	}

	@Override
	public void add(User user) {
		if(checkService.CheckIfRealPerson(user)) {
			userDao.add(user);
		}else {
			System.out.println("Ki�i do�rulanamad� ve kay�t edilemedi. L�tfen bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public void update(User user) {
		if(checkService.CheckIfRealPerson(user)) {
			userDao.update(user);
		}else {
			System.out.println("Ki�i do�rulanamad� ve g�ncellenemedi. L�tfen bilgilerinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void delete(User user) {
		if(checkService.CheckIfRealPerson(user)) {
			userDao.delete(user);
		}else {
			System.out.println("Ki�i do�rulanamad� ve silinemedi. L�tfen bilgilerinizi kontrol ediniz.");
		}
		
	}

}
