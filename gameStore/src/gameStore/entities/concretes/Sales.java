package gameStore.entities.concretes;

import java.util.ArrayList;

import gameStore.entities.abstracts.Entity;

public class Sales implements Entity{
	private int id;
	private User users;
	private Campaign campaigns;
	private ArrayList<Game> games;
	public Sales() {
		super();
	}
	public Sales(int id, User users, Campaign campaigns, ArrayList<Game> games) {
		super();
		this.id = id;
		this.users = users;
		this.campaigns = campaigns;
		this.games = games;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Campaign getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(Campaign campaigns) {
		this.campaigns = campaigns;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	

	
	
	
}
