package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.claims.UpdateClaim;

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

