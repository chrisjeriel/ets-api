package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcitAcctEntriesExt {
	private String extractId;
	private String tranId;
	private DateTime tranDate;
	private String tranClass;
	private String refNo;
	private String tranTypeCd;
	private String currCd;
	private String payee;
	private String particulars;
	private String tranStatus;
	private String acctStatus;
	private String glAcctId;
	private String acctCode;
	private String acctName;
	private String slTypeCd;
	private String slTypeName;
	private String slCd;
	private String slName;
	private BigDecimal creditAmt;
	private BigDecimal debitAmt;
	private BigDecimal localCreditAmt;
	private BigDecimal localDebitAmt;
	private String tranTypeName;
	private String tranStatusDesc;
	private String acctStatusDesc;
	private String entryType;
	private String periodType;
	private DateTime periodFrom;
	private DateTime periodTo;
	private String acctParam;
	private String acctParamCode;
	private String acctParamName;
	private String slTypeParam;
	private String slTypeParamName;
	private String arTag;
	private String cvTag;
	private String jvTag;
	private String closeTranTag;
	private String appendTag;
	private String extractUser;
	private DateTime extractDate;
	private String currCdParam;
	@Override
	public String toString() {
		return "AcitAcctEntriesExt [extractId=" + extractId + ", tranId=" + tranId + ", tranDate=" + tranDate
				+ ", tranClass=" + tranClass + ", refNo=" + refNo + ", tranTypeCd=" + tranTypeCd + ", currCd=" + currCd
				+ ", payee=" + payee + ", particulars=" + particulars + ", tranStatus=" + tranStatus + ", acctStatus="
				+ acctStatus + ", glAcctId=" + glAcctId + ", acctCode=" + acctCode + ", acctName=" + acctName
				+ ", slTypeCd=" + slTypeCd + ", slTypeName=" + slTypeName + ", slCd=" + slCd + ", slName=" + slName
				+ ", creditAmt=" + creditAmt + ", debitAmt=" + debitAmt + ", localCreditAmt=" + localCreditAmt
				+ ", localDebitAmt=" + localDebitAmt + ", tranTypeName=" + tranTypeName + ", tranStatusDesc="
				+ tranStatusDesc + ", acctStatusDesc=" + acctStatusDesc + ", entryType=" + entryType + ", periodType="
				+ periodType + ", periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", acctParam=" + acctParam
				+ ", acctParamCode=" + acctParamCode + ", acctParamName=" + acctParamName + ", slTypeParam="
				+ slTypeParam + ", slTypeParamName=" + slTypeParamName + ", arTag=" + arTag + ", cvTag=" + cvTag
				+ ", jvTag=" + jvTag + ", closeTranTag=" + closeTranTag + ", appendTag=" + appendTag + ", extractUser="
				+ extractUser + ", extractDate=" + extractDate + ", currCdParam=" + currCdParam + "]";
	}
	public String getExtractId() {
		return extractId;
	}
	public void setExtractId(String extractId) {
		this.extractId = extractId;
	}
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
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
	public String getTranStatus() {
		return tranStatus;
	}
	public void setTranStatus(String tranStatus) {
		this.tranStatus = tranStatus;
	}
	public String getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getAcctCode() {
		return acctCode;
	}
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public BigDecimal getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}
	public BigDecimal getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}
	public BigDecimal getLocalCreditAmt() {
		return localCreditAmt;
	}
	public void setLocalCreditAmt(BigDecimal localCreditAmt) {
		this.localCreditAmt = localCreditAmt;
	}
	public BigDecimal getLocalDebitAmt() {
		return localDebitAmt;
	}
	public void setLocalDebitAmt(BigDecimal localDebitAmt) {
		this.localDebitAmt = localDebitAmt;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getTranStatusDesc() {
		return tranStatusDesc;
	}
	public void setTranStatusDesc(String tranStatusDesc) {
		this.tranStatusDesc = tranStatusDesc;
	}
	public String getAcctStatusDesc() {
		return acctStatusDesc;
	}
	public void setAcctStatusDesc(String acctStatusDesc) {
		this.acctStatusDesc = acctStatusDesc;
	}
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public String getPeriodType() {
		return periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	public DateTime getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(DateTime periodFrom) {
		this.periodFrom = periodFrom;
	}
	public DateTime getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(DateTime periodTo) {
		this.periodTo = periodTo;
	}
	public String getAcctParam() {
		return acctParam;
	}
	public void setAcctParam(String acctParam) {
		this.acctParam = acctParam;
	}
	public String getAcctParamCode() {
		return acctParamCode;
	}
	public void setAcctParamCode(String acctParamCode) {
		this.acctParamCode = acctParamCode;
	}
	public String getAcctParamName() {
		return acctParamName;
	}
	public void setAcctParamName(String acctParamName) {
		this.acctParamName = acctParamName;
	}
	public String getSlTypeParam() {
		return slTypeParam;
	}
	public void setSlTypeParam(String slTypeParam) {
		this.slTypeParam = slTypeParam;
	}
	public String getSlTypeParamName() {
		return slTypeParamName;
	}
	public void setSlTypeParamName(String slTypeParamName) {
		this.slTypeParamName = slTypeParamName;
	}
	public String getArTag() {
		return arTag;
	}
	public void setArTag(String arTag) {
		this.arTag = arTag;
	}
	public String getCvTag() {
		return cvTag;
	}
	public void setCvTag(String cvTag) {
		this.cvTag = cvTag;
	}
	public String getJvTag() {
		return jvTag;
	}
	public void setJvTag(String jvTag) {
		this.jvTag = jvTag;
	}
	public String getCloseTranTag() {
		return closeTranTag;
	}
	public void setCloseTranTag(String closeTranTag) {
		this.closeTranTag = closeTranTag;
	}
	public String getAppendTag() {
		return appendTag;
	}
	public void setAppendTag(String appendTag) {
		this.appendTag = appendTag;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public DateTime getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(DateTime extractDate) {
		this.extractDate = extractDate;
	}
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
}
