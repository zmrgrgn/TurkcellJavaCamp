package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerService {
	void Save(Customer customer) throws RemoteException;
}
