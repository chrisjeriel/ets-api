package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.BatchDistribution;


public class BatchDistributionRequest {
	private List<BatchDistribution> distList;
	private String user;
	
	public List<BatchDistribution> getDistList() {
		return distList;
	}
	public void setDistList(List<BatchDistribution> distList) {
		//distList.sort(Comparator.comparing(BatchDistribution::getCreateDate));
		this.distList = distList;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "BatchDistributionRequest [distList=" + distList + ", user=" + user + "]";
	}

}