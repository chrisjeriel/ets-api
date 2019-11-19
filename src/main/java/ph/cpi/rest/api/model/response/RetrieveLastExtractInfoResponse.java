package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.underwriting.LastExpiryExtractInfo;

public class RetrieveLastExtractInfoResponse {
	private LastExpiryExtractInfo info;

	public LastExpiryExtractInfo getInfo() {
		return info;
	}

	public void setInfo(LastExpiryExtractInfo info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "RetrieveLastExtractInfoResponse [info=" + info + "]";
	}
	
}
