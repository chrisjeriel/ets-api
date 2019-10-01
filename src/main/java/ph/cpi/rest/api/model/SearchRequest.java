package ph.cpi.rest.api.model;

import java.util.List;

public class SearchRequest {
	private List<String> searchCols;
	private String value;
	public List<String> getSearchCols() {
		return searchCols;
	}
	public void setSearchCols(List<String> searchCols) {
		this.searchCols = searchCols;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "SearchRequest [searchCols=" + searchCols + ", value=" + value + "]";
	}
	
}
