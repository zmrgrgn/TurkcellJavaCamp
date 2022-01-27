package gameStore.dataAccess.concretes.oracle;


import gameStore.dataAccess.abstracts.UserDao;
import gameStore.entities.concretes.User;

public class UserOracleDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Ki�i do�ruland� ve Oracle DB'ye eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Ki�i do�ruland� ve Oracle DB'de g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Ki�i do�ruland� ve Oracle DB'den silindi.");
		
	}

}