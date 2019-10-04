package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitJVTrtyInvtRequest {
	private Integer tranId;
	private Integer tranType;
	private List<acctTrty> saveaccTrty;
	private List<acctTrty> delaccTrty;
	private List<invtTreaty> saveTrtyInvt;
	private List<invtTreaty> delTrtyInvt;
	
	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public Integer getTranType() {
		return tranType;
	}

	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}

	public List<invtTreaty> getSaveTrtyInvt() {
		return saveTrtyInvt;
	}

	public void setSaveTrtyInvt(List<invtTreaty> saveTrtyInvt) {
		this.saveTrtyInvt = saveTrtyInvt;
	}
	
	
	public List<acctTrty> getSaveaccTrty() {
		return saveaccTrty;
	}

	public void setSaveaccTrty(List<acctTrty> saveaccTrty) {
		this.saveaccTrty = saveaccTrty;
	}
	
	public List<invtTreaty> getDelTrtyInvt() {
		return delTrtyInvt;
	}

	public void setDelTrtyInvt(List<invtTreaty> delTrtyInvt) {
		this.delTrtyInvt = delTrtyInvt;
	}
	
	
	public List<acctTrty> getDelaccTrty() {
		return delaccTrty;
	}

	public void setDelaccTrty(List<acctTrty> delaccTrty) {
		this.delaccTrty = delaccTrty;
	}

	@Override
	public String toString() {
		return "SaveAcitJVTrtyInvtRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveaccTrty=" + saveaccTrty
				+ ", delaccTrty=" + delaccTrty + ", saveTrtyInvt=" + saveTrtyInvt + ", delTrtyInvt=" + delTrtyInvt
				+ "]";
	}

	
}

@Alias ("ACITInvtTrty")
class invtTreaty {
	private Integer tranId;
	private Integer quarterNo;
	private Integer itemNo;
	private Integer invtId;
	private String pulloutType;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal invtAmt;
	private BigDecimal incomeAmt;
	private BigDecimal bankCharge;
	private BigDecimal whtaxAmt;
	private BigDecimal maturityValue;
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
	public Integer getQuarterNo() {
		return quarterNo;
	}
	public void setQuarterNo(Integer quarterNo) {
		this.quarterNo = quarterNo;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getPulloutType() {
		return pulloutType;
	}
	public void setPulloutType(String pulloutType) {
		this.pulloutType = pulloutType;
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
	public BigDecimal getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(BigDecimal invtAmt) {
		this.invtAmt = invtAmt;
	}
	public BigDecimal getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(BigDecimal incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public BigDecimal getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(BigDecimal bankCharge) {
		this.bankCharge = bankCharge;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getMaturityValue() {
		return maturityValue;
	}
	public void setMaturityValue(BigDecimal maturityValue) {
		this.maturityValue = maturityValue;
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
		return "invtTreaty [tranId=" + tranId + ", quarterNo=" + quarterNo + ", itemNo=" + itemNo + ", invtId=" + invtId
				+ ", pulloutType=" + pulloutType + ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt="
				+ invtAmt + ", incomeAmt=" + incomeAmt + ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt
				+ ", maturityValue=" + maturityValue + ", localAmt=" + localAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}

@Alias ("ACITacctTrty")
class acctTrty {
	private Integer tranId;
	private Integer quarterNo;
	private Integer qsoaId;
	private String quarterEnding;
	private String cedingId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal balanceAmt;
	private BigDecimal localAmt;
	private BigDecimal actualBalPaid;
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
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getQuarterNo() {
		return quarterNo;
	}
	public void setQuarterNo(Integer quarterNo) {
		this.quarterNo = quarterNo;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
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
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
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
		return "acctTrty [tranId=" + tranId + ", quarterNo=" + quarterNo + ", qsoaId=" + qsoaId + ", quarterEnding="
				+ quarterEnding + ", cedingId=" + cedingId + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", balanceAmt=" + balanceAmt + ", localAmt=" + localAmt + ", actualBalPaid=" + actualBalPaid
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
