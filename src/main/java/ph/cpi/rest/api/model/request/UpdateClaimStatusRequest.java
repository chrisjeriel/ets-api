package ph.cpi.rest.api.model.request;

import java.util.List;

public class UpdateClaimStatusRequest {
	private List<UpdateClaim> updateClaim;

	public List<UpdateClaim> getUpdateClaim() {
		return updateClaim;
	}

	public void setUpdateClaim(List<UpdateClaim> updateClaim) {
		this.updateClaim = updateClaim;
	}

	@Override
	public String toString() {
		return "UpdateClaimStatusRequest [updateClaim=" + updateClaim + "]";
	}
}

class UpdateClaim{
	private String claimId;
	private String clmStatCd;
	private String reasonCd;
	private String updateUser;
	private String updateDate;
	
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getClmStatCd() {
		return clmStatCd;
	}
	public void setClmStatCd(String clmStatCd) {
		this.clmStatCd = clmStatCd;
	}
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "UpdateClaim: [claimId=" + claimId + ", clmStatCd=" + clmStatCd + ", reasonCd=" + reasonCd
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
