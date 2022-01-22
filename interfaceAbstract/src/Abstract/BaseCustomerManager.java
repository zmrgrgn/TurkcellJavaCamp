package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) throws RemoteException {
		System.out.println("Kiþi doðrulandý "+customer.getFirstName());
	}

}
