package ph.cpi.rest.api.model;

public class PaginationRequest {
	
	
	private Integer position;
	private Integer count;
	public Integer getPosition() {
		if (position == null) {
			position = 1;
		}
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getCount() {
		if (count == null) {
			count = 1;
		}
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "PaginationRequest [position=" + position + ", count=" + count + "]";
	}
	
}
