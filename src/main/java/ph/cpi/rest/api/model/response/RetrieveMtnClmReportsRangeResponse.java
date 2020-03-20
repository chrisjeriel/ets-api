package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.ClaimReportsRange;

public class RetrieveMtnClmReportsRangeResponse {
	private List<ClaimReportsRange> reportsRange;

	public List<ClaimReportsRange> getReportsRange() {
		return reportsRange;
	}

	public void setReportsRange(List<ClaimReportsRange> reportsRange) {
		this.reportsRange = reportsRange;
	}

	@Override
	public String toString() {
		return "RetrieveMtnClmReportsRangeResponse [reportsRange=" + reportsRange + "]";
	}
	
}
