package ph.cpi.rest.api.model.maintenance;

public class City {
	private Integer cityCd;
	private String cityDesc;
	private District district;
	
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
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "City [cityCd=" + cityCd + ", cityDesc=" + cityDesc + ", district=" + district + "]";
	}
	
	
}
