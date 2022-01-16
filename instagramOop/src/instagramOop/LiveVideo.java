package instagramOop;

import java.sql.Date;

public class LiveVideo extends Sharing{
	private String[] comment;
	private int[] audience;
	private String requestToJoin;
	public LiveVideo() {
		super();
	}
	public LiveVideo(int id,String userName, Date date,String[] comment, int[] audience, String requestToJoin) {
		super(id, userName, date);
		this.comment = comment;
		this.audience = audience;
		this.requestToJoin = requestToJoin;
	}
	public String[] getComment() {
		return comment;
	}
	public void setComment(String[] comment) {
		this.comment = comment;
	}
	public int[] getAudience() {
		return audience;
	}
	public void setAudience(int[] audience) {
		this.audience = audience;
	}
	public String getRequestToJoin() {
		return requestToJoin;
	}
	public void setRequestToJoin(String requestToJoin) {
		this.requestToJoin = requestToJoin;
	}
	
}
