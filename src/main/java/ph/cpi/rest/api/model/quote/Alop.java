package ph.cpi.rest.api.model.quote;

import java.util.List;

import org.joda.time.DateTime;

public class Alop {

	//private AlopItem alopItem;
	
	private Integer optionId;
	private Integer insuredId;
	private String insuredName;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<AlopDetails> alopDetails;
	
	
//	public AlopItem getAlopItem() {
//		return alopItem;
//	}
//	public void setAlopItem(AlopItem alopItem) {
//		this.alopItem = alopItem;
//	}
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
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
	
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Alop [optionId=" + optionId + ", insuredId=" + insuredId + ", insuredName=" + insuredName
				+ ", insuredDesc=" + insuredDesc + ", address=" + address + ", insuredBusiness=" + insuredBusiness
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", alopDetails=" + alopDetails + "]";
	}
	
	
}
