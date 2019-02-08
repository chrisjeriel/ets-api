package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

public class SaveQuoteAlopRequest {
	private Integer quoteId;
	private Integer alopId;
	private Integer insuredId;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private String issueDate;
	private String expiryDate;
	private Integer maxIndemPd;
	private String indemFromDate;
	private Integer timeExc;
	private Integer repInterval;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public Integer getAlopId() {
		return alopId;
	}
	public void setAlopId(Integer alopId) {
		this.alopId = alopId;
	}
	public Integer getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(Integer insuredId) {
		this.insuredId = insuredId;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInsuredBusiness() {
		return insuredBusiness;
	}
	public void setInsuredBusiness(String insuredBusiness) {
		this.insuredBusiness = insuredBusiness;
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
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Integer getMaxIndemPd() {
		return maxIndemPd;
	}
	public void setMaxIndemPd(Integer maxIndemPd) {
		this.maxIndemPd = maxIndemPd;
	}
	public String getIndemFromDate() {
		return indemFromDate;
	}
	public void setIndemFromDate(String indemFromDate) {
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
	@Override
	public String toString() {
		return "SaveQuoteAlopRequest [quoteId=" + quoteId + ", alopId=" + alopId + ", insuredId=" + insuredId
				+ ", insuredDesc=" + insuredDesc + ", address=" + address + ", insuredBusiness=" + insuredBusiness
				+ ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate=" + issueDate + ", expiryDate="
				+ expiryDate + ", maxIndemPd=" + maxIndemPd + ", indemFromDate=" + indemFromDate + ", timeExc="
				+ timeExc + ", repInterval=" + repInterval + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}