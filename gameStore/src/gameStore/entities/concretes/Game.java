package gameStore.entities.concretes;

import gameStore.entities.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private String details;
	private int unitPrice;
	private Campaign campaign;
	public Game() {
		super();
	}
	public Game(int id, String name, String details, int unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
}
