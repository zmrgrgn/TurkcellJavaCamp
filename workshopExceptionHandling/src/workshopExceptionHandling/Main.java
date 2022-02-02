package workshopExceptionHandling;

import java.util.ArrayList;

import workshopExceptionHandling.business.concretes.UserManager;
import workshopExceptionHandling.core.concretes.BusinessException;
import workshopExceptionHandling.dataAccess.concretes.hibernateimpls.HibernateUserDao;
import workshopExceptionHandling.entities.concretes.User;

public class Main {

	public static void main(String[] args)  {
		User user1=new User(1,"Zümra","Girgin","zumragirgin@hotmail.com","123456");
		User user2=new User(2,"Ayþe","Demir","aysedemir@hotmail.com","1234567");
		User user3=new User(3,"Ali","Yýlmaz","aliyilmaz@hotmail.com","1234568");
		
		ArrayList<User> users=new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		
		UserManager userManager=new UserManager(new HibernateUserDao());
		
		for (User user : users) {
			try {
				userManager.add(user);
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println("Bilinmeyen bir hata oluþtu.");
			}
		}
		
		
		
		
	}

}
