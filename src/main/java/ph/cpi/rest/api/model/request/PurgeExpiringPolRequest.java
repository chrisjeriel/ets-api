package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class PurgeExpiringPolRequest {
	private List<Purge> deletePurge;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public List<Purge> getDeletePurge() {
		return deletePurge;
	}
	public void setDeletePurge(List<Purge> deletePurge) {
		this.deletePurge = deletePurge;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	@Override
	public String toString() {
		return "PurgeExpiringPolRequest [deletePurge=" + deletePurge + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}

@Alias ("PurgeExpiry")
class Purge {
	
	private String policyId;
	private String lineCd;

	public String getLineCd() {
		return lineCd;
	}

	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "Purge [policyId=" + policyId + ", lineCd=" + lineCd + "]";
	}

}
