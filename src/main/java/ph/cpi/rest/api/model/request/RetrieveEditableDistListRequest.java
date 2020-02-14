package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SearchRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveEditableDistListRequest {
	private String lineCd;
	private Integer polYear;
	private Integer polSeqNo;
	private String cedingId;
	private Integer coSeriesNo;
	private Integer altNo;
	private String policyNo;
	private String riskName;
	private String cedingName;
	
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest;
	private SearchRequest search;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getPolYear() {
		return polYear;
	}
	public void setPolYear(Integer polYear) {
		this.polYear = polYear;
	}
	public Integer getPolSeqNo() {
		return polSeqNo;
	}
	public void setPolSeqNo(Integer polSeqNo) {
		this.polSeqNo = polSeqNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getCoSeriesNo() {
		return coSeriesNo;
	}
	public void setCoSeriesNo(Integer coSeriesNo) {
		this.coSeriesNo = coSeriesNo;
	}
	public Integer getAltNo() {
		return altNo;
	}
	public void setAltNo(Integer altNo) {
		this.altNo = altNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
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
	public SearchRequest getSearch() {
		return search;
	}
	public void setSearch(SearchRequest search) {
		this.search = search;
	}
	@Override
	public String toString() {
		return "RetrieveEditableDistListRequest [lineCd=" + lineCd + ", polYear=" + polYear + ", polSeqNo=" + polSeqNo
				+ ", cedingId=" + cedingId + ", coSeriesNo=" + coSeriesNo + ", altNo=" + altNo + ", policyNo="
				+ policyNo + ", riskName=" + riskName + ", cedingName=" + cedingName + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + ", search=" + search + "]";
	}
	
}
