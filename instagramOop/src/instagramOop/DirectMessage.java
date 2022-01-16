package instagramOop;

public class DirectMessage extends User{
	private String[] participants;
	private String[] contents;
	private String search;
	public DirectMessage() {
		super();
	}
	public DirectMessage(int id, String userName,String[] participants, String[] contents, String search) {
		super(id, userName);
		this.participants = participants;
		this.contents = contents;
		this.search = search;
	}
	public String[] getParticipants() {
		return participants;
	}
	public void setParticipants(String[] participants) {
		this.participants = participants;
	}
	public String[] getContents() {
		return contents;
	}
	public void setContents(String[] contents) {
		this.contents = contents;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
}
