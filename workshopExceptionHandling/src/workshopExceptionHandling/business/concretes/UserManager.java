package workshopExceptionHandling.business.concretes;

import java.util.ArrayList;

import workshopExceptionHandling.business.abstracts.UserService;
import workshopExceptionHandling.core.concretes.BusinessException;
import workshopExceptionHandling.dataAccess.abstracts.UserDao;
import workshopExceptionHandling.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	
	public UserManager() {
		super();
	}

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) throws BusinessException {
		if(checkPassword(user) && checkName(user) && checkMail(user) && checkExistMail(user) && checkExistId(user)) {
			this.userDao.add(user);
		}
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) throws BusinessException {
		if(checkPassword(user) && checkName(user) && checkMail(user) && checkExistMail(user)) {
			this.userDao.update(user);
		}
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.getAll();
	}
	
	
	
	private boolean checkPassword(User user) throws BusinessException {
		if(user.getPassword().length()<6) {
			 throw new BusinessException("Parola en az 6 karakterden oluþmalýdýr.");
		}
		return true;
	}
	private boolean checkName(User user) throws BusinessException {
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			 throw new BusinessException("Ad ve soyad en az 2 karakterden oluþmalýdýr.");
		}
		return true;
	}
	private boolean checkMail(User user) throws BusinessException {
		if(!user.getMail().contains("@")) {
			 throw new BusinessException("Mail adresinin içerisinde '@' olmalýdýr.");
		}
		return true;
	}
	private boolean checkExistMail(User user) throws BusinessException {
		for(int i=0 ; userDao.getAll().size()>i ; i++) {
			if(user.getMail()==getAll().get(i).getMail()) {
				throw new BusinessException("Kullanýlmýþ mail adresi. Lütfen baþka bir mail adresi deneyiniz.");
			}
		}
		return true;
	}
	private boolean checkExistId(User user) throws BusinessException {
		for(int i=0 ; userDao.getAll().size()>i ; i++) {
			if(user.getId()==getAll().get(i).getId()) {
				throw new BusinessException("Ayný kullanýcý bulunmaktadýr. Lütfen tekrar deneyiniz.");
			}
		}
		return true;
	}

}
