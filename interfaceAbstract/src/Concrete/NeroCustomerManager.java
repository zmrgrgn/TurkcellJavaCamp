package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerCheckService {
CustomerCheckService checkService;
	
	public NeroCustomerManager() {
		super();
	}
	public NeroCustomerManager(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}
	@Override
	public void Save(Customer customer) throws RemoteException {
		// TODO Auto-generated method stub
		if(checkService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			throw new RemoteException("Kiþi geçerli deðil.");
		}
	}
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
}

