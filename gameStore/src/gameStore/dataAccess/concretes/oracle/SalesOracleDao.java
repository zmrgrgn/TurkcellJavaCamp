package gameStore.dataAccess.concretes.oracle;

import gameStore.dataAccess.abstracts.SalesDao;
import gameStore.entities.concretes.Sales;

public class SalesOracleDao implements SalesDao{

	@Override
	public void add(Sales sales) {
		System.out.println("Satýþ Oracle Db'ye kayýt edildi.");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Satýþ Oracle Db'den silindi.");
		
	}

}
