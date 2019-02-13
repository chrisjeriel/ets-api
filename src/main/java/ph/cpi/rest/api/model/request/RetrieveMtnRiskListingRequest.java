package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnRiskListingRequest {

	private String riskId;
	private String riskAbbr;
	private String riskName;
	private String regionDesc;
	private String provinceDesc;
	private String cityDesc;
	private String districtDesc;
	private String blockDesc;
	private String latitude;
	private String longitude;
	private String activeTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public String getRiskAbbr() {
		return riskAbbr;
	}
	public void setRiskAbbr(String riskAbbr) {
		this.riskAbbr = riskAbbr;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getRegionDesc() {
		return regionDesc;
	}
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}
	public String getProvinceDesc() {
		return provinceDesc;
	}
	public void setProvinceDesc(String provinceDesc) {
		this.provinceDesc = provinceDesc;
	}
	public String getCityDesc() {
		return cityDesc;
	}
	public void setCityDesc(String cityDesc) {
		this.cityDesc = cityDesc;
	}
	public String getDistrictDesc() {
		return districtDesc;
	}
	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
	}
	public String getBlockDesc() {
		return blockDesc;
	}
	public void setBlockDesc(String blockDesc) {
		this.blockDesc = blockDesc;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "RetrieveMtnRiskListingRequest [riskId=" + riskId + ", riskAbbr=" + riskAbbr + ", riskName=" + riskName
				+ ", regionDesc=" + regionDesc + ", provinceDesc=" + provinceDesc + ", cityDesc=" + cityDesc
				+ ", districtDesc=" + districtDesc + ", blockDesc=" + blockDesc + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", activeTag=" + activeTag + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
