package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Insured {
	private Integer insuredId;
	private String insuredName;
	private String insuredAbbr;
	private String insuredType;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String addrLine1;
	private String addrLine2;
	private String addrLine3;
	private String zipCd;
	private String address;
	private String contactNo;
	private String emailAdd;
	private String activeTag;
	private String corpTag;
	private String vatTag;
	private String oldInsId;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
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
	public String getInsuredAbbr() {
		return insuredAbbr;
	}
	public void setInsuredAbbr(String insuredAbbr) {
		this.insuredAbbr = insuredAbbr;
	}
	public String getInsuredType() {
		return insuredType;
	}
	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getAddrLine3() {
		return addrLine3;
	}
	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}
	public String getZipCd() {
		return zipCd;
	}
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getCorpTag() {
		return corpTag;
	}
	public void setCorpTag(String corpTag) {
		this.corpTag = corpTag;
	}
	public String getVatTag() {
		return vatTag;
	}
	public void setVatTag(String vatTag) {
		this.vatTag = vatTag;
	}
	public String getOldInsId() {
		return oldInsId;
	}
	public void setOldInsId(String oldInsId) {
		this.oldInsId = oldInsId;
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
		return "Insured [insuredId=" + insuredId + ", insuredName=" + insuredName + ", insuredAbbr=" + insuredAbbr
				+ ", insuredType=" + insuredType + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", addrLine3="
				+ addrLine3 + ", zipCd=" + zipCd + ", address=" + address + ", contactNo=" + contactNo + ", emailAdd="
				+ emailAdd + ", activeTag=" + activeTag + ", corpTag=" + corpTag + ", vatTag=" + vatTag + ", oldInsId="
				+ oldInsId + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
