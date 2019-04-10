package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrievePolCoverageAltRequest {
	private String lineCd;
	private Integer polYear;
	private Integer seqNo;
	private Integer cedingId;
	private Integer coSeriesNo;
	private Integer altNo;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
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
	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
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
		return "RetrievePolCoverageAltRequest [lineCd=" + lineCd + ", polYear=" + polYear + ", seqNo=" + seqNo
				+ ", cedingId=" + cedingId + ", coSeriesNo=" + coSeriesNo + ", altNo=" + altNo + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
	
}
