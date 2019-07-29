package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class SaveAcitInvestmentsRequest {
		
	private List<AcitInvt> saveAcitInvestments;
	private List<AcitInvt> delAcitInvestments;
	
	public List<AcitInvt> getSaveAcitInvestments() {
		return saveAcitInvestments;
	}
	public void setSaveAcitInvestments(List<AcitInvt> saveAcitInvestments) {
		this.saveAcitInvestments = saveAcitInvestments;
	}
	public List<AcitInvt> getDelAcitInvestments() {
		return delAcitInvestments;
	}
	public void setDelAcitInvestments(List<AcitInvt> delAcitInvestments) {
		this.delAcitInvestments = delAcitInvestments;
	}
	
	@Override
	public String toString() {
		return "SaveAcitInvestmentsRequest [saveAcitInvestments=" + saveAcitInvestments + ", delAcitInvestments="
				+ delAcitInvestments + "]";
	}

} 

class AcitInvt {
	
	private String 		invtId;
	private String 		invtCd;
	private String  	bank;
	private String  	certNo;
	private String		invtType;
	private String  	invtSecCd;
	private String  	invtStatus;
	private String 		matPeriod;
	private String 		durUnit;
	private String 		intRt;
	private String 		purDate;
	private String 		matDate;
	private String 		currCd;
	private String 		currRate;
	private String 		invtAmt;
	private String 		incomeAmt;
	private String  	bankCharge;     
	private String  	whtaxAmt;
	private String  	matVal;
	private String 		createUser;
	private String 		createDate;
	private String 		updateUser;
	private String 		updateDate;
	
	public String getInvtId() {
		return invtId;
	}
	public void setInvtId(String invtId) {
		this.invtId = invtId;
	}
	public String getInvtCd() {
		return invtCd;
	}
	public void setInvtCd(String invtCd) {
		this.invtCd = invtCd;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getInvtType() {
		return invtType;
	}
	public void setInvtType(String invtType) {
		this.invtType = invtType;
	}
	public String getInvtSecCd() {
		return invtSecCd;
	}
	public void setInvtSecCd(String invtSecCd) {
		this.invtSecCd = invtSecCd;
	}
	public String getInvtStatus() {
		return invtStatus;
	}
	public void setInvtStatus(String invtStatus) {
		this.invtStatus = invtStatus;
	}
	public String getMatPeriod() {
		return matPeriod;
	}
	public void setMatPeriod(String matPeriod) {
		this.matPeriod = matPeriod;
	}
	public String getDurUnit() {
		return durUnit;
	}
	public void setDurUnit(String durUnit) {
		this.durUnit = durUnit;
	}
	public String getIntRt() {
		return intRt;
	}
	public void setIntRt(String intRt) {
		this.intRt = intRt;
	}
	public String getPurDate() {
		return purDate;
	}
	public void setPurDate(String purDate) {
		this.purDate = purDate;
	}
	public String getMatDate() {
		return matDate;
	}
	public void setMatDate(String matDate) {
		this.matDate = matDate;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(String invtAmt) {
		this.invtAmt = invtAmt;
	}
	public String getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(String incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public String getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(String bankCharge) {
		this.bankCharge = bankCharge;
	}
	public String getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(String whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public String getMatVal() {
		return matVal;
	}
	public void setMatVal(String matVal) {
		this.matVal = matVal;
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
		return "AcitInvestments [invtId=" + invtId + ", invtCd=" + invtCd + ", bank=" + bank + ", certNo=" + certNo
				+ ", invtType=" + invtType + ", invtSecCd=" + invtSecCd + ", invtStatus=" + invtStatus + ", matPeriod="
				+ matPeriod + ", durUnit=" + durUnit + ", intRt=" + intRt + ", purDate=" + purDate + ", matDate="
				+ matDate + ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt=" + invtAmt + ", incomeAmt="
				+ incomeAmt + ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt + ", matVal=" + matVal
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}