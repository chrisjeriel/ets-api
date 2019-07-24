package ph.cpi.rest.api.model.request;

public class RetrieveClmDistRequest {
	private String claimId;
	private String projId;
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
	@Override
	public String toString() {
		return "RetrieveClmDistRequest [claimId=" + claimId + ", projId=" + projId + "]";
	}
	
}
