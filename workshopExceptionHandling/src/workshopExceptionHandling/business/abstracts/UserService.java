package workshopExceptionHandling.business.abstracts;

import java.util.ArrayList;

import workshopExceptionHandling.core.concretes.BusinessException;
import workshopExceptionHandling.entities.concretes.User;

public interface UserService {
	void add(User user) throws BusinessException;
	void delete(User user);
	void update(User user) throws BusinessException;
	ArrayList<User> getAll();
}
