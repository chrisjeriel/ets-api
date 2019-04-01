package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

public class SavePolAlopRequest {
	
	private Integer policyId;
	private Integer insId;
	private String insuredDesc;
	private String address;
	private String insBusiness;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private String issueDate;
	private String expiryDate;
	private Integer maxIndemPd;
	private String indemFromDate;
	private String timeExc;
	private Integer repInterval;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	
	public Integer getInsId() {
		return insId;
	}
	public void setInsId(Integer insId) {
		this.insId = insId;
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
	public String getInsBusiness() {
		return insBusiness;
	}
	public void setInsBusiness(String insBusiness) {
		this.insBusiness = insBusiness;
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
		return "SavePolAlopRequest [policyId=" + policyId + ", insId=" + insId + ", insuredDesc=" + insuredDesc
				+ ", address=" + address + ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate="
				+ issueDate + ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd + ", indemFromDate="
				+ indemFromDate + ", timeExc=" + timeExc + ", repInterval=" + repInterval + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}

}
