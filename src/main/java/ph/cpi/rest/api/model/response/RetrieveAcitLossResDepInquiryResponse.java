package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.LossResDepInquiry;

public class RetrieveAcitLossResDepInquiryResponse {

	private List<LossResDepInquiry> lossResDepList;

	public List<LossResDepInquiry> getLossResDepList() {
		return lossResDepList;
	}
	public void setLossResDepList(List<LossResDepInquiry> lossResDepList) {
		this.lossResDepList = lossResDepList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitLossResDepInquiryResponse [lossResDepList=" + lossResDepList + "]";
	}
}
