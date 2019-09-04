package ph.cpi.rest.api.model.request;

public class SaveAcitCvRequest {
	private Integer tranId;
	private Integer mainTranId;
    private String cvYear;
    private Integer cvNo;
    private String cvDate;
    private String cvStatus;
    //private String payeeNo;
    private String payeeClassCd;
    private String payeeCd;
    private String payee;
    private String particulars;
    private String bank;
    private String bankAcct;
    private String checkNo;
    private String checkDate;
    private String checkClass;
    private String currCd;
    private String currRate;
    private String cvAmt;
    private String localAmt;
    private String preparedBy;
    private String preparedDate;
    private String certifiedBy;
    private String certifiedDate;
    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;
    private String tranStat;
    private String closeDate;
    private String deleteDate;
    private String postDate;
	public Integer getTranId() {
		return tranId;
	}
	public Integer getMainTranId() {
		return mainTranId;
	}
	public void setMainTranId(Integer mainTranId) {
		this.mainTranId = mainTranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getCvYear() {
		return cvYear;
	}
	public void setCvYear(String cvYear) {
		this.cvYear = cvYear;
	}
	public Integer getCvNo() {
		return cvNo;
	}
	public void setCvNo(Integer cvNo) {
		this.cvNo = cvNo;
	}
	public String getCvDate() {
		return cvDate;
	}
	public void setCvDate(String cvDate) {
		this.cvDate = cvDate;
	}
	public String getCvStatus() {
		return cvStatus;
	}
	public void setCvStatus(String cvStatus) {
		this.cvStatus = cvStatus;
	}
//	public String getPayeeNo() {
//		return payeeNo;
//	}
//	public void setPayeeNo(String payeeNo) {
//		this.payeeNo = payeeNo;
//	}
	public String getPayee() {
		return payee;
	}
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayeeCd() {
		return payeeCd;
	}
	public void setPayeeCd(String payeeCd) {
		this.payeeCd = payeeCd;
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
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
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
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
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
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getCvAmt() {
		return cvAmt;
	}
	public void setCvAmt(String cvAmt) {
		this.cvAmt = cvAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(String preparedDate) {
		this.preparedDate = preparedDate;
	}
	public String getCertifiedBy() {
		return certifiedBy;
	}
	public void setCertifiedBy(String certifiedBy) {
		this.certifiedBy = certifiedBy;
	}
	public String getCertifiedDate() {
		return certifiedDate;
	}
	public void setCertifiedDate(String certifiedDate) {
		this.certifiedDate = certifiedDate;
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
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	@Override
	public String toString() {
		return "SaveAcitCvRequest [tranId=" + tranId + ", mainTranId=" + mainTranId + ", cvYear=" + cvYear + ", cvNo="
				+ cvNo + ", cvDate=" + cvDate + ", cvStatus=" + cvStatus + ", payeeClassCd=" + payeeClassCd
				+ ", payeeCd=" + payeeCd + ", payee=" + payee + ", particulars=" + particulars + ", bank=" + bank
				+ ", bankAcct=" + bankAcct + ", checkNo=" + checkNo + ", checkDate=" + checkDate + ", checkClass="
				+ checkClass + ", currCd=" + currCd + ", currRate=" + currRate + ", cvAmt=" + cvAmt + ", localAmt="
				+ localAmt + ", preparedBy=" + preparedBy + ", preparedDate=" + preparedDate + ", certifiedBy="
				+ certifiedBy + ", certifiedDate=" + certifiedDate + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", tranStat=" + tranStat
				+ ", closeDate=" + closeDate + ", deleteDate=" + deleteDate + ", postDate=" + postDate + "]";
	}
}
