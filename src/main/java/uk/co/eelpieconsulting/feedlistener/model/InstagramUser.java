package uk.co.eelpieconsulting.feedlistener.model;

public class InstagramUser {

	private long id;
	private String username, profilePicture;
	
	public InstagramUser(long id, String username, String profilePicture) {
		this.id = id;
		this.username = username;
		this.profilePicture = profilePicture;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	@Override
	public String toString() {
		return "InstagramUser [id=" + id + ", profilePicture=" + profilePicture + ", username=" + username + "]";
	}
	
}
