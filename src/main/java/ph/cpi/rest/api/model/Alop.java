package ph.cpi.rest.api.model;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class Alop {

	private Integer alopId;
	private Integer insuredId;
	private String insuredName;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private Double annSi;
	private Double maxIndemPdSi;
	private LocalDateTime issueDate;
	private LocalDateTime expiryDate;
	private Double maxIndemPd;
	private LocalDateTime indemFromDate;
	private Integer timeExc;
	private Integer repInterval;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
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
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
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
	public Double getAnnSi() {
		return annSi;
	}
	public void setAnnSi(Double annSi) {
		this.annSi = annSi;
	}
	public Double getMaxIndemPdSi() {
		return maxIndemPdSi;
	}
	public void setMaxIndemPdSi(Double maxIndemPdSi) {
		this.maxIndemPdSi = maxIndemPdSi;
	}
	public Double getMaxIndemPd() {
		return maxIndemPd;
	}
	public void setMaxIndemPd(Double maxIndemPd) {
		this.maxIndemPd = maxIndemPd;
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

	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public LocalDateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public LocalDateTime getIndemFromDate() {
		return indemFromDate;
	}
	public void setIndemFromDate(LocalDateTime indemFromDate) {
		this.indemFromDate = indemFromDate;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Alop [alopId=" + alopId + ", insuredId=" + insuredId + ", insuredName=" + insuredName + ", insuredDesc="
				+ insuredDesc + ", address=" + address + ", insuredBusiness=" + insuredBusiness + ", annSi=" + annSi
				+ ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate
				+ ", maxIndemPd=" + maxIndemPd + ", indemFromDate=" + indemFromDate + ", timeExc=" + timeExc
				+ ", repInterval=" + repInterval + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
