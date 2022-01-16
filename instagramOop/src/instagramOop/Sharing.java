package instagramOop;

import java.sql.Date;

public class Sharing {
	private int id;
	private String userName;
	private Date date;
	public Sharing() {
		super();
	}
	public Sharing(int id, String userName, Date date) {
		super();
		this.id = id;
		this.userName = userName;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
