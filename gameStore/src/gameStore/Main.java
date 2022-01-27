package gameStore;
import java.util.ArrayList;

import gameStore.business.concretes.CampaignManager;
import gameStore.business.concretes.GameManager;
import gameStore.business.concretes.SalesManager;
import gameStore.business.concretes.UserManager;
import gameStore.core.concretes.UserCheckManager;
import gameStore.dataAccess.concretes.mssql.CampaignMsSqlDao;
import gameStore.dataAccess.concretes.mssql.GameMsSqlDao;
import gameStore.dataAccess.concretes.mssql.SalesMsSqlDao;
import gameStore.dataAccess.concretes.mssql.UserMsSqlDao;
import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.Sales;
import gameStore.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager(new UserCheckManager(),new UserMsSqlDao());
		User user1=new User(1,"zümra","girgin","10022452770",2000,"zumragirgin@hotmail.com","12345");
		userManager.add(user1);
		
		
		CampaignManager campaignManager=new CampaignManager(new CampaignMsSqlDao());
		Campaign campaign1=new Campaign(1,"Sudoku Ýndirimi",3);
		campaignManager.add(campaign1);
		
		
		GameManager gameManager=new GameManager(new GameMsSqlDao());
		Game game1=new Game(1,"Sudoku","Bir zeka oyunudur.",10);
		game1.setCampaign(campaign1); 
		gameManager.add(game1);
		
		
		System.out.println("----------------------------------------------------");
		gameManager.gameSale(user1, game1);
		

		SalesManager saleManager=new SalesManager(new SalesMsSqlDao());
		
		ArrayList<Game> games=new ArrayList<Game>();
		games.add(game1);
		
		Sales sales1=new Sales(1,user1,campaign1,games);
		saleManager.add(sales1);
		
		System.out.println("----------------------------------------------------");
		saleManager.gameSale(user1, game1, campaign1);
		
	}

}
