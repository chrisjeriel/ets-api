package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.type.Alias;

public class SaveAcitJVInvPullOutRequest {
	private Integer tranId;
	private Integer tranType;
	private List<InvPullOut> saveInvPullOut;
	private List<InvPullOut> delInvPullOut;
	
	
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

	public List<InvPullOut> getSaveInvPullOut() {
		return saveInvPullOut;
	}

	public void setSaveInvPullOut(List<InvPullOut> saveInvPullOut) {
		this.saveInvPullOut = saveInvPullOut;
	}

	public List<InvPullOut> getDelInvPullOut() {
		return delInvPullOut;
	}

	public void setDelInvPullOut(List<InvPullOut> delInvPullOut) {
		this.delInvPullOut = delInvPullOut;
	}

	@Override
	public String toString() {
		return "SaveAcitJVInvPullOutRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveInvPullOut="
				+ saveInvPullOut + ", delInvPullOut=" + delInvPullOut + "]";
	}

	
}

@Alias ("ACITInvPullOut")
class InvPullOut {
	private Integer tranId;
	private Integer itemNo;
	private Integer invtId;
	private String destInvtId;
	private String pulloutType;
	private Integer bank;
	private String bankAcct;
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
	private BigDecimal pullInvtAmt;
	private BigDecimal pullIncomeAmt;
	private BigDecimal pullBankCharge;
	private BigDecimal pullWhtaxAmt;
	private BigDecimal pullNetValue;
	private BigDecimal incomeBalance;
	
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
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getDestInvtId() {
		return destInvtId;
	}
	public void setDestInvtId(String destInvtId) {
		this.destInvtId = destInvtId;
	}
	public String getPulloutType() {
		return pulloutType;
	}
	public void setPulloutType(String pulloutType) {
		this.pulloutType = pulloutType;
	}
	public Integer getBank() {
		return bank;
	}
	public void setBank(Integer bank) {
		this.bank = bank;
	}
	public String getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
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
	public BigDecimal getPullInvtAmt() {
		return pullInvtAmt;
	}
	public void setPullInvtAmt(BigDecimal pullInvtAmt) {
		this.pullInvtAmt = pullInvtAmt;
	}
	public BigDecimal getPullIncomeAmt() {
		return pullIncomeAmt;
	}
	public void setPullIncomeAmt(BigDecimal pullIncomeAmt) {
		this.pullIncomeAmt = pullIncomeAmt;
	}
	public BigDecimal getPullBankCharge() {
		return pullBankCharge;
	}
	public void setPullBankCharge(BigDecimal pullBankCharge) {
		this.pullBankCharge = pullBankCharge;
	}
	public BigDecimal getPullWhtaxAmt() {
		return pullWhtaxAmt;
	}
	public void setPullWhtaxAmt(BigDecimal pullWhtaxAmt) {
		this.pullWhtaxAmt = pullWhtaxAmt;
	}
	public BigDecimal getPullNetValue() {
		return pullNetValue;
	}
	public void setPullNetValue(BigDecimal pullNetValue) {
		this.pullNetValue = pullNetValue;
	}
	public BigDecimal getIncomeBalance() {
		return incomeBalance;
	}
	public void setIncomeBalance(BigDecimal incomeBalance) {
		this.incomeBalance = incomeBalance;
	}
	@Override
	public String toString() {
		return "InvPullOut [tranId=" + tranId + ", itemNo=" + itemNo + ", invtId=" + invtId + ", destInvtId="
				+ destInvtId + ", pulloutType=" + pulloutType + ", bank=" + bank + ", bankAcct=" + bankAcct
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt=" + invtAmt + ", incomeAmt=" + incomeAmt
				+ ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt + ", maturityValue=" + maturityValue
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", pullInvtAmt=" + pullInvtAmt
				+ ", pullIncomeAmt=" + pullIncomeAmt + ", pullBankCharge=" + pullBankCharge + ", pullWhtaxAmt="
				+ pullWhtaxAmt + ", pullNetValue=" + pullNetValue + ", incomeBalance=" + incomeBalance + "]";
	}
	
}
