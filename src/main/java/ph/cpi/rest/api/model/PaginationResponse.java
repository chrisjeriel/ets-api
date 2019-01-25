package ph.cpi.rest.api.model;

public class PaginationResponse {

	private Integer position;
	private Integer count;
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "PaginationResponse [position=" + position + ", count=" + count + "]";
	}
}
