package gameStore.business.concretes;

import gameStore.business.abstracts.SalesService;
import gameStore.dataAccess.abstracts.SalesDao;
import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.Sales;
import gameStore.entities.concretes.User;

public class SalesManager implements SalesService{
	private SalesDao salesDao;
	
	public SalesManager(SalesDao salesDao) {
		super();
		this.salesDao = salesDao;
	}

	@Override
	public void add(Sales sale) {
		salesDao.add(sale);
		
	}

	@Override
	public void delete(Sales sale) {
		salesDao.delete(sale);
		
	}

	@Override
	public void gameSale(User user, Game game, Campaign campaign) {
		int fPrice=0;
		fPrice=game.getUnitPrice()-campaign.getDiscount();
		System.out.println(user.getName()+" adlý kullanýcý "+campaign.getDiscount()+" TL indirim ile "+fPrice+" TL'ye "+game.getName()+" oyununu satýn aldý.");
		
	}

}
