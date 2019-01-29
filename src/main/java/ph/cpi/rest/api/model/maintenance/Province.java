package ph.cpi.rest.api.model.maintenance;

public class Province {
	private Integer provinceCd;
	private String provinceDesc;
	private City city;
	
	public Integer getProvinceCd() {
		return provinceCd;
	}
	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}
	public String getProvinceDesc() {
		return provinceDesc;
	}
	public void setProvinceDesc(String provinceDesc) {
		this.provinceDesc = provinceDesc;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Province [provinceCd=" + provinceCd + ", provinceDesc=" + provinceDesc + ", city=" + city + "]";
	}
	
	
}
