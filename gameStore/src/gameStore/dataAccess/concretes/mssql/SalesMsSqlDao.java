package gameStore.dataAccess.concretes.mssql;

import gameStore.dataAccess.abstracts.SalesDao;
import gameStore.entities.concretes.Sales;

public class SalesMsSqlDao implements SalesDao{

	@Override
	public void add(Sales sales) {
		System.out.println("Sat�� Ms Sql Db'ye kay�t edildi.");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Sat�� Ms Sql Db'den silindi.");
		
	}

}
