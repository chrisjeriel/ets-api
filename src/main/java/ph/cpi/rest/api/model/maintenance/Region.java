package ph.cpi.rest.api.model.maintenance;

public class Region {
	private Integer regionCd;
	private String regionDesc;
	private Province province;
	
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
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	@Override
	public String toString() {
		return "Region [regionCd=" + regionCd + ", regionDesc=" + regionDesc + ", province=" + province + "]";
	}
	
	

}
