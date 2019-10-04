package ph.cpi.rest.api.model;

public class PaginationRequest {
	
	
	private Integer position;
	private Integer count;
	
	private Integer start;
	private Integer end;
	
	public Integer getPosition() {
//		if (position == null) {
//			position = 1;
//		}
		return position;
	}
	public void setPosition(Integer position) {
//		if(count != null){
//			start = ((count*position) - count) + 1 ;
//			end = count*position;
//		}
		this.position = position;
	}
	public Integer getCount() {
//		if (count == null) {
//			count = 10;
//		}
		return count;
	}
	public void setCount(Integer count) {
//		if(position != null){
//			start = ((count*position) - count) + 1 ;
//			end = count*position;
//		}
		this.count = count;
	}
	
	
	public Integer getStart() {
//		if(start == null)
//			start = 1;
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
//		if(end == null)
//			end = 10;
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "PaginationRequest [position=" + position + ", count=" + count + ", start=" + start + ", end=" + end
				+ "]";
	}
	
}
