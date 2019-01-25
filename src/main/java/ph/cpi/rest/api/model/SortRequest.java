package ph.cpi.rest.api.model;

public class SortRequest {

	private String sortKey;
	private String order;
	
	public String getSortKey() {
		return sortKey;
	}
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "SortRequest [sortKey=" + sortKey + ", order=" + order + "]";
	}
	
}
