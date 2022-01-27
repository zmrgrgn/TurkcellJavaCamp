package gameStore.dataAccess.concretes.oracle;

import gameStore.dataAccess.abstracts.CampaignDao;
import gameStore.entities.concretes.Campaign;

public class CampaignOracleDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Oracle Db'ye eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Oracle Db'de güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Oracle Db'den silindi.");
		
	}

}
