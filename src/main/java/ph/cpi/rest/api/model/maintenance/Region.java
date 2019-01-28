package ph.cpi.rest.api.model.maintenance;

import java.util.List;

public class Region {
	private Integer regionCd;
	private String regionDesc;
	private List<Province> province;
	
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
	public List<Province> getProvince() {
		return province;
	}
	public void setProvince(List<Province> province) {
		this.province = province;
	}
	
	@Override
	public String toString() {
		return "Region [regionCd=" + regionCd + ", regionDesc=" + regionDesc + ", province="
				+ province + "]";
	}
	
}
