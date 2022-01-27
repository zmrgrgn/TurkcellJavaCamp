package gameStore.business.concretes;

import gameStore.business.abstracts.CampaignService;
import gameStore.dataAccess.abstracts.CampaignDao;
import gameStore.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{
	private CampaignDao campaignDao;
	
	
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
		
	}

}
