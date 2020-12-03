package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.UnappColInquiry;

public class RetrieveAcitUnappColInquiryResponse {

	private List<UnappColInquiry> unappliedColList;
	private List<UnappColInquiry> unappliedColRealignmentList;
	
	public List<UnappColInquiry> getUnappliedColList() {
		return unappliedColList;
	}
	public void setUnappliedColList(List<UnappColInquiry> unappliedColList) {
		this.unappliedColList = unappliedColList;
	}
	public List<UnappColInquiry> getUnappliedColRealignmentList() {
		return unappliedColRealignmentList;
	}
	public void setUnappliedColRealignmentList(List<UnappColInquiry> unappliedColRealignmentList) {
		this.unappliedColRealignmentList = unappliedColRealignmentList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitUnappColInquiryResponse [unappliedColList=" + unappliedColList
				+ ", unappliedColRealignmentList=" + unappliedColRealignmentList + "]";
	}
}
