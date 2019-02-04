package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDateTime;

public class Alop {

	private AlopItem alopItem;
	
	private Integer alopId;
	private Integer insuredId;
	private String insuredName;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private LocalDateTime issueDate;
	private LocalDateTime expiryDate;
	private Integer maxIndemPd;
	private Double annSiD;
	private Double maxIndemPdSiD;
	private Double maxIndemPdD;
	private LocalDateTime indemFromDate;
	private Integer timeExc;
	private Integer repInterval;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private List<AlopItem> alopItemList;
	public AlopItem getAlopItem() {
		return alopItem;
	}
	public void setAlopItem(AlopItem alopItem) {
		this.alopItem = alopItem;
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
	public LocalDateTime getIndemFromDate() {
		return indemFromDate;
	}
	public void setIndemFromDate(LocalDateTime indemFromDate) {
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	public List<AlopItem> getAlopItemList() {
		return alopItemList;
	}
	public void setAlopItemList(List<AlopItem> alopItemList) {
		this.alopItemList = alopItemList;
	}
	@Override
	public String toString() {
		return "Alop [alopItem=" + alopItem + ", alopId=" + alopId + ", insuredId=" + insuredId + ", insuredName="
				+ insuredName + ", insuredDesc=" + insuredDesc + ", address=" + address + ", insuredBusiness="
				+ insuredBusiness + ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd + ", annSiD=" + annSiD
				+ ", maxIndemPdSiD=" + maxIndemPdSiD + ", maxIndemPdD=" + maxIndemPdD + ", indemFromDate="
				+ indemFromDate + ", timeExc=" + timeExc + ", repInterval=" + repInterval + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", alopItemList=" + alopItemList + "]";
	}
	
}
