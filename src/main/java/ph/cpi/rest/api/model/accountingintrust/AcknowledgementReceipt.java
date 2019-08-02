package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcknowledgementReceipt {
	private Integer tranId;
	private Integer arNo;
	private DateTime arDate;
	private String arStatus;
	private String arStatDesc;
	private Integer dcbYear;
	private Integer dcbUserCd;
	private Integer dcbNo;
	private Integer dcbBank;
	private String dcbBankName;
	private Integer dcbBankAcct;
	private String dcbBankAcctNo;
	private String refNo;
	private Integer tranTypeCd;
	private String tranTypeName;
	private String prNo;
	private DateTime prDate;
	private String prPreparedBy;
	private Integer payeeNo;
	private String payor;
	private String mailAddress;
	private Integer bussTypeCd;
	private String tin;
	private String currCd;
	private BigDecimal arAmt;
	private BigDecimal currRate;
	private String particulars;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String cedingId;
	private String bussTypeName;
	
	private List<ARPaymentDetails> paytDtl;

	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public Integer getArNo() {
		return arNo;
	}

	public void setArNo(Integer arNo) {
		this.arNo = arNo;
	}

	public DateTime getArDate() {
		return arDate;
	}

	public void setArDate(DateTime arDate) {
		this.arDate = arDate;
	}

	public String getArStatus() {
		return arStatus;
	}

	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}

	public String getArStatDesc() {
		return arStatDesc;
	}

	public void setArStatDesc(String arStatDesc) {
		this.arStatDesc = arStatDesc;
	}

	public Integer getDcbYear() {
		return dcbYear;
	}

	public void setDcbYear(Integer dcbYear) {
		this.dcbYear = dcbYear;
	}

	public Integer getDcbUserCd() {
		return dcbUserCd;
	}

	public void setDcbUserCd(Integer dcbUserCd) {
		this.dcbUserCd = dcbUserCd;
	}

	public Integer getDcbNo() {
		return dcbNo;
	}

	public void setDcbNo(Integer dcbNo) {
		this.dcbNo = dcbNo;
	}

	public Integer getDcbBank() {
		return dcbBank;
	}

	public void setDcbBank(Integer dcbBank) {
		this.dcbBank = dcbBank;
	}

	public String getDcbBankName() {
		return dcbBankName;
	}

	public void setDcbBankName(String dcbBankName) {
		this.dcbBankName = dcbBankName;
	}

	public Integer getDcbBankAcct() {
		return dcbBankAcct;
	}

	public void setDcbBankAcct(Integer dcbBankAcct) {
		this.dcbBankAcct = dcbBankAcct;
	}

	public String getDcbBankAcctNo() {
		return dcbBankAcctNo;
	}

	public void setDcbBankAcctNo(String dcbBankAcctNo) {
		this.dcbBankAcctNo = dcbBankAcctNo;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Integer getTranTypeCd() {
		return tranTypeCd;
	}

	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}

	public String getTranTypeName() {
		return tranTypeName;
	}

	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public DateTime getPrDate() {
		return prDate;
	}

	public void setPrDate(DateTime prDate) {
		this.prDate = prDate;
	}

	public String getPrPreparedBy() {
		return prPreparedBy;
	}

	public void setPrPreparedBy(String prPreparedBy) {
		this.prPreparedBy = prPreparedBy;
	}

	public Integer getPayeeNo() {
		return payeeNo;
	}

	public void setPayeeNo(Integer payeeNo) {
		this.payeeNo = payeeNo;
	}

	public String getPayor() {
		return payor;
	}

	public void setPayor(String payor) {
		this.payor = payor;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Integer getBussTypeCd() {
		return bussTypeCd;
	}

	public void setBussTypeCd(Integer bussTypeCd) {
		this.bussTypeCd = bussTypeCd;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getCurrCd() {
		return currCd;
	}

	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}

	public BigDecimal getArAmt() {
		return arAmt;
	}

	public void setArAmt(BigDecimal arAmt) {
		this.arAmt = arAmt;
	}

	public BigDecimal getCurrRate() {
		return currRate;
	}

	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}

	public String getParticulars() {
		return particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
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

	public List<ARPaymentDetails> getPaytDtl() {
		return paytDtl;
	}

	public void setPaytDtl(List<ARPaymentDetails> paytDtl) {
		this.paytDtl = paytDtl;
	}

	public String getCedingId() {
		return cedingId;
	}

	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}

	public String getBussTypeName() {
		return bussTypeName;
	}

	public void setBussTypeName(String bussTypeName) {
		this.bussTypeName = bussTypeName;
	}

	@Override
	public String toString() {
		return "AcknowledgementReceipt [tranId=" + tranId + ", arNo=" + arNo + ", arDate=" + arDate + ", arStatus="
				+ arStatus + ", arStatDesc=" + arStatDesc + ", dcbYear=" + dcbYear + ", dcbUserCd=" + dcbUserCd
				+ ", dcbNo=" + dcbNo + ", dcbBank=" + dcbBank + ", dcbBankName=" + dcbBankName + ", dcbBankAcct="
				+ dcbBankAcct + ", dcbBankAcctNo=" + dcbBankAcctNo + ", refNo=" + refNo + ", tranTypeCd=" + tranTypeCd
				+ ", tranTypeName=" + tranTypeName + ", prNo=" + prNo + ", prDate=" + prDate + ", prPreparedBy="
				+ prPreparedBy + ", payeeNo=" + payeeNo + ", payor=" + payor + ", mailAddress=" + mailAddress
				+ ", bussTypeCd=" + bussTypeCd + ", tin=" + tin + ", currCd=" + currCd + ", arAmt=" + arAmt
				+ ", currRate=" + currRate + ", particulars=" + particulars + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", cedingId=" + cedingId + ", bussTypeName=" + bussTypeName + ", paytDtl=" + paytDtl + "]";
	}
}
