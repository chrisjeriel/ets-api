package ph.cpi.rest.api.model.maintenance;

import java.util.List;

public class City {
	private Integer cityCd;
	private String cityDesc;
	private List<District> districtList;
	public Integer getCityCd() {
		return cityCd;
	}
	public void setCityCd(Integer cityCd) {
		this.cityCd = cityCd;
	}
	public String getCityDesc() {
		return cityDesc;
	}
	public void setCityDesc(String cityDesc) {
		this.cityDesc = cityDesc;
	}
	public List<District> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
	}
	@Override
	public String toString() {
		return "City [cityCd=" + cityCd + ", cityDesc=" + cityDesc + ", districtList=" + districtList + "]";
	}

	
}
