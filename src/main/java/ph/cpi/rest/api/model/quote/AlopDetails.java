package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AlopDetails {
	private Integer optionId;
	private BigDecimal optionRt;
	private String condition;
	private BigDecimal commRtQuota;
	private BigDecimal commRtSurplus;
	private BigDecimal commRtFac;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private DateTime issueDate;
	private DateTime expiryDate;
	private Integer maxIndemPd;
	private DateTime indemFromDate;
	private String timeExc;
	private Integer repInterval;
	private String createUserAlop;
	private DateTime createDateAlop;
	private String updateUserAlop;
	private DateTime updateDateAlop;
	
	private List<AlopItem> alopItemList;

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public BigDecimal getOptionRt() {
		return optionRt;
	}

	public void setOptionRt(BigDecimal optionRt) {
		this.optionRt = optionRt;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public BigDecimal getCommRtQuota() {
		return commRtQuota;
	}

	public void setCommRtQuota(BigDecimal commRtQuota) {
		this.commRtQuota = commRtQuota;
	}

	public BigDecimal getCommRtSurplus() {
		return commRtSurplus;
	}

	public void setCommRtSurplus(BigDecimal commRtSurplus) {
		this.commRtSurplus = commRtSurplus;
	}

	public BigDecimal getCommRtFac() {
		return commRtFac;
	}

	public void setCommRtFac(BigDecimal commRtFac) {
		this.commRtFac = commRtFac;
	}

	public BigDecimal getAnnSi() {
		return annSi;
	}

	public void setAnnSi(BigDecimal annSi) {
		this.annSi = annSi;
	}

	public BigDecimal getMaxIndemPdSi() {
		return maxIndemPdSi;
	}

	public void setMaxIndemPdSi(BigDecimal maxIndemPdSi) {
		this.maxIndemPdSi = maxIndemPdSi;
	}

	public DateTime getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(DateTime issueDate) {
		this.issueDate = issueDate;
	}

	public DateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getMaxIndemPd() {
		return maxIndemPd;
	}

	public void setMaxIndemPd(Integer maxIndemPd) {
		this.maxIndemPd = maxIndemPd;
	}

	public DateTime getIndemFromDate() {
		return indemFromDate;
	}

	public void setIndemFromDate(DateTime indemFromDate) {
		this.indemFromDate = indemFromDate;
	}

	public String getTimeExc() {
		return timeExc;
	}

	public void setTimeExc(String timeExc) {
		this.timeExc = timeExc;
	}

	public Integer getRepInterval() {
		return repInterval;
	}

	public void setRepInterval(Integer repInterval) {
		this.repInterval = repInterval;
	}

	public String getCreateUserAlop() {
		return createUserAlop;
	}

	public void setCreateUserAlop(String createUserAlop) {
		this.createUserAlop = createUserAlop;
	}

	public DateTime getCreateDateAlop() {
		return createDateAlop;
	}

	public void setCreateDateAlop(DateTime createDateAlop) {
		this.createDateAlop = createDateAlop;
	}

	public String getUpdateUserAlop() {
		return updateUserAlop;
	}

	public void setUpdateUserAlop(String updateUserAlop) {
		this.updateUserAlop = updateUserAlop;
	}

	public DateTime getUpdateDateAlop() {
		return updateDateAlop;
	}

	public void setUpdateDateAlop(DateTime updateDateAlop) {
		this.updateDateAlop = updateDateAlop;
	}

	public List<AlopItem> getAlopItemList() {
		return alopItemList;
	}

	public void setAlopItemList(List<AlopItem> alopItemList) {
		this.alopItemList = alopItemList;
	}

	@Override
	public String toString() {
		return "AlopDetails [optionId=" + optionId + ", optionRt=" + optionRt + ", condition=" + condition
				+ ", commRtQuota=" + commRtQuota + ", commRtSurplus=" + commRtSurplus + ", commRtFac=" + commRtFac
				+ ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate=" + issueDate + ", expiryDate="
				+ expiryDate + ", maxIndemPd=" + maxIndemPd + ", indemFromDate=" + indemFromDate + ", timeExc="
				+ timeExc + ", repInterval=" + repInterval + ", createUserAlop=" + createUserAlop + ", createDateAlop="
				+ createDateAlop + ", updateUserAlop=" + updateUserAlop + ", updateDateAlop=" + updateDateAlop
				+ ", alopItemList=" + alopItemList + "]";
	}

	
}
