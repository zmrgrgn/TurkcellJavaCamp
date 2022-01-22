import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Zümra","Girgin", 2000, "123"));
	}

}
