package ph.cpi.rest.api.model.request;

public class RestoreServiceAccountingEntriesRequest {
	private String tranId;
	private String histNo;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	@Override
	public String toString() {
		return "RestoreServiceAccountingEntriesRequest [tranId=" + tranId + ", histNo=" + histNo + "]";
	}
}
