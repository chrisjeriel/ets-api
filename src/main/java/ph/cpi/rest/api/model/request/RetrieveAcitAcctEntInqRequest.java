package ph.cpi.rest.api.model.request;

public class RetrieveAcitAcctEntInqRequest {
	private String tranClass;
	private String tranDateFrom;
	private String tranDateTo;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getTranDateFrom() {
		return tranDateFrom;
	}
	public void setTranDateFrom(String tranDateFrom) {
		this.tranDateFrom = tranDateFrom;
	}
	public String getTranDateTo() {
		return tranDateTo;
	}
	public void setTranDateTo(String tranDateTo) {
		this.tranDateTo = tranDateTo;
	}
	@Override
	public String toString() {
		return "RetrieveAcitAcctEntInqRequest [tranClass=" + tranClass + ", tranDateFrom=" + tranDateFrom
				+ ", tranDateTo=" + tranDateTo + "]";
	}
}
