package ph.cpi.rest.api.model.request;

public class SaveQuotationCopyRequest {
	private String copyingType;
	private String quoteId;
	private String lineCd;
	private String quoteYear;
	private String cedingId;
	private String riskId;
	private String autoIntComp;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String cessionId;
	
	public String getCessionId() {
		return cessionId;
	}
	public void setCessionId(String cessionId) {
		this.cessionId = cessionId;
	}
	public String getCopyingType() {
		return copyingType;
	}
	public void setCopyingType(String copyingType) {
		this.copyingType = copyingType;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getQuoteYear() {
		return quoteYear;
	}
	public void setQuoteYear(String quoteYear) {
		this.quoteYear = quoteYear;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	
	public String getAutoIntComp() {
		return autoIntComp;
	}
	public void setAutoIntComp(String autoIntComp) {
		this.autoIntComp = autoIntComp;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
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
		return "SaveQuotationCopyRequest [copyingType=" + copyingType + ", quoteId=" + quoteId + ", lineCd=" + lineCd
				+ ", quoteYear=" + quoteYear + ", cedingId=" + cedingId + ", riskId=" + riskId + ", autoIntComp="
				+ autoIntComp + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
