package ph.cpi.rest.api.model.maintenance;

import java.util.List;

public class Region {
	private Integer regionCd;
	private String regionDesc;
	private List<Province> provinceList;
	public Integer getRegionCd() {
		return regionCd;
	}
	public void setRegionCd(Integer regionCd) {
		this.regionCd = regionCd;
	}
	public String getRegionDesc() {
		return regionDesc;
	}
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}
	public List<Province> getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(List<Province> provinceList) {
		this.provinceList = provinceList;
	}
	@Override
	public String toString() {
		return "Region [regionCd=" + regionCd + ", regionDesc=" + regionDesc + ", provinceList=" + provinceList + "]";
	}
	
	
}
