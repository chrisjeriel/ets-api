package ph.cpi.rest.api.model.request;

public class RetrieveAcseBatchOrRequest {
	
	private String orDateFrom;
	private String orDateTo;
	private String tranTypeCd;
	
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getOrDateFrom() {
		return orDateFrom;
	}
	public void setOrDateFrom(String orDateFrom) {
		this.orDateFrom = orDateFrom;
	}
	public String getOrDateTo() {
		return orDateTo;
	}
	public void setOrDateTo(String orDateTo) {
		this.orDateTo = orDateTo;
	}
	
	@Override
	public String toString() {
		return "RetrieveAcseBatchOrRequest [orDateFrom=" + orDateFrom
				+ ", orDateTo=" + orDateTo + ", tranTypeCd=" + tranTypeCd + "]";
	}
}
