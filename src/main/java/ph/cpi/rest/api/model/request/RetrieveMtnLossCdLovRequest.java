package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnLossCdLovRequest {

	private String lossCdType;
	private String searchStr;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getLossCdType() {
		return lossCdType;
	}
	public void setLossCdType(String lossCdType) {
		this.lossCdType = lossCdType;
	}
	public String getSearchStr() {
		return searchStr;
	}
	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
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
		return "RetrieveMtnLossCdLovRequest [lossCdType=" + lossCdType + ", searchStr=" + searchStr
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
