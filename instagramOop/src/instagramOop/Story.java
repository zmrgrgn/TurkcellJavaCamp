package instagramOop;

import java.sql.Date;

public class Story extends Sharing{
	private int countdown;
	private String dm;
	public Story() {
		super();
	}
	public Story(int id,String userName, Date date,int countdown, String dm) {
		super(id, userName, date);
		this.countdown = countdown;
		this.dm = dm;
	}
	public String getDm() {
		return dm;
	}
	public void setDm(String dm) {
		this.dm = dm;
	}
	public int getCountdown() {
		return countdown;
		//date kýsmýndan hesaplanacak
	}
	
}
