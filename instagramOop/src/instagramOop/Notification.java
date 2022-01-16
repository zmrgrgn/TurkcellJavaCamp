package instagramOop;

public class Notification extends User{
	private String pPhoto;
	private String description;
	public Notification() {
		super();
	}
	public Notification(int id, String userName ,String pPhoto, String description) {
		super(id, userName);
		this.pPhoto = pPhoto;
		this.description = description;
	}
	public String getpPhoto() {
		return pPhoto;
	}
	public void setpPhoto(String pPhoto) {
		this.pPhoto = pPhoto;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
