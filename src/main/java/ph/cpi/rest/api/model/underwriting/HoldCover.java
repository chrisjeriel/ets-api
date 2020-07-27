package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("uwHoldCover")
public class HoldCover {

	private String policyId; 
	private String holdCovId; 
	private String holdCovNo;
	private String lineCd;
	private String holdCovYear;
	private String holdCovSeqNo;
	private String holdCovRevNo;
	private DateTime periodFrom;
	private DateTime periodTo;
	private String compRefHoldCovNo;
	private String status;
	private String statusDesc;
	private String reqBy;
	private DateTime reqDate;
	private String preparedBy;
	private String approvedBy;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	
	private Integer totalNoDays;
	private BigDecimal premAmt;
	private BigDecimal commAmt;
	private BigDecimal vatRiComm;
	private BigDecimal netDue;
	private String currCd;
	private BigDecimal currRt;
	
	public Integer getTotalNoDays() {
		return totalNoDays;
	}
	public void setTotalNoDays(Integer totalNoDays) {
		this.totalNoDays = totalNoDays;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(BigDecimal vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRt() {
		return currRt;
	}
	public void setCurrRt(BigDecimal currRt) {
		this.currRt = currRt;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getHoldCovId() {
		return holdCovId;
	}
	public void setHoldCovId(String holdCovId) {
		this.holdCovId = holdCovId;
	}
	public String getHoldCovNo() {
		return holdCovNo;
	}
	public void setHoldCovNo(String holdCovNo) {
		this.holdCovNo = holdCovNo;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getHoldCovYear() {
		return holdCovYear;
	}
	public void setHoldCovYear(String holdCovYear) {
		this.holdCovYear = holdCovYear;
	}
	public String getHoldCovSeqNo() {
		return holdCovSeqNo;
	}
	public void setHoldCovSeqNo(String holdCovSeqNo) {
		this.holdCovSeqNo = holdCovSeqNo;
	}
	public String getHoldCovRevNo() {
		return holdCovRevNo;
	}
	public void setHoldCovRevNo(String holdCovRevNo) {
		this.holdCovRevNo = holdCovRevNo;
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
	public String getCompRefHoldCovNo() {
		return compRefHoldCovNo;
	}
	public void setCompRefHoldCovNo(String compRefHoldCovNo) {
		this.compRefHoldCovNo = compRefHoldCovNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public DateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(DateTime reqDate) {
		this.reqDate = reqDate;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
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
		return "HoldCover [policyId=" + policyId + ", holdCovId=" + holdCovId + ", holdCovNo=" + holdCovNo + ", lineCd="
				+ lineCd + ", holdCovYear=" + holdCovYear + ", holdCovSeqNo=" + holdCovSeqNo + ", holdCovRevNo="
				+ holdCovRevNo + ", periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", compRefHoldCovNo="
				+ compRefHoldCovNo + ", status=" + status + ", statusDesc=" + statusDesc + ", reqBy=" + reqBy
				+ ", reqDate=" + reqDate + ", preparedBy=" + preparedBy + ", approvedBy=" + approvedBy + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", totalNoDays=" + totalNoDays + ", premAmt=" + premAmt + ", commAmt=" + commAmt
				+ ", vatRiComm=" + vatRiComm + ", netDue=" + netDue + ", currCd=" + currCd + ", currRt=" + currRt + "]";
	}
}
