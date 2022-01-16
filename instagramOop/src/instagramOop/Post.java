package instagramOop;

import java.sql.Date;

public class Post extends Sharing{
	private String[] likes;
	private String[] comment;
	private String save;
	public Post() {
		super();
	}
	public Post(int id,String userName, Date date,String[] likes, String[] comment, String save) {
		super(id, userName, date);
		this.likes = likes;
		this.comment = comment;
		this.save = save;
	}
	public String[] getLikes() {
		return likes;
	}
	public void setLikes(String[] likes) {
		this.likes = likes;
	}
	public String[] getComment() {
		return comment;
	}
	public void setComment(String[] comment) {
		this.comment = comment;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}
	
}
