package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;


public class SaveAcitJVIntOverdAcctMSRequest {
	private Integer tranType;
	private Integer tranId;
	private List<overDueAccts> saveOverdueAccts;
	private List<overDueAccts> deleteOverdueAccts;
	
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public List<overDueAccts> getSaveOverdueAccts() {
		return saveOverdueAccts;
	}
	public void setSaveOverdueAccts(List<overDueAccts> saveOverdueAccts) {
		this.saveOverdueAccts = saveOverdueAccts;
	}
	public List<overDueAccts> getDeleteOverdueAccts() {
		return deleteOverdueAccts;
	}
	public void setDeleteOverdueAccts(List<overDueAccts> deleteOverdueAccts) {
		this.deleteOverdueAccts = deleteOverdueAccts;
	}
	@Override
	public String toString() {
		return "SaveAcitJVIntOverdAcctMSRequest [tranType=" + tranType + ", tranId=" + tranId + ", saveOverdueAccts="
				+ saveOverdueAccts + ", deleteOverdueAccts=" + deleteOverdueAccts + "]";
	}
	
}

@Alias ("ACITOverdueAcct")
class overDueAccts {
	private Integer tranId;
	private Integer itemNo;
	private Integer policyId;
	private Integer instNo;
	private String dueDate;
	private Integer daysOverdue;
	private Integer interestRate;
	private String autoTag;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal premAmt;
	private BigDecimal overdueInt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getDaysOverdue() {
		return daysOverdue;
	}
	public void setDaysOverdue(Integer daysOverdue) {
		this.daysOverdue = daysOverdue;
	}
	
	public Integer getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "overDueAccts [tranId=" + tranId + ", itemNo=" + itemNo + ", policyId=" + policyId + ", instNo=" + instNo
				+ ", dueDate=" + dueDate + ", daysOverdue=" + daysOverdue + ", interestRate=" + interestRate
				+ ", autoTag=" + autoTag + ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt=" + premAmt
				+ ", overdueInt=" + overdueInt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}