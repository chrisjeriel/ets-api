package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class HoldCover {
	private Integer holdCoverId ;
	private String holdCoverNo;
	private String lineCd;
	private String lineCdDesc;
	private Integer holdCoverYear;
	private Integer holdCoverSeqNo;
	private Integer holdCoverRevNo;
	private Integer optionId;
	private Float optionRt;
	private BigDecimal totalSi;
	private String condition;
	private DateTime periodFrom;
	private DateTime periodTo;
	private String compRefHoldCovNo;
	private String status;
	private String reqBy;
	private DateTime reqDate;
	private String preparedBy;
	private String approvedBy;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getHoldCoverId() {
		return holdCoverId;
	}
	public void setHoldCoverId(Integer holdCoverId) {
		this.holdCoverId = holdCoverId;
	}
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineCdDesc() {
		return lineCdDesc;
	}
	public void setLineCdDesc(String lineCdDesc) {
		this.lineCdDesc = lineCdDesc;
	}
	public Integer getHoldCoverYear() {
		return holdCoverYear;
	}
	public void setHoldCoverYear(Integer holdCoverYear) {
		this.holdCoverYear = holdCoverYear;
	}
	public Integer getHoldCoverSeqNo() {
		return holdCoverSeqNo;
	}
	public void setHoldCoverSeqNo(Integer holdCoverSeqNo) {
		this.holdCoverSeqNo = holdCoverSeqNo;
	}
	public Integer getHoldCoverRevNo() {
		return holdCoverRevNo;
	}
	public void setHoldCoverRevNo(Integer holdCoverRevNo) {
		this.holdCoverRevNo = holdCoverRevNo;
	}
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public Float getOptionRt() {
		return optionRt;
	}
	public void setOptionRt(Float optionRt) {
		this.optionRt = optionRt;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
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
		return "HoldCover [holdCoverId=" + holdCoverId + ", holdCoverNo=" + holdCoverNo + ", lineCd=" + lineCd
				+ ", lineCdDesc=" + lineCdDesc + ", holdCoverYear=" + holdCoverYear + ", holdCoverSeqNo="
				+ holdCoverSeqNo + ", holdCoverRevNo=" + holdCoverRevNo + ", optionId=" + optionId + ", optionRt="
				+ optionRt + ", totalSi=" + totalSi + ", condition=" + condition + ", periodFrom=" + periodFrom
				+ ", periodTo=" + periodTo + ", compRefHoldCovNo=" + compRefHoldCovNo + ", status=" + status
				+ ", reqBy=" + reqBy + ", reqDate=" + reqDate + ", preparedBy=" + preparedBy + ", approvedBy="
				+ approvedBy + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
