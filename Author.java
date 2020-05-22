
public class Author {
	// variables
	private String firstName, lastName;
	// constructor
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// getters
	public String getFistName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getAuthor() {
		return this.firstName + " " + this.lastName;
	}
	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
