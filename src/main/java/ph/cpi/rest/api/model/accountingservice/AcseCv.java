package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseCv {
	private String cvGenNo;
	private Integer tranId;
	private Integer cvYear;
	private Integer cvNo;
	private DateTime cvDate;
	private String cvStatus;
	private String cvStatusDesc;
	private String paytReqType;
	private String paytReqTypeDesc;
	private Integer payeeClassCd;
	private String payeeCd;
	private String payee;
	private String particulars;
	private Integer bank;
	private String bankDesc;
	private Integer bankAcct;
	private String bankAcctDesc;
	private String checkNo;
	private DateTime checkDate;
	private String checkClass;
	private String checkClassDesc;
	private String currCd;
	private Float currRate;
	private BigDecimal cvAmt;
	private BigDecimal localAmt;
	private String preparedBy;
	private DateTime preparedDate;
	private String certifiedBy;
	private DateTime certifiedDate;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private Integer mainTranId;
	private DateTime mainTranDate;
	private String mainTranClass;
	private String mainTranTypeCd;
	private Integer mainTranYear;
	private Integer mainTranClassNo;
	private String mainTranStat;
	private String mainTranStatDesc;
	private DateTime mainCloseDate;
	private DateTime mainDeleteDate;
	private DateTime mainPostDate;
	private String mainCreateUser;
	private DateTime mainCreateDate;
	private String mainUpdateUser;
	private DateTime mainUpdateDate;
	
	private String refNo;

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

	public String getPaytReqType() {
		return paytReqType;
	}

	public void setPaytReqType(String paytReqType) {
		this.paytReqType = paytReqType;
	}

	public String getPaytReqTypeDesc() {
		return paytReqTypeDesc;
	}

	public void setPaytReqTypeDesc(String paytReqTypeDesc) {
		this.paytReqTypeDesc = paytReqTypeDesc;
	}

	public Integer getPayeeClassCd() {
		return payeeClassCd;
	}

	public void setPayeeClassCd(Integer payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}

	public String getPayeeCd() {
		return payeeCd;
	}

	public void setPayeeCd(String payeeCd) {
		this.payeeCd = payeeCd;
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

	public String getBankDesc() {
		return bankDesc;
	}

	public void setBankDesc(String bankDesc) {
		this.bankDesc = bankDesc;
	}

	public Integer getBankAcct() {
		return bankAcct;
	}

	public void setBankAcct(Integer bankAcct) {
		this.bankAcct = bankAcct;
	}

	public String getBankAcctDesc() {
		return bankAcctDesc;
	}

	public void setBankAcctDesc(String bankAcctDesc) {
		this.bankAcctDesc = bankAcctDesc;
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

	public String getCheckClassDesc() {
		return checkClassDesc;
	}

	public void setCheckClassDesc(String checkClassDesc) {
		this.checkClassDesc = checkClassDesc;
	}

	public String getCurrCd() {
		return currCd;
	}

	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}

	public Float getCurrRate() {
		return currRate;
	}

	public void setCurrRate(Float currRate) {
		this.currRate = currRate;
	}

	public BigDecimal getCvAmt() {
		return cvAmt;
	}

	public void setCvAmt(BigDecimal cvAmt) {
		this.cvAmt = cvAmt;
	}

	public BigDecimal getLocalAmt() {
		return localAmt;
	}

	public void setLocalAmt(BigDecimal localAmt) {
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

	public Integer getMainTranId() {
		return mainTranId;
	}

	public void setMainTranId(Integer mainTranId) {
		this.mainTranId = mainTranId;
	}

	public DateTime getMainTranDate() {
		return mainTranDate;
	}

	public void setMainTranDate(DateTime mainTranDate) {
		this.mainTranDate = mainTranDate;
	}

	public String getMainTranClass() {
		return mainTranClass;
	}

	public void setMainTranClass(String mainTranClass) {
		this.mainTranClass = mainTranClass;
	}

	public String getMainTranTypeCd() {
		return mainTranTypeCd;
	}

	public void setMainTranTypeCd(String mainTranTypeCd) {
		this.mainTranTypeCd = mainTranTypeCd;
	}

	public Integer getMainTranYear() {
		return mainTranYear;
	}

	public void setMainTranYear(Integer mainTranYear) {
		this.mainTranYear = mainTranYear;
	}

	public Integer getMainTranClassNo() {
		return mainTranClassNo;
	}

	public void setMainTranClassNo(Integer mainTranClassNo) {
		this.mainTranClassNo = mainTranClassNo;
	}

	public String getMainTranStat() {
		return mainTranStat;
	}

	public void setMainTranStat(String mainTranStat) {
		this.mainTranStat = mainTranStat;
	}

	public String getMainTranStatDesc() {
		return mainTranStatDesc;
	}

	public void setMainTranStatDesc(String mainTranStatDesc) {
		this.mainTranStatDesc = mainTranStatDesc;
	}

	public DateTime getMainCloseDate() {
		return mainCloseDate;
	}

	public void setMainCloseDate(DateTime mainCloseDate) {
		this.mainCloseDate = mainCloseDate;
	}

	public DateTime getMainDeleteDate() {
		return mainDeleteDate;
	}

	public void setMainDeleteDate(DateTime mainDeleteDate) {
		this.mainDeleteDate = mainDeleteDate;
	}

	public DateTime getMainPostDate() {
		return mainPostDate;
	}

	public void setMainPostDate(DateTime mainPostDate) {
		this.mainPostDate = mainPostDate;
	}

	public String getMainCreateUser() {
		return mainCreateUser;
	}

	public void setMainCreateUser(String mainCreateUser) {
		this.mainCreateUser = mainCreateUser;
	}

	public DateTime getMainCreateDate() {
		return mainCreateDate;
	}

	public void setMainCreateDate(DateTime mainCreateDate) {
		this.mainCreateDate = mainCreateDate;
	}

	public String getMainUpdateUser() {
		return mainUpdateUser;
	}

	public void setMainUpdateUser(String mainUpdateUser) {
		this.mainUpdateUser = mainUpdateUser;
	}

	public DateTime getMainUpdateDate() {
		return mainUpdateDate;
	}

	public void setMainUpdateDate(DateTime mainUpdateDate) {
		this.mainUpdateDate = mainUpdateDate;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "AcseCv [cvGenNo=" + cvGenNo + ", tranId=" + tranId + ", cvYear=" + cvYear + ", cvNo=" + cvNo
				+ ", cvDate=" + cvDate + ", cvStatus=" + cvStatus + ", cvStatusDesc=" + cvStatusDesc + ", paytReqType="
				+ paytReqType + ", paytReqTypeDesc=" + paytReqTypeDesc + ", payeeClassCd=" + payeeClassCd + ", payeeCd="
				+ payeeCd + ", payee=" + payee + ", particulars=" + particulars + ", bank=" + bank + ", bankDesc="
				+ bankDesc + ", bankAcct=" + bankAcct + ", bankAcctDesc=" + bankAcctDesc + ", checkNo=" + checkNo
				+ ", checkDate=" + checkDate + ", checkClass=" + checkClass + ", checkClassDesc=" + checkClassDesc
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", cvAmt=" + cvAmt + ", localAmt=" + localAmt
				+ ", preparedBy=" + preparedBy + ", preparedDate=" + preparedDate + ", certifiedBy=" + certifiedBy
				+ ", certifiedDate=" + certifiedDate + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", mainTranId=" + mainTranId
				+ ", mainTranDate=" + mainTranDate + ", mainTranClass=" + mainTranClass + ", mainTranTypeCd="
				+ mainTranTypeCd + ", mainTranYear=" + mainTranYear + ", mainTranClassNo=" + mainTranClassNo
				+ ", mainTranStat=" + mainTranStat + ", mainTranStatDesc=" + mainTranStatDesc + ", mainCloseDate="
				+ mainCloseDate + ", mainDeleteDate=" + mainDeleteDate + ", mainPostDate=" + mainPostDate
				+ ", mainCreateUser=" + mainCreateUser + ", mainCreateDate=" + mainCreateDate + ", mainUpdateUser="
				+ mainUpdateUser + ", mainUpdateDate=" + mainUpdateDate + ", refNo=" + refNo + "]";
	}
}