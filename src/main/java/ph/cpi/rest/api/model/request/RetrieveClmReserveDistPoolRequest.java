package ph.cpi.rest.api.model.request;

public class RetrieveClmReserveDistPoolRequest {
	private String claimId;
	private String projId;
	private String histCategory;
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
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getClmDistNo() {
		return clmDistNo;
	}
	public void setClmDistNo(String clmDistNo) {
		this.clmDistNo = clmDistNo;
	}
	@Override
	public String toString() {
		return "RetrieveClmReserveDistPoolRequest [claimId=" + claimId + ", projId=" + projId + ", histCategory="
				+ histCategory + ", clmDistNo=" + clmDistNo + "]";
	}
	
}
