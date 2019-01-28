package ph.cpi.rest.api.model.maintenance;

import java.util.List;

public class Province {
	private Integer provinceCd;
	private String provinceDesc;
	private List<City> city;
	
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
	public List<City> getCity() {
		return city;
	}
	public void setCity(List<City> city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Province [provinceCd=" + provinceCd + ", provinceDesc=" + provinceDesc + ", city="
				+ city + "]";
	}
	
}
