package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class OfficialReceipt {
	private Integer tranId;
	private String orType;
	private Integer orNo;
	private String formattedOrNo;
	private Integer orNoDigits;
	private DateTime orDate;
	private String orStatus;
	private String tranStat;
	private String orStatDesc;
	private String tranStatDesc;
	private Integer dcbYear;
	private Integer dcbUserCd;
	private Integer dcbNo;
	private String dcbStatus;
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
	private String vatTag;
	private String payeeNo;
	private String payeeClassCd;
	private String payor;
	private String mailAddress;
	private Integer bussTypeCd;
	private String tin;
	private Integer refCd;
	private String currCd;
	private BigDecimal orAmt;
	private BigDecimal currRate;
	private String particulars;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String cedingId;
	private String bussTypeName;
	private Integer rstrctTranUp;
	private BigDecimal orDtlSum;
	private BigDecimal acctEntriesSum;
	private List<ORPaymentDetails> paytDtl;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public Integer getOrNo() {
		return orNo;
	}
	public void setOrNo(Integer orNo) {
		this.orNo = orNo;
	}
	public String getFormattedOrNo() {
		return formattedOrNo;
	}
	public void setFormattedOrNo(String formattedOrNo) {
		this.formattedOrNo = formattedOrNo;
	}
	public Integer getOrNoDigits() {
		return orNoDigits;
	}
	public void setOrNoDigits(Integer orNoDigits) {
		this.orNoDigits = orNoDigits;
	}
	public DateTime getOrDate() {
		return orDate;
	}
	public void setOrDate(DateTime orDate) {
		this.orDate = orDate;
	}
	public String getOrStatus() {
		return orStatus;
	}
	public void setOrStatus(String orStatus) {
		this.orStatus = orStatus;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getOrStatDesc() {
		return orStatDesc;
	}
	public void setOrStatDesc(String orStatDesc) {
		this.orStatDesc = orStatDesc;
	}
	public String getTranStatDesc() {
		return tranStatDesc;
	}
	public void setTranStatDesc(String tranStatDesc) {
		this.tranStatDesc = tranStatDesc;
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
	public String getDcbStatus() {
		return dcbStatus;
	}
	public void setDcbStatus(String dcbStatus) {
		this.dcbStatus = dcbStatus;
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
	public String getVatTag() {
		return vatTag;
	}
	public void setVatTag(String vatTag) {
		this.vatTag = vatTag;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
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
	public Integer getRefCd() {
		return refCd;
	}
	public void setRefCd(Integer refCd) {
		this.refCd = refCd;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getOrAmt() {
		return orAmt;
	}
	public void setOrAmt(BigDecimal orAmt) {
		this.orAmt = orAmt;
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
	public Integer getRstrctTranUp() {
		return rstrctTranUp;
	}
	public void setRstrctTranUp(Integer rstrctTranUp) {
		this.rstrctTranUp = rstrctTranUp;
	}
	public BigDecimal getOrDtlSum() {
		return orDtlSum;
	}
	public void setOrDtlSum(BigDecimal orDtlSum) {
		this.orDtlSum = orDtlSum;
	}
	public BigDecimal getAcctEntriesSum() {
		return acctEntriesSum;
	}
	public void setAcctEntriesSum(BigDecimal acctEntriesSum) {
		this.acctEntriesSum = acctEntriesSum;
	}
	public List<ORPaymentDetails> getPaytDtl() {
		return paytDtl;
	}
	public void setPaytDtl(List<ORPaymentDetails> paytDtl) {
		this.paytDtl = paytDtl;
	}
	
	@Override
	public String toString() {
		return "OfficialReceipt [tranId=" + tranId + ", orType=" + orType + ", orNo=" + orNo + ", formattedOrNo="
				+ formattedOrNo + ", orNoDigits=" + orNoDigits + ", orDate=" + orDate + ", orStatus=" + orStatus
				+ ", tranStat=" + tranStat + ", orStatDesc=" + orStatDesc + ", tranStatDesc=" + tranStatDesc
				+ ", dcbYear=" + dcbYear + ", dcbUserCd=" + dcbUserCd + ", dcbNo=" + dcbNo + ", dcbStatus=" + dcbStatus
				+ ", dcbBank=" + dcbBank + ", dcbBankName=" + dcbBankName + ", dcbBankAcct=" + dcbBankAcct
				+ ", dcbBankAcctNo=" + dcbBankAcctNo + ", refNo=" + refNo + ", tranTypeCd=" + tranTypeCd
				+ ", tranTypeName=" + tranTypeName + ", prNo=" + prNo + ", prDate=" + prDate + ", prPreparedBy="
				+ prPreparedBy + ", vatTag=" + vatTag + ", payeeNo=" + payeeNo + ", payeeClassCd=" + payeeClassCd
				+ ", payor=" + payor + ", mailAddress=" + mailAddress + ", bussTypeCd=" + bussTypeCd + ", tin=" + tin
				+ ", refCd=" + refCd + ", currCd=" + currCd + ", orAmt=" + orAmt + ", currRate=" + currRate
				+ ", particulars=" + particulars + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", cedingId=" + cedingId
				+ ", bussTypeName=" + bussTypeName + ", rstrctTranUp=" + rstrctTranUp + ", orDtlSum=" + orDtlSum
				+ ", acctEntriesSum=" + acctEntriesSum + ", paytDtl=" + paytDtl + "]";
	}
}
