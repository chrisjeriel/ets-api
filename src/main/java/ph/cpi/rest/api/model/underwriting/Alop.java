package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("PolicyAlop")
public class Alop {

	private Integer insId;
	private String insuredName;
	private String insuredDesc;
	private String address;
	private String insBusiness;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private DateTime issueDate;
	private DateTime expiryDate;
	private Integer maxIndemPd;
	private DateTime indemFromDate;
	private String timeExc;
	private Integer repInterval;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<AlopItem> alopItem;
	
	public Integer getInsId() {
		return insId;
	}
	public void setInsId(Integer insId) {
		this.insId = insId;
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
	
	public List<AlopItem> getAlopItem() {
		return alopItem;
	}
	public void setAlopItem(List<AlopItem> alopItem) {
		this.alopItem = alopItem;
	}
	@Override
	public String toString() {
		return "Alop [insId=" + insId + ", insuredName=" + insuredName + ", insuredDesc=" + insuredDesc + ", address="
				+ address + ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd + ", indemFromDate=" + indemFromDate
				+ ", timeExc=" + timeExc + ", repInterval=" + repInterval + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", alopItem=" + alopItem + "]";
	}
	
	
}
