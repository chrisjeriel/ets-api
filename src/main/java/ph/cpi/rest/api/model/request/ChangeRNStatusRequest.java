package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.workflowmanager.NRStatus;

public class ChangeRNStatusRequest {

	
	List<NRStatus> rnStatusList;

	public List<NRStatus> getRnStatusList() {
		return rnStatusList;
	}

	public void setRnStatusList(List<NRStatus> rnStatusList) {
		this.rnStatusList = rnStatusList;
	}

	@Override
	public String toString() {
		return "ChangeRNStatusRequest [rnStatusList=" + rnStatusList + "]";
	}
	
}
