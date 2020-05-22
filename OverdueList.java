import java.util.Collection;

public class OverdueList<T> {
	// variables
	private Collection<T> overdueList;
	// constructor
	public OverdueList(Collection<T> overdueList) {
		this.overdueList = overdueList;
	}
	// getters
	public Collection<T> getOverdueList() {
		return this.overdueList;
	}
	// setters
	public void setOverdueList(Collection<T> overdueList) {
		this.overdueList = overdueList;
	}
	
}
