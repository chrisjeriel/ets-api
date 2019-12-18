package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetMtnInsuredLovRequest {
	
	private String lovParam;
	private String insuredName;
	private String address;
	private String insuredAbbr;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getInsuredAbbr() {
		return insuredAbbr;
	}
	public void setInsuredAbbr(String insuredAbbr) {
		this.insuredAbbr = insuredAbbr;
	}
	public String getLovParam() {
		return lovParam;
	}
	public void setLovParam(String lovParam) {
		this.lovParam = lovParam;
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
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "RetMtnInsuredLovRequest [lovParam=" + lovParam + ", insuredName=" + insuredName + ", address=" + address
				+ ", insuredAbbr=" + insuredAbbr + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
	
}
