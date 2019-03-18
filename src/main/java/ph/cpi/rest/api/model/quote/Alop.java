package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDateTime;

public class Alop {

	//private AlopItem alopItem;
	
	private Integer alopId;
	private Integer insuredId;
	private String insuredName;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private List<AlopDetails> alopDetails;
	private List<AlopItem> alopItemList;
	
//	public AlopItem getAlopItem() {
//		return alopItem;
//	}
//	public void setAlopItem(AlopItem alopItem) {
//		this.alopItem = alopItem;
//	}
	public Integer getAlopId() {
		return alopId;
	}
	public void setAlopId(Integer alopId) {
		this.alopId = alopId;
	}
	public Integer getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(Integer insuredId) {
		this.insuredId = insuredId;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInsuredBusiness() {
		return insuredBusiness;
	}
	public void setInsuredBusiness(String insuredBusiness) {
		this.insuredBusiness = insuredBusiness;
	}
	
	public List<AlopDetails> getAlopDetails() {
		return alopDetails;
	}
	public void setAlopDetails(List<AlopDetails> alopDetails) {
		this.alopDetails = alopDetails;
	}
	public List<AlopItem> getAlopItemList() {
		return alopItemList;
	}
	public void setAlopItemList(List<AlopItem> alopItemList) {
		this.alopItemList = alopItemList;
	}
	@Override
	public String toString() {
		return "Alop [alopId=" + alopId + ", insuredId=" + insuredId + ", insuredName=" + insuredName + ", insuredDesc="
				+ insuredDesc + ", address=" + address + ", insuredBusiness=" + insuredBusiness + ", alopDetails="
				+ alopDetails + ", alopItemList=" + alopItemList + "]";
	}
	
}
