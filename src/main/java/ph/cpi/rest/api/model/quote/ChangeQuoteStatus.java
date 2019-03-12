package ph.cpi.rest.api.model.quote;

public class ChangeQuoteStatus {
	private Integer quoteId;
	private Integer cedingId;
	private Integer cessionId;
	private Integer status;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getCessionId() {
		return cessionId;
	}
	public void setCessionId(Integer cessionId) {
		this.cessionId = cessionId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ChangeQuoteStatus [quoteId=" + quoteId + ", cedingId=" + cedingId + ", cessionId=" + cessionId
				+ ", status=" + status + "]";
	}
	
	
	
	
}
