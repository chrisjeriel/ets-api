package ph.cpi.rest.api.model.accountingintrust;

import org.joda.time.DateTime;

public class AcitCvListing {
	private String cvGenNo;
	private Integer tranId;
	private Integer cvYear;
	private Integer cvNo;
	private DateTime cvDate;
	private String cvStatus;
	private String cvStatusDesc;
	private Integer payeeNo;
	private String payee;
	private String particulars;
	private Integer bank;
	private String bankAcct;
	private String checkNo;
	private DateTime checkDate;
	private String checkClass;
	private String currCd;
	private Integer currRate;
	private Integer cvAmt;
	private Integer localAmt;
	private String preparedBy;
	private DateTime preparedDate;
	private String certifiedBy;
	private DateTime certifiedDate;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getCvGenNo() {
		return cvGenNo;
	}
	public void setCvGenNo(String cvGenNo) {
		this.cvGenNo = cvGenNo;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getCvYear() {
		return cvYear;
	}
	public void setCvYear(Integer cvYear) {
		this.cvYear = cvYear;
	}
	public Integer getCvNo() {
		return cvNo;
	}
	public void setCvNo(Integer cvNo) {
		this.cvNo = cvNo;
	}
	public DateTime getCvDate() {
		return cvDate;
	}
	public void setCvDate(DateTime cvDate) {
		this.cvDate = cvDate;
	}
	public String getCvStatus() {
		return cvStatus;
	}
	public void setCvStatus(String cvStatus) {
		this.cvStatus = cvStatus;
	}
	public String getCvStatusDesc() {
		return cvStatusDesc;
	}
	public void setCvStatusDesc(String cvStatusDesc) {
		this.cvStatusDesc = cvStatusDesc;
	}
	public Integer getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(Integer payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
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
	public String getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	public DateTime getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(DateTime checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckClass() {
		return checkClass;
	}
	public void setCheckClass(String checkClass) {
		this.checkClass = checkClass;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Integer getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Integer currRate) {
		this.currRate = currRate;
	}
	public Integer getCvAmt() {
		return cvAmt;
	}
	public void setCvAmt(Integer cvAmt) {
		this.cvAmt = cvAmt;
	}
	public Integer getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(Integer localAmt) {
		this.localAmt = localAmt;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public DateTime getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(DateTime preparedDate) {
		this.preparedDate = preparedDate;
	}
	public String getCertifiedBy() {
		return certifiedBy;
	}
	public void setCertifiedBy(String certifiedBy) {
		this.certifiedBy = certifiedBy;
	}
	public DateTime getCertifiedDate() {
		return certifiedDate;
	}
	public void setCertifiedDate(DateTime certifiedDate) {
		this.certifiedDate = certifiedDate;
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
		return "AcitCvListing [cvGenNo=" + cvGenNo + ", tranId=" + tranId + ", cvYear=" + cvYear + ", cvNo=" + cvNo
				+ ", cvDate=" + cvDate + ", cvStatus=" + cvStatus + ", cvStatusDesc=" + cvStatusDesc + ", payeeNo="
				+ payeeNo + ", payee=" + payee + ", particulars=" + particulars + ", bank=" + bank + ", bankAcct="
				+ bankAcct + ", checkNo=" + checkNo + ", checkDate=" + checkDate + ", checkClass=" + checkClass
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", cvAmt=" + cvAmt + ", localAmt=" + localAmt
				+ ", preparedBy=" + preparedBy + ", preparedDate=" + preparedDate + ", certifiedBy=" + certifiedBy
				+ ", certifiedDate=" + certifiedDate + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
