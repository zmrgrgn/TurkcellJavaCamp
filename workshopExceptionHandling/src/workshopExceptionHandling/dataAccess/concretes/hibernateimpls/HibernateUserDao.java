package workshopExceptionHandling.dataAccess.concretes.hibernateimpls;

import java.util.ArrayList;

import workshopExceptionHandling.dataAccess.abstracts.UserDao;
import workshopExceptionHandling.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	ArrayList<User> users=new ArrayList<User>();
	@Override
	public void add(User entity) {
		System.out.println(entity.getFirstName() + " Hibernate ile eklendi.");
		users.add(entity);
		
	}

	@Override
	public void update(User entity) {
		for (User user : users) {
			users.set(users.indexOf(user), entity);
		}
		System.out.println(entity.getFirstName() + " Hibernate ile güncellendi.");
		
	}

	@Override
	public void delete(User entity) {
		System.out.println(entity.getFirstName() + " Hibernate ile silindi.");
		users.remove(entity);
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
