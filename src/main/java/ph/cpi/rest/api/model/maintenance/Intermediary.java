package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class Intermediary {

	private Integer intmId;
	private String intmName;
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
	private String corpTagDesc;
	private String vatTag;
	private String vatTagDesc;
	private Integer oldIntmId;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getIntmId() {
		return intmId;
	}
	public void setIntmId(Integer intmId) {
		this.intmId = intmId;
	}
	public String getIntmName() {
		return intmName;
	}
	public void setIntmName(String intmName) {
		this.intmName = intmName;
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
	public String getCorpTagDesc() {
		return corpTagDesc;
	}
	public void setCorpTagDesc(String corpTagDesc) {
		this.corpTagDesc = corpTagDesc;
	}
	public String getVatTag() {
		return vatTag;
	}
	public void setVatTag(String vatTag) {
		this.vatTag = vatTag;
	}
	public String getVatTagDesc() {
		return vatTagDesc;
	}
	public void setVatTagDesc(String vatTagDesc) {
		this.vatTagDesc = vatTagDesc;
	}
	public Integer getOldIntmId() {
		return oldIntmId;
	}
	public void setOldIntmId(Integer oldIntmId) {
		this.oldIntmId = oldIntmId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "Intermediary [intmId=" + intmId + ", intmName=" + intmName + ", firstName=" + firstName
				+ ", middleInitial=" + middleInitial + ", lastName=" + lastName + ", addrLine1=" + addrLine1
				+ ", addrLine2=" + addrLine2 + ", addrLine3=" + addrLine3 + ", zipCd=" + zipCd + ", address=" + address
				+ ", contactNo=" + contactNo + ", emailAdd=" + emailAdd + ", activeTag=" + activeTag + ", corpTag="
				+ corpTag + ", corpTagDesc=" + corpTagDesc + ", vatTag=" + vatTag + ", vatTagDesc=" + vatTagDesc
				+ ", oldIntmId=" + oldIntmId + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}	

}
