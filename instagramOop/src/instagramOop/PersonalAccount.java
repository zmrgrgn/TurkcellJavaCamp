package instagramOop;

public class PersonalAccount extends Account{
	private String name;
	private String pPhoto;
	private String description;
	private String[] images;
	private String[] stories;
	private int[] followings;
	private int[] followers;
	public PersonalAccount() {
		super();
	}
	public PersonalAccount(int id, String userName, String password,String name, String pPhoto, String description, String[] images, String[] stories,
			int[] followings, int[] followers) {
		super(id, userName,password);
		this.name = name;
		this.pPhoto = pPhoto;
		this.description = description;
		this.images = images;
		this.stories = stories;
		this.followings = followings;
		this.followers = followers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public String[] getStories() {
		return stories;
	}
	public void setStories(String[] stories) {
		this.stories = stories;
	}
	public int[] getFollowings() {
		return followings;
	}
	public void setFollowings(int[] followings) {
		this.followings = followings;
	}
	public int[] getFollowers() {
		return followers;
	}
	public void setFollowers(int[] followers) {
		this.followers = followers;
	}
	
}
