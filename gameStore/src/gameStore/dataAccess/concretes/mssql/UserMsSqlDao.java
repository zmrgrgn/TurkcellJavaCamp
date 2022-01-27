package gameStore.dataAccess.concretes.mssql;


import gameStore.dataAccess.abstracts.UserDao;
import gameStore.entities.concretes.User;

public class UserMsSqlDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kiþi doðrulandý ve Ms Sql DB'ye eklendi.");

	}

	@Override
	public void update(User user) {
		System.out.println("Kiþi doðrulandý ve Ms Sql DB'de güncellendi.");

	}

	@Override
	public void delete(User user) {
		System.out.println("Kiþi doðrulandý ve Ms Sql DB'den silindi.");
	}

}

