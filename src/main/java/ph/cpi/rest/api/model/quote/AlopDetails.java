package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class AlopDetails {
	private Integer optionId;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private DateTime issueDate;
	private DateTime expiryDate;
	private Integer maxIndemPd;
	private Double annSiD;
	private Double maxIndemPdSiD;
	private Double maxIndemPdD;
	private DateTime indemFromDate;
	private String timeExc;
	private Integer repInterval;
	private String createUserAlop;
	private DateTime createDateAlop;
	private String updateUserAlop;
	private DateTime updateDateAlop;
	
	private List<AlopItem> alopItemList;
	
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
	public Double getAnnSiD() {
		return annSiD;
	}
	public void setAnnSiD(Double annSiD) {
		this.annSiD = annSiD;
	}
	public Double getMaxIndemPdSiD() {
		return maxIndemPdSiD;
	}
	public void setMaxIndemPdSiD(Double maxIndemPdSiD) {
		this.maxIndemPdSiD = maxIndemPdSiD;
	}
	public Double getMaxIndemPdD() {
		return maxIndemPdD;
	}
	public void setMaxIndemPdD(Double maxIndemPdD) {
		this.maxIndemPdD = maxIndemPdD;
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
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	
	public List<AlopItem> getAlopItemList() {
		return alopItemList;
	}
	public void setAlopItemList(List<AlopItem> alopItemList) {
		this.alopItemList = alopItemList;
	}
	@Override
	public String toString() {
		return "AlopDetails [optionId=" + optionId + ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd + ", annSiD="
				+ annSiD + ", maxIndemPdSiD=" + maxIndemPdSiD + ", maxIndemPdD=" + maxIndemPdD + ", indemFromDate="
				+ indemFromDate + ", timeExc=" + timeExc + ", repInterval=" + repInterval + ", createUserAlop=" + createUserAlop
				+ ", createDateAlop=" + createDateAlop + ", updateUserAlop=" + updateUserAlop + ", updateDateAlop=" + updateDateAlop
				+ ", alopItemList=" + alopItemList + "]";
	}
	
	
	
}
