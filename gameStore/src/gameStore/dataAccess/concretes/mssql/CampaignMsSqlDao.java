package gameStore.dataAccess.concretes.mssql;

import gameStore.dataAccess.abstracts.CampaignDao;
import gameStore.entities.concretes.Campaign;

public class CampaignMsSqlDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Ms Sql Db'ye eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Ms Sql Db'de güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Ms Sql Db'den silindi.");
		
	}

}
