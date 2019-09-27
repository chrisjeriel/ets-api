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
    private String itemNo;
    private Integer policyId;
    private Integer instNo;
    private String dueDate;
    private Integer actualOverdueDays;
    private Integer overdueDaysWInt;
    private BigDecimal interestRate;
    private String autoTag;
    private String currCd;
    private BigDecimal currRate;
    private BigDecimal balanceAmt;
    private BigDecimal overdueInt;
    private BigDecimal localAmt;
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
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
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
	public Integer getActualOverdueDays() {
		return actualOverdueDays;
	}
	public void setActualOverdueDays(Integer actualOverdueDays) {
		this.actualOverdueDays = actualOverdueDays;
	}
	public Integer getOverdueDaysWInt() {
		return overdueDaysWInt;
	}
	public void setOverdueDaysWInt(Integer overdueDaysWInt) {
		this.overdueDaysWInt = overdueDaysWInt;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
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
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public BigDecimal getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
				+ ", dueDate=" + dueDate + ", actualOverdueDays=" + actualOverdueDays + ", overdueDaysWInt="
				+ overdueDaysWInt + ", interestRate=" + interestRate + ", autoTag=" + autoTag + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", balanceAmt=" + balanceAmt + ", overdueInt=" + overdueInt + ", localAmt="
				+ localAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
    
}