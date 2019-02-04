package ph.cpi.rest.api.model;

import org.springframework.web.bind.annotation.RequestParam;

public class PaginationRequest {
	
	
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
		return "PaginationRequest [position=" + position + ", count=" + count + "]";
	}
	
}
