package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteAlopRequest {
	private Integer quoteId;
	private String insuredId;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private List<AlopDetails> alopDetails;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(String insuredId) {
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
	public List<AlopDetails> getAlopDetails() {
		return alopDetails;
	}
	public void setAlopDetails(List<AlopDetails> alopDetails) {
		this.alopDetails = alopDetails;
	}
	@Override
	public String toString() {
		return "SaveQuoteAlopRequest [quoteId=" + quoteId + ", insuredId=" + insuredId + ", insuredDesc=" + insuredDesc
				+ ", address=" + address + ", insuredBusiness=" + insuredBusiness + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", alopDetails=" + alopDetails + "]";
	}
}

@Alias("SaveQuoteAlopDetails")
class AlopDetails {
	private String optionId;
	private BigDecimal annSi;
	private BigDecimal maxIndemPdSi;
	private String issueDate;
	private String expiryDate;
	private Integer maxIndemPd;
	private String indemFromDate;
	private String timeExc;
	private Integer repInterval;
	private String createUserAlop;
	private String createDateAlop;
	private String updateUserAlop;
	private String updateDateAlop;

	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
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
	public String getCreateUserAlop() {
		return createUserAlop;
	}
	public void setCreateUserAlop(String createUserAlop) {
		this.createUserAlop = createUserAlop;
	}
	public String getCreateDateAlop() {
		return createDateAlop;
	}
	public void setCreateDateAlop(String createDateAlop) {
		this.createDateAlop = createDateAlop;
	}
	public String getUpdateUserAlop() {
		return updateUserAlop;
	}
	public void setUpdateUserAlop(String updateUserAlop) {
		this.updateUserAlop = updateUserAlop;
	}
	public String getUpdateDateAlop() {
		return updateDateAlop;
	}
	public void setUpdateDateAlop(String updateDateAlop) {
		this.updateDateAlop = updateDateAlop;
	}
	@Override
	public String toString() {
		return "AlopDetails [optionId=" + optionId + ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd
				+ ", indemFromDate=" + indemFromDate + ", timeExc=" + timeExc + ", repInterval=" + repInterval
				+ ", createUserAlop=" + createUserAlop + ", createDateAlop=" + createDateAlop + ", updateUserAlop=" + updateUserAlop
				+ ", updateDateAlop=" + updateDateAlop + "]";
	}
	
}
