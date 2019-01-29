package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.maintenance.Block;
import ph.cpi.rest.api.model.maintenance.City;
import ph.cpi.rest.api.model.maintenance.District;
import ph.cpi.rest.api.model.maintenance.Province;
import ph.cpi.rest.api.model.maintenance.Region;

public class RetrieveMtnBlockRequest {
	private Integer regionCd;
	private Integer provinceCd;
	private Integer cityCd;
	private Integer districtCd;
	private Integer blockCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getRegionCd() {
		return regionCd;
	}
	public void setRegionCd(Integer regionCd) {
		this.regionCd = regionCd;
	}
	public Integer getProvinceCd() {
		return provinceCd;
	}
	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}
	public Integer getCityCd() {
		return cityCd;
	}
	public void setCityCd(Integer cityCd) {
		this.cityCd = cityCd;
	}
	public Integer getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(Integer districtCd) {
		this.districtCd = districtCd;
	}
	public Integer getBlockCd() {
		return blockCd;
	}
	public void setBlockCd(Integer blockCd) {
		this.blockCd = blockCd;
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
		return "RetrieveMtnBlockRequest [regionCd=" + regionCd + ", provinceCd=" + provinceCd + ", cityCd=" + cityCd
				+ ", districtCd=" + districtCd + ", blockCd=" + blockCd + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
	
	
	
}
