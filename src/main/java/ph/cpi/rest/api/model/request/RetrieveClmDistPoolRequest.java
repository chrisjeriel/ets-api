package ph.cpi.rest.api.model.request;

public class RetrieveClmDistPoolRequest {
	private String claimId;
	private String projId;
	private String histNo;
	private String clmDistNo;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getClmDistNo() {
		return clmDistNo;
	}
	public void setClmDistNo(String clmDistNo) {
		this.clmDistNo = clmDistNo;
	}
	@Override
	public String toString() {
		return "RetrieveClmDistPoolRequest [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo
				+ ", clmDistNo=" + clmDistNo + "]";
	}
	
}
