package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;

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
	private Integer timeExc;
	private Integer repInterval;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public Integer getTimeExc() {
		return timeExc;
	}
	public void setTimeExc(Integer timeExc) {
		this.timeExc = timeExc;
	}
	public Integer getRepInterval() {
		return repInterval;
	}
	public void setRepInterval(Integer repInterval) {
		this.repInterval = repInterval;
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
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	@Override
	public String toString() {
		return "AlopDetails [annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd + ", annSiD=" + annSiD
				+ ", maxIndemPdSiD=" + maxIndemPdSiD + ", maxIndemPdD=" + maxIndemPdD + ", indemFromDate="
				+ indemFromDate + ", timeExc=" + timeExc + ", repInterval=" + repInterval + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", optionId=" + optionId + "]";
	}
	
}
