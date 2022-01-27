package gameStore.dataAccess.concretes.mssql;

import gameStore.dataAccess.abstracts.SalesDao;
import gameStore.entities.concretes.Sales;

public class SalesMsSqlDao implements SalesDao{

	@Override
	public void add(Sales sales) {
		System.out.println("Satýþ Ms Sql Db'ye kayýt edildi.");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Satýþ Ms Sql Db'den silindi.");
		
	}

}
