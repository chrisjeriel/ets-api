package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteAlopRequest {
	private Integer quoteId;
	private String alopId;
	private String insuredId;
	private String insuredDesc;
	private String address;
	private String insuredBusiness;
	private List<AlopDetails> alopDetails;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getAlopId() {
		return alopId;
	}
	public void setAlopId(String alopId) {
		this.alopId = alopId;
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
	public List<AlopDetails> getAlopDetails() {
		return alopDetails;
	}
	public void setAlopDetails(List<AlopDetails> alopDetails) {
		this.alopDetails = alopDetails;
	}
	@Override
	public String toString() {
		return "SaveQuoteAlopRequest [quoteId=" + quoteId + ", alopId=" + alopId + ", insuredId=" + insuredId
				+ ", insuredDesc=" + insuredDesc + ", address=" + address + ", insuredBusiness=" + insuredBusiness
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
	private Integer timeExc;
	private Integer repInterval;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;

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
		return "AlopDetails [optionId=" + optionId + ", annSi=" + annSi + ", maxIndemPdSi=" + maxIndemPdSi
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", maxIndemPd=" + maxIndemPd
				+ ", indemFromDate=" + indemFromDate + ", timeExc=" + timeExc + ", repInterval=" + repInterval
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
	
}
